package tim_KI.KI_Webpage.Repository.GrundlagenRepository;
import org.springframework.stereotype.Component;
import tim_KI.KI_Webpage.Model.Grundlagen;

@Component
public class Geschichte {

    String text =
            """
<div class="page-container">


  <div class="content-block">
    <h2 class="header">Die Geschichte der KI in einem Zeitstrang</h2>
    <p class="subtext">
      Eine chronologische Übersicht der wichtigsten Meilensteine der künstlichen Intelligenz.
    </p>
  </div>

  <div class="content-block">
    <h3 class="subheader">Aristoteles – Organon</h3>
    <p>
      Aristoteles legte mit seinem Werk <em>Organon</em> die Grundlagen der formalen Logik,
      welche später zu einem zentralen Baustein der KI‑Forschung wurde.
    </p>
  </div>

  <div class="page-number">4</div>

</div>
""";



    public Grundlagen geschichte() {
        Grundlagen grundlagen = new Grundlagen();
        grundlagen.setText(text);
        grundlagen.setPage(4);
        grundlagen.setTitle("Geschichte");
        return grundlagen;
    }
}

