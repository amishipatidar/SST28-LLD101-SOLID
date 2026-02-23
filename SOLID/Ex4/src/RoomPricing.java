class RoomPricing implements PricingComponent {

    private double monthlyFee;
    private double depositFee;

    RoomPricing(double monthlyFee, double depositFee) {
        this.monthlyFee = monthlyFee;
        this.depositFee = depositFee;
    }

    public double monthly() {
        return monthlyFee;
    }

    public double deposit() {
        return depositFee;
    }
}