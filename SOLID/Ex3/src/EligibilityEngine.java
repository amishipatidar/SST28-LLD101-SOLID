import java.util.List;

class EligibilityEngine {

    private List<EligibilityRule> rules;
    private FakeEligibilityStore store;
    private ReportPrinter printer;

    EligibilityEngine(List<EligibilityRule> rules,
                      FakeEligibilityStore store,
                      ReportPrinter printer) {
        this.rules = rules;
        this.store = store;
        this.printer = printer;
    }

    void evaluate(StudentProfile profile) {

        EvaluationResult result = new EvaluationResult();

        for (EligibilityRule rule : rules) {
            rule.evaluate(profile, result);
        }

        printer.print(profile, result);

        store.save(profile.rollNo);
    }
}