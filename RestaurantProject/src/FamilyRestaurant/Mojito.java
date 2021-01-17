/*
 * *Project coded by Mateo Agudelo Garc�a*
 * *GIT was used to manage versions*
 */
package FamilyRestaurant;

/**
 *
 * @author Mateo Agudelo Garcia
 */
public class Mojito extends Drinks implements Price{
    private int mlVodka;
    private int qtLemon;

    public Mojito(int mlVodka, int qtLemon, int mlTop) {
        super(mlTop);
        this.mlVodka = mlVodka;
        this.qtLemon = qtLemon;
    }

    public int getMlVodka() {
        return mlVodka;
    }

    public void setMlVodka(int mlVodka) {
        this.mlVodka = mlVodka;
    }

    public int getQtLemon() {
        return qtLemon;
    }

    public void setQtLemon(int qtLemon) {
        this.qtLemon = qtLemon;
    }
    
    @Override
    public Double calcPrice(){
        double pr = (getMlVodka()+getQtLemon()+getMlTop())*0.5+fixPrice;
    return pr;
    }
}
