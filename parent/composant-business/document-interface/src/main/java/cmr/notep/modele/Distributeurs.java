package cmr.notep.modele;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Distributeurs extends Personnes {
    private String distributeurs_id;
    private Date dateModification;
    private String raisonSociale;
    private String code ;


}
