import com.amadeus.Amadeus;
import com.amadeus.booking.FlightOrder;
import com.amadeus.exceptions.ResponseException;

public class FlightOrderManagement {
    public static void main(String[] args) throws ResponseException {

      Amadeus amadeus = Amadeus
              .builder("YOUR_AMADEUS_API_KEY","YOUR_AMAEUS_API_SECRET")
              .build();

      com.amadeus.resources.FlightOrder order = amadeus.booking.flightOrder("eJzTd9f3NjIJdzUGAAp%2fAiY=").get();

      if (order.getResponse().getStatusCode() != 200) {
        System.out.println("Wrong status code: " + order.getResponse().getStatusCode());
        System.exit(-1);
      }

      System.out.println(order);
     }
}
