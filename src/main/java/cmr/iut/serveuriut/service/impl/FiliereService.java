package cmr.iut.serveuriut.service.impl;

import cmr.iut.serveuriut.entities.Filiere;
import cmr.iut.serveuriut.repository.FiliereRepository;
import cmr.iut.serveuriut.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FiliereService implements ICrudService<Filiere,String> {
    @Autowired
    private FiliereRepository filiereRepository;
    @Override
    public List<Filiere> findAllT() {
        return filiereRepository.findAll();
    }

    @Override
    public Filiere addItem(Filiere i) {
        return filiereRepository.save(i);
    }

    @Override
    public Optional<Filiere> findItemById(String s) {
        return filiereRepository.findById(s);
    }

    @Override
    public void deleteById(String s) {
        filiereRepository.deleteById(s);
    }
}
