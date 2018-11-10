
/*3.	Napisati program koji pita korisnika da unese ime, a zatim ispisuje vrijeme koje je
ucesnik pod tim imenom ostvario u maratonu citajuci ga iz fajla.*/
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class ContenderInput {
    public static void main (String[]args) throws FileNotFoundException {
//fajl iz kojeg citamo
        File Maraton = new File("Maraton/maraton.txt");

        //skener za fajl
        Scanner input = new Scanner(Maraton);
//skener za unos korisnika
        Scanner userInput = new Scanner(System.in);

        //pitanje za unos korisnika
        System.out.println("Enter a name of contender: ");

        //dodjeljujemo korisnikov unos stringu
        String contender = userInput.next();

        //while petljom i metodom equals nadjemo korisnika koji se podudara sa unosom
        // i uzimamo njegovo vrijeme i ispisujemo ga
        int time = -1;
        while (input.hasNext()){
            if(input.next().equals(contender)){
                time = input.nextInt();
                System.out.println("Time of contender " + time);
            }
        }


        if(time == -1){
            System.out.println("The contender does not exist.");
        }
    input.close();
        userInput.close();
    }
}
