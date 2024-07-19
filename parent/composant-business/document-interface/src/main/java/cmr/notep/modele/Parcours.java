package cmr.notep.modele;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Parcours {
    private String id;
    private String libelle;
    private Date dateCreation;
    private List<Etapes> etapes;
}
