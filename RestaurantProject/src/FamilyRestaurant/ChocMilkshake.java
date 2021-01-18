/*
 * *Project coded by Mateo Agudelo Garc�a*
 * *GIT was used to manage versions*
 */
package FamilyRestaurant;

/**
 *
 * @author Mateo Agudelo Garcia
 */
public class ChocMilkshake extends Drinks implements Price{
    private int grHersheys;
    private int mlMilk;

    public ChocMilkshake(int grHersheys, int mlMilk, int mlTop) {
        super(mlTop);
        this.grHersheys = grHersheys;
        this.mlMilk = mlMilk;
    }

        public int getGrHersheys() {
        return grHersheys;
    }

    public void setGrHersheys(int grHersheys) {
        this.grHersheys = grHersheys;
    }

    public int getMlMilk() {
        return mlMilk;
    }

    public void setMlMilk(int mlMilk) {
        this.mlMilk = mlMilk;
    }
    
    @Override
    public Double calcPrice(double prHer,double prMilk){
        double pr = ((getGrHersheys()*prHer)+(getMlMilk()*prMilk)+getMlTop())*0.15+fixPrice;
    return pr;
    }
    @Override
    public String printPrice(int ingA,int ingB,double pric){
        String pPr = "Chocolate milkshake= Hersheys: "+ingA+" gr & Milk: "+ingB+" mL & Price: $"+pric+".";
    return pPr;
    }
    
}
