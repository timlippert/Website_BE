package tim_KI.KI_Webpage.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tim_KI.KI_Webpage.Model.Grundlagen;
import tim_KI.KI_Webpage.Repository.GrundlagenRepository.Geschichte;
import tim_KI.KI_Webpage.Repository.GrundlagenRepository.Mathematische_Grundlagen;
import tim_KI.KI_Webpage.Repository.GrundlagenRepository.Neuronale_Netze;
import tim_KI.KI_Webpage.Repository.GrundlagenRepository.Was_ist_KI;

@Service
public class GrundlagenService {

    @Autowired
    private Geschichte geschichte;

    @Autowired
    private Mathematische_Grundlagen mathematischeGrundlagen;

    @Autowired
    private Neuronale_Netze neuronaleNetze;

    @Autowired
    private Was_ist_KI wasIstKi;



    public Grundlagen getGeschichte() {
        return geschichte.geschichte();
    }

    public Grundlagen getMathematischeGrundlagen() {
        return mathematischeGrundlagen.mathematische_Grundlagen();
    }

    public Grundlagen getNeuronaleNetze() {
        return neuronaleNetze.neuronale_Netze();
    }

    public Grundlagen getWasIstKI() {
        return wasIstKi.was_ist_KI();
    }
}
