package cmr.iut.serveuriut.repository;

import cmr.iut.serveuriut.entities.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NiveauRepository extends JpaRepository<Niveau ,Integer> {
}
