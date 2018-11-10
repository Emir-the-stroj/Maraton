
/*1.	Napisati program koji prolazi kroz fajl maraton.txt i ispisuje
ime i vrijeme ucesnika koji je najbrze istrcao maraton.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fastest {
    public static void main(String[] args) throws FileNotFoundException {

//lista sa objektom
        ArrayList<Contenders> contenders = new ArrayList<Contenders>();

// file iz kojeg citamo podatke
        File Maraton = new File("Maraton/maraton.txt");

//skener
        Scanner input = new Scanner(Maraton);

//prolazimo kroz citav fajl i podatke koje citamo dodjeljujemo listi objekata
        while (input.hasNext()){
            String name = input.next();
            int time = input.nextInt();
            Contenders contender = new Contenders(name, time);
            contenders.add(contender);
        }
        input.close();


        //poredjenjem i dodijeljivanjem manje vrijednosti kroz petlju dolazimo do
        //najbrzeg takmicara
        int bestTime = contenders.get(0).getTime();
        Contenders bestContender = contenders.get(0);

        for (int i = 0; i < contenders.size(); i++){
            if(contenders.get(i).getTime() <= bestTime){
                bestTime = contenders.get(i).getTime();
                bestContender = contenders.get(i);
            }
        }

        //printamo rezultat
        System.out.println("Best contender is " + bestContender.getName() + " with time " + bestContender.getTime());

    }
}
