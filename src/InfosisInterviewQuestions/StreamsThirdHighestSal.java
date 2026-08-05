package InfosisInterviewQuestions;
import java.util.Comparator;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String city;

    public Employee(int id, String name, double salary, String city) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id +
                ", name=" + name +
                ", salary=" + salary +
                ", city=" + city + "]";
    }
}

public class StreamsThirdHighestSal {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(101, "Amit Sharma", 75000, "Mumbai"),
                new Employee(102, "Priya Singh", 68000, "Pune"),
                new Employee(103, "Rahul Verma", 82000, "Bangalore"),
                new Employee(104, "Neha Gupta", 72000, "Delhi"),
                new Employee(105, "Vikas Kumar", 90000, "Hyderabad")
        );

        Employee thirdHighest = employees.stream()
        		    .distinct()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(2)
                .findFirst()
                .orElse(null);

        System.out.println("Third Highest Salary Employee:");
        System.out.println(thirdHighest);
    }
}
