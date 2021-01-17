/*
 * *Project coded by Mateo Agudelo Garc�a*
 * *GIT was used to manage versions*
 */
package FamilyRestaurant;

/**
 *
 * @author Mateo Agudelo Garcia
 */
public class Pie extends Dessert implements Price{
    private int qtApple;
    private int grPastry;

    public Pie(int qtApple, int grPastry, int grAdd) {
        super(grAdd);
        this.qtApple = qtApple;
        this.grPastry = grPastry;
    }

    public int getQtApple() {
        return qtApple;
    }

    public void setQtApple(int qtApple) {
        this.qtApple = qtApple;
    }

    public int getGrPastry() {
        return grPastry;
    }

    public void setGrPastry(int grPastry) {
        this.grPastry = grPastry;
    }
    
    @Override
    public Double calcPrice(){
        double pr = (getGrPastry()+getQtApple()+getGrAdd())*0.5+fixPrice;
    return pr;
    }
    
    public Integer calcCalor(){
        int pr = (getGrPastry()+getQtApple()+getGrAdd())*30;
    return pr;
    }
}
