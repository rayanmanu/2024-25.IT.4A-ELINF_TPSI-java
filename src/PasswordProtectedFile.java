
// Un oggetto di questa classe rappresenta un file protetto da password.
// La password viene creata da un generatore interno e il file puo' essere
// aperto solo fornendo la password corretta.
public class PasswordProtectedFile {
    String password;

    public PasswordProtectedFile(int password_length) {
        PasswordGenerator pg = new PasswordGenerator();
        this.password = pg.generate(password_length);
    }

    public boolean open(String user_password) {
        // TODO: ritorna al chiamante True se la password
        // fornita e' quella corretta per aprire il file.
        if(password.equals(user_password)){
            return true;
        }
        return false;
    }
}
