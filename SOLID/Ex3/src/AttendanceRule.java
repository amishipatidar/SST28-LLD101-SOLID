class AttendanceRule implements EligibilityRule {

    private int minAttendance;

    AttendanceRule(int minAttendance) {
        this.minAttendance = minAttendance;
    }

    public void evaluate(StudentProfile profile, EvaluationResult result) {
        if (profile.attendancePct < minAttendance) {
            result.addReason("attendance below " + minAttendance);
        }
    }
}