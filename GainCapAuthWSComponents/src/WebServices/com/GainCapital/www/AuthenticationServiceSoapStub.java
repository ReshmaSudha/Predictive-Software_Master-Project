/**
 * AuthenticationServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class AuthenticationServiceSoapStub extends org.apache.axis.client.Stub implements WebServices.com.GainCapital.www.AuthenticationServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AuthenticateCredentials");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticationResult"));
        oper.setReturnClass(WebServices.com.GainCapital.www.AuthenticationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AuthenticateCredentialsWithBrandCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "brandCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticationResult"));
        oper.setReturnClass(WebServices.com.GainCapital.www.AuthenticationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AuthenticateLinkedAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AccountNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticationResult"));
        oper.setReturnClass(WebServices.com.GainCapital.www.AuthenticationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetServerTime");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "GetServerTimeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SingleSignOn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticationRequest"), WebServices.com.GainCapital.www.AuthenticationRequest.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticationResponse"));
        oper.setReturnClass(WebServices.com.GainCapital.www.AuthenticationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AuthenticateWithDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticationResult2"));
        oper.setReturnClass(WebServices.com.GainCapital.www.AuthenticationResult2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticateWithDetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

    }

    public AuthenticationServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AuthenticationServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AuthenticationServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AccountSettings");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.AccountSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AccountType");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.AccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Activity");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.Activity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ArrayOfActivity");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.Activity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Activity");
            qName2 = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Activity");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ArrayOfConnection");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.Connection[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Connection");
            qName2 = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Connection");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ArrayOfMargin");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.Margin[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Margin");
            qName2 = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Margin");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ArrayOfOrder");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.Order[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Order");
            qName2 = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Order");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ArrayOfPosition");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.Position[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Position");
            qName2 = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Position");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ArrayOfProductSetting");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.ProductSetting[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ProductSetting");
            qName2 = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ProductSetting");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ArrayOfService");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.Service[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Service");
            qName2 = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Service");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ArrayOfTimeZones");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.TimeZones[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "TimeZones");
            qName2 = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "TimeZones");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticationRequest");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.AuthenticationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticationResponse");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.AuthenticationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticationResult");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.AuthenticationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticationResult2");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.AuthenticationResult2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfActivity");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.BlotterOfActivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfMargin");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.BlotterOfMargin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfOrder");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.BlotterOfOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfPosition");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.BlotterOfPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfTimeZones");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.BlotterOfTimeZones.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ConfigurationSettings");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.ConfigurationSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Connection");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.Connection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "LoginRequestType");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.LoginRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Margin");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.Margin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Order");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.Order.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Position");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.Position.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ProductSetting");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.ProductSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Service");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.Service.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ServiceEndPoint");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.ServiceEndPoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Settings");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.Settings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SystemDetails");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.SystemDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "TimeZones");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.TimeZones.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "udProductType");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.UdProductType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UserTimeZone");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.UserTimeZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public WebServices.com.GainCapital.www.AuthenticationResult authenticateCredentials(java.lang.String userID, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/AuthenticateCredentials");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticateCredentials"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userID, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.AuthenticationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.AuthenticationResult) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.AuthenticationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebServices.com.GainCapital.www.AuthenticationResult authenticateCredentialsWithBrandCode(java.lang.String userID, java.lang.String password, java.lang.String brandCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/AuthenticateCredentialsWithBrandCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticateCredentialsWithBrandCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userID, password, brandCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.AuthenticationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.AuthenticationResult) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.AuthenticationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebServices.com.GainCapital.www.AuthenticationResult authenticateLinkedAccount(java.lang.String token, java.lang.String accountNumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/AuthenticateLinkedAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticateLinkedAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, accountNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.AuthenticationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.AuthenticationResult) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.AuthenticationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String getServerTime() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/GetServerTime");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "GetServerTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebServices.com.GainCapital.www.AuthenticationResponse singleSignOn(WebServices.com.GainCapital.www.AuthenticationRequest authenticationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/SingleSignOn");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SingleSignOn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authenticationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.AuthenticationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.AuthenticationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.AuthenticationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebServices.com.GainCapital.www.AuthenticationResult2 authenticateWithDetails(java.lang.String userID, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/AuthenticateWithDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AuthenticateWithDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userID, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.AuthenticationResult2) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.AuthenticationResult2) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.AuthenticationResult2.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
