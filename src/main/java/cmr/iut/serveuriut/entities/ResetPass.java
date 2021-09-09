package cmr.iut.serveuriut.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.query.Param;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResetPass {
    private String nom;
    private String prenom;
    private String lieu;
    private String date;
    private String password;
}
