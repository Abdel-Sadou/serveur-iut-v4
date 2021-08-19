package cmr.iut.serveuriut.service.impl;

import cmr.iut.serveuriut.entities.DiplomeAdmission;
import cmr.iut.serveuriut.repository.DiplomeAdRepository;
import cmr.iut.serveuriut.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DiplomeAdService implements ICrudService<DiplomeAdmission,Long> {
    @Autowired
    private DiplomeAdRepository diplomeAdRepository;
    @Override
    public List<DiplomeAdmission> findAllT() {
        return diplomeAdRepository.findAll();
    }

    @Override
    public DiplomeAdmission addItem(DiplomeAdmission i) {
        return diplomeAdRepository.save(i);
    }

    @Override
    public Optional<DiplomeAdmission> findItemById(Long aLong) {
        return diplomeAdRepository.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
        diplomeAdRepository.deleteById(aLong);
    }
}
