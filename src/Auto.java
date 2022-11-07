public class Auto {
    String brand;
    String model;
    double vMotor;//хотя тут на мой взгляд подошло бы больше обозначение v_motor в джаве так допустимо писать?
    String color;
    int year;
    String country;

    public Auto(String brand, String model, double vMotor, String color, int year, String country){
        this.brand = brand;
        this.model = model;
        this.vMotor = vMotor;
        this.color = color;
        this.year = year;
        this.country = country;
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
}
