package cmr.iut.serveuriut.service.impl;

import cmr.iut.serveuriut.entities.Etudiant;
import cmr.iut.serveuriut.entities.Inscrit;
import cmr.iut.serveuriut.repository.EtudiantRepository;
import cmr.iut.serveuriut.repository.InscritRepository;
import cmr.iut.serveuriut.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class InscritService implements ICrudService<Inscrit,Long> {
    @Autowired
    private InscritRepository inscritRepository;

    @Autowired
    private EtudiantRepository edRepository;
    @Override
    public List<Inscrit> findAllT() {
        return inscritRepository.findAll();
    }

    @Override
    public Inscrit addItem(Inscrit i) {
        return inscritRepository.save(i);
    }

    @Override
    public Optional<Inscrit> findItemById(Long aLong) {
        return inscritRepository.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
            inscritRepository.deleteById(aLong);
    }


    public void resetPassword(String nom,String prenom,String lieu,String date ,String password){
            Etudiant etudiant = edRepository.findByNomAndPrenomAndLieuAndDateNaissance(nom, prenom, lieu, date);
            Inscrit inscrit = etudiant.getInscrit();
                inscrit.setPassword(password);
                inscritRepository.save(inscrit);
    }

}
