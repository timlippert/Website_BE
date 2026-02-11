package tim_KI.KI_Webpage.Controller;

import org.springframework.web.bind.annotation.*;
import tim_KI.KI_Webpage.DTO.DeepLearning;
import tim_KI.KI_Webpage.Repository.DeepLearningRepository.Autoencoder;
import tim_KI.KI_Webpage.Repository.DeepLearningRepository.CNN;
import tim_KI.KI_Webpage.Repository.DeepLearningRepository.GAN;
import tim_KI.KI_Webpage.Repository.Maschinenelles_Lernen.*;

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
        return cnn.CNN();
    }

    @GetMapping("/gan")
    public DeepLearning gan() {
        return gan.GAN();
    }
}
