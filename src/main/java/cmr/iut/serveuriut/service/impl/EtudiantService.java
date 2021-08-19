package cmr.iut.serveuriut.service.impl;

import cmr.iut.serveuriut.entities.Etudiant;
import cmr.iut.serveuriut.repository.EtudiantRepository;
import cmr.iut.serveuriut.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EtudiantService implements ICrudService<Etudiant,Long>{
    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> findAllT() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addItem(Etudiant i) {
        return etudiantRepository.save(i);
    }

    @Override
    public Optional<Etudiant> findItemById(Long aLong) {
        return etudiantRepository.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
        etudiantRepository.deleteById(aLong);
    }
}
