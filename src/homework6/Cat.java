package homework6;

public class Cat extends Animals {
    static int catcounter;

    public Cat(String name) {
        this.name = name;
        catcounter++;
        animalcounter++;
    }

    @Override
    public void run(int a) {
        if (a > 200 || a <= 0) {
            System.out.println(name + " can`t run this distance.");
        } else System.out.println(name + " has run " + a + " meters");
    }

    public void swim(int b) {
        System.out.println(name + " can`t swim");
    }

//    public int getCatcounter() {
//        return catcounter;
//    }
}


