package cmr.iut.serveuriut;

import cmr.iut.serveuriut.entities.Etudiant;
import cmr.iut.serveuriut.entities.Tuteur;
import cmr.iut.serveuriut.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServeurIutApplication implements CommandLineRunner {

	private final EtudiantRepository etudiantRepository;
	@Autowired
	public ServeurIutApplication(EtudiantRepository etudiantRepository) {
		this.etudiantRepository = etudiantRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ServeurIutApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Etudiant etudiant1 = new Etudiant("Abdel", "Sadou", "masculin", "09/02/1999"
				, "njdd", "3394d", "adsd@gmail.com", 2544655, "Cameroun", "anglais");
		Etudiant etudiant2 = new Etudiant("toto", "bobo", "femini", "09/27/1999"
				, "njdd", "33564d", "adsd@gmail.com", 2544655, "Cameroun", "anglais");
		Etudiant etudiant3 = new Etudiant("rre", "konai", "masculin", "08/02/1995"
				, "njdd", "3394d", "adsd@gmail.com", 2544655, "Cameroun", "anglais");
		 etudiantRepository.save(etudiant1);
		 etudiantRepository.save(etudiant2);
		 etudiantRepository.save(etudiant3);
		 etudiantRepository.save(etudiant3);

	}
}
