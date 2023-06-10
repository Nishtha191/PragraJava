import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Team {
    String projectName;
    String features;
    String stakeholders;
    double budget;

}
