package tim_KI.KI_Webpage.Controller;

import tim_KI.KI_Webpage.DTO.Grundlagen;
import tim_KI.KI_Webpage.Repository.GrundlagenRepository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/grundlagen")
    public class GrundlagenController {
    @Autowired
    Was_ist_KI wasIstKi;

    @Autowired
    Geschichte geschichte;

    @Autowired
    Mathematische_Grundlagen mathematischeGrundlagen;

    @Autowired
    Neuronale_Netze neuronaleNetze;

        public GrundlagenController(Was_ist_KI wasIstKi){
            this.wasIstKi = wasIstKi;
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
        public Grundlagen mathematische_grundlagen(){
            return mathematischeGrundlagen.mathematische_Grundlagen();
    }
        @GetMapping("/neuronaleNetze")
        public Grundlagen neuronaleNetze(){
            return neuronaleNetze.neuronale_Netze();
        }

}
