package cmr.iut.serveuriut.controller;

import cmr.iut.serveuriut.entities.DiplomeAdmission;
import cmr.iut.serveuriut.service.impl.DiplomeAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("admin")
public class DilpomeAdController {
    @Autowired
    private DiplomeAdService diplomeAdService;
    @GetMapping("/dolpomeAdmission")
    public List<DiplomeAdmission> findAllT() {
        return diplomeAdService.findAllT();
    }
    @PostMapping("dolpomeAdmission/{id}")
    public DiplomeAdmission addItem(DiplomeAdmission i) {
        return diplomeAdService.addItem(i);
    }
    @GetMapping("/dolpomeAdmission/{id}")
    public Optional<DiplomeAdmission> findItemById(@PathVariable(name = "Id") Long aLong) {
        return diplomeAdService.findItemById(aLong);
    }
    @DeleteMapping("/dolpomeAdmission/{id}")
    public void deleteById(@PathVariable Long aLong) {
        diplomeAdService.deleteById(aLong);
    }
}
