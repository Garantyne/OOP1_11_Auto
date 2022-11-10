import transport.Auto;

public class Main {
    public static void main(String[] args) {
        Auto.Key ladaa = new Auto.Key(true,true);

        Auto lada = new Auto("Lada","Granta",1.7,"Желтый",2015,"Россия",
                "A","S","A123AA892",4,"W");
        Auto audi = new Auto("Audi","A8 50 L TDI quattro",3.0,"Черный",2020,"Германия",
                "A","S","A123AA892",4,"W");
        Auto bmw = new Auto("BMW","Z8",3.0,"Черный",2021,"германия",
                "A","S","A123AA892",4,"W");
        Auto kia = new Auto("KIA","Sportage",2.4,"Красный",2018,"Южная Корея",
                "A","S","A123AA892",4,"W");
        Auto hyundai = new Auto("Hyundai","Avante",1.6,"Оранжевый",2016,"Южная Корея",
                "A","S","A123AA892",4,"W");
        Auto kop = new Auto("","asd",1,"",19,null,
                "A","S","A123AA892",4,"W");
        lada.setKey(ladaa);


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
        lada.swapProtector(false);
        System.out.println("поменяли резину на " + lada.getProtector());

        System.out.println(ladaa);

    }
}