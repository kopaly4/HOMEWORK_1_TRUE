package homework7;

public class homeworkapp7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 10),
                new Cat("Sema", 50),
                new Cat("Murka", 15),
                new Cat("Chester", 5),
                new Cat("Sherstyannoy", 25),
        };
        Plate plate = new Plate(70);
//        plate.addfoodtoplate(35);
//        plate.addfoodtoplate(-151);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].printIsSatiety();
        }
//        Cat barsik = new Cat("Barsik", 10);
//        Cat sema = new Cat ("Sema", 50);
//        Cat murka = new Cat("Murka", 20);
//        Plate plate = new Plate(100);
//        barsik.eat(plate);
//        sema.eat(plate);
//        sema.eat(plate);
//        System.out.println(plate.getAmount());
//        sema.printIsSatiety();
//        murka.printIsSatiety();
//        barsik.printIsSatiety();
//        plate.addfoodtoplate(50);
//        System.out.println(plate.getAmount());


    }
}
