import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;


public class Main {
    public static void main (String args[]){

        // 1st : Ask for plaintext.
        System.out.print("Plaintext: ");
        Scanner scanner = new Scanner(System.in);
        String plain = scanner.nextLine();

        // Transform plaintext to all lowercase because in morse code the case
        // doesn't matter + Validate plain --> only alphabetical chars and numbers are allowed

        plain = Plain.lowercase(plain);

        if(!Plain.validate(plain)){
            System.out.println("Invalid String");
        }
        else{

            String morse = Morse.translate(plain);
            System.out.println(morse);

            Sound.shortSound();

        }








    }
}
