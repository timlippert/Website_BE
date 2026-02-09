package tim_KI.KI_Webpage.Repository.Maschinenelles_Lernen;

import org.apache.tomcat.util.collections.ManagedConcurrentWeakHashMap;
import org.springframework.stereotype.Service;
import tim_KI.KI_Webpage.Controller.MaschinellesLernenController;
import tim_KI.KI_Webpage.DTO.Maschinelles_Lernen;
@Service
public class Reinforcement_Learning {
    public Maschinelles_Lernen reinforcement_Learning() {
        Maschinelles_Lernen reinforcement_Learning = new Maschinelles_Lernen();
        reinforcement_Learning.setTitle("Reinforcement Learning");
        reinforcement_Learning.setPage(25);
        reinforcement_Learning.setText("Alter ist dieses Learning Reinforced");
        return reinforcement_Learning;
    }
}
