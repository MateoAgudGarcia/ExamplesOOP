/*
 * *Project coded by Mateo Agudelo Garc�a*
 * *GIT was used to manage versions*
 */
package FamilyRestaurant;

/**
 *
 * @author Mateo Agudelo Garcia
 */
public class Coffee extends Drinks implements Price{
    private int grCoffee;
    private int mlMilk;

    public Coffee(int grCoffee, int mlMilk, int mlTop) {
        super(mlTop);
        this.grCoffee = grCoffee;
        this.mlMilk = mlMilk;
    }

    public int getGrCoffee() {
        return grCoffee;
    }

    public void setGrCoffee(int grCoffee) {
        this.grCoffee = grCoffee;
    }

    public int getMlMilk() {
        return mlMilk;
    }

    public void setMlMilk(int mlMilk) {
        this.mlMilk = mlMilk;
    }
    
    @Override
    public Double calcPrice(){
        double pr = (getGrCoffee()+getMlMilk()+getMlTop())*0.5+fixPrice;
    return pr;
    }
    
}
