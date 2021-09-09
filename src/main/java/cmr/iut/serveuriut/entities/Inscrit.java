package cmr.iut.serveuriut.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;
import java.io.Serializable;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Inscrit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdInscrit;
    private String username;
    private String password;
    private boolean enabled;
    private  String role="ROLE_USER";
    @OneToOne
    Etudiant etudiant;

    public void setPassword(String password) {
        BCryptPasswordEncoder b = new BCryptPasswordEncoder();
        this.password = b.encode(password);
    }

    public Inscrit(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
