/*
 * *Project coded by Mateo Agudelo Garc�a*
 * *GIT was used to manage versions*
 */
package FamilyRestaurant;

/**
 *
 * @author Mateo Agudelo Garcia
 */
public class Drinks extends Dishes{
    private int mlTop;

    public Drinks(int mlTop) {
        this.mlTop = mlTop;
    }

    public int getMlTop() {
        return mlTop;
    }

    public void setMlTop(int mlTop) {
        this.mlTop = mlTop;
    }
}
