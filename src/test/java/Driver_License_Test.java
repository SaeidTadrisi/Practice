import org.junit.jupiter.api.Test;

public class Driver_License_Test {

    @Test
    void printDriverInformation() {

        Driver driver = new Driver();
        Driver.license license = driver.new license();
        license.print();
    }

    @Test
    void printDriverName() {
        Driver.staticLicense staticLicense = new Driver.staticLicense();
        staticLicense.print();
    }
}
