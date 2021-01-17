/*
 * *Project coded by Mateo Agudelo Garc�a*
 * *GIT was used to manage versions*
 */
package FamilyRestaurant;

/**
 *
 * @author Mateo Agudelo Garcia
 */
public class IceCream extends Dessert implements Price{
    private int grChips;
    private int grIceCr;

    public IceCream(int grChips, int grIceCr, int grAdd) {
        super(grAdd);
        this.grChips = grChips;
        this.grIceCr = grIceCr;
    }

    public int getGrChips() {
        return grChips;
    }

    public void setGrChips(int grChips) {
        this.grChips = grChips;
    }

    public int getGrIceCr() {
        return grIceCr;
    }

    public void setGrIceCr(int grIceCr) {
        this.grIceCr = grIceCr;
    }

    @Override
    public Double calcPrice(double prChip,double prIceC){
        double pr = ((getGrChips()*prChip)+(getGrIceCr()*prIceC)+getGrAdd())*0.12+fixPrice;
    return pr;
    }
    
    public Integer calcCalor(){
        int pr = (getGrChips()+getGrIceCr()+getGrAdd())*30;
    return pr;
    }
    
    
}
