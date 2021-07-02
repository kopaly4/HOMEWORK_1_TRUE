package homeworkapp5;

public class homeworkapp5 {
    public static void main(String[] args) {
        Сотрудник[] employee = {new Сотрудник("Мишина Юлия Сергеевна", "Генеральный директор", "mishina_y@mail.ru", "89013331923", 800000, 25),
                new Сотрудник("Cмоленский Павел Петрович", "Заместитель ген.директора", "smolensky_p@mail.ru", "89018295591", 300000, 22),
                new Сотрудник("Орехова Гульнара Нуримовна", "Уборщица", "gulyanurim@mail.ru", "89996713187", 25000, 42),
                new Сотрудник("Григорьева Ольга Сергеевна", "Секретарь", "grigorolga@mail.ru", "89265152345", 60000, 45),
                new Сотрудник("Сидоров Федор Павлович", "Программист Java", "Sifedor@mail.ru", "89019012231", 150000, 20),
        };
        for (int i = 0; i <employee.length ; i++) {
            if (employee[i].getВозраст() > 40){
                System.out.println(employee[i].getФИО() + " " + employee[i].getДолжность() + " " + employee[i].getEmail() + " " + employee[i].getТелефон() + " " + employee[i].getЗарплата() + " " + employee[i].getВозраст());;
            }
        }

        }
    }




