package cmr.iut.serveuriut.repository;

import cmr.iut.serveuriut.entities.Handicap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HandicapRepository extends JpaRepository<Handicap,Integer> {
}
