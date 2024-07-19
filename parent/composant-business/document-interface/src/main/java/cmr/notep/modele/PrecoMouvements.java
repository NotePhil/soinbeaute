package cmr.notep.modele;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties({"documents,mouvementsCorrects,mouvementsIncorrects"})
@ToString(exclude = {"documents,mouvementsCorrects,mouvementsIncorrects"})
@EqualsAndHashCode(exclude = {"documents,mouvementsCorrects,mouvementsIncorrects"})
public class PrecoMouvements {
    private String id ;
    private String libelle ;
    private boolean etat ;
    private TypeMouvement typeMouvement ;
    private Date dateCreation ;
    private Date dateModification ;
    private List<Mouvements> mouvements ;
    private List<Documents> documents ;
    private List<Mouvements> mouvementsCorrects ;
    private List<Mouvements> mouvementsIncorrects ;
    private List<PrecoMouvementsQtes> precoMouvementsQtes;
}
