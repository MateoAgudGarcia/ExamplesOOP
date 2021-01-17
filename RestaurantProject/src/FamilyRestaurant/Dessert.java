/*
 * *Project coded by Mateo Agudelo Garc�a*
 * *GIT was used to manage versions*
 */
package FamilyRestaurant;

/**
 *
 * @author Mateo Agudelo Garcia
 */
public class Dessert extends Dishes{
    private int grAdd;

    public Dessert(int grAdd) {
        this.grAdd = grAdd;
    }

    public int getGrAdd() {
        return grAdd;
    }

    public void setGrAdd(int grAdd) {
        this.grAdd = grAdd;
    }
}
