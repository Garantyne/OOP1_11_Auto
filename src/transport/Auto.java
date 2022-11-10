package transport;

public class Auto {
    private String brand;
    private String model;
    double vMotor;//хотя тут на мой взгляд подошло бы больше обозначение v_motor в джаве так допустимо писать?
     String color;
    private int year;
    private String country;
    String transmission;
    private String typeOfCorpus;
    String govNumber;
    private int numberOfSeats;
    String protector;
    private Key key;

    public Auto(String brand, String model, double vMotor, String color, int year, String country,
                String transmission, String typeOfCorpus, String govNumber, int numberOfSeats, String protector){
        if(brand==null|| brand == ""){
            this.brand = "default";
        }else{ this.brand = brand;}
        if(model == null|| model == ""){
            this.model = "default";
        }else{ this.model = model;}
        if(vMotor<1.5){
            this.vMotor = 1.5;
        }else{ this.vMotor = vMotor;}
        if(color == null||color == ""){
            this.color = "белый";
        }else{ this.color = color;}
        if(year<2000){
            this.year = 2000;
        }else{ this.year = year;}
        if(country == null){
            this.country = "default";
        }else{
            this.country = country;
        }
        if (transmission.equals("A") ) {
            this.transmission = "Автоматическая коробка передач ";
        } else {
            this.transmission = "Механическая коробка передач";
        }
        if (typeOfCorpus.equals("S")) {
            this.typeOfCorpus = "Sedan";
        } else {
            this.typeOfCorpus = "universal";
        }
        if (govNumber.length() > 9) {
            this.govNumber = "Введен некорректный номер";
        } else {
            this.govNumber = govNumber;
        }
        if (numberOfSeats > 5) {
            this.numberOfSeats = 5;
        }
        if (protector.equals("W")) {
            this.protector = "winter";
        } else {
            this.protector = "summer";
        }
    }

