public class Car {

    private String ownerName;
    private String contactNumber;
    private String carNumber;
    private String arrivalTime;
    private String leavingTime;
  

    public Car(String ownerName, String contactNumber,String carNumber, String arrivalTime) {

        this.ownerName = ownerName;
        this.contactNumber = contactNumber;
        this.carNumber = carNumber;
        this.arrivalTime = arrivalTime;
        this.leavingTime = "";
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getLeavingTime() {
        return leavingTime;
    }

    public void setLeavingTime(String leavingTime) {
        this.leavingTime = leavingTime;
    }
}
