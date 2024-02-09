import java.util.Scanner;

class Reservation {
    private String checkInDate;
    private String checkOutDate;
    private String roomType;

    public Reservation(String checkInDate, String checkOutDate, String roomType) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomType = roomType;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public String getRoomType() {
        return roomType;
    }
}

class Hotel {
    private static boolean isRoomAvailable(String roomType) {
        // Simulated room availability
        return switch (roomType) {
            case "single" -> true;
            case "double" -> false;
            case "suite" -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hotel Reservation System");

        System.out.print("Enter Check-In Date: ");
        String checkInDate = scanner.nextLine();

        System.out.print("Enter Check-Out Date: ");
        String checkOutDate = scanner.nextLine();

        System.out.print("Enter Room Type (single/double/suite): ");
        String roomType = scanner.nextLine();

        if (isRoomAvailable(roomType)) {
            Reservation reservation = new Reservation(checkInDate, checkOutDate, roomType);

            System.out.println("Room is available!");
            displayBookingDetails(reservation);
        } else {
            System.out.println("Room is not available for the selected dates.");
        }
    }

    private static void displayBookingDetails(Reservation reservation) {
        System.out.println("\nBooking Details:");
        System.out.println("Check-In Date: " + reservation.getCheckInDate());
        System.out.println("Check-Out Date: " + reservation.getCheckOutDate());
        System.out.println("Room Type: " + reservation.getRoomType());
    }
}
