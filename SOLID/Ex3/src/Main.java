import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        StudentProfile profile =
                new StudentProfile(
                        "23BCS1001",
                        "Ayaan",
                        8.10,
                        72,
                        18,
                        "NONE"
                );

        List<EligibilityRule> rules = new ArrayList<>();
        rules.add(new CGRRule(7.0));
        rules.add(new AttendanceRule(75));
        rules.add(new CreditsRule(20));
        rules.add(new DisciplineRule());

        FakeEligibilityStore store = new FakeEligibilityStore();
        ReportPrinter printer = new ReportPrinter();

        EligibilityEngine engine =
                new EligibilityEngine(rules, store, printer);

        engine.evaluate(profile);
    }
}