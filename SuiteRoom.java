public class SuiteRoom extends Room {
    public SuiteRoom(int roomNumber) {
        super(roomNumber, 200.0);
    }

    @Override
    public void displayDetails() {
        System.out.println("Suite Room #" + roomNumber + " | Price: $" + price + " | Booked: " + isBooked);
    }

    @Override
    public String getRoomType() {
        return "Suite";
    }
}
