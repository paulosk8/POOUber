class Main {
    public static void main(String[] args) {

        uberX uberX = new uberX("Tipo A", new Account("Paulo G.", "PGS-003"), "Mazda", "Mazda2");
        uberX.setPassenger(4);
        /* uberX.passenger = 3; */
        uberX.printDataCar();
        /*
         * uberVan uberVan = new uberVan("Tipo B", new Account("Jose P.", "JP-003"),
         * "mAZDA", "Mazda2");
         * uberVan.setPassenger(4);
         */
    }
}