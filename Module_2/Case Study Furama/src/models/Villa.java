package models;

public class Villa extends Services{
    private String standardRoom;
    private String descriptionFacility;
    private String areSwimmingPoll;
    private String numberFloor;

    public Villa() {
    }

    public Villa(String standardRoom, String descriptionFacility, String areSwimmingPoll, String numberFloor) {
        this.standardRoom = standardRoom;
        this.descriptionFacility = descriptionFacility;
        this.areSwimmingPoll = areSwimmingPoll;
        this.numberFloor = numberFloor;
    }

    public Villa(String id, String serviceName, String areUsing, String rentalFee, String maxPeople, String rentalType, String standardRoom, String descriptionFacility, String areSwimmingPoll, String numberFloor) {
        super(id, serviceName, areUsing, rentalFee, maxPeople, rentalType);
        this.standardRoom = standardRoom;
        this.descriptionFacility = descriptionFacility;
        this.areSwimmingPoll = areSwimmingPoll;
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

    public String getAreSwimmingPoll() {
        return areSwimmingPoll;
    }

    public void setAreSwimmingPoll(String areSwimmingPoll) {
        this.areSwimmingPoll = areSwimmingPoll;
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
                ", " + standardRoom +
                ", " + descriptionFacility +
                ", " + areSwimmingPoll +
                ", " + numberFloor;
    }

    @Override
    public String showInfo() {
        return "Villa{" +
                "ID: "+this.getId()+
                ", Service Name: "+this.getServiceName()+
                ", Area Using: "+this.getAreUsing()+
                ", Rental Fee: "+this.getRentalFee()+
                ", Maximum number of People: "+this.getMaxPeople()+
                ", Rental Type: "+this.getRentalType()+
                ", Standard Room:" + standardRoom + '\'' +
                ", Description Facility: " + descriptionFacility + '\'' +
                ", Area Swimming Poll: "+areSwimmingPoll+
                ", Number of Floor: " + numberFloor + '\'' +
                '}';
    }
}
