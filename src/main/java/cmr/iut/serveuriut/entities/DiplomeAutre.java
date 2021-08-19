package cmr.iut.serveuriut.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiplomeAutre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDiplomeAutre;
    private String nomDiplome;
    private String anneeObtention;
    private String etablissement;
    @ManyToOne(cascade = CascadeType.REFRESH)
            @JoinColumn(name= "idEtudiant")
    Etudiant etudiant;

    @JsonIgnore
    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }


}
