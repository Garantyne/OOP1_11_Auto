public class Auto {
    private String brand;
    private String model;
    private double vMotor;//хотя тут на мой взгляд подошло бы больше обозначение v_motor в джаве так допустимо писать?
    private String color;
    private int year;
    private String country;

    public Auto(String brand, String model, double vMotor, String color, int year, String country){
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
        }else{ this.country = country;}
    }

    public Auto( String model, double vMotor, String color, int year, String country){

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
        if(country == null){
            this.country = "default";
        }else{ this.country = country;}
    }

    public Auto(String brand, String model,  String color, int year, String country){
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
    }

    public Auto(String brand, String model, double vMotor,  int year, String country){
        if(brand==null|| brand == ""){
            this.brand = "default";
        }else{ this.brand = brand;}
        if(model == null|| model == ""){
            this.model = "default";
        }else{ this.model = model;}
        if(vMotor<1.5){
            this.vMotor = 1.5;
        }else{ this.vMotor = vMotor;}
        this.color = "белый";
        if(year<2000){
            this.year = 2000;
        }else{ this.year = year;}
        if(country == null){
            this.country = "default";
        }else{ this.country = country;}
    }

    public Auto( String model, double vMotor, String color, int year){

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
        }





    @Override
    public String toString() {
        return "Марка авто - " + brand +
                " \nмодель - " + model +
                " \nОбъем двигателя- " + vMotor +" литра "+
                " \nцвет - " + color +
                " \nгод выпуска - " + year +
                " \nСтрана сборки - " + country ;
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
}
