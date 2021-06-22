package homework_2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        // boolean c = Compare(5,4);
        //System.out.println(c);
        // String string1 = "Я очень люблю Юлечку";
        //int p = 100;
        //PrintString(string1, p);
       // int yearr = 16;
       // boolean check = VisokosnoeCheck(yearr);
       // System.out.println(check);

    }

    public static boolean Compare(int a, int b) {
        if ((a + b) >= 10 & (a + b) <= 20) { // насколько я понял задание, от 10 (включительно) и до 20 (включительно)
            // System.out.println("true");
            return true;
        } else {
            //  System.out.println("false");
            return false;
        }
    }

    public static void CheckNumber(int c) {
        if (c >= 0) {
            System.out.println("Передано положительное число");
        } else {
            System.out.println("Передано отрицательное число");
        }

    }

    public static boolean CheckNumberBoolean(int d) {
        if (d >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void PrintString(String string, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println(string);
        }
    }

    public static boolean VisokosnoeCheck(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }


}
