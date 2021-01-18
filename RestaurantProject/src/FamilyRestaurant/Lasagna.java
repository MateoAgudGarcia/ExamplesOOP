/*
 * *Project coded by Mateo Agudelo Garc�a*
 * *GIT was used to manage versions*
 */
package FamilyRestaurant;

/**
 *
 * @author Mateo Agudelo Garcia
 */
public class Lasagna extends Food implements Price{
    private int grPasta;
    private int mlSauce;

    public Lasagna(int grPasta, int mlSauce, Integer grAccom) {
        super(grAccom);
        this.grPasta = grPasta;
        this.mlSauce = mlSauce;
    }

    public int getGrPasta() {
        return grPasta;
    }

    public void setGrPasta(int grPasta) {
        this.grPasta = grPasta;
    }

    public int getMlSauce() {
        return mlSauce;
    }

    public void setMlSauce(int mlSauce) {
        this.mlSauce = mlSauce;
    }
    
    @Override
    public Double calcPrice(double prSauc,double prPas){
        double pr = ((getMlSauce()*prSauc)+(getGrPasta()*prPas)+getGrAccom())*0.2+fixPrice;
    return pr;
    }
    
    @Override
    public String printPrice(int ingA,int ingB,double pric){
        String pPr = "Lasagna= Pasta: "+ingA+" gr & Sauce: "+ingB+" mL & Price: $"+pric+".";
    return pPr;
    }
    
}
