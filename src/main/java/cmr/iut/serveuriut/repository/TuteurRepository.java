package cmr.iut.serveuriut.repository;

import cmr.iut.serveuriut.entities.Tuteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TuteurRepository extends JpaRepository<Tuteur,Long> {
}
