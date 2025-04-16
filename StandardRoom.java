public class StandardRoom extends Room {
    public StandardRoom(int roomNumber) {
        super(roomNumber, 100.0);
    }

    @Override
    public void displayDetails() {
        System.out.println("Standard Room #" + roomNumber + " | Price: $" + price + " | Booked: " + isBooked);
    }

    @Override
    public String getRoomType() {
        return "Standard";
    }
}
