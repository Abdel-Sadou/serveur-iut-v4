package cmr.iut.serveuriut.controller;

import cmr.iut.serveuriut.entities.Cursus;
import cmr.iut.serveuriut.service.impl.CursusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CursusController {
    @Autowired
    private CursusService cursusService;
    @GetMapping("/cursus")
    public List<Cursus> findAllT() {
        return cursusService.findAllT();
    }

    @PostMapping("/cursus")
    public Cursus addItem(@RequestBody Cursus i) {
        i.getFiliereList().forEach(filiere -> {
            filiere.setCursus(i);
        });
        return cursusService.addItem(i);
    }

    @GetMapping("/cursus/{id}")
    public Optional<Cursus> findItemById(@PathVariable(name = "id") String s) {
        return cursusService.findItemById(s);
    }

    @DeleteMapping("/cursus/{id}")
    public void deleteById(@PathVariable(name = "id")String s) {
        cursusService.deleteById(s);
    }
}
