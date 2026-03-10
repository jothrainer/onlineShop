package htl.swp2.system_out.OOP.onlineShop.onlineShop;

public class KundenMain {
    public static void main(String[] args) {
        Adresse a_k1 = new Adresse("6330", "31", "Kufstein", "Schopperweg");
        Kunden k1 = new Kunden("Johannes", "Thrainer", a_k1);
        k1.kundenProfilAnzeigen();

       Kunden k4 = new Kunden("Simon", "Schober");
        


    }
}
