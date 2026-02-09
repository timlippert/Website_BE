package tim_KI.KI_Webpage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tim_KI.KI_Webpage.DTO.Grundlagen;
import tim_KI.KI_Webpage.DTO.Maschinelles_Lernen;
import tim_KI.KI_Webpage.Repository.Maschinenelles_Lernen.Reinforcement_Learning;
import tim_KI.KI_Webpage.Repository.Maschinenelles_Lernen.Semi_and_Self_SLearning;
import tim_KI.KI_Webpage.Repository.Maschinenelles_Lernen.Supervised_Learning;
import tim_KI.KI_Webpage.Repository.Maschinenelles_Lernen.Unsupervised_Learning;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/maschinellese_lernen")
public class MaschinellesLernenController {
    @Autowired
    Reinforcement_Learning reinforcementLearning;

    @Autowired
    Semi_and_Self_SLearning semiAndSelfSLearning;

    @Autowired
    Supervised_Learning supervisedLearning;

    @Autowired
    Unsupervised_Learning unsupervisedLearning;

    @GetMapping("/reinforcement_learning")
    public Maschinelles_Lernen reinforcement_Learning() {
        return reinforcementLearning.reinforcement_Learning();
    }

    @GetMapping("/semi_and_selfsupervosed_learning")
    public Maschinelles_Lernen semiAndSelfSLearning() {
        return semiAndSelfSLearning.semi_and_self();
    }

    @GetMapping("/supervised_learning")
    public Maschinelles_Lernen supervised_learning() {
        return supervisedLearning.supervised_learning();
    }

    @GetMapping("/unsupervised_learning")
    public Maschinelles_Lernen unsupervisedLearning() {
        return unsupervisedLearning.unsupervised_Learning();
    }
}

