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
        if(getgTofu()>0){
            int aux = getgTofu() + extra;
            setgTofu(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getgTofu();
    }
    public int bOnion(int extra){
        if(getgOnion()>0){
            int aux = getgOnion()+ extra;
            setgOnion(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getgOnion();
    }
    public int bPasta(int extra){
        if(getgPasta()>0){
            int aux = getgPasta()+ extra;
            setgPasta(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getgPasta();
    }
    public int bHersheys(int extra){
        if(getgHersheys()>0){
            int aux = getgHersheys()+ extra;
            setgHersheys(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getgHersheys();
    }
    public int bMilk(int extra){
        if(getmMilk()>0){
            int aux = getmMilk()+ extra;
            setmMilk(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getmMilk();
    }
    public int bCoffee(int extra){
        if(getgCoffee()>0){
            int aux = getgCoffee()+ extra;
            setgCoffee(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getgCoffee();
    }
    public int bVodka(int extra){
        if(getmVodka()>0){
            int aux = getmVodka()+ extra;
            setmVodka(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getmVodka();
    }
    public int bLemon(int extra){
        if(getqLemon()>0){
            int aux = getqLemon()+ extra;
            setqLemon(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getqLemon();
    }
    public int bApple(int extra){
        if(getqApple()>0){
            int aux = getqApple()+ extra;
            setqApple(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getqApple();
    }
    public int bPastry(int extra){
        if(getgPastry()>0){
            int aux = getgPastry()+ extra;
            setgPastry(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getgPastry();
    }
    public int bChips(int extra){
        if(getgChips()>0){
            int aux = getgChips()+ extra;
            setgChips(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getgChips();
    }
    public int bIceCream(int extra){
        if(getgIceCr()>0){
            int aux = getgIceCr()+ extra;
            setgIceCr(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getgIceCr();
    }
    
    public int sTofu(int rest){
        if(getgTofu()>0){
            int aux = getgTofu() - rest;
            setgTofu(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getgTofu();
    }
    public int sOnion(int rest){
        if(getgOnion()>0){
            int aux = getgOnion()- rest;
            setgOnion(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getgOnion();
    }
    public int sPasta(int rest){
        if(getgPasta()>0){
            int aux = getgPasta()- rest;
            setgPasta(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getgPasta();
    }
    public int sHersheys(int rest){
        if(getgHersheys()>0){
            int aux = getgHersheys()- rest;
            setgHersheys(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getgHersheys();
    }
    public int sMilk(int rest){
        if(getmMilk()>0){
            int aux = getmMilk()- rest;
            setmMilk(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getmMilk();
    }
    public int sCoffee(int rest){
        if(getgCoffee()>0){
            int aux = getgCoffee()- rest;
            setgCoffee(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getgCoffee();
    }
    public int sVodka(int rest){
        if(getmVodka()>0){
            int aux = getmVodka()- rest;
            setmVodka(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getmVodka();
    }
    public int sLemon(int rest){
        if(getqLemon()>0){
            int aux = getqLemon()- rest;
            setqLemon(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getqLemon();
    }
    public int sApple(int rest){
        if(getqApple()>0){
            int aux = getqApple()- rest;
            setqApple(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getqApple();
    }
    public int sPastry(int rest){
        if(getgPastry()>0){
            int aux = getgPastry()- rest;
            setgPastry(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getgPastry();
    }
    public int sChips(int rest){
        if(getgChips()>0){
            int aux = getgChips()- rest;
            setgChips(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getgChips();
    }
    public int sIceCream(int rest){
        if(getgIceCr()>0){
            int aux = getgIceCr()- rest;
            setgIceCr(aux);
        }else{
            System.out.println("No hay existencias");
        }
    return getgIceCr();
    
    }
}
