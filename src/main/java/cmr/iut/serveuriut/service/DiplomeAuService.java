package cmr.iut.serveuriut.service;

import cmr.iut.serveuriut.entities.DiplomeAutre;
import cmr.iut.serveuriut.repository.DiplomeAuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DiplomeAuService implements IcrudService<DiplomeAutre,Integer>{
    @Autowired
    private DiplomeAuRepository diplomeAuRepository;
    @Override
    public List<DiplomeAutre> findAllT() {
        return diplomeAuRepository.findAll() ;
    }

    @Override
    public DiplomeAutre AddItem(DiplomeAutre diplomeAutre) {
        return diplomeAuRepository.save(diplomeAutre);
    }

    @Override
    public Optional<DiplomeAutre> findItemById(int id) {
        return diplomeAuRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
            diplomeAuRepository.deleteById(id);
    }
}
