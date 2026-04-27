package tim_KI.KI_Webpage.Controller;

import org.springframework.web.bind.annotation.*;
import tim_KI.KI_Webpage.Model.Maschinelles_Lernen;
import tim_KI.KI_Webpage.Repository.Maschinenelles_Lernen.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/lernen")
public class MaschinellesLernenController {

    private final Reinforcement_Learning reinforcementLearning;
    private final Semi_and_Self_SLearning semiAndSelfSLearning;
    private final Supervised_Learning supervisedLearning;
    private final Unsupervised_Learning unsupervisedLearning;

    public MaschinellesLernenController(
            Reinforcement_Learning reinforcementLearning,
            Semi_and_Self_SLearning semiAndSelfSLearning,
            Supervised_Learning supervisedLearning,
            Unsupervised_Learning unsupervisedLearning
    ) {
        this.reinforcementLearning = reinforcementLearning;
        this.semiAndSelfSLearning = semiAndSelfSLearning;
        this.supervisedLearning = supervisedLearning;
        this.unsupervisedLearning = unsupervisedLearning;
    }

    @GetMapping("/rl")
    public Maschinelles_Lernen reinforcementLearning() {
        return reinforcementLearning.reinforcement_Learning();
    }

    @GetMapping("/ssl")
    public Maschinelles_Lernen semiAndSelfLearning() {
        return semiAndSelfSLearning.semi_and_self();
    }

    @GetMapping("/sl")
    public Maschinelles_Lernen supervisedLearning() {
        return supervisedLearning.supervised_learning();
    }

    @GetMapping("/ul")
    public Maschinelles_Lernen unsupervisedLearning() {
        return unsupervisedLearning.unsupervised_Learning();
    }
}
