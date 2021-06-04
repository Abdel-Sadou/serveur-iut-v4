package cmr.iut.serveuriut.repository;

import cmr.iut.serveuriut.entities.DiplomeAutre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiplomeAuRepository extends JpaRepository<DiplomeAutre,Integer> {}
