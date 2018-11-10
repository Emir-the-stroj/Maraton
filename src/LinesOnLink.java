import java.net.URL;
import java.util.Scanner;

/*6.	Napisati program koji ispisuje koliko ima linija u fajlu koji se nalazi na sledecoj
adresi:
http://www.textfiles.com/science/astronau.txt
*/
public class LinesOnLink {

    public static void main(String[]args){
String URLString = "http://www.textfiles.com/science/astronau.txt";

try{
    java.net.URL url = new java.net.URL(URLString);
    int count = 0;
    Scanner input = new Scanner(url.openStream());
    while (input.hasNextLine()){
        String line = input.nextLine();
        count++;
    }
    input.close();
    System.out.println("Number of lines in file is " + count);

}
catch (java.net.MalformedURLException ex){
    System.out.println("Invalid URL");
}
catch (java.io.IOException ex){
    System.out.println("I/O Error: no such file.");
}
    }
}
