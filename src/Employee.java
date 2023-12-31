import java.util.Objects;

public class Employee {
    private final int id;
    private static int count;
    private String name;
    private String surname;
    private String patronymic;
    private int department;
    private float salary;
    public Employee(String name, String surname, String patronymic, int department, float salary) {
        if (department<1 || department >5){
            throw new IllegalArgumentException("Номер отдела может быть в диапазоне от 1 - 5 а он :" + department);
        } else {
            this.name = name;
            this.surname = surname;
            this.patronymic = patronymic;
            this.department = department;
            this.salary = salary;
            this.id = count;
            count++;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return  Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(patronymic, employee.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic);
    }
}