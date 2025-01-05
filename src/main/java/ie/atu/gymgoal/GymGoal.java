package ie.atu.gymgoal;

import jakarta.persistence.*;

@Entity
@Table(name = "gym_goal")
public class GymGoal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long goalId;
    private String goal;
    private String sets;
    private String reps;


    public GymGoal() {}
    public GymGoal(Long id, String goal, String sets, String reps) {
        this.goalId = id;
        this.goal = goal;
        this.sets = sets;
        this.reps = reps;
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

    public void setSets(String sets){
        this.sets = sets;
    }
    public String getSets(){
        return sets;
    }

    public void setReps(String reps){
        this.reps = reps;
    }
    public String getReps(){
        return reps;
    }
}

