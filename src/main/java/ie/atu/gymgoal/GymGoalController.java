package ie.atu.gymgoal;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/gym-goal")
public class GymGoalController {

    private final GymGoalRepository gymGoalRepository;

    public GymGoalController(GymGoalRepository gymGoalRepository){
        this.gymGoalRepository = gymGoalRepository;
    }

    @GetMapping
    public List<GymGoal> getAllGymGoals() {
        return gymGoalRepository.findAll();
    }

    // Get gym goal by ID
    @GetMapping("/{id}")
    public ResponseEntity<GymGoal> getGymGoalById(@PathVariable Long id) {
        Optional<GymGoal> gymGoal = gymGoalRepository.findById(id);
        return gymGoal.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
