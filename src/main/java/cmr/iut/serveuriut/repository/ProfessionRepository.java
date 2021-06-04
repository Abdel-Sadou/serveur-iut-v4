package cmr.iut.serveuriut.repository;

import cmr.iut.serveuriut.entities.Profession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessionRepository extends JpaRepository<Profession,Integer> {}
