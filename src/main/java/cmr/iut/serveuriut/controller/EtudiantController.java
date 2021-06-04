package cmr.iut.serveuriut.controller;

import cmr.iut.serveuriut.entities.Etudiant;
import cmr.iut.serveuriut.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;
    @GetMapping("/etudiant")
    public List<Etudiant> findAllT() {
        return etudiantService.findAllT();
    }
    @PostMapping("/etudiant")
    public Etudiant AddItem(@RequestBody Etudiant etudiant) {
        return etudiantService.AddItem(etudiant);
    }
    @GetMapping("/etudiant/{id}")
    public Optional<Etudiant> findItemById(@PathVariable int id) {
        return etudiantService.findItemById(id);
    }
    @DeleteMapping("/etudiant/{id}")
    public void deleteById(@PathVariable int id) {
        etudiantService.deleteById(id);
    }
    //
}
