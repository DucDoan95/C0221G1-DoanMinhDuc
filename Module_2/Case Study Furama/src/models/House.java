package models;

public class House extends Services {
    private String standardRoom;
    private String descriptionFacility;
    private String numberFloor;

    public House() {
    }

    public House(String standardRoom, String descriptionFacility, String numberFloor) {
        this.standardRoom = standardRoom;
        this.descriptionFacility = descriptionFacility;
        this.numberFloor = numberFloor;
    }

    public House(String id, String serviceName, String areUsing, String rentalFee, String maxPeople, String rentalType, String standardRoom, String descriptionFacility, String numberFloor) {
        super(id, serviceName, areUsing, rentalFee, maxPeople, rentalType);
        this.standardRoom = standardRoom;
        this.descriptionFacility = descriptionFacility;
        this.numberFloor = numberFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionFacility() {
        return descriptionFacility;
    }

    public void setDescriptionFacility(String descriptionFacility) {
        this.descriptionFacility = descriptionFacility;
    }

    public String getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(String numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", " +standardRoom+
                ", " +descriptionFacility+
                ", " +numberFloor;
    }

    @Override
    public String showInfo() {
        return "House{" +
                "ID: "+this.getId()+
                ", Service Name: "+this.getServiceName()+
                ", Area Using: "+this.getAreUsing()+
                ", Rental Fee: "+this.getRentalFee()+
                ", Maximum number of People: "+this.getMaxPeople()+
                ", Rental Type: "+this.getRentalType()+
                ", Standard Room:" + standardRoom + '\'' +
                ", Description Facility: " + descriptionFacility + '\'' +
                ", Number Floor: "+numberFloor+
                '}';
    }
}
