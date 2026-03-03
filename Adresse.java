package htl.swp2.system_out.OOP.onlineShop.onlineShop;

public class Adresse {
    private String plz;
    private String hausnummer;
    private String stadt;
    private String strasse;

    public Adresse(){}

    public Adresse(String plz, String hausnummer, String stadt,String strasse){
        this.plz = plz;
        this.stadt = stadt;
        this.hausnummer = hausnummer;
        this.strasse = strasse;
    }

}
