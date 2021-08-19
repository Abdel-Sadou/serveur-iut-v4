package cmr.iut.serveuriut.controller;

import cmr.iut.serveuriut.entities.DiplomeAutre;
import cmr.iut.serveuriut.service.impl.DiplomeAuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("admin")
public class DiplomAuController {
    @Autowired
    private DiplomeAuService diplomeAuService;
    @GetMapping("/diplomeAutre")
    public List<DiplomeAutre> findAllT() {
        return diplomeAuService.findAllT();
    }
    @PostMapping("/diplomeAutre")
    public DiplomeAutre addItem(@RequestBody DiplomeAutre i) {
        return diplomeAuService.addItem(i);
    }
    @GetMapping("/diplomeAutre/{id}")
    public Optional<DiplomeAutre> findItemById(@PathVariable(name = "id") Long aLong) {
        return diplomeAuService.findItemById(aLong);
    }
    @DeleteMapping("/diplomeAutre/{id}")
    public void deleteById(@PathVariable(name = "id") Long aLong) {
        diplomeAuService.deleteById(aLong);
    }
}
