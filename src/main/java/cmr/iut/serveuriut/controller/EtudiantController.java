package cmr.iut.serveuriut.controller;

import cmr.iut.serveuriut.entities.Etudiant;
import cmr.iut.serveuriut.repository.EtudiantRepository;
import cmr.iut.serveuriut.service.impl.EtudiantService;
import com.fasterxml.jackson.core.JsonParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin("*")
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;
    @Autowired

    private EtudiantRepository etudiantRepository;


    @GetMapping("/findBynomAndprenom")
    public Etudiant findByNomAndPrenom(@Param("n") String nom, @Param("p") String prenom){
        return etudiantRepository.findByNomAndPrenom(nom, prenom);
    }

    @GetMapping("/etudiant")
    public List<Etudiant> findAllT() {
        return etudiantService.findAllT();
    }
    @PostMapping("/etudiant")
    public ResponseEntity<Etudiant> addItem(@RequestBody Etudiant i) throws JsonParseException {

        if (i.getDiplomeAutres()!=null)
        i.getDiplomeAutres().forEach(diplomeAutre -> {
            diplomeAutre.setEtudiant(i);
        });


        etudiantService.addItem(i);
        return new ResponseEntity<>(HttpStatus.OK);
    }
   /* @GetMapping("/etudiant/{id}")
    public Optional<Etudiant> findItemById(@PathVariable(name = "id") Long aLong) {

        return etudiantService.findItemById(aLong) ;
    }
    @GetMapping("/etudiant/{id}")
    public HttpStatus findItemById(@PathVariable(name = "id") Long aLong) throws ResourceNotFoundException{
            Optional<Etudiant> e = Optional.ofNullable(etudiantService.findItemById(aLong).orElseThrow(
                    () -> new ResourceNotFoundException("l'etudiant ayant l'id '"+aLong+"' n'as pas été trouve")));
        return ResponseEntity.ok().body(e).getStatusCode() ;
    }*/

    @GetMapping("/etudiant/{id}")
    public Optional<Etudiant> findItemById(@PathVariable(name = "id") Long aLong) throws ResourceNotFoundException{
        Optional<Etudiant> e = Optional.ofNullable(etudiantService.findItemById(aLong).orElseThrow(
                () -> new ResourceNotFoundException("l'etudiant ayant l'id '"+aLong+"' n'as pas été trouve")));
        return e ;
    }
    @DeleteMapping("/etudiant/{id}")
    public HttpStatus deleteById(@PathVariable(name = "id")Long aLong) {
        etudiantService.deleteById(aLong);
        return HttpStatus.ACCEPTED;
    }
}
