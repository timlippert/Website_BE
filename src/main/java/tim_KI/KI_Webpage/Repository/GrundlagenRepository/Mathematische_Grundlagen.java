package tim_KI.KI_Webpage.Repository.GrundlagenRepository;
import org.springframework.stereotype.Component;
import tim_KI.KI_Webpage.Model.Grundlagen;

@Component
public class Mathematische_Grundlagen {

    public Grundlagen mathematische_Grundlagen() {
        Grundlagen grundlagen = new Grundlagen();
        grundlagen.setText("Vile Mathe");
        grundlagen.setPage(3);
        grundlagen.setTitle("Mathe");
        return grundlagen;
    }
}
