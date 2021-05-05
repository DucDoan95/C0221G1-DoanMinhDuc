package models;

public abstract class Services {
    private String id;
    private String serviceName;
    private String areUsing;
    private String rentalFee;
    private String maxPeople;
    private String rentalType;

    public Services() {
    }

    public Services(String id, String serviceName, String areUsing, String rentalFee, String maxPeople, String rentalType) {
        this.id = id;
        this.serviceName = serviceName;
        this.areUsing = areUsing;
        this.rentalFee = rentalFee;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getAreUsing() {
        return areUsing;
    }

    public void setAreUsing(String areUsing) {
        this.areUsing = areUsing;
    }

    public String getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(String rentalFee) {
        this.rentalFee = rentalFee;
    }

    public String getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(String maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return  id+
                ", " + serviceName +
                ", " + areUsing +
                ", " + rentalFee +
                ", " + maxPeople +
                ", " + rentalType ;
    }

    public abstract String showInfo();
}
