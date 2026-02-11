package tim_KI.KI_Webpage.Repository.DeepLearningRepository;

import org.springframework.stereotype.Component;
import tim_KI.KI_Webpage.DTO.DeepLearning;
@Component
public class CNN {
    public DeepLearning CNN(){
        DeepLearning cnn = new DeepLearning();
        cnn.setTitle("CNN Digga");
        cnn.setText("Es wird CNNed");
        cnn.setPage(12);
        return cnn;
    }
}
