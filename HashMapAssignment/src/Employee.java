import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor

public class Employee {
    String firstName;
    String lastName;
    int age;
    double salary;
    String company;

}
