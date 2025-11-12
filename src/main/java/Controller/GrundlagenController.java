package Controller;

import Repository.GrundlagenRepository.Was_ist_KI;
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

        @GetMapping("/was-ist-ki")
        public String wasIstKi() {
            return wasIstKi.text;
        }

        @GetMapping("/geschichte")
        public String geschichte() {
            return "Daten zur Geschichte der KI";
        }
        @GetMapping("/mathematische-grundlagen")
        public String mathematische_grundlagen(){
            return "mathematische Grundlagen";
    }
        @GetMapping("/neuronaleNetze")
        public String neuronaleNetze(){
            return "neuronale Netze";
        }

}
