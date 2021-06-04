package cmr.iut.serveuriut.service;

import cmr.iut.serveuriut.entities.Tuteur;
import cmr.iut.serveuriut.repository.TuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TuteurService implements IcrudService<Tuteur,Integer> {
    @Autowired
    private TuteurRepository tuteurRepository;
    @Override
    public List<Tuteur> findAllT() {
        return tuteurRepository.findAll();
    }

    @Override
    public Tuteur AddItem(Tuteur tuteur) {
        return tuteurRepository.save(tuteur);
    }

    @Override
    public Optional<Tuteur> findItemById(int id) {
        return tuteurRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        tuteurRepository.deleteById(id);
    }
}
