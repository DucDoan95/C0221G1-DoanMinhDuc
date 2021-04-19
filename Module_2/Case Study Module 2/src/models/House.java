package models;

public class House extends Services {
    private String roomStandard;
    private String descriptionFacility;
    private int numberOfFloor;

    public House() {
    }



    public House(String roomStandard, String descriptionFacility, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.descriptionFacility = descriptionFacility;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String id, String serviceName, float areaUsing, double rentalFee, int maxPeople, String rentalType, String roomStandard, String descriptionFacility, int numberOfFloor) {
        super(id, serviceName, areaUsing, rentalFee, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.descriptionFacility = descriptionFacility;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getDescriptionFacility() {
        return descriptionFacility;
    }

    public void setDescriptionFacility(String descriptionFacility) {
        this.descriptionFacility = descriptionFacility;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String showInfor() {
        return this.toString();
    }
    @Override
    public String toString() {
        return "      House" +super.toString()+
                "\nRoom Standard: " + roomStandard +
                "\nDescription of the Facility: " + descriptionFacility +
                "\nNumber of Floor" + numberOfFloor ;
    }
}
