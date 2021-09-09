package cmr.iut.serveuriut.repository;

import cmr.iut.serveuriut.entities.Etudiant;
import cmr.iut.serveuriut.entities.Inscrit;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    public Etudiant findByNomAndPrenom( String nom,String prenom);
    public Etudiant findByNomAndPrenomAndLieuAndDateNaissance( String nom,String prenom,String lieu,String date);
    public Etudiant findEtudiantByInscrit(Inscrit inscrit);

}
