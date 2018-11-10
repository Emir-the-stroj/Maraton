import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*2.	Napisati program koji prolazi kroz fajl maraton.txt, a zatim ispisuje imena ucesnika i
 njihova vremena sortirane
prema vremenu koje su ostvarili od najmanjeg prema najvecem.*/
public class LowestToHighest {
    public static void main(String[] args) throws FileNotFoundException {
        //lista sa objektom
        ArrayList<Contenders> contenders = new ArrayList<Contenders>();
        ArrayList<Contenders> cnt = new ArrayList<>();
// file iz kojeg citamo podatke
        File Maraton = new File("Maraton/maraton.txt");

        //scanner
        Scanner input = new Scanner(Maraton);

        //prolazimo kroz citav fajl i podatke koje citamo dodjeljujemo listi objekata

        while(input.hasNext()) {
            String name = input.next();
            int time = input.nextInt();
            Contenders contender = new Contenders(name, time);
            contenders.add(contender);
        }
        //kreiran niz velicine arrayliste radi dodjele vremena nizu iz arrayliste
            int [] newTime = new int[contenders.size()];

            for(int i = 0; i < contenders.size(); i++){
                newTime[i] = contenders.get(i).time;
            }
            ///sortirana vremena
            Arrays.sort(newTime);


//poredimo vrijeme iz liste i sortirano i dodijeljujemo novoj listi po redu koju kasnije printamo
            for(int i = 0; i < contenders.size(); i++){
                for (int j = 0; j < contenders.size(); j++){
                    if(contenders.get(j).time == newTime[i]){
                        cnt.add(contenders.get(j));
                    }
                }
            }

            //printanje liste
            for(int i = 0; i < cnt.size(); i++) {
                System.out.println(cnt.get(i).getName() + " " + cnt.get(i).getTime());
            }
        }
    }

