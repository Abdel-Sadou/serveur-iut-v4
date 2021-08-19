package cmr.iut.serveuriut.service.impl;

import cmr.iut.serveuriut.entities.Tuteur;
import cmr.iut.serveuriut.repository.TuteurRepository;
import cmr.iut.serveuriut.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TuteurService implements ICrudService<Tuteur,Long> {
    @Autowired
    private TuteurRepository tuteurRepository;

    @Override
    public List<Tuteur> findAllT() {
        return tuteurRepository.findAll();
    }

    @Override
    public Tuteur addItem(Tuteur i) {
        return tuteurRepository.save(i);
    }

    @Override
    public Optional<Tuteur> findItemById(Long aLong) {
        return tuteurRepository.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
        tuteurRepository.deleteById(aLong);
    }
}
