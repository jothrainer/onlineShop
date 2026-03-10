package htl.swp2.system_out.OOP.onlineShop.onlineShop;

public class Produkte {
    private String produktName;
    private double produktPreis;
    private double ust;

    public Produkte(){}
    public Produkte(String produktName, double produktPreis, double ust){
        this.produktName = produktName;
        this.produktPreis = produktPreis;
        this.ust = ust;
    }

    public String getProduktName() {
        return produktName;
    }

    public double getBruttoPreis() {
        double bruttoPreis = produktPreis * ust;
        return bruttoPreis;
    }

    public double getNettoPreis(){
        return produktPreis;
    }

    public double getUst(){
        return ust;
    }


}
