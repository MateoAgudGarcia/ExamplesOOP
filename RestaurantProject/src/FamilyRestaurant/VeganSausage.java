/*
 * *Project coded by Mateo Agudelo Garc�a*
 * *GIT was used to manage versions*
 */
package FamilyRestaurant;

/**
 *
 * @author Mateo Agudelo Garcia
 */
public class VeganSausage extends Food implements Price{
    private int grTofu;
    private int grOnion;

    public VeganSausage(int grTofu, int grOnion, Integer grAccom) {
        super(grAccom);
        this.grTofu = grTofu;
        this.grOnion = grOnion;
    }

    public int getGrTofu() {
        return grTofu;
    }

    public void setGrTofu(int grTofu) {
        this.grTofu = grTofu;
    }

    public int getGrOnion() {
        return grOnion;
    }

    public void setGrOnion(int grOnion) {
        this.grOnion = grOnion;
    }
    
    @Override
    public Double calcPrice(){
        double pr = 400;
    return pr;
    }
    
    
}
