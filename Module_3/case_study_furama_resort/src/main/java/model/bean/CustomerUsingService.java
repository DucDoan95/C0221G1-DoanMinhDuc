package model.bean;

public class CustomerUsingService {
    private int customerID;
    private String customerName;
    private int contractID;
    private String contractStartDate;
    private String contractEndDate;
    private String serviceName;
    private String attachServiceName;
    private int quantity;

    public CustomerUsingService() {
    }

    public CustomerUsingService(int customerID, String customerName, int contractID, String contractStartDate, String contractEndDate, String serviceName, String attachServiceName, int quantity) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.contractID = contractID;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.serviceName = serviceName;
        this.attachServiceName = attachServiceName;
        this.quantity = quantity;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getAttachServiceName() {
        return attachServiceName;
    }

    public void setAttachServiceName(String attachServiceName) {
        this.attachServiceName = attachServiceName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
