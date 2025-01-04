package ie.atu.gymgoal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "gym_goal")
public class GymGoal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long goalId;
    private String goal;


    public GymGoal() {}
    public GymGoal(Long id, String goal) {
        this.goalId = id;
        this.goal = goal;
    }

    public Long getId() {
        return goalId;
    }

    public void setId(Long id) {
        this.goalId = id;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
}

