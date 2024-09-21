import java.util.ArrayList;
import java.util.Collections;

public class TicketAgent {
  public static void main(String[] args) {
    ArrayList<AirlineTickets> tickets = new ArrayList<AirlineTickets>();

    AirlineTickets t = new AirlineTickets("Spirit", 125.00, 2);
    tickets.add(t);
    t = new AirlineTickets("Delta", 350.00, 0);
    tickets.add(t);
    t = new AirlineTickets("Delta", 10000.00, 2);
    tickets.add(t);
    t = new AirlineTickets("Fun Bus", 25.00, 5);
    tickets.add(t);
    t = new AirlineTickets("Southwest", 350.00, 1);
    tickets.add(t);
    t = new AirlineTickets("Spirit", 170.00, 1);
    tickets.add(t);

    Collections.sort(tickets);

    for (AirlineTickets at : tickets) {
      System.out.println(at);
    }
  }
}
