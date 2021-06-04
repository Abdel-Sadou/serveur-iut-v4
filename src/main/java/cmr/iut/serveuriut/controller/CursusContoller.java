package cmr.iut.serveuriut.controller;

import cmr.iut.serveuriut.entities.Cursus;
import cmr.iut.serveuriut.service.CursusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CursusContoller {
    @Autowired
   private CursusService cursusService;
    @GetMapping("/cursus")
    public List<Cursus> findAllT() {
        return cursusService.findAllT();
    }
    @PostMapping("/cursus")
    public Cursus AddItem(@RequestBody Cursus cursus) {
        return cursusService.AddItem(cursus);
    }
    @GetMapping("/cursus/{id}")
    public Optional<Cursus> findItemById(@PathVariable int id) {
        return cursusService.findItemById(id);
    }
    @DeleteMapping("/cursus/{id}")
    public void deleteById(@PathVariable int id) {
        cursusService.deleteById(id);
    }
}
