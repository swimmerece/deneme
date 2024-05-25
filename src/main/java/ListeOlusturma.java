import java.util.ArrayList;
import java.util.Scanner;

public class ListeOlusturma {
    public ArrayList<String> kontrolListesi= new ArrayList<String>();
    public ListeOlusturma(){
        Scanner madde= new Scanner(System.in);
        System.out.println("Eklemek istediğiniz maddeyi giriniz (Eğer yok ise x girmeniz yeterli)");
        while (!madde.equals("x") && madde.hasNext()){
            kontrolListesi.add(madde.toString());
            System.out.println("Eklemek istediğiniz maddeyi giriniz (Eğer yok ise x girmeniz yeterli):");
            madde = new Scanner(System.in);
            System.out.println(kontrolListesi);
        }
        
    }  

    public ArrayList<String> getKontrolListesi(){
        return kontrolListesi;
    }
}