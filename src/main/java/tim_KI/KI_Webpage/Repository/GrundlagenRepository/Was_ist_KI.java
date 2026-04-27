package tim_KI.KI_Webpage.Repository.GrundlagenRepository;
import org.springframework.stereotype.Component;
import tim_KI.KI_Webpage.Model.Grundlagen;

@Component
public class Was_ist_KI {

    public Grundlagen was_ist_KI() {
        Grundlagen grundlagen = new Grundlagen();
        grundlagen.setText("Bruder was ist KI");
        grundlagen.setPage(3);
        grundlagen.setTitle("Was ist KI?");
        return grundlagen;
    }
}

/*
Controller sollen nur Services kennen, keine Datenhaltungsobjekte
-> Controller -> Service -> Returnt Datenobjekt
 */
