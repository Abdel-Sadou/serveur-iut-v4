package cmr.iut.serveuriut.service;

import cmr.iut.serveuriut.entities.Niveau;
import cmr.iut.serveuriut.repository.NiveauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class NiveauService implements IcrudService<Niveau, Integer>{
    private final NiveauRepository niveauRepository;
    @Autowired
    public NiveauService(NiveauRepository niveauRepository) {
        this.niveauRepository = niveauRepository;
    }

    @Override
    public List<Niveau> findAllT() {
        return niveauRepository.findAll();
    }

    @Override
    public Niveau AddItem(Niveau niveau) {
        return niveauRepository.save(niveau);
    }

    @Override
    public Optional<Niveau> findItemById(int id) {
        return niveauRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
            niveauRepository.deleteById(id);
    }
}
