import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Calisan calisan1 = new Calisan("Alper", "Kaya", "Sivas", "Yazılımcı", 100000);
        Calisan calisan2 = new Calisan("Sevim", "Yakuboğlu", "Tokat", "Mimar", 90000);
        Calisan calisan3 = new Calisan("Serap", "Yakuboğlu", "Tokat", "Mimar", 9000);
        Calisan calisan4 = new Calisan("İclal", "Kaya", "Sivas", "Savcı", 9200);

        
        Calisan bonusGoreviCalisanListesi = new Calisan("Ayşe", "Kara", "İstanbul", "İnsan Kaynakları", 6000);

        
        List<Calisan> calisanListesi = new ArrayList<>();
        calisanListesi.add(calisan1);
        calisanListesi.add(calisan2);
        calisanListesi.add(calisan3);
        calisanListesi.add(calisan4);

       
        System.out.println("Calisan Listesi:");
        for (Calisan calisan : calisanListesi) {
            System.out.println(calisan);
        }        
        
        
        int index = calisanListesi.indexOf(bonusGoreviCalisanListesi);

      
        if (index != -1) {
            System.out.println("Aynı değerlere sahip nesnenin indeksi: " + index);
        } else {
            System.out.println("Aynı değerlere sahip nesne listede bulunamadı.");
        }
    }
}