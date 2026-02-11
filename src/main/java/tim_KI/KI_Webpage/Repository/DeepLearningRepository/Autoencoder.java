package tim_KI.KI_Webpage.Repository.DeepLearningRepository;


import org.springframework.stereotype.Component;
import tim_KI.KI_Webpage.DTO.DeepLearning;

import java.security.PublicKey;
@Component

public class Autoencoder {
    public DeepLearning autoencode(){
        DeepLearning deepLearning = new DeepLearning();
        deepLearning.setPage(33);
        deepLearning.setText("Es wird so autoencoded digga");
        deepLearning.setTitle("Lass mal autoencoden");
        return deepLearning;
    }
}
