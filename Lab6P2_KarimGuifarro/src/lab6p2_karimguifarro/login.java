
package lab6p2_karimguifarro;
public class login {
    private String user;
    private String contra;

    public login(String user, String contra) {
        this.user = user;
        this.contra = contra;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "login{" + "user=" + user + ", contra=" + contra + '}';
    }
    
}
