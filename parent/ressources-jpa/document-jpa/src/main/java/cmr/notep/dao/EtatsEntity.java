package cmr.notep.dao;

import lombok.Getter;
import lombok.Setter;
import org.dozer.Mapping;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "etats")
public class EtatsEntity {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, updatable = false, columnDefinition = "UUID")
    private UUID id;

    @Column(name = "libelle")
    private String libelle;

    @Column(name = "description")
    private String description;

    @Column(name = "datecreation", updatable = false)
    private Date dateCreation;
    @Column(name = "datemodification")
    private Date dateModification;
    @OneToMany(mappedBy = "etatsEntity")
    @Mapping("docEtats")
    private List<DocEtatsEntity> docEtatsEntities;

    @OneToMany(mappedBy = "etatsEntity")
    @Mapping("ordresEtat")
    private List<OrdreEtatsEntity> ordreEtatsEntities;
    //ajouter EtatsValidationsEntity avec ManyToOne sur EtatsEntity, PersonnelsEntity et OrdreEtatsEntity
}
