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
    public Double calcPrice(){
        double pr = (getGrHersheys()+getGrHersheys()+getMlTop())*0.5+fixPrice;
    return pr;
    }
}
