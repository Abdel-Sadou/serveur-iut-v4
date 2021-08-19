package cmr.iut.serveuriut.repository;

import cmr.iut.serveuriut.entities.Etudiant;
import cmr.iut.serveuriut.entities.Inscrit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    public Etudiant findByNomAndPrenom( String nom,String prenom);
    public Etudiant findEtudiantByInscrit(Inscrit inscrit);
}
