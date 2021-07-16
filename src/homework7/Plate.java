package homework7;

public class Plate {
    int amount;

    public Plate(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

//    public void setAmount(int amount) {
//        this.amount = amount;
//    }

    public void eatfromplate(Plate plate, Cat cat) {
        amount = plate.getAmount() - cat.getSatietyamount();
        System.out.println(cat.getName() + " succesfully eated and doesn`t hungry anymore. ");
        cat.setSatiety(true);
    }

    public void addfoodtoplate(int addamount) {
        if (addamount <= 0) {
            System.out.println("Incorrect amount. Food amount haven`t changed.");
        } else {
            this.amount = amount + addamount;
            System.out.println("Succesfully added " + addamount + " food. Current food amount = " + amount);
        }
    }
}
