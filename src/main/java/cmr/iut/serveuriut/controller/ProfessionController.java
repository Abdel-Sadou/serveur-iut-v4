package cmr.iut.serveuriut.controller;

import cmr.iut.serveuriut.entities.Profession;
import cmr.iut.serveuriut.service.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProfessionController {
    @Autowired
    private ProfessionService professionService;
    @GetMapping("/profession")
    public List<Profession> findAllT() {
        return professionService.findAllT();
    }
    @PostMapping("/profession")
    public Profession AddItem(@PathVariable Profession profession) {
        return professionService.AddItem(profession);
    }
    @GetMapping("/profession/{id}")
    public Optional<Profession> findItemById(@PathVariable int id) {
        return professionService.findItemById(id);
    }

    @DeleteMapping("/profession/{id}")
    public void deleteById(@PathVariable int id) {
        professionService.deleteById(id);

    }
}
