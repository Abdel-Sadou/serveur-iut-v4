package cmr.iut.serveuriut.service;

import cmr.iut.serveuriut.DetailUser;
import cmr.iut.serveuriut.entities.Inscrit;
import cmr.iut.serveuriut.repository.InscritRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustumDetailsService implements UserDetailsService {
    @Autowired
    InscritRepository inscritRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Inscrit inscrit= this.inscritRepository.findInscritByUsername(s);
        if (inscrit==null){
           throw new UsernameNotFoundException("Aucun utilisateur trouve !");
        }else {
            return new DetailUser(inscrit);
        }
    }
}
