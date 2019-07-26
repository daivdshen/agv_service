
package com.touchspring.agv.inter.sap.client.stock;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.touchspring.agv.inter.sap.client.stock package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StockGetQuantResponse_QNAME = new QName("http://boschxml.com/ci/Logistics/WarehouseManagement/Stock", "StockGetQuantResponse");
    private final static QName _StockGetQuantRequest_QNAME = new QName("http://boschxml.com/ci/Logistics/WarehouseManagement/Stock", "StockGetQuantRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.touchspring.agv.inter.sap.client.stock
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StockGetQuantRequest }
     * 
     */
    public StockGetQuantRequest createStockGetQuantRequest() {
        return new StockGetQuantRequest();
    }

    /**
     * Create an instance of {@link StockGetQuantResponse }
     * 
     */
    public StockGetQuantResponse createStockGetQuantResponse() {
        return new StockGetQuantResponse();
    }

    /**
     * Create an instance of {@link TotalStockQuantity }
     * 
     */
    public TotalStockQuantity createTotalStockQuantity() {
        return new TotalStockQuantity();
    }

    /**
     * Create an instance of {@link ExchangeFaultData }
     * 
     */
    public ExchangeFaultData createExchangeFaultData() {
        return new ExchangeFaultData();
    }

    /**
     * Create an instance of {@link StockRemovalQuantity }
     * 
     */
    public StockRemovalQuantity createStockRemovalQuantity() {
        return new StockRemovalQuantity();
    }

    /**
     * Create an instance of {@link Quant }
     * 
     */
    public Quant createQuant() {
        return new Quant();
    }

    /**
     * Create an instance of {@link PutawayQuantity }
     * 
     */
    public PutawayQuantity createPutawayQuantity() {
        return new PutawayQuantity();
    }

    /**
     * Create an instance of {@link ExchangeLogData }
     * 
     */
    public ExchangeLogData createExchangeLogData() {
        return new ExchangeLogData();
    }

    /**
     * Create an instance of {@link AvailableStockQuantity }
     * 
     */
    public AvailableStockQuantity createAvailableStockQuantity() {
        return new AvailableStockQuantity();
    }

    /**
     * Create an instance of {@link StandardMessageFault }
     * 
     */
    public StandardMessageFault createStandardMessageFault() {
        return new StandardMessageFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockGetQuantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://boschxml.com/ci/Logistics/WarehouseManagement/Stock", name = "StockGetQuantResponse")
    public JAXBElement<StockGetQuantResponse> createStockGetQuantResponse(StockGetQuantResponse value) {
        return new JAXBElement<StockGetQuantResponse>(_StockGetQuantResponse_QNAME, StockGetQuantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockGetQuantRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://boschxml.com/ci/Logistics/WarehouseManagement/Stock", name = "StockGetQuantRequest")
    public JAXBElement<StockGetQuantRequest> createStockGetQuantRequest(StockGetQuantRequest value) {
        return new JAXBElement<StockGetQuantRequest>(_StockGetQuantRequest_QNAME, StockGetQuantRequest.class, null, value);
    }

}
