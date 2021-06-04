package cmr.iut.serveuriut.service;

import cmr.iut.serveuriut.entities.Profession;
import cmr.iut.serveuriut.repository.ProfessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessionService implements IcrudService<Profession,Integer> {
    @Autowired
    private ProfessionRepository professionRepository;
    @Override
    public List<Profession> findAllT() {
        return professionRepository.findAll();
    }

    @Override
    public Profession AddItem(Profession profession) {
        return professionRepository.save(profession);
    }

    @Override
    public Optional<Profession> findItemById(int id) {
        return professionRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {
        professionRepository.deleteById(id);
    }
}
