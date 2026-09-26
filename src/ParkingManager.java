public class ParkingManager {

    private ParkingSlot[] slots;

    public ParkingManager(int totalSlots) {

        // Using array
        slots = new ParkingSlot[totalSlots];

     
        for (int i = 0; i < slots.length; i++) {
            slots[i] = new ParkingSlot(i + 1);
        }
    }

    public void parkCar(Car car) {

        // already parked??
        for (int i = 0; i < slots.length; i++) {

            if (slots[i].isOccupied() &&
                slots[i].getCar().getCarNumber()
                        .equalsIgnoreCase(car.getCarNumber())) {

                System.out.println("\nCar is already parked.");
                return;
            }
        }

        //available slot??
        for (int i = 0; i < slots.length; i++) {

            if (!slots[i].isOccupied()) {

                slots[i].parkCar(car);

                System.out.println("\nCar parked successfully!");
                System.out.println(
                    "Parking Slot: " + slots[i].getSlotNumber()
                );

                return;
            }
        }

        System.out.println("\nParking is full.");
    }

    public void removeCar(String carNumber, String leavingTime) {

        for (int i = 0; i < slots.length; i++) {

            if (slots[i].isOccupied() &&
                slots[i].getCar().getCarNumber()
                        .equalsIgnoreCase(carNumber)) {

                slots[i].getCar().setLeavingTime(leavingTime);

                System.out.println("\nCar removed successfully!");
                System.out.println(
                    "Parking Slot: " + slots[i].getSlotNumber()
                );
                System.out.println(
                    "Leaving Time: " + leavingTime
                );

                slots[i].removeCar();

                return;
            }
        }

        System.out.println("\nCar not found.");
    }

    public void searchCar(String carNumber) {

        for (int i = 0; i < slots.length; i++) {

            if (slots[i].isOccupied() &&
                slots[i].getCar().getCarNumber()
                        .equalsIgnoreCase(carNumber)) {

                Car car = slots[i].getCar();

                System.out.println("\n----- Car Details -----");
                System.out.println("Owner       : " + car.getOwnerName());
                System.out.println("Contact     : " + car.getContactNumber());
                System.out.println("Car Number  : " + car.getCarNumber());
                System.out.println("Arrival     : " + car.getArrivalTime());
                System.out.println("Slot        : " + slots[i].getSlotNumber());

                return;
            }
        }

        System.out.println("\nCar not found.");
    }

    public void showStatus() {

        System.out.println("\n----- Parking Status -----");

        for (int i = 0; i < slots.length; i++) {

            if (slots[i].isOccupied()) {

                System.out.println(
                    "Slot " + slots[i].getSlotNumber()
                    + " : Occupied - "
                    + slots[i].getCar().getCarNumber()
                );

            } else {

                System.out.println(
                    "Slot " + slots[i].getSlotNumber()
                    + " : Available"
                );
            }
        }
    }
}
