
public class PasswordBreaker {
    final static int PASSWORD_LENGTH = 5;

    public static void main(String[] args) {
        // viene creato un file protetto da una password segreta ...
        PasswordProtectedFile file = new PasswordProtectedFile(PASSWORD_LENGTH);
        // e un cracker che deve scoprire la password del file
        PasswordCracker cracker1 = new PasswordCracker(file, PASSWORD_LENGTH,1);
        PasswordCracker cracker2 = new PasswordCracker(file, PASSWORD_LENGTH,2);
        PasswordCracker cracker3 = new PasswordCracker(file, PASSWORD_LENGTH,3);

        System.out.println("Un file password protected e' stato creato. ");
        System.out.println("Stiamo cercando di violare la password... ");
        System.out.println();
        Cronometro crono = new Cronometro();
        crono.start();
        String secret_password;
        
           cracker1.start();
           cracker2.start();
           cracker3.start();
        

        crono.stop();
//        System.out.println("La password segreta: " + secret_password);
    //    System.out.println("e' stata violata in: " + crono.elapsed() + " millisecondi");
    }
}
