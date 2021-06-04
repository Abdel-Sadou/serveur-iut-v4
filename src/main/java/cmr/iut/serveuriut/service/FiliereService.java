package cmr.iut.serveuriut.service;

import cmr.iut.serveuriut.entities.Filiere;
import cmr.iut.serveuriut.repository.FiliereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FiliereService implements IcrudService<Filiere,Integer>{
    @Autowired
    private FiliereRepository filiereRepository;

    @Override
    public List<Filiere> findAllT() {
        return filiereRepository.findAll();
    }

    @Override
    public Filiere AddItem(Filiere filiere) {
        return filiereRepository.save(filiere);
    }

    @Override
    public Optional<Filiere> findItemById(int id) {
        return filiereRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        filiereRepository.deleteById(id);
    }
}
