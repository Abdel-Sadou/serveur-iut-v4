package cmr.iut.serveuriut.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiplomeAdmission implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDiplomeAdmission;
    private String nomDiplome;
    private String anneeObtention;
    private String paysObtention;
    private String etablissement;
    private String centreExamen;
    private String serieDiplome;
    private String anneeObtentionAutre;

}
