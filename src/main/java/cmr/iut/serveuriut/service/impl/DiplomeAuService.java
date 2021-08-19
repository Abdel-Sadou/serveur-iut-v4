package cmr.iut.serveuriut.service.impl;

import cmr.iut.serveuriut.entities.DiplomeAutre;
import cmr.iut.serveuriut.repository.DiplomeAuRepository;
import cmr.iut.serveuriut.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DiplomeAuService implements ICrudService<DiplomeAutre,Long> {
    @Autowired
    private DiplomeAuRepository diplomeAuRepository;
    @Override
    public List<DiplomeAutre> findAllT() {
        return diplomeAuRepository.findAll();
    }

    @Override
    public DiplomeAutre addItem(DiplomeAutre i) {
        return diplomeAuRepository.save(i);
    }

    @Override
    public Optional<DiplomeAutre> findItemById(Long aLong) {
        return diplomeAuRepository.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
        diplomeAuRepository.deleteById(aLong);
    }
}
