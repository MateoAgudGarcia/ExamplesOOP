/*
 * *Project coded by Mateo Agudelo Garc�a*
 * *GIT was used to manage versions*
 */
package FamilyRestaurant;

/**
 *
 * @author Mateo Agudelo Garcia
 */
public class Food extends Dishes{
    private Integer grAccom;

    public Food(Integer grAccom) {
        this.grAccom = grAccom;
    }

    public Integer getGrAccom() {
        return grAccom;
    }

    public void setGrAccom(Integer grAccom) {
        this.grAccom = grAccom;
    }

    
    
}
