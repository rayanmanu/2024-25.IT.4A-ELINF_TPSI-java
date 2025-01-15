
// Un oggetto di questa classe rappresenta un hacker che cerca di violare
// la password segreta per aprire il file protetto che viene ricevuto nel
// costruttore.
public class PasswordCracker extends Thread {
    public PasswordGenerator passwordGenerator;
    private PasswordProtectedFile fileToCrack;
    private int password_length;
    private int id;

    public PasswordCracker(PasswordProtectedFile file, int password_length, int id)
     {
        this.password_length = password_length;
        this.passwordGenerator = new PasswordGenerator();
        this.fileToCrack = file;
        this.id=id;
    }
    private String crack_it() {
        char[] attempt = new char[password_length];
        return bruteForce(attempt, 0);
    }
    private String bruteForce(char[] attempt, int position) {
        if (position == password_length) {
            String passwordAttempt = new String(attempt);
            if (fileToCrack.open(passwordAttempt)) {
                return passwordAttempt;
            }
            return null;
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            attempt[position] = c;
            String result = bruteForce(attempt, position + 1);
            if (result != null) {
                return result;
            }
        }

        return null;
    }
public void run (){
Cronometro crono1=new Cronometro();
crono1.start();
    String  secret_password=crack_it();
    
    System.out.println("La password segreta: " + secret_password);
   crono1.stop();
   System.out.println("e' stata violata in: " + crono1.elapsed() + " millisecondi  id: "+this.id); 

}
}
