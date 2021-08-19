package cmr.iut.serveuriut.security;

import cmr.iut.serveuriut.entities.Inscrit;
import cmr.iut.serveuriut.model.UserDTO;
import cmr.iut.serveuriut.repository.InscritRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private InscritRepository inscritRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Inscrit user = inscritRepository.findInscritByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found in database: ");
        }
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(user.getRole()));
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                authorities);
    }

    public Inscrit save(UserDTO user) {
        Inscrit newUser = new Inscrit();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(user.getPassword());
        return inscritRepository.save(newUser);
    }
}

