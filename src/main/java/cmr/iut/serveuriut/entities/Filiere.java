package cmr.iut.serveuriut.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Filiere implements Serializable {
    @Id
    private String nomFiliere;

    @JsonIgnore
    public Cursus getCursus() {
        return cursus;
    }
    @ManyToOne
    private Etudiant etudiant;

    @JsonIgnore
    public Etudiant getEtudiant() {
        return etudiant;
    }
    @JsonSetter
    public void setCursus(Cursus cursus) {
        this.cursus = cursus;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    private Cursus cursus;
}
