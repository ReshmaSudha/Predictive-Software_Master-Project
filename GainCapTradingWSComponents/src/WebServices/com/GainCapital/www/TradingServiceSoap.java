/**
 * TradingServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public interface TradingServiceSoap extends java.rmi.Remote {

    /**
     * Place Trade Request
     * 				with Tolerance Option
     */
    public WebServices.com.GainCapital.www.DealResponse instantExecution(java.lang.String token, java.lang.String product, java.lang.String buySell, java.lang.String amount, java.lang.String rate, int tolerance) throws java.rmi.RemoteException;

    /**
     * Place Trade Deal
     * 				Request
     */
    public WebServices.com.GainCapital.www.DealResponse dealRequest(java.lang.String token, java.lang.String product, java.lang.String buySell, java.lang.String amount, java.lang.String rate) throws java.rmi.RemoteException;

    /**
     * Place Trade Deal
     * 				Request with Rate at Best
     */
    public WebServices.com.GainCapital.www.DealResponse dealRequestAtBest(java.lang.String token, java.lang.String product, java.lang.String buySell, java.lang.String amount) throws java.rmi.RemoteException;

    /**
     * Close an Open Trade
     * 				using DealSequence
     */
    public WebServices.com.GainCapital.www.DealResponse closeDeal(java.lang.String token, java.lang.String product, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String dealSequence) throws java.rmi.RemoteException;

    /**
     * Liquidates all open
     * 				positions
     */
    public WebServices.com.GainCapital.www.BlotterOfDealResponse liquidateAll(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Cancel existing
     * 				Open Order
     */
    public WebServices.com.GainCapital.www.Confirmation cancelOrder(java.lang.String token, java.lang.String orderReferenceNumber) throws java.rmi.RemoteException;

    /**
     * Place Single Trade
     * 				Order Request
     */
    public WebServices.com.GainCapital.www.OrderResponse placeSingleOrder(java.lang.String token, java.lang.String product, java.lang.String expiry, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String basis) throws java.rmi.RemoteException;

    /**
     * Place OCO Trade
     * 				Order Request
     */
    public WebServices.com.GainCapital.www.OrderResponse placeOCOOrder(java.lang.String token, java.lang.String product, java.lang.String expiry, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String basis, java.lang.String buySell1, java.lang.String amount1, java.lang.String rate1, java.lang.String basis1) throws java.rmi.RemoteException;

    /**
     * Place IfThen Trade
     * 				Order Request
     */
    public WebServices.com.GainCapital.www.OrderResponse placeIfThenOrder(java.lang.String token, java.lang.String product, java.lang.String expiry, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String basis, java.lang.String buySell1, java.lang.String amount1, java.lang.String rate1, java.lang.String basis1) throws java.rmi.RemoteException;

    /**
     * Place IfThenOCO
     * 				Trade Order Request
     */
    public WebServices.com.GainCapital.www.OrderResponse placeIfThenOCOOrder(java.lang.String token, java.lang.String product, java.lang.String expiry, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String basis, java.lang.String buySell1, java.lang.String amount1, java.lang.String rate1, java.lang.String basis1, java.lang.String buySell2, java.lang.String amount2, java.lang.String rate2, java.lang.String basis2) throws java.rmi.RemoteException;

    /**
     * Place Trailing Stop
     * 				Trade Order Request
     */
    public WebServices.com.GainCapital.www.OrderResponse placeTrailingStopOrder(java.lang.String token, java.lang.String product, java.lang.String expiry, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String trailingPoints) throws java.rmi.RemoteException;

    /**
     * Place Single
     * 				Associated Position Trade order.
     */
    public WebServices.com.GainCapital.www.OrderResponse placeSingleASSPOrder(java.lang.String token, java.lang.String product, java.lang.String rate, java.lang.String basis) throws java.rmi.RemoteException;

    /**
     * Place OCO
     * 				Associated Position Trade order.
     */
    public WebServices.com.GainCapital.www.OrderResponse placeOCOASSPOrder(java.lang.String token, java.lang.String product, java.lang.String limitRate, java.lang.String stopRate) throws java.rmi.RemoteException;

    /**
     * Place Trailing Stop
     * 				Associated Position Trade order.
     */
    public WebServices.com.GainCapital.www.OrderResponse placeTrailingStopASSPOrder(java.lang.String token, java.lang.String product, java.lang.String rate, java.lang.String trailingPoints) throws java.rmi.RemoteException;

    /**
     * Modify Trailing
     * 				Stop Associated Position Trade order.
     */
    public WebServices.com.GainCapital.www.OrderResponse modifyTrailingStopASSPOrder(java.lang.String token, java.lang.String orderReference, java.lang.String rate, java.lang.String trailingPoints) throws java.rmi.RemoteException;

    /**
     * Modify single trade
     * 				order.
     */
    public WebServices.com.GainCapital.www.OrderResponse modifySingleOrder(java.lang.String token, java.lang.String orderReference, java.lang.String expiry, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String basis) throws java.rmi.RemoteException;

    /**
     * Modify OCO trade
     * 				order.
     */
    public WebServices.com.GainCapital.www.OrderResponse modifyOCOOrder(java.lang.String token, java.lang.String orderReference, java.lang.String expiry, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String basis, java.lang.String buySell1, java.lang.String amount1, java.lang.String rate1, java.lang.String basis1) throws java.rmi.RemoteException;

    /**
     * Modify IfThen trade
     * 				order.
     */
    public WebServices.com.GainCapital.www.OrderResponse modifyIfThenOrder(java.lang.String token, java.lang.String orderReference, java.lang.String expiry, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String basis, java.lang.String buySell1, java.lang.String amount1, java.lang.String rate1, java.lang.String basis1) throws java.rmi.RemoteException;

    /**
     * Modify IfThen trade
     * 				order.
     */
    public WebServices.com.GainCapital.www.OrderResponse modifyIfThenOCOOrder(java.lang.String token, java.lang.String orderReference, java.lang.String expiry, java.lang.String buySell, java.lang.String amount, java.lang.String rate, java.lang.String basis, java.lang.String buySell1, java.lang.String amount1, java.lang.String rate1, java.lang.String basis1, java.lang.String buySell2, java.lang.String amount2, java.lang.String rate2, java.lang.String basis2) throws java.rmi.RemoteException;

    /**
     * Modify Single
     * 				Associated Position Trade order.
     */
    public WebServices.com.GainCapital.www.OrderResponse modifySingleASSPOrder(java.lang.String token, java.lang.String orderReference, java.lang.String rate, java.lang.String basis) throws java.rmi.RemoteException;

    /**
     * Modify OCO
     * 				Associated Position Trade order.
     */
    public WebServices.com.GainCapital.www.OrderResponse modifyOCOASSPOrder(java.lang.String token, java.lang.String orderReference, java.lang.String limitRate, java.lang.String stopLossRate) throws java.rmi.RemoteException;

    /**
     * Returns List of
     * 				Positions
     */
    public WebServices.com.GainCapital.www.BlotterOfPosition getPositionBlotter(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Returns Position
     * 				for a specific Product
     */
    public WebServices.com.GainCapital.www.BlotterOfPosition getPositionBlotterWithFilter(java.lang.String token, java.lang.String product) throws java.rmi.RemoteException;

    /**
     * Returns List of
     * 				Orders
     */
    public WebServices.com.GainCapital.www.BlotterOfOrder getOrderBlotter(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Returns List of
     * 				Orders in customer time zones
     */
    public WebServices.com.GainCapital.www.BlotterOfOrder getOrderBlotterInCustomerTimeZone(java.lang.String token, boolean convertToCustomerTimeZone) throws java.rmi.RemoteException;

    /**
     * Returns List of
     * 				Orders for a specific Product
     */
    public WebServices.com.GainCapital.www.BlotterOfOrder getOrderBlotterWithFilter(java.lang.String token, java.lang.String product) throws java.rmi.RemoteException;

    /**
     * Returns List of
     * 				Orders for a specific Product in Customer time zone
     */
    public WebServices.com.GainCapital.www.BlotterOfOrder getOrderBlotterWithFilterInCustomerTimeZone(java.lang.String token, java.lang.String product, boolean convertToCustomerTimeZone) throws java.rmi.RemoteException;

    /**
     * Returns
     * 				OrderDetails for a specific Order using Product and Reference
     * 				Number
     */
    public WebServices.com.GainCapital.www.BlotterOfOrder getOrderDetails(java.lang.String token, java.lang.String product, java.lang.String orderReferenceNumber) throws java.rmi.RemoteException;

    /**
     * Returns
     * 				OrderDetails for a specific Order using Product and Reference
     * 				Number
     */
    public WebServices.com.GainCapital.www.BlotterOfOrder getOrderDetailsInCustomerTimeZone(java.lang.String token, java.lang.String product, java.lang.String orderReferenceNumber, boolean convertToCustomerTimeZone) throws java.rmi.RemoteException;

    /**
     * Returns List of
     * 				Deals
     */
    public WebServices.com.GainCapital.www.BlotterOfDeal getDealBlotter(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Returns List of
     * 				Deals in Customer Time Zone
     */
    public WebServices.com.GainCapital.www.BlotterOfDeal getDealBlotterInCustomerTimeZone(java.lang.String token, boolean convertToCustomerTimeZone) throws java.rmi.RemoteException;

    /**
     * Returns List of
     * 				Deals for a specific Product
     */
    public WebServices.com.GainCapital.www.BlotterOfDeal getDealBlotterWithFilter(java.lang.String token, java.lang.String product) throws java.rmi.RemoteException;

    /**
     * Returns List of
     * 				Deals for a specific Product in Customer Time Zone
     */
    public WebServices.com.GainCapital.www.BlotterOfDeal getDealBlotterWithFilterInCustomerTimeZone(java.lang.String token, java.lang.String product, boolean convertToCustomerTimeZone) throws java.rmi.RemoteException;

    /**
     * Returns List of
     * 				Open Deals
     */
    public WebServices.com.GainCapital.www.BlotterOfDeal getOpenDealBlotter(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Returns List of
     * 				Open Deals in Customer Time Zone
     */
    public WebServices.com.GainCapital.www.BlotterOfDeal getOpenDealBlotterInCustomerTimeZone(java.lang.String token, boolean convertToCustomerTimeZone) throws java.rmi.RemoteException;

    /**
     * Returns List of
     * 				Open Deals for a specific Product
     */
    public WebServices.com.GainCapital.www.BlotterOfDeal getOpenDealBlotterWithFilter(java.lang.String token, java.lang.String product) throws java.rmi.RemoteException;

    /**
     * Returns List of
     * 				Open Deals for a specific Product in Customer Time Zone
     */
    public WebServices.com.GainCapital.www.BlotterOfDeal getOpenDealBlotterWithFilterInCustomerTimeZone(java.lang.String token, java.lang.String product, boolean convertToCustomerTimeZone) throws java.rmi.RemoteException;

    /**
     * Returns Margin
     * 				Details
     */
    public WebServices.com.GainCapital.www.BlotterOfMargin getMarginBlotter(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Returns Activity
     * 				Details for Current Trading Day
     */
    public WebServices.com.GainCapital.www.BlotterOfActivity getActivityBlotter(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Returns Activity
     * 				Details for Current Trading Day
     */
    public WebServices.com.GainCapital.www.BlotterOfActivity getActivityBlotterInCustomerTimeZone(java.lang.String token, boolean convertToCustomerTimeZone) throws java.rmi.RemoteException;

    /**
     * Returns Details of
     * 				a specific Deal using DealReference and
     * 				ConfirmationNumber
     */
    public WebServices.com.GainCapital.www.BlotterOfDealInfo getDealInfoBlotter(java.lang.String token, java.lang.String product, java.lang.String confirmationNumber, java.lang.String dealReference) throws java.rmi.RemoteException;

    /**
     * Closes the Position
     */
    public WebServices.com.GainCapital.www.DealResponse closePosition(java.lang.String token, java.lang.String product) throws java.rmi.RemoteException;
}
