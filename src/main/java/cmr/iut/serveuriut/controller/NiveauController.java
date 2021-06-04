package cmr.iut.serveuriut.controller;

import cmr.iut.serveuriut.entities.Niveau;
import cmr.iut.serveuriut.service.NiveauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class NiveauController {

    private final NiveauService niveauService;
    @Autowired
    public NiveauController(NiveauService niveauService) {
        this.niveauService = niveauService;
    }
    @GetMapping("/niveau")
    public List<Niveau> findAllT() {

        return niveauService.findAllT();
    }
    @PostMapping("/niveau")
    public Niveau AddItem(@RequestBody Niveau niveau) {
        return niveauService.AddItem(niveau);
    }
    @GetMapping("/niveau/{id}")
    public Optional<Niveau> findItemById(@PathVariable int id) {
        return niveauService.findItemById(id);
    }
    @DeleteMapping("/niveau/{id}")
    public void deleteById(@PathVariable int id) {
        niveauService.deleteById(id);
    }
}
