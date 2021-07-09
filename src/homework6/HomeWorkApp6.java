package homework6;

public class HomeWorkApp6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik");
        Dog dog1 = new Dog("Bobik");
        cat1.run(150);
        cat1.run(0);
        cat1.run(201);
        cat1.swim(20);
        dog1.run(250);
        dog1.run(505);
        dog1.run(-20);
        dog1.swim(20);
        dog1.swim(10);
        Cat cat2 = new Cat("Barsik");
        Cat cat3 = new Cat("Mirka");
        System.out.println(Cat.catcounter);
        System.out.println(Dog.dogcounter);
        System.out.println(Animals.animalcounter);

    }
}
