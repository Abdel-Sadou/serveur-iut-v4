package cmr.iut.serveuriut.controller;

import cmr.iut.serveuriut.entities.Niveau;
import cmr.iut.serveuriut.service.impl.NiveauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class NiveauController {
    @Autowired
    private NiveauService niveauService;

    @GetMapping("/niveau")
    public List<Niveau> findAllT() {
        return niveauService.findAllT();
    }
    @PostMapping("/niveau")
    public Niveau addItem(@RequestBody Niveau i) {
        return niveauService.addItem(i);
    }
    @GetMapping("/niveau/{id}")
    public Optional<Niveau> findItemById(@PathVariable(name = "id") String s) {
        return niveauService.findItemById(s);
    }
    @DeleteMapping("/niveau/{id}")
    public void deleteById(@PathVariable(name = "id") String s) {
        niveauService.deleteById(s);
    }



}
