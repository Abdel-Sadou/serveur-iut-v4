package cmr.iut.serveuriut.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {

    private static final long serialVersionUID = -8091879091924046844L;
    private  String jwtToken;
    private  String status;
    private  long idEtudiant;

    public JwtResponse(String jwtToken, String status, String role) {
        this.jwtToken = jwtToken;
        this.status = status;
        this.role = role;
    }

    private  String role;

    public String getRole() {
        return role;
    }

    public JwtResponse(String jwtToken, String status, long idEtudiant, String role) {
        this.jwtToken = jwtToken;
        this.status = status;
        this.idEtudiant = idEtudiant;
        this.role = role;
    }


    public String getJwtToken() {
        return jwtToken;
    }

    public String getStatus() {
        return status;
    }

    public long getIdEtudiant() {
        return idEtudiant;
    }

}
