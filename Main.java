import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.addRoom(new StandardRoom(101));
        hotel.addRoom(new SuiteRoom(201));
        hotel.addRoom(new VIPRoom(301));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Hotel Room Reservation System =====");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            int roomNumber;
            switch (choice) {
                case 1:
                    hotel.listAvailableRooms();
                    break;
                case 2:
                    System.out.print("Enter room number to book: ");
                    roomNumber = scanner.nextInt();
                    hotel.bookRoom(roomNumber);
                    break;
                case 3:
                    System.out.print("Enter room number to cancel: ");
                    roomNumber = scanner.nextInt();
                    hotel.cancelRoom(roomNumber);
                    break;
                case 4:
                    System.out.println("Thank you for using the Hotel Reservation System!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
