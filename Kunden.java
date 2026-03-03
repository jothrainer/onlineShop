package htl.swp2.system_out.OOP.onlineShop.onlineShop;

public class Kunden {
    private String vorname;
    private String nachname;
    private String anschrift;

    public Kunden(){}


    public Kunden(String vorname, String nachname, String anschrift){
        this.vorname = vorname;
        this.nachname = nachname;
        this.anschrift = anschrift;
    }

    public void kundenProfilAnzeigen(){
        System.out.println("Name: " + vorname + " " + nachname + " Anschrift: " + anschrift);
    }


}

