package cmr.iut.serveuriut.repository;

import cmr.iut.serveuriut.entities.DiplomeAdmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiplomeAdRepository extends JpaRepository<DiplomeAdmission, Integer> {

}
