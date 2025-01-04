package ie.atu.gymgoal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "gym_goal")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GymGoal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long goalId;
    private String goal;
}
