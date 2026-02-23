class CGRRule implements EligibilityRule {

    private double minCgr;

    CGRRule(double minCgr) {
        this.minCgr = minCgr;
    }

    public void evaluate(StudentProfile profile, EvaluationResult result) {
        if (profile.cgr < minCgr) {
            result.addReason("CGR below " + minCgr);
        }
    }
}