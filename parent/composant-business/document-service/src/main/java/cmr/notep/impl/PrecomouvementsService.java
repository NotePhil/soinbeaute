package cmr.notep.impl;

import cmr.notep.api.IPrecoMouvementsApi;
import cmr.notep.business.PrecomouvementsBusiness;
import cmr.notep.modele.PrecoMouvements;
import lombok.NonNull;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@Transactional
public class PrecomouvementsService implements IPrecoMouvementsApi {

    private final PrecomouvementsBusiness precomouvementbusiness ;
    public PrecomouvementsService(PrecomouvementsBusiness precomouvementbusiness) {this.precomouvementbusiness = precomouvementbusiness ;}


    @Override
    public PrecoMouvements avoirPrecoMouvement(@NonNull String idPrecomouvements) {
        return precomouvementbusiness.avoirPrecomouvements(idPrecomouvements);
    }

    @Override
    public List<PrecoMouvements> avoirToutPrecoMouvement() {
        return precomouvementbusiness.avoirTousPrecouvement();
    }

    @Override
    public void supprimerPrecoMouvements(PrecoMouvements precoMouvements) {

    }

    @Override
    public PrecoMouvements posterPrecoMouvements(@NonNull PrecoMouvements precoMouvements) {
        return precomouvementbusiness.posterPrecomouvement(precoMouvements);
    }
}
