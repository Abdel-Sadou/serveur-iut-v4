package cmr.iut.serveuriut.controller;

import cmr.iut.serveuriut.entities.Filiere;
import cmr.iut.serveuriut.service.impl.FiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FiliereController {
    @Autowired
    private FiliereService filiereService;
    @GetMapping("/filiere")
    public List<Filiere> findAllT() {
        return filiereService.findAllT();
    }
    @PostMapping("/filiere")
    public Filiere addItem(@RequestBody Filiere i) {
        return filiereService.addItem(i);
    }
    @GetMapping("/filiere/{id}")
    public Optional<Filiere> findItemById(@PathVariable(name = "id") String s) {
        return filiereService.findItemById(s);
    }
    @DeleteMapping("/filiere/{id}")
    public void deleteById(@PathVariable(name = "id") String s) {
        filiereService.deleteById(s);
    }
}
