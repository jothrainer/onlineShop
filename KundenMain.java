package htl.swp2.system_out.OOP.onlineShop.onlineShop;

public class KundenMain {
    public static void main(String[] args) {
        Kunden k1 = new Kunden("Johannes", "Thrainer", "Hurensohnstraße bei Mario");
        Kunden k2 = new Kunden("Hund", "e", "sohn");
        k1.kundenProfilAnzeigen();
        k2.kundenProfilAnzeigen();


    }
}
