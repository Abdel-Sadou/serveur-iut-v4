package cmr.iut.serveuriut.service.impl;

import cmr.iut.serveuriut.entities.Cursus;
import cmr.iut.serveuriut.repository.CursusRepository;
import cmr.iut.serveuriut.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursusService implements ICrudService<Cursus,String> {
    @Autowired
    private CursusRepository cursusRepository;

    @Override
    public List<Cursus> findAllT() {
        return cursusRepository.findAll();
    }

    @Override
    public Cursus addItem(Cursus i) {
        return cursusRepository.save(i);
    }

    @Override
    public Optional<Cursus> findItemById(String s) {
        return cursusRepository.findById(s);
    }

    @Override
    public void deleteById(String s) {
        cursusRepository.deleteById(s);
    }
}
