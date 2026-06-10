package tim_KI.KI_Webpage.Controller;

import org.springframework.web.bind.annotation.*;
import tim_KI.KI_Webpage.Model.DeepLearning;
import tim_KI.KI_Webpage.Repository.DeepLearningRepository.Autoencoder;
import tim_KI.KI_Webpage.Repository.DeepLearningRepository.CNN;
import tim_KI.KI_Webpage.Repository.DeepLearningRepository.GAN;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/lernen/deep")
public class DeepLearningController {

    private final Autoencoder autoencoder;
    private final CNN cnn;
    private final GAN gan;

    public DeepLearningController(
            Autoencoder autoencoder,
            CNN cnn,
            GAN gan
    ) {
        this.autoencoder = autoencoder;
        this.cnn = cnn;
        this.gan = gan;
    }

    @GetMapping("/autoencoder")
    public DeepLearning autoencoder() {
        return autoencoder.autoencode();
    }

    @GetMapping("/cnn")
    public DeepLearning cnn() {
        return cnn.cnn();
    }

    @GetMapping("/gan")
    public DeepLearning gan() {
        return gan.gan();
    }
}
