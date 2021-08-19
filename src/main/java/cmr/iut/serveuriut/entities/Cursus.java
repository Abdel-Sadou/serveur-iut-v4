package cmr.iut.serveuriut.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
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
public class Cursus implements Serializable {
    @Id
    private String nomCursus;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "niveau")
    private Niveau niveau;
    @OneToMany(mappedBy = "cursus",cascade = CascadeType.ALL)
    private List<Filiere> filiereList;


    public List<Filiere> getFiliereList() {
        return filiereList;
    }

    @JsonSetter
    public void setFiliereList(List<Filiere> filiereList) {
        this.filiereList = filiereList;
    }
}
