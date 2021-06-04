package cmr.iut.serveuriut.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DiplomeAutre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    private int annee;
    private String etablissement;
    @ManyToOne
    @JoinColumn(columnDefinition = "id_etudiant")
    private Etudiant etudiant;


}
