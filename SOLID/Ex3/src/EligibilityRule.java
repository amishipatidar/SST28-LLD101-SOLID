interface EligibilityRule {
    void evaluate(StudentProfile profile, EvaluationResult result);
}