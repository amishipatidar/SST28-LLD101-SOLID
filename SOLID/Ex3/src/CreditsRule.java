class CreditsRule implements EligibilityRule {

    private int minCredits;

    CreditsRule(int minCredits) {
        this.minCredits = minCredits;
    }

    public void evaluate(StudentProfile profile, EvaluationResult result) {
        if (profile.earnedCredits < minCredits) {
            result.addReason("credits below " + minCredits);
        }
    }
}