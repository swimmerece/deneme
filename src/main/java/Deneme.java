import java.util.ArrayList;
import java.util.Scanner;

public class Deneme {
    public ArrayList<String> kontrolListesi= new ArrayList<String>();
    public Deneme(){
        Scanner madde= new Scanner(System.in);
        System.out.println("Eklemek istediğiniz maddeyi giriniz (Eğer yok ise x girmeniz yeterli)");
        String deger = madde.nextLine();
        while (!madde.nextLine().equals("x") && madde.hasNext()){ 
            kontrolListesi.add(madde.nextLine());
            System.out.println(kontrolListesi);
            System.out.println("Eklemek istediğiniz maddeyi giriniz (Eğer yok ise x girmeniz yeterli):");

        }
        
    }  

    public ArrayList<String> getKontrolListesi(){
        return kontrolListesi;
    }
}