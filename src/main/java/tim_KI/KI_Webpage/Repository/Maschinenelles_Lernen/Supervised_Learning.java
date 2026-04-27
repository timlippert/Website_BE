package tim_KI.KI_Webpage.Repository.Maschinenelles_Lernen;

import org.springframework.stereotype.Service;
import tim_KI.KI_Webpage.Model.Maschinelles_Lernen;

@Service
public class Supervised_Learning {
    public Maschinelles_Lernen supervised_learning(){
        Maschinelles_Lernen supervised_Leearning = new Maschinelles_Lernen();
        supervised_Leearning.setTitle("Supervised Learning");
        supervised_Leearning.setPage(33);
        supervised_Leearning.setText("Immernoch supervised");
        return supervised_Leearning;
    }
}
