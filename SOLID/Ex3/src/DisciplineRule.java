class DisciplineRule implements EligibilityRule {

    public void evaluate(StudentProfile profile, EvaluationResult result) {
        if (!profile.disciplinaryFlag.equals("NONE")) {
            result.addReason("disciplinary flag present");
        }
    }
}