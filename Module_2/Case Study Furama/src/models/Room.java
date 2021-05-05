package models;

public class Room extends Services {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String serviceName, String areUsing, String rentalFee, String maxPeople, String rentalType, String freeService) {
        super(id, serviceName, areUsing, rentalFee, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", " + freeService;
    }

    @Override
    public String showInfo() {
        return "Room{" +
                "ID: "+this.getId()+
                ", Service Name: "+this.getServiceName()+
                ", Area Using: "+this.getAreUsing()+
                ", Rental Fee: "+this.getRentalFee()+
                ", Maximum number of People: "+this.getMaxPeople()+
                ", Rental Type: "+this.getRentalType()+
                ", Free Service: "+freeService+
                '}';
    }
}
