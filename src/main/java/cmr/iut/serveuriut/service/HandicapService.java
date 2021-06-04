package cmr.iut.serveuriut.service;

import cmr.iut.serveuriut.entities.Handicap;
import cmr.iut.serveuriut.repository.HandicapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HandicapService implements IcrudService<Handicap,Integer>{
    @Autowired
    private HandicapRepository handicapRepository;
    @Override
    public List<Handicap> findAllT() {
        return handicapRepository.findAll();
    }

    @Override
    public Handicap AddItem(Handicap handicap) {
        return handicapRepository.save(handicap);
    }

    @Override
    public Optional<Handicap> findItemById(int id) {
        return handicapRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        handicapRepository.deleteById(id);
    }
}
