package htl.swp2.system_out.OOP.onlineShop.onlineShop;

import java.awt.*;
import java.util.ArrayList;

public class Bestellung {
    private int bestellNummer;
    private Kunden kunde;
    private ArrayList<Produkte> warenkorb;

    public Bestellung(int bestellNummer, Kunden kunde){
        this.bestellNummer = bestellNummer;
        this.kunde = kunde;
        this.warenkorb = new ArrayList<>();
    }

    public void produktHinzufügen(Produkte p){
       this.warenkorb.add(p);

    }

    public void rechnungDrucken(){
        System.out.println("RECHNUNGS NR: " + bestellNummer);
        kunde.kundenProfilAnzeigen();
        System.out.println("------------------------------");

        double gesammtSumme = 0;
        double nettoSumme = 0;

        for(Produkte p : warenkorb){
            gesammtSumme += p.getBruttoPreis();
            nettoSumme += p.getNettoPreis();
        }
        System.out.println("Nettobetrag: " + nettoSumme);
        System.out.println("Bruttobetrag: " + gesammtSumme);
    }
}
