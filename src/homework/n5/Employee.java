package homework.n5;

public class Employee {
    private String FIO;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String FIO, String position, String email, String phoneNumber, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getEmployeeInfo(){
        System.out.println(this.FIO);
        System.out.println(this.position);
        System.out.println(this.email);
        System.out.println(this.phoneNumber);
        System.out.println(this.salary);
        System.out.println(this.age);
    }

    public String getFIO() {
        return FIO;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
