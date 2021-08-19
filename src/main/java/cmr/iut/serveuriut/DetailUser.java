package cmr.iut.serveuriut;

import cmr.iut.serveuriut.entities.Inscrit;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.List;

public class DetailUser implements UserDetails{
    private Inscrit inscrit;

    public DetailUser(Inscrit inscrit) {
        this.inscrit = inscrit;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority simpleGrantedAuthority =
                new SimpleGrantedAuthority(inscrit.getRole());//simple autorite accorder
        return List.of(simpleGrantedAuthority);
    }

    @Override
    public String getPassword() {
        return inscrit.getPassword();
    }

    @Override
    public String getUsername() {
        return inscrit.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
