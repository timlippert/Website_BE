package tim_KI.KI_Webpage.Repository.GrundlagenRepository;
import org.springframework.stereotype.Component;
import tim_KI.KI_Webpage.DTO.Grundlagen;

@Component
public class Geschichte {

    public Grundlagen geschichte() {
        Grundlagen grundlagen = new Grundlagen();
        grundlagen.setText("Viel Geschichte");
        grundlagen.setPage(4);
        grundlagen.setTitle("Geschichte");
        return grundlagen;
    }
}

