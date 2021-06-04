package cmr.iut.serveuriut.controller;

import cmr.iut.serveuriut.entities.DiplomeAutre;
import cmr.iut.serveuriut.service.DiplomeAuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DiplomeAuController {
    @Autowired
    private DiplomeAuService diplomeAuService;

    @GetMapping("/diplomeAu")
    public List<DiplomeAutre> findAllT() {
        return diplomeAuService.findAllT();
    }
    @PostMapping("/diplomeAu")
    public DiplomeAutre AddItem(@RequestBody DiplomeAutre diplomeAutre) {
        return diplomeAuService.AddItem(diplomeAutre);
    }
    @GetMapping("/diplomeAu/{id}")
    public Optional<DiplomeAutre> findItemById(@PathVariable int id) {
        return diplomeAuService.findItemById(id);
    }
    @DeleteMapping("/diplomeAu/{id}")
    public void deleteById(@PathVariable int id) {
        diplomeAuService.deleteById(id);
    }

}
