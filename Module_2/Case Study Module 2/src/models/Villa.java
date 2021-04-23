package models;

public class Villa extends Services {
    private String roomStandard;
    private String descriptionFacility;
    private float areaSwimmingPool;
    private int numberOfFloor;

    public Villa() {
    }

    public Villa(String roomStandard, String descriptionFacility, float areaSwimmingPool, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.descriptionFacility = descriptionFacility;
        this.areaSwimmingPool = areaSwimmingPool;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String id, String serviceName, float areaUsing, double rentalFee, int maxPeople, String rentalType, String roomStandard, String descriptionFacility, float areaSwimmingPool, int numberOfFloor) {
        super(id, serviceName, areaUsing, rentalFee, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.descriptionFacility = descriptionFacility;
        this.areaSwimmingPool = areaSwimmingPool;
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

    public float getAreaSwimmingPool() {
        return areaSwimmingPool;
    }

    public void setAreaSwimmingPool(float areaSwimmingPool) {
        this.areaSwimmingPool = areaSwimmingPool;
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
        return super.toString()+
                ", Room Standard: " + roomStandard +
                ", Description of the Facility: " + descriptionFacility +
                ", Area Swimming Pool: " + areaSwimmingPool +
                ", Number of Floor: " + numberOfFloor ;
    }
}
