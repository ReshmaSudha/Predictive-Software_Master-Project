/**
 * ConfigurationServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public interface ConfigurationServiceSoap extends java.rmi.Remote {

    /**
     * Returns Account settings, list of Products and their related
     * Trade Settings
     */
    public WebServices.com.GainCapital.www.Settings getAccountTradeSettings(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Returns Product
     * 				settings for a particular Product
     */
    public WebServices.com.GainCapital.www.BlotterOfProductSetting getProductSetting(java.lang.String token, java.lang.String product) throws java.rmi.RemoteException;

    /**
     * Returns Account settings, list of Products and their related
     * Trade Settings
     */
    public WebServices.com.GainCapital.www.BlotterOfTimeZones getTimeZones(java.lang.String token, WebServices.com.GainCapital.www.Languages language) throws java.rmi.RemoteException;

    /**
     * Returns Configuration settings, platform logo, and resources
     */
    public WebServices.com.GainCapital.www.ConfigurationSettings getConfigurationSettings(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Saves User settings
     */
    public WebServices.com.GainCapital.www.BlotterOfUserSettings saveUserSettings(java.lang.String token, WebServices.com.GainCapital.www.BlotterOfUserSettings userSettingsCollection) throws java.rmi.RemoteException;

    /**
     * Saves User settings
     */
    public WebServices.com.GainCapital.www.BlotterOfUserSettings saveUserSetting(java.lang.String token, WebServices.com.GainCapital.www.CollectionOfUserSettings userSettingsCollection) throws java.rmi.RemoteException;

    /**
     * Updates User
     * 				Product Subscription Profile
     */
    public WebServices.com.GainCapital.www.BlotterOfString saveUserProductSubscriptionSettings(java.lang.String token, WebServices.com.GainCapital.www.BlotterOfString userSettingsProductSubscriptionCollection) throws java.rmi.RemoteException;

    /**
     * Updates User
     * 				Product Subscription Profile
     */
    public WebServices.com.GainCapital.www.BlotterOfString saveUserProductSubscriptionSetting(java.lang.String token, WebServices.com.GainCapital.www.CollectionOfString userSettingsProductSubscriptionCollection) throws java.rmi.RemoteException;

    /**
     * Updates Users Quick
     * 				Pairs Profile
     */
    public WebServices.com.GainCapital.www.BlotterOfString saveUserQuickPairSetting(java.lang.String token, WebServices.com.GainCapital.www.CollectionOfString userSettingsQuickPairsCollection) throws java.rmi.RemoteException;

    /**
     * Updates Users Trade
     * 				Settings
     */
    public WebServices.com.GainCapital.www.BlotterOfString saveUserTradeSettings(java.lang.String token, WebServices.com.GainCapital.www.TradeSettings tradeSetting) throws java.rmi.RemoteException;

    /**
     * Updates Users
     * 				TimeZone Settings
     */
    public WebServices.com.GainCapital.www.BlotterOfUserTimeZone saveUserTimeZoneSettings(java.lang.String token, long timeZoneID) throws java.rmi.RemoteException;

    /**
     * Returns all Product
     * 				Settings
     */
    public WebServices.com.GainCapital.www.BlotterOfProductSetting getAnonymousProductSettings(java.lang.String token, WebServices.com.GainCapital.www.Languages lang) throws java.rmi.RemoteException;

    /**
     * Returns all Sub
     * 				Accounts
     */
    public WebServices.com.GainCapital.www.BlotterOfSubAccount getSubAccounts(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Return Platform
     * 				settings
     */
    public WebServices.com.GainCapital.www.BlotterOfPlatformSettings getPlatformSettings(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Saves Platform
     * 				settings
     */
    public WebServices.com.GainCapital.www.BlotterOfString savePlatformSettings(java.lang.String token, WebServices.com.GainCapital.www.PlatformSettings platformSetting) throws java.rmi.RemoteException;

    /**
     * Update Watchlist
     * 				for user
     */
    public WebServices.com.GainCapital.www.BlotterOfString updateUserWatchList(java.lang.String token, WebServices.com.GainCapital.www.WatchListSettings[] watchList) throws java.rmi.RemoteException;
}
