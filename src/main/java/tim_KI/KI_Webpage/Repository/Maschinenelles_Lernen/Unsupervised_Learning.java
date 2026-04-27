package tim_KI.KI_Webpage.Repository.Maschinenelles_Lernen;

import org.springframework.stereotype.Service;
import tim_KI.KI_Webpage.Model.Maschinelles_Lernen;

@Service
public class Unsupervised_Learning {
    public Maschinelles_Lernen unsupervised_Learning(){
        Maschinelles_Lernen unsupervised_Learning = new Maschinelles_Lernen();
        unsupervised_Learning.setText("Unsupervised");
        unsupervised_Learning.setPage(44);
        unsupervised_Learning.setTitle("Unsupervised Learning");
        return unsupervised_Learning;
    }
}
