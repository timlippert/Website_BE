package tim_KI.KI_Webpage.Repository.GrundlagenRepository;
import org.springframework.stereotype.Component;
import tim_KI.KI_Webpage.Model.Grundlagen;

@Component
public class Neuronale_Netze {

    public Grundlagen neuronale_Netze() {
        Grundlagen grundlagen = new Grundlagen();
        grundlagen.setText("Diese Netze sind neuronal");
        grundlagen.setPage(3);
        grundlagen.setTitle("NN");
        return grundlagen;
    }
}
