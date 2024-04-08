import java.util.ArrayList;
import java.util.Map;

public class uberBlack extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatMaterial;

    public uberBlack(String license, Account driver,
            Map<String, Map<String, Integer>> typeCarAccepted,
            ArrayList<String> seatMaterial) {
        super(license, driver);
        this.seatMaterial = seatMaterial;
        this.typeCarAccepted = typeCarAccepted;
    }
}
