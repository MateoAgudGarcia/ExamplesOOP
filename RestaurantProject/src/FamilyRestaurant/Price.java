/*
 * *Project coded by Mateo Agudelo Garc�a*
 * *GIT was used to manage versions*
 */
package FamilyRestaurant;

/**
 *
 * @author Mateo Agudelo Garcia
 */
public interface Price {
    public abstract Double calcPrice(double prA,double prB);
    public abstract String printPrice(int ingA,int ingB, double pri);
}
