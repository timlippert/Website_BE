package tim_KI.KI_Webpage.Repository.Maschinenelles_Lernen;

import org.springframework.stereotype.Service;
import tim_KI.KI_Webpage.DTO.Maschinelles_Lernen;

@Service
public class Semi_and_Self_SLearning {
    public Maschinelles_Lernen semi_and_self(){
        Maschinelles_Lernen semiAndSelfSLearning = new Maschinelles_Lernen();
        semiAndSelfSLearning.setText("Semi and Self");
        semiAndSelfSLearning.setPage(55);
        semiAndSelfSLearning.setTitle("Immernoch semi and Self");
        return semiAndSelfSLearning;
    }
}
