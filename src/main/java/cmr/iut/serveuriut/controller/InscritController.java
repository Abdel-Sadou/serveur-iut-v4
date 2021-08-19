package cmr.iut.serveuriut.controller;

import cmr.iut.serveuriut.entities.Etudiant;
import cmr.iut.serveuriut.entities.Inscrit;
import cmr.iut.serveuriut.repository.EtudiantRepository;
import cmr.iut.serveuriut.service.impl.EtudiantService;
import cmr.iut.serveuriut.service.impl.InscritService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class InscritController {
    @Autowired
    private InscritService inscritService;
    @Autowired
    private EtudiantRepository etudiantRepository;

    @PostMapping("/changePasswordANdUsernameInscrit")
    public String  resetPassword(@Param("nom") String nom, @Param("prenom") String prenom, @Param("password") String password,@Param("username") String username) {
        inscritService.resetPassword(nom, prenom,password,username);
        return password;
    }

    @GetMapping("/inscrit")
    public List<Inscrit> findAllT() {
        return inscritService.findAllT();
    }

     @GetMapping("/findIdByInscrit")
    public Long getiDEtudiantByInscrit(@RequestBody Inscrit i) {
        Etudiant e = etudiantRepository.findEtudiantByInscrit(i);
        return e.getIdEtudiant();
    }

    @PostMapping("/inscription")
    public HttpStatus addItem(@RequestBody Inscrit i) {

       i.setPassword(new BCryptPasswordEncoder().encode(i.getPassword()));
         inscritService.addItem(i);
         return HttpStatus.OK;
    }

    @GetMapping("/inscrit/{id}")
    public Optional<Inscrit> findItemById(@PathVariable Long aLong) {
        return inscritService.findItemById(aLong);
    }

    @DeleteMapping("/inscrit/{id}")
    public void deleteById(@PathVariable Long aLong) {
        inscritService.deleteById(aLong);
    }

}
