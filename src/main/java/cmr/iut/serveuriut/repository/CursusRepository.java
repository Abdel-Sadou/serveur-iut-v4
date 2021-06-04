package cmr.iut.serveuriut.repository;

import cmr.iut.serveuriut.entities.Cursus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursusRepository extends JpaRepository<Cursus, Integer> {
}
