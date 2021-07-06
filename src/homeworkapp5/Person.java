package homeworkapp5;

public class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary='" + salary +
                ", age='" + age +
                '}';
    }

    public void printInfo(){
        System.out.print(name + " " + position + " " + email + " " + phone + " " + salary + " " + age);
        System.out.println();
    }

    public int getAge() {
        return age;
    }
//
//    public String getФИО() {
//        return ФИО;
//    }
//
//    public String getДолжность() {
//        return должность;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getТелефон() {
//        return телефон;
//    }
//
//    public int getЗарплата() {
//        return зарплата;
    }

