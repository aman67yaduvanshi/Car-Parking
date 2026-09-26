import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 5 slots
        ParkingManager manager = new ParkingManager(5);

        while (true) {

            System.out.println("\n==============================");
            System.out.println("    CAR PARKING MANAGEMENT");
            System.out.println("==============================");
            System.out.println("1. Park Car");
            System.out.println("2. Remove Car");
            System.out.println("3. Search Car");
            System.out.println("4. Show Parking Status");
            System.out.println("5. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.println("\n--- Park Car ---");

                System.out.print("Owner Name: ");
                String ownerName = sc.nextLine();

                System.out.print("Contact Number: ");
                String contactNumber = sc.nextLine();

                System.out.print("Car Number: ");
                String carNumber = sc.nextLine();

                System.out.print("Arrival Time: ");
                String arrivalTime = sc.nextLine();

                Car car = new Car(
                    ownerName,
                    contactNumber,
                    carNumber,
                    arrivalTime
                );

                manager.parkCar(car);

            } else if (choice == 2) {

                System.out.println("\n--- Remove Car ---");

                System.out.print("Car Number: ");
                String carNumber = sc.nextLine();

                System.out.print("Leaving Time: ");
                String leavingTime = sc.nextLine();

                manager.removeCar(carNumber, leavingTime);

            } else if (choice == 3) {

                System.out.println("\n--- Search Car ---");

                System.out.print("Car Number: ");
                String carNumber = sc.nextLine();

                manager.searchCar(carNumber);

            } else if (choice == 4) {

                manager.showStatus();

            } else if (choice == 5) {

                System.out.println("\nThank you for using the system.");
                break;

            } else {

                System.out.println("\nInvalid choice.");
            }
        }

        sc.close();
    }
}
