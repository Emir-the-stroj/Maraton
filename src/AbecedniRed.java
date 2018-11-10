import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/*7.Napisati program koji ucitava imena iz fajla imena.txt, a
zatim ih ispisuje sortirane po abecedi.*/
public class AbecedniRed {
    public static void main(String[] args) throws FileNotFoundException {

// arraylista za ucesnike
        ArrayList<String> contanderNames = new ArrayList<String>();

        //file klasa sa putanjom za citanje imena
        File names = new File("Names/imena.txt");

        //scanner
        Scanner input = new Scanner(names);

        //prolazimo kroz tekst i sve dok ima citanja ide petlja i dodaje imena
        // u listu

        while (input.hasNext()){
            String name = input.next();

            contanderNames.add(name);
        }
        input.close();


        //deklarisanje stringa
        String [] abc = new String[contanderNames.size()];

        /// inicijalizacija stringa, poredjenje i dodavanje imena nizu
        for(int i = 0; i < abc.length; i++ ){
            int number = 0;
            String namesABC = contanderNames.get(0);
            for(int j = 0; j < contanderNames.size(); j++){
                if (contanderNames.get(j).compareTo(namesABC) < 0){
                    namesABC = contanderNames.get(j);
                    number = j;
                }
            }
            abc[i] = namesABC;
            contanderNames.remove(number);
        }


        //ispis po abecedi
        for(int i = 0; i < abc.length; i++){
            System.out.println(abc[i]);
        }

    }
}
