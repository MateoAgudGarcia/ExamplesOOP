/*
 * *Project coded by Mateo Agudelo Garc�a*
 * *GIT was used to manage versions*
 */
package FamilyRestaurant;

/**
 *
 * @author Mateo Agudelo Garcia
 */
public class Inventory {
    private int gTofu;
    private int gOnion;
    private int gPasta;
    private int mSauce;
    private int gHersheys;
    private int mMilk;
    private int gCoffee;
    private int mVodka;
    private int qLemon;
    private int qApple;
    private int gPastry;
    private int gChips;
    private int gIceCr;

    public Inventory() {
    }

        
    public Inventory(int gTofu, int gOnion, int gPasta, int mSauce, int gHersheys, int mMilk, int gCoffee, int mVodka, int qLemon, int qApple, int gPastry, int gChips, int gIceCr) {
        this.gTofu = gTofu;
        this.gOnion = gOnion;
        this.gPasta = gPasta;
        this.mSauce = mSauce;
        this.gHersheys = gHersheys;
        this.mMilk = mMilk;
        this.gCoffee = gCoffee;
        this.mVodka = mVodka;
        this.qLemon = qLemon;
        this.qApple = qApple;
        this.gPastry = gPastry;
        this.gChips = gChips;
        this.gIceCr = gIceCr;
    }

    public int getgTofu() {
        return gTofu;
    }

    public void setgTofu(int gTofu) {
        this.gTofu = gTofu;
    }

    public int getgOnion() {
        return gOnion;
    }

    public void setgOnion(int gOnion) {
        this.gOnion = gOnion;
    }

    public int getgPasta() {
        return gPasta;
    }

    public void setgPasta(int gPasta) {
        this.gPasta = gPasta;
    }

    public int getmSauce() {
        return mSauce;
    }

    public void setmSauce(int mSauce) {
        this.mSauce = mSauce;
    }

    public int getgHersheys() {
        return gHersheys;
    }

    public void setgHersheys(int gHersheys) {
        this.gHersheys = gHersheys;
    }

    public int getmMilk() {
        return mMilk;
    }

    public void setmMilk(int mMilk) {
        this.mMilk = mMilk;
    }

    public int getgCoffee() {
        return gCoffee;
    }

    public void setgCoffee(int gCoffee) {
        this.gCoffee = gCoffee;
    }

    public int getmVodka() {
        return mVodka;
    }

    public void setmVodka(int mVodka) {
        this.mVodka = mVodka;
    }

    public int getqLemon() {
        return qLemon;
    }

    public void setqLemon(int qLemon) {
        this.qLemon = qLemon;
    }

    public int getqApple() {
        return qApple;
    }

    public void setqApple(int qApple) {
        this.qApple = qApple;
    }

    public int getgPastry() {
        return gPastry;
    }

    public void setgPastry(int gPastry) {
        this.gPastry = gPastry;
    }

    public int getgChips() {
        return gChips;
    }

    public void setgChips(int gChips) {
        this.gChips = gChips;
    }

    public int getgIceCr() {
        return gIceCr;
    }

    public void setgIceCr(int gIceCr) {
        this.gIceCr = gIceCr;
    }
    
