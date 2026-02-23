import java.util.ArrayList;
import java.util.List;

class EvaluationResult {

    private List<String> reasons = new ArrayList<>();

    void addReason(String reason) {
        reasons.add(reason);
    }

    boolean isEligible() {
        return reasons.isEmpty();
    }

    List<String> getReasons() {
        return reasons;
    }
}