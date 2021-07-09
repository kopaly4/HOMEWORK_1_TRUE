package homework6;

public class Dog extends Animals {
    static int dogcounter;

    public Dog(String name) {
        this.name = name;
        dogcounter++;
        animalcounter++;
    }

    @Override
    public void run(int a) {
        if (a <= 0 || a > 500) {
            System.out.println(name + " can`t run this distance");
        } else System.out.println(name + " has run " + a + " meters");
    }

    public void swim(int b) {
        if (b <= 0 || b > 10) {
            System.out.println(name + " can`t swim this distance");
        } else System.out.println(name + " has swum " + b + " meters");
    }

//    public int getDogcounter() {
//        return dogcounter;
//    }
}
