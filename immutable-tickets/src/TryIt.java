import com.example.tickets.IncidentTicket;
import com.example.tickets.TicketService;

import java.util.List;

public class TryIt {

    public static void main(String[] args) {

        TicketService service = new TicketService();

        IncidentTicket t = service.createTicket(
                "TCK-1001",
                "reporter@example.com",
                "Payment failing on checkout"
        );

        System.out.println("Created:\n" + t);

        t = service.assign(t, "agent@example.com");
        t = service.escalateToCritical(t);

        System.out.println("\nAfter updates:\n" + t);

        try {
            List<String> tags = t.getTags();
            tags.add("HACKED");
        } catch (Exception e) {
            System.out.println("\nExternal mutation blocked: " + e);
        }

        System.out.println("\nFinal ticket:\n" + t);
    }
}