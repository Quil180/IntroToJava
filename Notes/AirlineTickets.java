public class AirlineTickets implements Comparable<AirlineTickets> {
  private String airlineName;
  private double price;
  private int connections;

  public AirlineTickets(String n, double p, int c) {
    this.airlineName = n;
    this.price = p;
    this.connections = c;
  }

  public String toString() {
    return "Airline: " + this.airlineName + "($" + this.price + ", " + this.connections + ")";
  }

  @Override
  public int compareTo(AirlineTickets o) {
    // now to sort by spirit or not (1st priority)
    if (!this.airlineName.equals("Spirit") && o.airlineName.equals("Spirit")) {
      return 1;
    }
    if (this.airlineName.equals("Spirit") && !o.airlineName.equals("Spirit")) {
      return -1;
    }

    // now it will sort by price (ascending)... (as second priority)
    if (this.price - o.price > 0) {
      return 1;
    }
    if (this.price - o.price < 0) {
      return -1;
    }

    // sorts by connections (descending) (3rd priority)
    return o.connections - this.connections;
  }

}
