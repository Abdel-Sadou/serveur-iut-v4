package cmr.iut.serveuriut.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEtudiant;
    private String nom;
    private String prenom;
    private String sexe;
    private String dateNaissance;
    private String lieu;
    private String numCNI;
    private String email;
    private Integer telephone;
    private String paysOrigine;
    private String regionOrigine;
    private String langue;
    private String handicap;
    private String profession;
    private String situationFamilial;
    private String adresse;
    private String centre;


    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idTuteur")
    private Tuteur tuteur;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name= "idInscrit")
    private Inscrit inscrit;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idDiplomeAdmission")
    private DiplomeAdmission diplomeAdmission;

    @OneToMany(mappedBy = "etudiant",cascade = CascadeType.ALL)
    private List<DiplomeAutre> diplomeAutres;

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "nomCursus")
    private Cursus cursus;

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "nomNiveau")
    private Niveau niveau;
@OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "nomFiliere")
    private Filiere filiere;


    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }
//
//    @OneToMany(cascade = CascadeType.REFRESH)
//    private List<Filiere> listFiliere;
//
//    @JsonIgnore
//    public List<Filiere> getListFiliere() {
//        return listFiliere;
//    }
//    @JsonSetter
//    public void setListFiliere(List<Filiere> listFiliere) {
//        this.listFiliere = listFiliere;
//    }
//
//

}
