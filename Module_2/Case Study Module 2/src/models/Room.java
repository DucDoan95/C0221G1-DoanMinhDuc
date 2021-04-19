package models;

public class Room extends Services {
    private String serviceFree;

    public Room() {
    }



    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String id, String serviceName, float areaUsing, double rentalFee, int maxPeople, String rentalType, String serviceFree) {
        super(id, serviceName, areaUsing, rentalFee, maxPeople, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String showInfor() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "      Room" +super.toString()+
                "\nService Free:" + serviceFree;
    }
}
