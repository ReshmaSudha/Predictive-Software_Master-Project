/**
 * ConfigurationServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class ConfigurationServiceSoapStub extends org.apache.axis.client.Stub implements WebServices.com.GainCapital.www.ConfigurationServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[16];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAccountTradeSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Settings"));
        oper.setReturnClass(WebServices.com.GainCapital.www.Settings.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "GetAccountTradeSettingsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProductSetting");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Product"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfProductSetting"));
        oper.setReturnClass(WebServices.com.GainCapital.www.BlotterOfProductSetting.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "GetProductSettingResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTimeZones");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Languages"), WebServices.com.GainCapital.www.Languages.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfTimeZones"));
        oper.setReturnClass(WebServices.com.GainCapital.www.BlotterOfTimeZones.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "GetTimeZonesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetConfigurationSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ConfigurationSettings"));
        oper.setReturnClass(WebServices.com.GainCapital.www.ConfigurationSettings.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "GetConfigurationSettingsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveUserSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "userSettingsCollection"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfUserSettings"), WebServices.com.GainCapital.www.BlotterOfUserSettings.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfUserSettings"));
        oper.setReturnClass(WebServices.com.GainCapital.www.BlotterOfUserSettings.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SaveUserSettingsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveUserSetting");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "userSettingsCollection"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "CollectionOfUserSettings"), WebServices.com.GainCapital.www.CollectionOfUserSettings.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfUserSettings"));
        oper.setReturnClass(WebServices.com.GainCapital.www.BlotterOfUserSettings.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SaveUserSettingResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveUserProductSubscriptionSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "userSettingsProductSubscriptionCollection"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfString"), WebServices.com.GainCapital.www.BlotterOfString.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfString"));
        oper.setReturnClass(WebServices.com.GainCapital.www.BlotterOfString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SaveUserProductSubscriptionSettingsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveUserProductSubscriptionSetting");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "userSettingsProductSubscriptionCollection"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "CollectionOfString"), WebServices.com.GainCapital.www.CollectionOfString.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfString"));
        oper.setReturnClass(WebServices.com.GainCapital.www.BlotterOfString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SaveUserProductSubscriptionSettingResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveUserQuickPairSetting");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "userSettingsQuickPairsCollection"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "CollectionOfString"), WebServices.com.GainCapital.www.CollectionOfString.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfString"));
        oper.setReturnClass(WebServices.com.GainCapital.www.BlotterOfString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SaveUserQuickPairSettingResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveUserTradeSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "tradeSetting"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "TradeSettings"), WebServices.com.GainCapital.www.TradeSettings.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfString"));
        oper.setReturnClass(WebServices.com.GainCapital.www.BlotterOfString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SaveUserTradeSettingsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveUserTimeZoneSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "TimeZoneID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfUserTimeZone"));
        oper.setReturnClass(WebServices.com.GainCapital.www.BlotterOfUserTimeZone.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SaveUserTimeZoneSettingsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAnonymousProductSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "lang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Languages"), WebServices.com.GainCapital.www.Languages.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfProductSetting"));
        oper.setReturnClass(WebServices.com.GainCapital.www.BlotterOfProductSetting.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "GetAnonymousProductSettingsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSubAccounts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfSubAccount"));
        oper.setReturnClass(WebServices.com.GainCapital.www.BlotterOfSubAccount.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "GetSubAccountsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPlatformSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfPlatformSettings"));
        oper.setReturnClass(WebServices.com.GainCapital.www.BlotterOfPlatformSettings.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "GetPlatformSettingsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SavePlatformSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "platformSetting"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "PlatformSettings"), WebServices.com.GainCapital.www.PlatformSettings.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfString"));
        oper.setReturnClass(WebServices.com.GainCapital.www.BlotterOfString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SavePlatformSettingsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateUserWatchList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "watchList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ArrayOfWatchListSettings"), WebServices.com.GainCapital.www.WatchListSettings[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "WatchListSettings"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfString"));
        oper.setReturnClass(WebServices.com.GainCapital.www.BlotterOfString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UpdateUserWatchListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

    }

    public ConfigurationServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ConfigurationServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ConfigurationServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ArrayOfConnection");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.Connection[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Connection");
            qName2 = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Connection");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ArrayOfPlatformSettings");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.PlatformSettings[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "PlatformSettings");
            qName2 = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "PlatformSettings");
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

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ArrayOfSubAccount");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.SubAccount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SubAccount");
            qName2 = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SubAccount");
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

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ArrayOfUserSettings");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.UserSettings[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UserSettings");
            qName2 = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UserSettings");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ArrayOfUserTimeZone");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.UserTimeZone[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UserTimeZone");
            qName2 = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UserTimeZone");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ArrayOfWatchListSettings");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.WatchListSettings[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "WatchListSettings");
            qName2 = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "WatchListSettings");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfPlatformSettings");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.BlotterOfPlatformSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfProductSetting");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.BlotterOfProductSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfString");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.BlotterOfString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfSubAccount");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.BlotterOfSubAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfTimeZones");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.BlotterOfTimeZones.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfUserSettings");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.BlotterOfUserSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BlotterOfUserTimeZone");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.BlotterOfUserTimeZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "CollectionOfString");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.CollectionOfString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "CollectionOfUserSettings");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.CollectionOfUserSettings.class;
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

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Languages");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.Languages.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "PlatformSettings");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.PlatformSettings.class;
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

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Settings");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.Settings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SubAccount");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.SubAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "TimeZones");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.TimeZones.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "TradeSettings");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.TradeSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "udProductType");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.UdProductType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UserSettings");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.UserSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UserTimeZone");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.UserTimeZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "WatchListSettings");
            cachedSerQNames.add(qName);
            cls = WebServices.com.GainCapital.www.WatchListSettings.class;
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

    public WebServices.com.GainCapital.www.Settings getAccountTradeSettings(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/GetAccountTradeSettings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "GetAccountTradeSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.Settings) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.Settings) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.Settings.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebServices.com.GainCapital.www.BlotterOfProductSetting getProductSetting(java.lang.String token, java.lang.String product) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/GetProductSetting");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "GetProductSetting"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, product});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.BlotterOfProductSetting) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.BlotterOfProductSetting) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.BlotterOfProductSetting.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebServices.com.GainCapital.www.BlotterOfTimeZones getTimeZones(java.lang.String token, WebServices.com.GainCapital.www.Languages language) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/GetTimeZones");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "GetTimeZones"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, language});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.BlotterOfTimeZones) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.BlotterOfTimeZones) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.BlotterOfTimeZones.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebServices.com.GainCapital.www.ConfigurationSettings getConfigurationSettings(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/GetConfigurationSettings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "GetConfigurationSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.ConfigurationSettings) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.ConfigurationSettings) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.ConfigurationSettings.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebServices.com.GainCapital.www.BlotterOfUserSettings saveUserSettings(java.lang.String token, WebServices.com.GainCapital.www.BlotterOfUserSettings userSettingsCollection) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/SaveUserSettings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SaveUserSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, userSettingsCollection});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.BlotterOfUserSettings) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.BlotterOfUserSettings) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.BlotterOfUserSettings.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebServices.com.GainCapital.www.BlotterOfUserSettings saveUserSetting(java.lang.String token, WebServices.com.GainCapital.www.CollectionOfUserSettings userSettingsCollection) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/SaveUserSetting");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SaveUserSetting"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, userSettingsCollection});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.BlotterOfUserSettings) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.BlotterOfUserSettings) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.BlotterOfUserSettings.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebServices.com.GainCapital.www.BlotterOfString saveUserProductSubscriptionSettings(java.lang.String token, WebServices.com.GainCapital.www.BlotterOfString userSettingsProductSubscriptionCollection) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/SaveUserProductSubscriptionSettings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SaveUserProductSubscriptionSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, userSettingsProductSubscriptionCollection});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.BlotterOfString) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.BlotterOfString) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.BlotterOfString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebServices.com.GainCapital.www.BlotterOfString saveUserProductSubscriptionSetting(java.lang.String token, WebServices.com.GainCapital.www.CollectionOfString userSettingsProductSubscriptionCollection) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/SaveUserProductSubscriptionSetting");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SaveUserProductSubscriptionSetting"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, userSettingsProductSubscriptionCollection});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.BlotterOfString) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.BlotterOfString) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.BlotterOfString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebServices.com.GainCapital.www.BlotterOfString saveUserQuickPairSetting(java.lang.String token, WebServices.com.GainCapital.www.CollectionOfString userSettingsQuickPairsCollection) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/SaveUserQuickPairSetting");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SaveUserQuickPairSetting"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, userSettingsQuickPairsCollection});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.BlotterOfString) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.BlotterOfString) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.BlotterOfString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebServices.com.GainCapital.www.BlotterOfString saveUserTradeSettings(java.lang.String token, WebServices.com.GainCapital.www.TradeSettings tradeSetting) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/SaveUserTradeSettings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SaveUserTradeSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, tradeSetting});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.BlotterOfString) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.BlotterOfString) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.BlotterOfString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebServices.com.GainCapital.www.BlotterOfUserTimeZone saveUserTimeZoneSettings(java.lang.String token, long timeZoneID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/SaveUserTimeZoneSettings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SaveUserTimeZoneSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(timeZoneID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.BlotterOfUserTimeZone) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.BlotterOfUserTimeZone) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.BlotterOfUserTimeZone.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebServices.com.GainCapital.www.BlotterOfProductSetting getAnonymousProductSettings(java.lang.String token, WebServices.com.GainCapital.www.Languages lang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/GetAnonymousProductSettings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "GetAnonymousProductSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, lang});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.BlotterOfProductSetting) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.BlotterOfProductSetting) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.BlotterOfProductSetting.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebServices.com.GainCapital.www.BlotterOfSubAccount getSubAccounts(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/GetSubAccounts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "GetSubAccounts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.BlotterOfSubAccount) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.BlotterOfSubAccount) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.BlotterOfSubAccount.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebServices.com.GainCapital.www.BlotterOfPlatformSettings getPlatformSettings(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/GetPlatformSettings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "GetPlatformSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.BlotterOfPlatformSettings) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.BlotterOfPlatformSettings) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.BlotterOfPlatformSettings.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebServices.com.GainCapital.www.BlotterOfString savePlatformSettings(java.lang.String token, WebServices.com.GainCapital.www.PlatformSettings platformSetting) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/SavePlatformSettings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SavePlatformSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, platformSetting});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.BlotterOfString) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.BlotterOfString) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.BlotterOfString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebServices.com.GainCapital.www.BlotterOfString updateUserWatchList(java.lang.String token, WebServices.com.GainCapital.www.WatchListSettings[] watchList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("www.GainCapital.com.WebServices/UpdateUserWatchList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UpdateUserWatchList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, watchList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebServices.com.GainCapital.www.BlotterOfString) _resp;
            } catch (java.lang.Exception _exception) {
                return (WebServices.com.GainCapital.www.BlotterOfString) org.apache.axis.utils.JavaUtils.convert(_resp, WebServices.com.GainCapital.www.BlotterOfString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
