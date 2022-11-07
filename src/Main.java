public class Main {
    public static void main(String[] args) {
        Auto lada = new Auto("Lada","Granta",1.7,"Желтый",2015,"Россия");
        Auto audi = new Auto("Audi","A8 50 L TDI quattro",3.0,"Черный",2020,"Германия");
        Auto bmw = new Auto("BMW","Z8",3.0,"Черный",2021,"германия");
        Auto kia = new Auto("KIA","Sportage",2.4,"Красный",2018,"Южная Корея");
        Auto hyundai = new Auto("Hyundai","Avante",1.6,"Оранжевый",2016,"Южная Корея");
        Auto kop = new Auto("","asd",1,"",19,null);
        Auto kot = new Auto("asd",1,"",19,null);

        System.out.println(lada.toString());
        System.out.println();
        System.out.println(audi.toString());
        System.out.println();
        System.out.println(bmw.toString());
        System.out.println();
        System.out.println(kia.toString());
        System.out.println();
        System.out.println(hyundai.toString());
        System.out.println();
        System.out.println(kop.toString());
        System.out.println();
        System.out.println(kot.toString());
    }
}