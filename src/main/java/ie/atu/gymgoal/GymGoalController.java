package ie.atu.gymgoal;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
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
    @GetMapping("/gym-goal/{id}")
    public ResponseEntity<GymGoal> getGymGoalById(@PathVariable Long id) {
        Optional<GymGoal> gymGoal = gymGoalRepository.findById(id);
        return gymGoal.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
