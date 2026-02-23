import java.util.List;

class BookingRequest {

    String bookingId;
    String roomType;
    List<String> addOns;

    BookingRequest(String bookingId,
                   String roomType,
                   List<String> addOns) {
        this.bookingId = bookingId;
        this.roomType = roomType;
        this.addOns = addOns;
    }
}