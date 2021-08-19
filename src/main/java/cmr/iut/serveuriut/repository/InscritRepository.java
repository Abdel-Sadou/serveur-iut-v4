package cmr.iut.serveuriut.repository;

import cmr.iut.serveuriut.entities.Inscrit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.authentication.jaas.AuthorityGranter;

public interface InscritRepository extends JpaRepository<Inscrit,Long> {
    public Inscrit findInscritByUsernameAndPassword(String username, String password);
    public Inscrit findInscritByUsername(String username);

}
