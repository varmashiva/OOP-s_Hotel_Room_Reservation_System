public class VIPRoom extends Room {
    public VIPRoom(int roomNumber) {
        super(roomNumber, 350.0);
    }

    @Override
    public void displayDetails() {
        System.out.println("VIP Room #" + roomNumber + " | Price: $" + price + " | Booked: " + isBooked);
    }

    @Override
    public String getRoomType() {
        return "VIP";
    }
}
