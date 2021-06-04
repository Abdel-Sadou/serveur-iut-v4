package cmr.iut.serveuriut.service;

import cmr.iut.serveuriut.entities.DiplomeAdmission;
import cmr.iut.serveuriut.repository.DiplomeAdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiplomeAdService implements IcrudService<DiplomeAdmission,Integer>{
    @Autowired
    private DiplomeAdRepository diplomeAdRepository;

    @Override
    public List<DiplomeAdmission> findAllT() {
        return diplomeAdRepository.findAll();
    }

    @Override
    public DiplomeAdmission AddItem(DiplomeAdmission diplomeAdmission) {
        return diplomeAdRepository.save(diplomeAdmission);
    }

    @Override
    public Optional<DiplomeAdmission> findItemById(int id) {
        return diplomeAdRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        diplomeAdRepository.deleteById(id);
    }

}
