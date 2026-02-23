// import java.util.Arrays;

// class Main {

//     public static void main(String[] args) {

//         BookingRequest request =
//                 new BookingRequest(
//                         "H-7781",
//                         "DOUBLE",
//                         Arrays.asList("LAUNDRY", "MESS")
//                 );

//         PricingFactory factory = new PricingFactory();

//         HostelFeeCalculator calculator =
//                 new HostelFeeCalculator(factory);

//         FeeResult result =
//                 calculator.calculate(request);

//         ReceiptPrinter printer =
//                 new ReceiptPrinter();

//         printer.print(request, result);

//         BookingStore store =
//                 new BookingStore();

//         store.save(request.bookingId);
//     }
// }

import java.util.Arrays;

class Main {

    public static void main(String[] args) {

        BookingRequest request =
                new BookingRequest(
                        "H-7781",
                        "DOUBLE",
                        Arrays.asList("LAUNDRY", "MESS")
                );

        PricingFactory factory = new PricingFactory();

        HostelFeeCalculator calculator =
                new HostelFeeCalculator(factory);

        FeeResult result =
                calculator.calculate(request);

        ReceiptPrinter printer =
                new ReceiptPrinter();

        printer.print(request, result);

        BookingStore store =
                new BookingStore();

        store.save(request.bookingId);
    }
}