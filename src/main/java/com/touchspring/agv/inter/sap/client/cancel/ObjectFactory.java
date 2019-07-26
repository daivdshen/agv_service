
package com.touchspring.agv.inter.sap.client.cancel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.touchspring.agv.inter.sap.client.cancel package. 
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

    private final static QName _TransferOrderCancelTransferOrderItemResponse_QNAME = new QName("http://boschxml.com/ci/Logistics/WarehouseManagement/TransferOrder", "TransferOrderCancelTransferOrderItemResponse");
    private final static QName _TransferOrderCancelTransferOrderItemRequest_QNAME = new QName("http://boschxml.com/ci/Logistics/WarehouseManagement/TransferOrder", "TransferOrderCancelTransferOrderItemRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.touchspring.agv.inter.sap.client.cancel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransferOrderCancelTransferOrderItemRequest }
     * 
     */
    public TransferOrderCancelTransferOrderItemRequest createTransferOrderCancelTransferOrderItemRequest() {
        return new TransferOrderCancelTransferOrderItemRequest();
    }

    /**
     * Create an instance of {@link TransferOrderCancelTransferOrderItemResponse }
     * 
     */
    public TransferOrderCancelTransferOrderItemResponse createTransferOrderCancelTransferOrderItemResponse() {
        return new TransferOrderCancelTransferOrderItemResponse();
    }

    /**
     * Create an instance of {@link ReturnText }
     * 
     */
    public ReturnText createReturnText() {
        return new ReturnText();
    }

    /**
     * Create an instance of {@link ExchangeFaultData }
     * 
     */
    public ExchangeFaultData createExchangeFaultData() {
        return new ExchangeFaultData();
    }

    /**
     * Create an instance of {@link ExchangeLogData }
     * 
     */
    public ExchangeLogData createExchangeLogData() {
        return new ExchangeLogData();
    }

    /**
     * Create an instance of {@link TransferOrderKey }
     * 
     */
    public TransferOrderKey createTransferOrderKey() {
        return new TransferOrderKey();
    }

    /**
     * Create an instance of {@link StandardMessageFault }
     * 
     */
    public StandardMessageFault createStandardMessageFault() {
        return new StandardMessageFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferOrderCancelTransferOrderItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://boschxml.com/ci/Logistics/WarehouseManagement/TransferOrder", name = "TransferOrderCancelTransferOrderItemResponse")
    public JAXBElement<TransferOrderCancelTransferOrderItemResponse> createTransferOrderCancelTransferOrderItemResponse(TransferOrderCancelTransferOrderItemResponse value) {
        return new JAXBElement<TransferOrderCancelTransferOrderItemResponse>(_TransferOrderCancelTransferOrderItemResponse_QNAME, TransferOrderCancelTransferOrderItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferOrderCancelTransferOrderItemRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://boschxml.com/ci/Logistics/WarehouseManagement/TransferOrder", name = "TransferOrderCancelTransferOrderItemRequest")
    public JAXBElement<TransferOrderCancelTransferOrderItemRequest> createTransferOrderCancelTransferOrderItemRequest(TransferOrderCancelTransferOrderItemRequest value) {
        return new JAXBElement<TransferOrderCancelTransferOrderItemRequest>(_TransferOrderCancelTransferOrderItemRequest_QNAME, TransferOrderCancelTransferOrderItemRequest.class, null, value);
    }

}
