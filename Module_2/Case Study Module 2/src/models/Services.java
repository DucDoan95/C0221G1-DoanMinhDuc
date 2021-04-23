package models;

public abstract class Services {
    private String id;
    private String serviceName;
    private float areaUsing;
    private double rentalFee;
    private int maxPeople;
    private String rentalType;

    public Services() {
    }

    public Services(String id, String serviceName, float areaUsing, double rentalFee, int maxPeople, String rentalType) {
        this.id = id;
        this.serviceName = serviceName;
        this.areaUsing = areaUsing;
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

    public float getAreaUsing() {
        return areaUsing;
    }

    public void setAreaUsing(float areaUsing) {
        this.areaUsing = areaUsing;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTypeRental() {
        return rentalType;
    }

    public void setTypeRental(String rentalType) {
        this.rentalType = rentalType;
    }
    public abstract String showInfor();
    @Override
    public String toString() {
        return
                "ID: " + id +
                ", Service Name: " + serviceName +
                ", Area Using: " + areaUsing +
                ", Rental Fee: " + rentalFee +
                ", Maximum number of People: " + maxPeople +
                ", Rental Type:" + rentalType;
    }
}
