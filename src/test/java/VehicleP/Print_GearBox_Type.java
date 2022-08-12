package VehicleP;

import VehicleP.Car.GearBox;
import org.junit.jupiter.api.Test;

public class Print_GearBox_Type {

    @Test
    void must_print_all_gearbox_type() {
        GearBox.print();
    }

    @Test
    void must_print_in_persian() {
        GearBox.printInPersian();
    }

    @Test
    void must_print_in_english() {
        GearBox.printInEnglish();
    }
}
