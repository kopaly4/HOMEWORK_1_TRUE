package homeworkapp5;

public class homeworkapp5 {
    public static void main(String[] args) {
        Person[] employee = {new Person("Mishina Yuliya", "Director", "mishina_y@mail.ru", "89013331923", 800000, 25),
                new Person("Smolensky Pavel", "Associate Director", "smolensky_p@mail.ru", "89018295591", 300000, 22),
                new Person("Orehova Gulnara", "Cleaner", "gulyanurim@mail.ru", "89996713187", 25000, 42),
                new Person("Grigorieva Olga", "Secretary", "grigorolga@mail.ru", "89265152345", 60000, 45),
                new Person("Sidorov Fedor", "junior Java developer", "Sifedor@mail.ru", "89019012231", 150000, 20),
        };
        for (int i = 0; i <employee.length ; i++) {
            if (employee[i].getAge() > 40){
                employee[i].printInfo();
                //System.out.println(employee[i].getФИО() + " " + employee[i].getДолжность() + " " + employee[i].getEmail() + " " + employee[i].getТелефон() + " " + employee[i].getЗарплата() + " " + employee[i].getВозраст());;
            }
        }

        }
    }




