package cmr.iut.serveuriut.service.impl;

import cmr.iut.serveuriut.entities.Niveau;
import cmr.iut.serveuriut.repository.NiveauRepository;
import cmr.iut.serveuriut.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class NiveauService implements ICrudService<Niveau,String> {
    @Autowired
    private NiveauRepository niveauRepository;
    @Override
    public List<Niveau> findAllT() {
        return niveauRepository.findAll();
    }

    @Override
    public Niveau addItem(Niveau i) {
        return niveauRepository.save(i);
    }

    @Override
    public Optional<Niveau> findItemById(String s) {
        return niveauRepository.findById(s);
    }

    @Override
    public void deleteById(String s) {
        niveauRepository.deleteById(s);
    }
}
