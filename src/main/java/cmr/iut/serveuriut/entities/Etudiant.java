package cmr.iut.serveuriut.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor

public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    private String prenom;
    private String sexe;

    public Etudiant(String nom, String prenom, String sexe, String dateNaissance, String lieu, String numCNI, String email, int telephone, String paysOrigine, String langue) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.lieu = lieu;
        this.numCNI = numCNI;
        this.email = email;
        this.telephone = telephone;
        this.paysOrigine = paysOrigine;
        this.langue = langue;
    }

    private String dateNaissance;
    private String lieu;
    private String numCNI;
    private String email;
    private int telephone;

    public Etudiant(int id, String nom, String prenom, String sexe, String dateNaissance, String lieu, String numCNI, String email, int telephone, String paysOrigine, String langue) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.lieu = lieu;
        this.numCNI = numCNI;
        this.email = email;
        this.telephone = telephone;
        this.paysOrigine = paysOrigine;
        this.langue = langue;
    }

    private String paysOrigine;
    private String langue;

    @OneToMany(mappedBy = "etudiant")
    private List<DiplomeAutre> diplomeAutre;

    @OneToMany(mappedBy = "etudiant")
    private List<Filiere> filiere;

}
