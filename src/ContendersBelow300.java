import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*5.	Napisati program koji prolazi kroz fajl maraton.txt, pronalazi ucesnike koji su
zavrsili maraton za manje od 300 minuta, zatim sprema njihova imena
i vrijeme u novi fajl pod nazivom najboljiMaratonci.txt*/
public class ContendersBelow300 {
    public static void main(String[] args) throws FileNotFoundException{
        //lista contendera
        ArrayList<Contenders> contenders = new ArrayList<>();
//fajl koji citamo
        File Maraton = new File("Maraton/maraton.txt");
//fajl u koji zapisujemo
        File najboljiMaratonci = new File("najboljiMaratonci/najboljiMaratonci.txt");
//skener za fajl koji citamo
        Scanner input = new Scanner(Maraton);
//printwriter za fajl u koji zapisujemo
        PrintWriter output = new PrintWriter(najboljiMaratonci);
// prolazimo kroz fajl i dodijeljuejmo listi contenders contendere sa imenom i vremenom
        while(input.hasNext()){
            String name = input.next();
            int time = input.nextInt();

            Contenders contender = new Contenders(name, time);

            contenders.add(contender);
        }

        for(int i = 0; i < contenders.size(); i++){
            if(contenders.get(i).getTime() < 300){
                output.println(contenders.get(i).getName() + " " + contenders.get(i).getTime());
            }
        }
        input.close();
        output.close();
        System.out.println("Alles ist fertig.");


    }
}
