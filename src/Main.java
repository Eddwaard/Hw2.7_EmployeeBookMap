public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee(new Employee("Игорь", "Карпов", "Семёнович", 1, EmployeeBook.getGeneratedSalary()));
        employeeBook.addEmployee(new Employee("Василий", "Водолазов", "Александрович", 2, EmployeeBook.getGeneratedSalary()));
        employeeBook.addEmployee(new Employee("Алёна", "Водонаева", "Игоревна", 1, EmployeeBook.getGeneratedSalary()));
        employeeBook.addEmployee(new Employee("Анастасия", "Бой", "Никифоровна", 3, EmployeeBook.getGeneratedSalary()));
        employeeBook.addEmployee(new Employee("Петр", "Капралов", "Дионисович", 5, EmployeeBook.getGeneratedSalary()));
        employeeBook.addEmployee(new Employee("Владимир", "Владимиров", "Владимирович", 4, EmployeeBook.getGeneratedSalary()));
        employeeBook.addEmployee(new Employee("Гарри", "Чердаков", "Робертавич", 2, EmployeeBook.getGeneratedSalary()));
        employeeBook.addEmployee(new Employee("Казбек", "Горин", "Ильбрусович", 3, EmployeeBook.getGeneratedSalary()));
        employeeBook.addEmployee(new Employee("Соня", "Коробочкина", "Камиловна", 4, EmployeeBook.getGeneratedSalary()));
        employeeBook.addEmployee(new Employee("Эдуард", "Даутоков", "Магометович", 1, EmployeeBook.getGeneratedSalary()));
        System.out.println("task1");
        employeeBook.printAll();
        System.out.println("task2");
        System.out.println(employeeBook.getOurSalary());
        System.out.println("task3");
        System.out.println(employeeBook.getEmployeeMinSalary());
        System.out.println("task4");
        System.out.println(employeeBook.getEmployeeMaxSalary());
        System.out.println("task5");
        System.out.println(employeeBook.getAverageSalary());
        System.out.println("task6");
        employeeBook.getFullNameAll();

    }


}