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
    public Double calcPrice(){
        double pr = (getGrPasta()+getMlSauce()+getGrAccom())*0.5+fixPrice;
    return pr;
    }
    
    
    
}
