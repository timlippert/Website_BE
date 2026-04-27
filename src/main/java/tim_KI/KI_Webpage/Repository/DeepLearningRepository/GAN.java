package tim_KI.KI_Webpage.Repository.DeepLearningRepository;

import org.springframework.stereotype.Component;
import tim_KI.KI_Webpage.Model.DeepLearning;
@Component
public class GAN {
    public DeepLearning gan(){
        DeepLearning gan = new DeepLearning();
        gan.setPage(13);
        gan.setText("Gan wie dieses heckelmaterial");
        gan.setTitle("GANGAN");
        return gan;
    }
}
