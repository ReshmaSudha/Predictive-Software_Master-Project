/**
 * ProductSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WebServices.com.GainCapital.www;

public class ProductSetting  implements java.io.Serializable {
    private java.lang.String product;

    private java.lang.String marginFactor;

    private java.lang.String notation;

    private java.lang.String counterProduct;

    private java.lang.String contractProduct;

    private java.lang.String tradeSize;

    private java.lang.String orderSize;

    private java.lang.String defaultTradeLots;

    private java.lang.String defaultOrderLots;

    private java.lang.String maxTradeLots;

    private java.lang.String maxOrderLots;

    private java.lang.String cancelOrderPips;

    private java.lang.String maxOrderPips;

    private java.lang.String pipDifference;

    private boolean active;

    private java.lang.String order;

    private boolean subscribed;

    private boolean quickPair;

    private java.lang.String maxPosition;

    private java.lang.String decimalPlaces;

    private java.lang.String aliasName;

    private java.lang.String description;

    private java.lang.String boldIndex;

    private java.lang.String superScriptIndex;

    private java.lang.String contractExpiryDescription;

    private java.lang.String dailyClosureExpiryTimeDescription;

    private java.lang.String unitsPerLotDescription;

    private java.lang.String minimumTickDescription;

    private java.lang.String orderPipsAway;

    private WebServices.com.GainCapital.www.UdProductType type;

    private WebServices.com.GainCapital.www.UdProductType productGroup;

    private java.lang.String minimumTolerance;

    private java.lang.String tolerance;

    private boolean isOnWatchList;

    private boolean isPopularMarket;

    private java.lang.String popularMarketOrder;

    private java.lang.String watchlistSortOrder;

    private java.lang.String dealBoxSortOrder;

    private java.lang.String minimumTickValue;

    private java.lang.String underlyingExchange;

    private java.lang.String contactValueDescription;

    private java.lang.String tickValue;

    private java.lang.String productDisplayTree;

    private java.lang.String tradingHours;

    private java.lang.String expirationDate;

    private java.lang.String underlyingExchangeMonth;

    private java.lang.String expirationDateTime;

    public ProductSetting() {
    }

    public ProductSetting(
           java.lang.String product,
           java.lang.String marginFactor,
           java.lang.String notation,
           java.lang.String counterProduct,
           java.lang.String contractProduct,
           java.lang.String tradeSize,
           java.lang.String orderSize,
           java.lang.String defaultTradeLots,
           java.lang.String defaultOrderLots,
           java.lang.String maxTradeLots,
           java.lang.String maxOrderLots,
           java.lang.String cancelOrderPips,
           java.lang.String maxOrderPips,
           java.lang.String pipDifference,
           boolean active,
           java.lang.String order,
           boolean subscribed,
           boolean quickPair,
           java.lang.String maxPosition,
           java.lang.String decimalPlaces,
           java.lang.String aliasName,
           java.lang.String description,
           java.lang.String boldIndex,
           java.lang.String superScriptIndex,
           java.lang.String contractExpiryDescription,
           java.lang.String dailyClosureExpiryTimeDescription,
           java.lang.String unitsPerLotDescription,
           java.lang.String minimumTickDescription,
           java.lang.String orderPipsAway,
           WebServices.com.GainCapital.www.UdProductType type,
           WebServices.com.GainCapital.www.UdProductType productGroup,
           java.lang.String minimumTolerance,
           java.lang.String tolerance,
           boolean isOnWatchList,
           boolean isPopularMarket,
           java.lang.String popularMarketOrder,
           java.lang.String watchlistSortOrder,
           java.lang.String dealBoxSortOrder,
           java.lang.String minimumTickValue,
           java.lang.String underlyingExchange,
           java.lang.String contactValueDescription,
           java.lang.String tickValue,
           java.lang.String productDisplayTree,
           java.lang.String tradingHours,
           java.lang.String expirationDate,
           java.lang.String underlyingExchangeMonth,
           java.lang.String expirationDateTime) {
           this.product = product;
           this.marginFactor = marginFactor;
           this.notation = notation;
           this.counterProduct = counterProduct;
           this.contractProduct = contractProduct;
           this.tradeSize = tradeSize;
           this.orderSize = orderSize;
           this.defaultTradeLots = defaultTradeLots;
           this.defaultOrderLots = defaultOrderLots;
           this.maxTradeLots = maxTradeLots;
           this.maxOrderLots = maxOrderLots;
           this.cancelOrderPips = cancelOrderPips;
           this.maxOrderPips = maxOrderPips;
           this.pipDifference = pipDifference;
           this.active = active;
           this.order = order;
           this.subscribed = subscribed;
           this.quickPair = quickPair;
           this.maxPosition = maxPosition;
           this.decimalPlaces = decimalPlaces;
           this.aliasName = aliasName;
           this.description = description;
           this.boldIndex = boldIndex;
           this.superScriptIndex = superScriptIndex;
           this.contractExpiryDescription = contractExpiryDescription;
           this.dailyClosureExpiryTimeDescription = dailyClosureExpiryTimeDescription;
           this.unitsPerLotDescription = unitsPerLotDescription;
           this.minimumTickDescription = minimumTickDescription;
           this.orderPipsAway = orderPipsAway;
           this.type = type;
           this.productGroup = productGroup;
           this.minimumTolerance = minimumTolerance;
           this.tolerance = tolerance;
           this.isOnWatchList = isOnWatchList;
           this.isPopularMarket = isPopularMarket;
           this.popularMarketOrder = popularMarketOrder;
           this.watchlistSortOrder = watchlistSortOrder;
           this.dealBoxSortOrder = dealBoxSortOrder;
           this.minimumTickValue = minimumTickValue;
           this.underlyingExchange = underlyingExchange;
           this.contactValueDescription = contactValueDescription;
           this.tickValue = tickValue;
           this.productDisplayTree = productDisplayTree;
           this.tradingHours = tradingHours;
           this.expirationDate = expirationDate;
           this.underlyingExchangeMonth = underlyingExchangeMonth;
           this.expirationDateTime = expirationDateTime;
    }


    /**
     * Gets the product value for this ProductSetting.
     * 
     * @return product
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this ProductSetting.
     * 
     * @param product
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the marginFactor value for this ProductSetting.
     * 
     * @return marginFactor
     */
    public java.lang.String getMarginFactor() {
        return marginFactor;
    }


    /**
     * Sets the marginFactor value for this ProductSetting.
     * 
     * @param marginFactor
     */
    public void setMarginFactor(java.lang.String marginFactor) {
        this.marginFactor = marginFactor;
    }


    /**
     * Gets the notation value for this ProductSetting.
     * 
     * @return notation
     */
    public java.lang.String getNotation() {
        return notation;
    }


    /**
     * Sets the notation value for this ProductSetting.
     * 
     * @param notation
     */
    public void setNotation(java.lang.String notation) {
        this.notation = notation;
    }


    /**
     * Gets the counterProduct value for this ProductSetting.
     * 
     * @return counterProduct
     */
    public java.lang.String getCounterProduct() {
        return counterProduct;
    }


    /**
     * Sets the counterProduct value for this ProductSetting.
     * 
     * @param counterProduct
     */
    public void setCounterProduct(java.lang.String counterProduct) {
        this.counterProduct = counterProduct;
    }


    /**
     * Gets the contractProduct value for this ProductSetting.
     * 
     * @return contractProduct
     */
    public java.lang.String getContractProduct() {
        return contractProduct;
    }


    /**
     * Sets the contractProduct value for this ProductSetting.
     * 
     * @param contractProduct
     */
    public void setContractProduct(java.lang.String contractProduct) {
        this.contractProduct = contractProduct;
    }


    /**
     * Gets the tradeSize value for this ProductSetting.
     * 
     * @return tradeSize
     */
    public java.lang.String getTradeSize() {
        return tradeSize;
    }


    /**
     * Sets the tradeSize value for this ProductSetting.
     * 
     * @param tradeSize
     */
    public void setTradeSize(java.lang.String tradeSize) {
        this.tradeSize = tradeSize;
    }


    /**
     * Gets the orderSize value for this ProductSetting.
     * 
     * @return orderSize
     */
    public java.lang.String getOrderSize() {
        return orderSize;
    }


    /**
     * Sets the orderSize value for this ProductSetting.
     * 
     * @param orderSize
     */
    public void setOrderSize(java.lang.String orderSize) {
        this.orderSize = orderSize;
    }


    /**
     * Gets the defaultTradeLots value for this ProductSetting.
     * 
     * @return defaultTradeLots
     */
    public java.lang.String getDefaultTradeLots() {
        return defaultTradeLots;
    }


    /**
     * Sets the defaultTradeLots value for this ProductSetting.
     * 
     * @param defaultTradeLots
     */
    public void setDefaultTradeLots(java.lang.String defaultTradeLots) {
        this.defaultTradeLots = defaultTradeLots;
    }


    /**
     * Gets the defaultOrderLots value for this ProductSetting.
     * 
     * @return defaultOrderLots
     */
    public java.lang.String getDefaultOrderLots() {
        return defaultOrderLots;
    }


    /**
     * Sets the defaultOrderLots value for this ProductSetting.
     * 
     * @param defaultOrderLots
     */
    public void setDefaultOrderLots(java.lang.String defaultOrderLots) {
        this.defaultOrderLots = defaultOrderLots;
    }


    /**
     * Gets the maxTradeLots value for this ProductSetting.
     * 
     * @return maxTradeLots
     */
    public java.lang.String getMaxTradeLots() {
        return maxTradeLots;
    }


    /**
     * Sets the maxTradeLots value for this ProductSetting.
     * 
     * @param maxTradeLots
     */
    public void setMaxTradeLots(java.lang.String maxTradeLots) {
        this.maxTradeLots = maxTradeLots;
    }


    /**
     * Gets the maxOrderLots value for this ProductSetting.
     * 
     * @return maxOrderLots
     */
    public java.lang.String getMaxOrderLots() {
        return maxOrderLots;
    }


    /**
     * Sets the maxOrderLots value for this ProductSetting.
     * 
     * @param maxOrderLots
     */
    public void setMaxOrderLots(java.lang.String maxOrderLots) {
        this.maxOrderLots = maxOrderLots;
    }


    /**
     * Gets the cancelOrderPips value for this ProductSetting.
     * 
     * @return cancelOrderPips
     */
    public java.lang.String getCancelOrderPips() {
        return cancelOrderPips;
    }


    /**
     * Sets the cancelOrderPips value for this ProductSetting.
     * 
     * @param cancelOrderPips
     */
    public void setCancelOrderPips(java.lang.String cancelOrderPips) {
        this.cancelOrderPips = cancelOrderPips;
    }


    /**
     * Gets the maxOrderPips value for this ProductSetting.
     * 
     * @return maxOrderPips
     */
    public java.lang.String getMaxOrderPips() {
        return maxOrderPips;
    }


    /**
     * Sets the maxOrderPips value for this ProductSetting.
     * 
     * @param maxOrderPips
     */
    public void setMaxOrderPips(java.lang.String maxOrderPips) {
        this.maxOrderPips = maxOrderPips;
    }


    /**
     * Gets the pipDifference value for this ProductSetting.
     * 
     * @return pipDifference
     */
    public java.lang.String getPipDifference() {
        return pipDifference;
    }


    /**
     * Sets the pipDifference value for this ProductSetting.
     * 
     * @param pipDifference
     */
    public void setPipDifference(java.lang.String pipDifference) {
        this.pipDifference = pipDifference;
    }


    /**
     * Gets the active value for this ProductSetting.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this ProductSetting.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the order value for this ProductSetting.
     * 
     * @return order
     */
    public java.lang.String getOrder() {
        return order;
    }


    /**
     * Sets the order value for this ProductSetting.
     * 
     * @param order
     */
    public void setOrder(java.lang.String order) {
        this.order = order;
    }


    /**
     * Gets the subscribed value for this ProductSetting.
     * 
     * @return subscribed
     */
    public boolean isSubscribed() {
        return subscribed;
    }


    /**
     * Sets the subscribed value for this ProductSetting.
     * 
     * @param subscribed
     */
    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }


    /**
     * Gets the quickPair value for this ProductSetting.
     * 
     * @return quickPair
     */
    public boolean isQuickPair() {
        return quickPair;
    }


    /**
     * Sets the quickPair value for this ProductSetting.
     * 
     * @param quickPair
     */
    public void setQuickPair(boolean quickPair) {
        this.quickPair = quickPair;
    }


    /**
     * Gets the maxPosition value for this ProductSetting.
     * 
     * @return maxPosition
     */
    public java.lang.String getMaxPosition() {
        return maxPosition;
    }


    /**
     * Sets the maxPosition value for this ProductSetting.
     * 
     * @param maxPosition
     */
    public void setMaxPosition(java.lang.String maxPosition) {
        this.maxPosition = maxPosition;
    }


    /**
     * Gets the decimalPlaces value for this ProductSetting.
     * 
     * @return decimalPlaces
     */
    public java.lang.String getDecimalPlaces() {
        return decimalPlaces;
    }


    /**
     * Sets the decimalPlaces value for this ProductSetting.
     * 
     * @param decimalPlaces
     */
    public void setDecimalPlaces(java.lang.String decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }


    /**
     * Gets the aliasName value for this ProductSetting.
     * 
     * @return aliasName
     */
    public java.lang.String getAliasName() {
        return aliasName;
    }


    /**
     * Sets the aliasName value for this ProductSetting.
     * 
     * @param aliasName
     */
    public void setAliasName(java.lang.String aliasName) {
        this.aliasName = aliasName;
    }


    /**
     * Gets the description value for this ProductSetting.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProductSetting.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the boldIndex value for this ProductSetting.
     * 
     * @return boldIndex
     */
    public java.lang.String getBoldIndex() {
        return boldIndex;
    }


    /**
     * Sets the boldIndex value for this ProductSetting.
     * 
     * @param boldIndex
     */
    public void setBoldIndex(java.lang.String boldIndex) {
        this.boldIndex = boldIndex;
    }


    /**
     * Gets the superScriptIndex value for this ProductSetting.
     * 
     * @return superScriptIndex
     */
    public java.lang.String getSuperScriptIndex() {
        return superScriptIndex;
    }


    /**
     * Sets the superScriptIndex value for this ProductSetting.
     * 
     * @param superScriptIndex
     */
    public void setSuperScriptIndex(java.lang.String superScriptIndex) {
        this.superScriptIndex = superScriptIndex;
    }


    /**
     * Gets the contractExpiryDescription value for this ProductSetting.
     * 
     * @return contractExpiryDescription
     */
    public java.lang.String getContractExpiryDescription() {
        return contractExpiryDescription;
    }


    /**
     * Sets the contractExpiryDescription value for this ProductSetting.
     * 
     * @param contractExpiryDescription
     */
    public void setContractExpiryDescription(java.lang.String contractExpiryDescription) {
        this.contractExpiryDescription = contractExpiryDescription;
    }


    /**
     * Gets the dailyClosureExpiryTimeDescription value for this ProductSetting.
     * 
     * @return dailyClosureExpiryTimeDescription
     */
    public java.lang.String getDailyClosureExpiryTimeDescription() {
        return dailyClosureExpiryTimeDescription;
    }


    /**
     * Sets the dailyClosureExpiryTimeDescription value for this ProductSetting.
     * 
     * @param dailyClosureExpiryTimeDescription
     */
    public void setDailyClosureExpiryTimeDescription(java.lang.String dailyClosureExpiryTimeDescription) {
        this.dailyClosureExpiryTimeDescription = dailyClosureExpiryTimeDescription;
    }


    /**
     * Gets the unitsPerLotDescription value for this ProductSetting.
     * 
     * @return unitsPerLotDescription
     */
    public java.lang.String getUnitsPerLotDescription() {
        return unitsPerLotDescription;
    }


    /**
     * Sets the unitsPerLotDescription value for this ProductSetting.
     * 
     * @param unitsPerLotDescription
     */
    public void setUnitsPerLotDescription(java.lang.String unitsPerLotDescription) {
        this.unitsPerLotDescription = unitsPerLotDescription;
    }


    /**
     * Gets the minimumTickDescription value for this ProductSetting.
     * 
     * @return minimumTickDescription
     */
    public java.lang.String getMinimumTickDescription() {
        return minimumTickDescription;
    }


    /**
     * Sets the minimumTickDescription value for this ProductSetting.
     * 
     * @param minimumTickDescription
     */
    public void setMinimumTickDescription(java.lang.String minimumTickDescription) {
        this.minimumTickDescription = minimumTickDescription;
    }


    /**
     * Gets the orderPipsAway value for this ProductSetting.
     * 
     * @return orderPipsAway
     */
    public java.lang.String getOrderPipsAway() {
        return orderPipsAway;
    }


    /**
     * Sets the orderPipsAway value for this ProductSetting.
     * 
     * @param orderPipsAway
     */
    public void setOrderPipsAway(java.lang.String orderPipsAway) {
        this.orderPipsAway = orderPipsAway;
    }


    /**
     * Gets the type value for this ProductSetting.
     * 
     * @return type
     */
    public WebServices.com.GainCapital.www.UdProductType getType() {
        return type;
    }


    /**
     * Sets the type value for this ProductSetting.
     * 
     * @param type
     */
    public void setType(WebServices.com.GainCapital.www.UdProductType type) {
        this.type = type;
    }


    /**
     * Gets the productGroup value for this ProductSetting.
     * 
     * @return productGroup
     */
    public WebServices.com.GainCapital.www.UdProductType getProductGroup() {
        return productGroup;
    }


    /**
     * Sets the productGroup value for this ProductSetting.
     * 
     * @param productGroup
     */
    public void setProductGroup(WebServices.com.GainCapital.www.UdProductType productGroup) {
        this.productGroup = productGroup;
    }


    /**
     * Gets the minimumTolerance value for this ProductSetting.
     * 
     * @return minimumTolerance
     */
    public java.lang.String getMinimumTolerance() {
        return minimumTolerance;
    }


    /**
     * Sets the minimumTolerance value for this ProductSetting.
     * 
     * @param minimumTolerance
     */
    public void setMinimumTolerance(java.lang.String minimumTolerance) {
        this.minimumTolerance = minimumTolerance;
    }


    /**
     * Gets the tolerance value for this ProductSetting.
     * 
     * @return tolerance
     */
    public java.lang.String getTolerance() {
        return tolerance;
    }


    /**
     * Sets the tolerance value for this ProductSetting.
     * 
     * @param tolerance
     */
    public void setTolerance(java.lang.String tolerance) {
        this.tolerance = tolerance;
    }


    /**
     * Gets the isOnWatchList value for this ProductSetting.
     * 
     * @return isOnWatchList
     */
    public boolean isIsOnWatchList() {
        return isOnWatchList;
    }


    /**
     * Sets the isOnWatchList value for this ProductSetting.
     * 
     * @param isOnWatchList
     */
    public void setIsOnWatchList(boolean isOnWatchList) {
        this.isOnWatchList = isOnWatchList;
    }


    /**
     * Gets the isPopularMarket value for this ProductSetting.
     * 
     * @return isPopularMarket
     */
    public boolean isIsPopularMarket() {
        return isPopularMarket;
    }


    /**
     * Sets the isPopularMarket value for this ProductSetting.
     * 
     * @param isPopularMarket
     */
    public void setIsPopularMarket(boolean isPopularMarket) {
        this.isPopularMarket = isPopularMarket;
    }


    /**
     * Gets the popularMarketOrder value for this ProductSetting.
     * 
     * @return popularMarketOrder
     */
    public java.lang.String getPopularMarketOrder() {
        return popularMarketOrder;
    }


    /**
     * Sets the popularMarketOrder value for this ProductSetting.
     * 
     * @param popularMarketOrder
     */
    public void setPopularMarketOrder(java.lang.String popularMarketOrder) {
        this.popularMarketOrder = popularMarketOrder;
    }


    /**
     * Gets the watchlistSortOrder value for this ProductSetting.
     * 
     * @return watchlistSortOrder
     */
    public java.lang.String getWatchlistSortOrder() {
        return watchlistSortOrder;
    }


    /**
     * Sets the watchlistSortOrder value for this ProductSetting.
     * 
     * @param watchlistSortOrder
     */
    public void setWatchlistSortOrder(java.lang.String watchlistSortOrder) {
        this.watchlistSortOrder = watchlistSortOrder;
    }


    /**
     * Gets the dealBoxSortOrder value for this ProductSetting.
     * 
     * @return dealBoxSortOrder
     */
    public java.lang.String getDealBoxSortOrder() {
        return dealBoxSortOrder;
    }


    /**
     * Sets the dealBoxSortOrder value for this ProductSetting.
     * 
     * @param dealBoxSortOrder
     */
    public void setDealBoxSortOrder(java.lang.String dealBoxSortOrder) {
        this.dealBoxSortOrder = dealBoxSortOrder;
    }


    /**
     * Gets the minimumTickValue value for this ProductSetting.
     * 
     * @return minimumTickValue
     */
    public java.lang.String getMinimumTickValue() {
        return minimumTickValue;
    }


    /**
     * Sets the minimumTickValue value for this ProductSetting.
     * 
     * @param minimumTickValue
     */
    public void setMinimumTickValue(java.lang.String minimumTickValue) {
        this.minimumTickValue = minimumTickValue;
    }


    /**
     * Gets the underlyingExchange value for this ProductSetting.
     * 
     * @return underlyingExchange
     */
    public java.lang.String getUnderlyingExchange() {
        return underlyingExchange;
    }


    /**
     * Sets the underlyingExchange value for this ProductSetting.
     * 
     * @param underlyingExchange
     */
    public void setUnderlyingExchange(java.lang.String underlyingExchange) {
        this.underlyingExchange = underlyingExchange;
    }


    /**
     * Gets the contactValueDescription value for this ProductSetting.
     * 
     * @return contactValueDescription
     */
    public java.lang.String getContactValueDescription() {
        return contactValueDescription;
    }


    /**
     * Sets the contactValueDescription value for this ProductSetting.
     * 
     * @param contactValueDescription
     */
    public void setContactValueDescription(java.lang.String contactValueDescription) {
        this.contactValueDescription = contactValueDescription;
    }


    /**
     * Gets the tickValue value for this ProductSetting.
     * 
     * @return tickValue
     */
    public java.lang.String getTickValue() {
        return tickValue;
    }


    /**
     * Sets the tickValue value for this ProductSetting.
     * 
     * @param tickValue
     */
    public void setTickValue(java.lang.String tickValue) {
        this.tickValue = tickValue;
    }


    /**
     * Gets the productDisplayTree value for this ProductSetting.
     * 
     * @return productDisplayTree
     */
    public java.lang.String getProductDisplayTree() {
        return productDisplayTree;
    }


    /**
     * Sets the productDisplayTree value for this ProductSetting.
     * 
     * @param productDisplayTree
     */
    public void setProductDisplayTree(java.lang.String productDisplayTree) {
        this.productDisplayTree = productDisplayTree;
    }


    /**
     * Gets the tradingHours value for this ProductSetting.
     * 
     * @return tradingHours
     */
    public java.lang.String getTradingHours() {
        return tradingHours;
    }


    /**
     * Sets the tradingHours value for this ProductSetting.
     * 
     * @param tradingHours
     */
    public void setTradingHours(java.lang.String tradingHours) {
        this.tradingHours = tradingHours;
    }


    /**
     * Gets the expirationDate value for this ProductSetting.
     * 
     * @return expirationDate
     */
    public java.lang.String getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this ProductSetting.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.lang.String expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the underlyingExchangeMonth value for this ProductSetting.
     * 
     * @return underlyingExchangeMonth
     */
    public java.lang.String getUnderlyingExchangeMonth() {
        return underlyingExchangeMonth;
    }


    /**
     * Sets the underlyingExchangeMonth value for this ProductSetting.
     * 
     * @param underlyingExchangeMonth
     */
    public void setUnderlyingExchangeMonth(java.lang.String underlyingExchangeMonth) {
        this.underlyingExchangeMonth = underlyingExchangeMonth;
    }


    /**
     * Gets the expirationDateTime value for this ProductSetting.
     * 
     * @return expirationDateTime
     */
    public java.lang.String getExpirationDateTime() {
        return expirationDateTime;
    }


    /**
     * Sets the expirationDateTime value for this ProductSetting.
     * 
     * @param expirationDateTime
     */
    public void setExpirationDateTime(java.lang.String expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductSetting)) return false;
        ProductSetting other = (ProductSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.marginFactor==null && other.getMarginFactor()==null) || 
             (this.marginFactor!=null &&
              this.marginFactor.equals(other.getMarginFactor()))) &&
            ((this.notation==null && other.getNotation()==null) || 
             (this.notation!=null &&
              this.notation.equals(other.getNotation()))) &&
            ((this.counterProduct==null && other.getCounterProduct()==null) || 
             (this.counterProduct!=null &&
              this.counterProduct.equals(other.getCounterProduct()))) &&
            ((this.contractProduct==null && other.getContractProduct()==null) || 
             (this.contractProduct!=null &&
              this.contractProduct.equals(other.getContractProduct()))) &&
            ((this.tradeSize==null && other.getTradeSize()==null) || 
             (this.tradeSize!=null &&
              this.tradeSize.equals(other.getTradeSize()))) &&
            ((this.orderSize==null && other.getOrderSize()==null) || 
             (this.orderSize!=null &&
              this.orderSize.equals(other.getOrderSize()))) &&
            ((this.defaultTradeLots==null && other.getDefaultTradeLots()==null) || 
             (this.defaultTradeLots!=null &&
              this.defaultTradeLots.equals(other.getDefaultTradeLots()))) &&
            ((this.defaultOrderLots==null && other.getDefaultOrderLots()==null) || 
             (this.defaultOrderLots!=null &&
              this.defaultOrderLots.equals(other.getDefaultOrderLots()))) &&
            ((this.maxTradeLots==null && other.getMaxTradeLots()==null) || 
             (this.maxTradeLots!=null &&
              this.maxTradeLots.equals(other.getMaxTradeLots()))) &&
            ((this.maxOrderLots==null && other.getMaxOrderLots()==null) || 
             (this.maxOrderLots!=null &&
              this.maxOrderLots.equals(other.getMaxOrderLots()))) &&
            ((this.cancelOrderPips==null && other.getCancelOrderPips()==null) || 
             (this.cancelOrderPips!=null &&
              this.cancelOrderPips.equals(other.getCancelOrderPips()))) &&
            ((this.maxOrderPips==null && other.getMaxOrderPips()==null) || 
             (this.maxOrderPips!=null &&
              this.maxOrderPips.equals(other.getMaxOrderPips()))) &&
            ((this.pipDifference==null && other.getPipDifference()==null) || 
             (this.pipDifference!=null &&
              this.pipDifference.equals(other.getPipDifference()))) &&
            this.active == other.isActive() &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder()))) &&
            this.subscribed == other.isSubscribed() &&
            this.quickPair == other.isQuickPair() &&
            ((this.maxPosition==null && other.getMaxPosition()==null) || 
             (this.maxPosition!=null &&
              this.maxPosition.equals(other.getMaxPosition()))) &&
            ((this.decimalPlaces==null && other.getDecimalPlaces()==null) || 
             (this.decimalPlaces!=null &&
              this.decimalPlaces.equals(other.getDecimalPlaces()))) &&
            ((this.aliasName==null && other.getAliasName()==null) || 
             (this.aliasName!=null &&
              this.aliasName.equals(other.getAliasName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.boldIndex==null && other.getBoldIndex()==null) || 
             (this.boldIndex!=null &&
              this.boldIndex.equals(other.getBoldIndex()))) &&
            ((this.superScriptIndex==null && other.getSuperScriptIndex()==null) || 
             (this.superScriptIndex!=null &&
              this.superScriptIndex.equals(other.getSuperScriptIndex()))) &&
            ((this.contractExpiryDescription==null && other.getContractExpiryDescription()==null) || 
             (this.contractExpiryDescription!=null &&
              this.contractExpiryDescription.equals(other.getContractExpiryDescription()))) &&
            ((this.dailyClosureExpiryTimeDescription==null && other.getDailyClosureExpiryTimeDescription()==null) || 
             (this.dailyClosureExpiryTimeDescription!=null &&
              this.dailyClosureExpiryTimeDescription.equals(other.getDailyClosureExpiryTimeDescription()))) &&
            ((this.unitsPerLotDescription==null && other.getUnitsPerLotDescription()==null) || 
             (this.unitsPerLotDescription!=null &&
              this.unitsPerLotDescription.equals(other.getUnitsPerLotDescription()))) &&
            ((this.minimumTickDescription==null && other.getMinimumTickDescription()==null) || 
             (this.minimumTickDescription!=null &&
              this.minimumTickDescription.equals(other.getMinimumTickDescription()))) &&
            ((this.orderPipsAway==null && other.getOrderPipsAway()==null) || 
             (this.orderPipsAway!=null &&
              this.orderPipsAway.equals(other.getOrderPipsAway()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.productGroup==null && other.getProductGroup()==null) || 
             (this.productGroup!=null &&
              this.productGroup.equals(other.getProductGroup()))) &&
            ((this.minimumTolerance==null && other.getMinimumTolerance()==null) || 
             (this.minimumTolerance!=null &&
              this.minimumTolerance.equals(other.getMinimumTolerance()))) &&
            ((this.tolerance==null && other.getTolerance()==null) || 
             (this.tolerance!=null &&
              this.tolerance.equals(other.getTolerance()))) &&
            this.isOnWatchList == other.isIsOnWatchList() &&
            this.isPopularMarket == other.isIsPopularMarket() &&
            ((this.popularMarketOrder==null && other.getPopularMarketOrder()==null) || 
             (this.popularMarketOrder!=null &&
              this.popularMarketOrder.equals(other.getPopularMarketOrder()))) &&
            ((this.watchlistSortOrder==null && other.getWatchlistSortOrder()==null) || 
             (this.watchlistSortOrder!=null &&
              this.watchlistSortOrder.equals(other.getWatchlistSortOrder()))) &&
            ((this.dealBoxSortOrder==null && other.getDealBoxSortOrder()==null) || 
             (this.dealBoxSortOrder!=null &&
              this.dealBoxSortOrder.equals(other.getDealBoxSortOrder()))) &&
            ((this.minimumTickValue==null && other.getMinimumTickValue()==null) || 
             (this.minimumTickValue!=null &&
              this.minimumTickValue.equals(other.getMinimumTickValue()))) &&
            ((this.underlyingExchange==null && other.getUnderlyingExchange()==null) || 
             (this.underlyingExchange!=null &&
              this.underlyingExchange.equals(other.getUnderlyingExchange()))) &&
            ((this.contactValueDescription==null && other.getContactValueDescription()==null) || 
             (this.contactValueDescription!=null &&
              this.contactValueDescription.equals(other.getContactValueDescription()))) &&
            ((this.tickValue==null && other.getTickValue()==null) || 
             (this.tickValue!=null &&
              this.tickValue.equals(other.getTickValue()))) &&
            ((this.productDisplayTree==null && other.getProductDisplayTree()==null) || 
             (this.productDisplayTree!=null &&
              this.productDisplayTree.equals(other.getProductDisplayTree()))) &&
            ((this.tradingHours==null && other.getTradingHours()==null) || 
             (this.tradingHours!=null &&
              this.tradingHours.equals(other.getTradingHours()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.underlyingExchangeMonth==null && other.getUnderlyingExchangeMonth()==null) || 
             (this.underlyingExchangeMonth!=null &&
              this.underlyingExchangeMonth.equals(other.getUnderlyingExchangeMonth()))) &&
            ((this.expirationDateTime==null && other.getExpirationDateTime()==null) || 
             (this.expirationDateTime!=null &&
              this.expirationDateTime.equals(other.getExpirationDateTime())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getMarginFactor() != null) {
            _hashCode += getMarginFactor().hashCode();
        }
        if (getNotation() != null) {
            _hashCode += getNotation().hashCode();
        }
        if (getCounterProduct() != null) {
            _hashCode += getCounterProduct().hashCode();
        }
        if (getContractProduct() != null) {
            _hashCode += getContractProduct().hashCode();
        }
        if (getTradeSize() != null) {
            _hashCode += getTradeSize().hashCode();
        }
        if (getOrderSize() != null) {
            _hashCode += getOrderSize().hashCode();
        }
        if (getDefaultTradeLots() != null) {
            _hashCode += getDefaultTradeLots().hashCode();
        }
        if (getDefaultOrderLots() != null) {
            _hashCode += getDefaultOrderLots().hashCode();
        }
        if (getMaxTradeLots() != null) {
            _hashCode += getMaxTradeLots().hashCode();
        }
        if (getMaxOrderLots() != null) {
            _hashCode += getMaxOrderLots().hashCode();
        }
        if (getCancelOrderPips() != null) {
            _hashCode += getCancelOrderPips().hashCode();
        }
        if (getMaxOrderPips() != null) {
            _hashCode += getMaxOrderPips().hashCode();
        }
        if (getPipDifference() != null) {
            _hashCode += getPipDifference().hashCode();
        }
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        _hashCode += (isSubscribed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isQuickPair() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMaxPosition() != null) {
            _hashCode += getMaxPosition().hashCode();
        }
        if (getDecimalPlaces() != null) {
            _hashCode += getDecimalPlaces().hashCode();
        }
        if (getAliasName() != null) {
            _hashCode += getAliasName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getBoldIndex() != null) {
            _hashCode += getBoldIndex().hashCode();
        }
        if (getSuperScriptIndex() != null) {
            _hashCode += getSuperScriptIndex().hashCode();
        }
        if (getContractExpiryDescription() != null) {
            _hashCode += getContractExpiryDescription().hashCode();
        }
        if (getDailyClosureExpiryTimeDescription() != null) {
            _hashCode += getDailyClosureExpiryTimeDescription().hashCode();
        }
        if (getUnitsPerLotDescription() != null) {
            _hashCode += getUnitsPerLotDescription().hashCode();
        }
        if (getMinimumTickDescription() != null) {
            _hashCode += getMinimumTickDescription().hashCode();
        }
        if (getOrderPipsAway() != null) {
            _hashCode += getOrderPipsAway().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getProductGroup() != null) {
            _hashCode += getProductGroup().hashCode();
        }
        if (getMinimumTolerance() != null) {
            _hashCode += getMinimumTolerance().hashCode();
        }
        if (getTolerance() != null) {
            _hashCode += getTolerance().hashCode();
        }
        _hashCode += (isIsOnWatchList() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsPopularMarket() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPopularMarketOrder() != null) {
            _hashCode += getPopularMarketOrder().hashCode();
        }
        if (getWatchlistSortOrder() != null) {
            _hashCode += getWatchlistSortOrder().hashCode();
        }
        if (getDealBoxSortOrder() != null) {
            _hashCode += getDealBoxSortOrder().hashCode();
        }
        if (getMinimumTickValue() != null) {
            _hashCode += getMinimumTickValue().hashCode();
        }
        if (getUnderlyingExchange() != null) {
            _hashCode += getUnderlyingExchange().hashCode();
        }
        if (getContactValueDescription() != null) {
            _hashCode += getContactValueDescription().hashCode();
        }
        if (getTickValue() != null) {
            _hashCode += getTickValue().hashCode();
        }
        if (getProductDisplayTree() != null) {
            _hashCode += getProductDisplayTree().hashCode();
        }
        if (getTradingHours() != null) {
            _hashCode += getTradingHours().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getUnderlyingExchangeMonth() != null) {
            _hashCode += getUnderlyingExchangeMonth().hashCode();
        }
        if (getExpirationDateTime() != null) {
            _hashCode += getExpirationDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ProductSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marginFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "MarginFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notation");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Notation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("counterProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "CounterProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ContractProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeSize");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "TradeSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderSize");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OrderSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultTradeLots");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "DefaultTradeLots"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultOrderLots");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "DefaultOrderLots"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxTradeLots");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "MaxTradeLots"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxOrderLots");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "MaxOrderLots"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelOrderPips");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "CancelOrderPips"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxOrderPips");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "MaxOrderPips"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pipDifference");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "PipDifference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribed");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Subscribed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quickPair");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "QuickPair"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "MaxPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decimalPlaces");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "DecimalPlaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliasName");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "AliasName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boldIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "BoldIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superScriptIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "SuperScriptIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractExpiryDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ContractExpiryDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyClosureExpiryTimeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "DailyClosureExpiryTimeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsPerLotDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UnitsPerLotDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumTickDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "MinimumTickDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderPipsAway");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "OrderPipsAway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "udProductType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ProductGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "udProductType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumTolerance");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "MinimumTolerance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tolerance");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "Tolerance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOnWatchList");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "IsOnWatchList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPopularMarket");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "IsPopularMarket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("popularMarketOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "PopularMarketOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("watchlistSortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "WatchlistSortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealBoxSortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "DealBoxSortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumTickValue");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "MinimumTickValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("underlyingExchange");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UnderlyingExchange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactValueDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ContactValueDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tickValue");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "TickValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productDisplayTree");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ProductDisplayTree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradingHours");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "TradingHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("underlyingExchangeMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "UnderlyingExchangeMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("www.GainCapital.com.WebServices", "ExpirationDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
