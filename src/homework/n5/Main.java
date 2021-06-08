package homework.n5;


public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Иванов Иван Иванович", "tester", "ivanov@gmail.com",
                "+79101111111'", 100000, 35);

        employee.getEmployeeInfo();

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Петров Петр Петрович", "developer", "petrov@gmail.com",
                "+79102222222", 150000, 30);
        employeesArray[1] = new Employee("Баширов Башир Баширович", "system analyst", "bashirov@gmail.com",
                "+79103456789", 90000, 32);
        employeesArray[2] = new Employee("Семенов Семен Семенович", "project manager", "semenov@gmail.com",
                "+79611311112", 200000, 45);
        employeesArray[3] = new Employee("Калинина Мария Ивановна", "business analyst", "kalinina@gmail.com",
                "+79036401112", 100000, 33);
        employeesArray[4] = new Employee("Рогов Денис Дмитриевич", "team lead", "rogov@gmail.com",
                "+79056901934", 180000, 42);

        getEmployeeOver40(employeesArray);
    }

    private static void getEmployeeOver40(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee.getAge() > 40){
                employee.getEmployeeInfo();
            }
        }
    }
}
