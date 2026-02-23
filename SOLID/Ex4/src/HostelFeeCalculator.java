import java.util.List;

class HostelFeeCalculator {

    private PricingFactory factory;

    HostelFeeCalculator(PricingFactory factory) {
        this.factory = factory;
    }

    FeeResult calculate(BookingRequest request) {

        List<PricingComponent> components =
                factory.buildComponents(request);

        double monthly = 0;
        double deposit = 0;

        for (PricingComponent component : components) {
            monthly += component.monthly();
            deposit += component.deposit();
        }

        double total = monthly + deposit;

        return new FeeResult(monthly, deposit, total);
    }
}