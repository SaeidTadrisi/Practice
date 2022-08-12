package VehicleP.Car;

public enum GearBox {
    AUTOMATIC ("Otomatik", "Automatic"),
    MANUAL("Dasti", "Manual");

    private final String toPersian;
    private final String toEnglish;

    GearBox(String toPersian, String toEnglish) {
        this.toPersian = toPersian;
        this.toEnglish = toEnglish;
    }


    public static void print() {
        GearBox[] values = GearBox.values();
        for (int index = 0; index < values.length; index++) {
            System.out.println(values[index]);
        }
    }

    public static void printInPersian(){
        GearBox[] values = GearBox.values();
        for (int index = 0; index < values.length; index++) {
            GearBox value = values[index];
            System.out.println(value.toPersian);
        }
    }

    public static void printInEnglish(){
        GearBox[] values = GearBox.values();
        for (int index = 0; index < values.length; index++) {
            GearBox value = values[index];
            System.out.println(value.toEnglish);
        }
    }

//    public String getToPersian() {
//        return toPersian;
//    }
//
//    public String getToEnglish() {
//        return toEnglish;
//    }

}
