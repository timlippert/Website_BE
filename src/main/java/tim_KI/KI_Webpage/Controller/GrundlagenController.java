package tim_KI.KI_Webpage.Controller;

import org.springframework.web.bind.annotation.*;
import tim_KI.KI_Webpage.Model.Grundlagen;
import tim_KI.KI_Webpage.Repository.GrundlagenRepository.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/grundlagen")
public class GrundlagenController {

    private final Was_ist_KI wasIstKi;
    private final Geschichte geschichte;
    private final Mathematische_Grundlagen mathematischeGrundlagen;
    private final Neuronale_Netze neuronaleNetze;

    public GrundlagenController(
            Was_ist_KI wasIstKi,
            Geschichte geschichte,
            Mathematische_Grundlagen mathematischeGrundlagen,
            Neuronale_Netze neuronaleNetze
    ) {
        this.wasIstKi = wasIstKi;
        this.geschichte = geschichte;
        this.mathematischeGrundlagen = mathematischeGrundlagen;
        this.neuronaleNetze = neuronaleNetze;
    }

    @GetMapping("/was-ist-ki")
    public Grundlagen wasIstKi() {
        return wasIstKi.was_ist_KI();
    }

    @GetMapping("/geschichte")
    public Grundlagen geschichte() {
        return geschichte.geschichte();
    }

    @GetMapping("/mathematische-grundlagen")
    public Grundlagen mathematischeGrundlagen() {
        return mathematischeGrundlagen.mathematische_Grundlagen();
    }

    @GetMapping("/neuronalenetze")
    public Grundlagen neuronaleNetze() {
        return neuronaleNetze.neuronale_Netze();
    }
}
