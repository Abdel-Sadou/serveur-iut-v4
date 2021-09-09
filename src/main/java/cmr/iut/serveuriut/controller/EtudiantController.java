package cmr.iut.serveuriut.controller;

import cmr.iut.serveuriut.entities.Etudiant;
import cmr.iut.serveuriut.repository.EtudiantRepository;
import cmr.iut.serveuriut.service.impl.EtudiantService;
import com.fasterxml.jackson.core.JsonParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin("*")
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;

    @Autowired
    private EtudiantRepository etudiantRepository;

    @GetMapping("admin/findAllEtudiants")
    public Page<Etudiant> etudiants(@PathParam("page") int page, @PathParam("size") int size) {
        return etudiantService.etudiants(size, page);
    }

    @GetMapping("admin/findEtudiantBynomAndprenom")
    public Etudiant findByNomAndPrenom(@Param("n") String nom, @Param("p") String prenom){
        return etudiantRepository.findByNomAndPrenom(nom, prenom);
    }

    @GetMapping("admin/findAllEtudiant")
    public List<Etudiant> findAllT() {
        return etudiantService.findAllT();
    }

    @PostMapping("/createEtudiant")
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

    @GetMapping("admin/findEtudiantById/{id}")
    public Optional<Etudiant> findItemById(@PathVariable(name = "id") Long aLong) throws Exception{
        Optional<Etudiant> e = Optional.ofNullable(etudiantService.findItemById(aLong).orElseThrow(
                () -> new Exception("l'etudiant ayant l'id '"+aLong+"' n'as pas été trouve")));
        return e ;
    }
    @DeleteMapping("admin/deleteEtudiantBy/{id}")
    public HttpStatus deleteById(@PathVariable(name = "id")Long aLong) {
        etudiantService.deleteById(aLong);
        return HttpStatus.ACCEPTED;
    }
}
