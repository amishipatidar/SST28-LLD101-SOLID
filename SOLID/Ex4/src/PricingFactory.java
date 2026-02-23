import java.util.ArrayList;
import java.util.List;

class PricingFactory {

    List<PricingComponent> buildComponents(BookingRequest request) {

        List<PricingComponent> components = new ArrayList<>();

        // Room pricing
        switch (request.roomType) {
            case "SINGLE":
                components.add(new RoomPricing(12000, 5000));
                break;
            case "DOUBLE":
                components.add(new RoomPricing(15000, 5000));
                break;
            case "TRIPLE":
                components.add(new RoomPricing(10000, 3000));
                break;
        }

        // Add-ons
        for (String addOn : request.addOns) {

            if (addOn.equals("LAUNDRY")) {
                components.add(new AddOnPricing(500));
            }

            if (addOn.equals("MESS")) {
                components.add(new AddOnPricing(500));
            }
        }

        return components;
    }
}