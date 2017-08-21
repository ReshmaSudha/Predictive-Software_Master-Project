package com.intellatrade;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;
import java.util.concurrent.*;


import javax.websocket.*;
import javax.websocket.server.*;

import org.apache.log4j.Logger;

@ServerEndpoint("/broadcast")
public class GainCapWebSocketServer {
	private static Queue<Session> queue = new ConcurrentLinkedQueue<Session>();
	static boolean completedInitialSetUp = false;
	final static Logger logger = Logger.getLogger(GainCapWebSocketServer.class.getName());
	
	@OnMessage
	public void onMessage(Session session, String rateData) {
		try {
			logger.info("received msg " + rateData + " from " + session.getId());
			sendAll(rateData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@OnOpen
	public void open(Session session) {
		try {
			if (!completedInitialSetUp) {
				setUpLog4jForLogging();
				completedInitialSetUp = true;
				logger.info("Setting completedInitialSetUp to TRUE");
			}
			queue.add(session);
			logger.info("New session opened: " + session.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@OnError
	public void error(Session session, Throwable t) {
		queue.remove(session);
		logger.info("Error on session " + session.getId());
	}

	@OnClose
	public void closedConnection(Session session) {
		queue.remove(session);
		logger.info("Session closed: " + session.getId());
	}

	private static synchronized void sendAll(String rateData) {
		try {
			ArrayList<Session> closedSessions = new ArrayList<>();
			for (Session session : queue) {
				if (!session.isOpen()) {
					logger.info("Closed session: " + session.getId());
					closedSessions.add(session);
				} else {
					session.getBasicRemote().sendText(rateData);
				}
			}
			queue.removeAll(closedSessions);
			logger.info("Broadcasting [" + rateData + "] to " + queue.size() + " clients");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	public void setUpLog4jForLogging() throws Exception{
		try {
			System.setProperty("class_name", "GainCapWebSocketServer");
			System.out.println("Setting up Log4j...... ");
			String log4jPropPath = "/home/reshma/apache-tomcat-8.5.13/webapps/gaincapital-websocket-rateservice/WEB-INF/log4j.properties";
			System.out.println("log4jPropPath is :" + log4jPropPath);
			File log4jPropFile = new File(log4jPropPath);
			Properties log4jProperties = new Properties();
			log4jProperties.load(new FileInputStream(log4jPropFile));
		    org.apache.log4j.PropertyConfigurator.configure(log4jProperties);	
		    System.out.println("Log4j set-up with PropertyConfigurator is completed!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}	
}