import java.util.ArrayList;
import java.util.Map;

public class uberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatMaterial;
    private Integer passenger;

    public uberVan(String license, Account driver,
            Map<String, Map<String, Integer>> typeCarAccepted,
            ArrayList<String> seatMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatMaterial = seatMaterial;
    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
            this.passenger = (passenger);
        } else {
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }
}
