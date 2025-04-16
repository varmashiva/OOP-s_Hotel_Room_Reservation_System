abstract class Room {
    protected int roomNumber;
    protected double price;
    protected boolean isBooked;

    public Room(int roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.isBooked = false;
    }

    public boolean isAvailable() {
        return !isBooked;
    }

    public void bookRoom() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Room " + roomNumber + " booked successfully.");
        } else {
            System.out.println("Room " + roomNumber + " is already booked.");
        }
    }

    public void cancelBooking() {
        if (isBooked) {
            isBooked = false;
            System.out.println("Room " + roomNumber + " booking cancelled.");
        } else {
            System.out.println("Room " + roomNumber + " is not currently booked.");
        }
    }

    public abstract void displayDetails();
    public abstract String getRoomType();
}
