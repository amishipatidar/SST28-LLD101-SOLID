class AddOnPricing implements PricingComponent {

    private double monthlyFee;

    AddOnPricing(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public double monthly() {
        return monthlyFee;
    }

    public double deposit() {
        return 0;
    }
}