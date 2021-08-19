package cmr.iut.serveuriut.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EnabledEncoder {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String code = "as12";
        System.out.println(bCryptPasswordEncoder.encode(code));

    }
}
