package cmr.iut.serveuriut.service;

import cmr.iut.serveuriut.entities.Etudiant;
import cmr.iut.serveuriut.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EtudiantService implements IcrudService<Etudiant,Long>{
    @Autowired
    private EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> findAllT() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant AddItem(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Optional<Etudiant> findItemById(int id) {
        return etudiantRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        etudiantRepository.deleteById(id);
    }
}
