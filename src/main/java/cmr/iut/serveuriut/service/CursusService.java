package cmr.iut.serveuriut.service;

import cmr.iut.serveuriut.entities.Cursus;
import cmr.iut.serveuriut.repository.CursusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursusService implements IcrudService<Cursus,Integer>{
    @Autowired
    private CursusRepository cursusRepository;
    @Override
    public List<Cursus> findAllT() {
        return cursusRepository.findAll();
    }

    @Override
    public Cursus AddItem(Cursus cursus) {
        return cursusRepository.save(cursus);
    }

    @Override
    public Optional<Cursus> findItemById(int id) {
        return cursusRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        cursusRepository.deleteById(id);
    }
}
