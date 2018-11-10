/*4.	Napisati program koji prolazi kroz fajl maraton.txt i ispisuje prosjecno vrijeme
koje je bilo potrebno ucesnicima da zavrse maraton.*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageTime {
    public static void main(String[]args) throws FileNotFoundException {

        //lista ucesnika
        ArrayList<Contenders> contenders = new ArrayList<>();

        // varijable  koje nam kasnije trebaju za racunanje prosjeka
        int sum = 0;
        int averageTime;

        //fajl iz kojeg citamo
        File Maraton = new File("Maraton/maraton.txt");


//skener za fajl
        Scanner input = new Scanner(Maraton);

        //while petljom prolazimo kroz fajl i dodijeljujemo ime i vrijeme objektu contender i onda contendera dodajemo u listu
        //contendera
        while(input.hasNext()){
            String name = input.next();
            int time = input.nextInt();
            Contenders contender = new Contenders(name, time);
            contenders.add(contender);
        }
        input.close();

        //for petljom prolazimo kroz listu contendera i sabiramo vrijeme od contendersa
        for (int i = 0; i < contenders.size(); i++){
             sum += contenders.get(i).getTime();

        }
        //racunamo prosjek vremena maratona i ispisujemo ga
averageTime = sum /contenders.size();
        System.out.println("Average time of contenders is " + averageTime + ".");
    }
}