    public int bTofu(int extra){
        int aux = getgTofu() + extra;
        setgTofu(aux);
    return getgTofu();
    }
    public int bOnion(int extra){
        int aux = getgOnion()+ extra;
        setgOnion(aux);
    return getgOnion();
    }
    public int bPasta(int extra){
        int aux = getgPasta()+ extra;
        setgPasta(aux);
    return getgPasta();
    }
    public int bHersheys(int extra){
        int aux = getgHersheys()+ extra;
        setgHersheys(aux);
    return getgHersheys();
    }
    public int bMilk(int extra){
        int aux = getmMilk()+ extra;
        setmMilk(aux);
    return getmMilk();
    }
    public int bCoffee(int extra){
        int aux = getgCoffee()+ extra;
        setgCoffee(aux);
    return getgCoffee();
    }
    public int bVodka(int extra){
        int aux = getmVodka()+ extra;
        setmVodka(aux);
    return getmVodka();
    }
    public int bLemon(int extra){
        int aux = getqLemon()+ extra;
        setqLemon(aux);
    return getqLemon();
    }
    public int bApple(int extra){
        int aux = getqApple()+ extra;
        setqApple(aux);
    return getqApple();
    }
    public int bPastry(int extra){
        int aux = getgPastry()+ extra;
        setgPastry(aux);
    return getgPastry();
    }
    public int bChips(int extra){
        int aux = getgChips()+ extra;
        setgChips(aux);
    return getgChips();
    }
    public int bIceCream(int extra){
        int aux = getgIceCr()+ extra;
        setgIceCr(aux);
    return getgIceCr();
    }
    
    public int sTofu(int rest){
        if((getgTofu()-rest)>=0){
            int aux = getgTofu() - rest;
            setgTofu(aux);
        }else{
            System.out.println("No hay existencias");
            setgTofu(-1);
        }
    return getgTofu();
    }
    public int sOnion(int rest){
        if((getgOnion()-rest)>=0){
            int aux = getgOnion()- rest;
            setgOnion(aux);
        }else{
            System.out.println("No hay existencias");
            setgOnion(-1);
        }
    return getgOnion();
    }
    public int sPasta(int rest){
        if((getgPasta()-rest)>=0){
            int aux = getgPasta()- rest;
            setgPasta(aux);
        }else{
            System.out.println("No hay existencias");
            setgPasta(-1);
        }
    return getgPasta();
    }
    public int sHersheys(int rest){
        if((getgHersheys()-rest)>=0){
            int aux = getgHersheys()- rest;
            setgHersheys(aux);
        }else{
            System.out.println("No hay existencias");
            setgHersheys(-1);
        }
    return getgHersheys();
    }
    public int sMilk(int rest){
        if((getmMilk()-rest)>=0){
            int aux = getmMilk()- rest;
            setmMilk(aux);
        }else{
            System.out.println("No hay existencias");
            setmMilk(-1);
        }
    return getmMilk();
    }
    public int sCoffee(int rest){
        if((getgCoffee()-rest)>=0){
            int aux = getgCoffee()- rest;
            setgCoffee(aux);
        }else{
            System.out.println("No hay existencias");
            setgCoffee(-1);
        }
    return getgCoffee();
    }
    public int sVodka(int rest){
        if((getmVodka()-rest)>=0){
            int aux = getmVodka()- rest;
            setmVodka(aux);
        }else{
            System.out.println("No hay existencias");
            setmVodka(-1);
        }
    return getmVodka();
    }
    public int sLemon(int rest){
        if((getqLemon()-rest)>=0){
            int aux = getqLemon()- rest;
            setqLemon(aux);
        }else{
            System.out.println("No hay existencias");
            setqLemon(-1);
        }
    return getqLemon();
    }
    public int sApple(int rest){
        if((getqApple()-rest)>=0){
            int aux = getqApple()- rest;
            setqApple(aux);
        }else{
            System.out.println("No hay existencias");
            setqApple(-1);
        }
    return getqApple();
    }
    public int sPastry(int rest){
        if((getgPastry()-rest)>=0){
            int aux = getgPastry()- rest;
            setgPastry(aux);
        }else{
            System.out.println("No hay existencias");
            setgPastry(-1);
        }
    return getgPastry();
    }
    public int sChips(int rest){
        if((getgChips()-rest)>=0){
            int aux = getgChips()- rest;
            setgChips(aux);
        }else{
            System.out.println("No hay existencias");
            setgChips(-1);
        }
    return getgChips();
    }
    public int sIceCream(int rest){
        if((getgIceCr()-rest)>=0){
            int aux = getgIceCr()- rest;
            setgIceCr(aux);
        }else{
            System.out.println("No hay existencias");
            setgIceCr(-1);
        }
    return getgIceCr();
    
    }
}
