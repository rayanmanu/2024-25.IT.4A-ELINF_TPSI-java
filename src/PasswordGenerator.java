
import java.util.Random;

// Un oggetto di questa classe rappresenta un generatore di password
// casuali di una determinata lunghezza.
// Le password devono essere composte da soli CARATTERI MAIUSCOLI.
public class PasswordGenerator {
    // metodo che genera una password di lunghezza password_length
    // e la ritorna al chiamante.
    public String generate(int password_length) {
        // TODO: genera una password causale composta da sole
        // lettere maiuscole.
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < password_length; i++) {
            char c = (char) ('A' + random.nextInt(26)); // Genera lettere maiuscole da 'A' a 'Z'
            password.append(c);
        }
        return password.toString();
    }
}

