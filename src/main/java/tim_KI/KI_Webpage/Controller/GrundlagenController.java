package tim_KI.KI_Webpage.Controller;

import org.springframework.web.bind.annotation.*;
import tim_KI.KI_Webpage.Model.Grundlagen;
import tim_KI.KI_Webpage.Service.GrundlagenService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/grundlagen")
public class GrundlagenController {

    private final GrundlagenService grundlagenService;

    public GrundlagenController(GrundlagenService grundlagenService) {
        this.grundlagenService = grundlagenService;
    }

    @GetMapping("/was-ist-ki")
    public Grundlagen wasIstKi() {
        return grundlagenService.getWasIstKI();
    }

    @GetMapping("/geschichte")
    public Grundlagen geschichte() {
        return grundlagenService.getGeschichte();
    }

    @GetMapping("/mathematische-grundlagen")
    public Grundlagen mathematischeGrundlagen() {
        return grundlagenService.getMathematischeGrundlagen();
    }

    @GetMapping("/neuronalenetze")
    public Grundlagen neuronaleNetze() {
        return grundlagenService.getNeuronaleNetze();
    }
}
