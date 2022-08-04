package Vehicle;

public class Driver {

    private static String driverName = "Josh";
    private String licenseType = "A1";


    public static class staticLicense {
        public void print(){
            System.out.println("Static Class");
            System.out.println(driverName);
        }
    }

    public class license {
        public void print (){
            System.out.println("Non Static Class");
            System.out.println(driverName);
            System.out.println(licenseType);
        }
    }

}