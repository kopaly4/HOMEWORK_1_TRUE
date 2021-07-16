package homework7;

public class Cat {
    private String name;
    private boolean satiety;
    private final int satietyamount;

    public Cat(String name, int satietyamount) {
        this.name = name;
        this.satietyamount = satietyamount;
        satiety = false;
    }

    public String getName() {
        return name;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

//    public boolean isSatiety() {
//        return satiety;
//    }

    public void printIsSatiety() {
        if (satiety) {
            System.out.println(name + " is full");
        } else System.out.println(name + " is hungry");

    }

    public int getSatietyamount() {
        return satietyamount;
    }

    public void eat(Plate plate) {
        if (plate.getAmount() - satietyamount < 0) {
            System.out.println(name + " couldn`t eat (not enough food to be full)");
        } else {
            plate.eatfromplate(plate, Cat.this);
        }
    }
}