    public  Auto(String model, double vMotor, String color, int year, String country,
                       String transmission, String typeOfCorpus, String govNumber, int numberOfSeats, String protector) {

        this.brand = "default";

        if (model == null || model == "") {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (vMotor < 1.5) {
            this.vMotor = 1.5;
        } else {
            this.vMotor = vMotor;
        }
        if (color == null || color == "") {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year < 2000) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (transmission.equals("A") ) {
            this.transmission = "Автоматическая коробка передач ";
        } else {
            this.transmission = "Механическая коробка передач";
        }
        if (typeOfCorpus.equals("S")) {
            this.typeOfCorpus = "Sedan";
        } else {
            this.typeOfCorpus = "universal";
        }
        if (govNumber.length() > 9) {
            this.govNumber = "Введен некорректный номер";
        } else {
            this.govNumber = govNumber;
        }
        if (numberOfSeats > 5) {
            this.numberOfSeats = 5;
        }
        if (protector.equals("W")) {
            this.protector = "winter";
        } else {
            this.protector = "summer";
        }
    }

    public Auto(String brand, String model,  String color, int year, String country,
                String transmission, String typeOfCorpus, String govNumber, int numberOfSeats){
        if(brand==null|| brand == ""){
            this.brand = "default";
        }else{ this.brand = brand;}
        if(model == null|| model == ""){
            this.model = "default";
        }else{ this.model = model;}

        this.vMotor = 1.5;

        if(color == null||color == ""){
            this.color = "белый";
        }else{ this.color = color;}
        if(year<2000){
            this.year = 2000;
        }else{ this.year = year;}
        if(country == null){
            this.country = "default";
        }else{ this.country = country;}
        if(transmission.equals("A")){
            this.transmission = "Автоматическая коробка передач ";
        }else{this.transmission = "Механическая коробка передач";}
        if(typeOfCorpus.equals("S")){
            this.typeOfCorpus = "Sedan";
        }else{this.typeOfCorpus = "universal";}
        if(govNumber.length()>9){
            this.govNumber = "Введен некорректный номер";
        }else{this.govNumber = govNumber;}
        if(numberOfSeats>5){
            this.numberOfSeats = 5;
        }
        this.protector = "winter";

    }

    public Auto(String brand, String model, double vMotor,  int year, String country,
                String transmission, String typeOfCorpus, String govNumber, String protector){
        if(brand==null|| brand == "")
        {
            this.brand = "default";
        }
        else{
            this.brand = brand;
        }
        if(model == null|| model == ""){
            this.model = "default";
        }
        else{
            this.model = model;
        }
        if(vMotor<1.5){
            this.vMotor = 1.5;
        }
        else{
            this.vMotor = vMotor;
        }
        this.color = "белый";
        if(year<2000){
            this.year = 2000;
        }
        else{
            this.year = year;
        }
        if(country == null){
            this.country = "default";
        }
        else{
            this.country = country;
        }
        if(transmission.equals("A") ){
            this.transmission = "Автоматическая коробка передач ";
        }
        else{
            this.transmission = "Механическая коробка передач";
        }
        if(typeOfCorpus.equals("S")){
            this.typeOfCorpus = "Sedan";
        }
        else{
            this.typeOfCorpus = "universal";
        }
        if(govNumber.length()>9){
            this.govNumber = "Введен некорректный номер";
        }
        else{
            this.govNumber = govNumber;
        }
        if(numberOfSeats>5){
            this.numberOfSeats = 5;
        }
        if(protector.equals("W")==true){
            this.protector = "winter";
        }
        else{
            this.protector = "summer";
        }
    }
        public Auto( String model, double vMotor, String color, int year,
                 String transmission, String typeOfCorpus, int numberOfSeats, String protector){

        this.brand = "default";

        if(model == null|| model == ""){
            this.model = "default";
        }else{ this.model = model;}
        if(vMotor<1.5){
            this.vMotor = 1.5;
        }else{ this.vMotor = vMotor;}
        if(color == null||color == ""){
            this.color = "белый";
        }else{ this.color = color;}
        if(year<2000){
            this.year = 2000;
        }else{ this.year = year;}
        this.country = "default";
        if(transmission.equals("A") ){
            this.transmission = "Автоматическая коробка передач ";
        }else{this.transmission = "Механическая коробка передач";}
        if(typeOfCorpus.equals("S")){
            this.typeOfCorpus = "Sedan";
        }else{this.typeOfCorpus = "universal";}
        if(govNumber.length()>9){
            this.govNumber = "Введен некорректный номер";
        }else{this.govNumber = govNumber;}
        if(numberOfSeats>5){
            this.numberOfSeats = 5;
        }
        if(protector.equals("W")){
            this.protector = "winter";
        }else{this.protector = "summer";}
        }





    @Override
    public String toString() {
        return "Марка авто - " + brand +
                " \nмодель - " + model +
                " \nОбъем двигателя- " + vMotor +" литра "+
                " \nцвет - " + color +
                " \nгод выпуска - " + year +
                " \nСтрана сборки - " + country +
                " \nКоробка передач - " + transmission +
                " \nТип кузова - " +typeOfCorpus +
                " \nРегистрационный номер - " + govNumber +
                " \nКоличество мест - " + numberOfSeats +
                " \nРезина стоит - " + protector;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getvMotor() {
        return vMotor;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setvMotor(double vMotor) {
        this.vMotor = vMotor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getTypeOfCorpus() {
        return typeOfCorpus;
    }

    public void setTypeOfCorpus(String typeOfCorpus) {
        this.typeOfCorpus = typeOfCorpus;
    }

    public String getGovNumber() {
        return govNumber;
    }

    public void setGovNumber(String govNumber) {
        this.govNumber = govNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getProtector() {
        return protector;
    }

    public void setProtector(String protector) {
        this.protector = protector;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void swapProtector(boolean sProt){
        if(sProt){
            setProtector("Summer");
        }else{
            setProtector("Winter");
        }
    }
    public static class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;


        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            if (remoteEngineStart) {
                System.out.println("можете запускать эту тачку удаленно");
            } else {
                System.out.println("Иди запускай тачку самостоятельно");
            }
            if (keylessAccess) {
                System.out.println("прикладывай палец, ключи для слабаков");
            } else {
                System.out.println("добро пожаловать в наш клуб слабаков XD");
            }

        }

        public boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(boolean remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
        }

        public boolean getKeylessAccess() {
            return keylessAccess;
        }

        public void setKeylessAccess(boolean keylessAccess) {
            this.keylessAccess = keylessAccess;
        }

    }
        public  class Insurance{
            private String insuranceМalidityPeriod;
            private float costOfInsurance;
            private String numberOfInsurance;



            public Insurance(String insuranceМalidityPeriod, float costOfInsurance, String numberOfInsurance){
                if(insuranceМalidityPeriod.equals(123)){
                    System.out.println("интересно откуда я должен получить эти знания...");
                }else{
                    this.insuranceМalidityPeriod = insuranceМalidityPeriod;
                }
                if(numberOfInsurance.length()!=9){
                    System.out.println("Введен некорректный номер");
                }else{
                    this.numberOfInsurance = numberOfInsurance;
                }
                if(costOfInsurance<=0){
                    System.out.println("Введен некорректный ценник");
                }else{
                    this.costOfInsurance = costOfInsurance;
                }

            }
        }

}
