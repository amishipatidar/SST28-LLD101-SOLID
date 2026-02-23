class ReceiptPrinter {

    void print(BookingRequest request, FeeResult result) {

        System.out.println("=== Hostel Fee Calculator ===");
        System.out.println("Room: " + request.roomType +
                " | AddOns: " + request.addOns);

        System.out.println("Monthly: " +
                String.format("%.2f", result.monthly));

        System.out.println("Deposit: " +
                String.format("%.2f", result.deposit));

        System.out.println("TOTAL DUE NOW: " +
                String.format("%.2f", result.total));
    }
}