/*
 * *Project coded by Mateo Agudelo Garc�a*
 * *GIT was used to manage versions*
 */
package FamilyRestaurant;

/**
 *
 * @author Mateo Agudelo Garcia
 */
public class Mojito extends Drinks implements Price{
    private int mlVodka;
    private int qtLemon;

    public Mojito(int mlVodka, int qtLemon, int mlTop) {
        super(mlTop);
        this.mlVodka = mlVodka;
        this.qtLemon = qtLemon;
    }

    public int getMlVodka() {
        return mlVodka;
    }

    public void setMlVodka(int mlVodka) {
        this.mlVodka = mlVodka;
    }

    public int getQtLemon() {
        return qtLemon;
    }

    public void setQtLemon(int qtLemon) {
        this.qtLemon = qtLemon;
    }
    
    @Override
    public Double calcPrice(double Moj,double Vod){
        double pr = 400+fixPrice;
    return pr;
    }
    @Override
    public String printPrice(int ingA,int ingB,double pric){
        String pPr = "Mojito= Vodka: "+ingA+" mL & Lemons: "+ingB+" & Price: $"+pric+".";
    return pPr;
    }
}
