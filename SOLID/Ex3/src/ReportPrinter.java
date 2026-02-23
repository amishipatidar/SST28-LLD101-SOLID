class ReportPrinter {

    void print(StudentProfile profile, EvaluationResult result) {

        System.out.println("=== Placement Eligibility ===");
        System.out.println("Student: " + profile);

        if (result.isEligible()) {
            System.out.println("RESULT: ELIGIBLE");
        } else {
            System.out.println("RESULT: NOT_ELIGIBLE");
            for (String reason : result.getReasons()) {
                System.out.println("- " + reason);
            }
        }
    }
}