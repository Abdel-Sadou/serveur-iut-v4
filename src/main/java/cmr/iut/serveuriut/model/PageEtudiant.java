package cmr.iut.serveuriut.model;

import cmr.iut.serveuriut.entities.Etudiant;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class PageEtudiant implements Serializable {
    private List<Etudiant> etudiants;
    private int page;
    private int nombreEtudiant;
    private int totalEtudiant;
    private int totalPages;
}
