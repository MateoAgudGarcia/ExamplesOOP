/*
 * *Project coded by Mateo Agudelo Garc�a*
 * *GIT was used to manage versions*
 */
package FamilyRestaurant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mateo Agudelo Garcia
 */
public class Principal {

    public static int autoTextFile(){
        System.out.println("Select your desired option:");
        System.out.println("1. Insert manually asked data");
        System.out.println("2. Create random info");
        System.out.println("3. Data extracted from TXT File");
        System.out.println("");
        
        Scanner n = new Scanner(System.in);
        int opt = n.nextInt();
        boolean seg = true;
        
        do {            
            switch(opt){
                case 1:
                    System.out.println("\nFollowing, we'll ask you some info");
                    seg = true;
                    break;
                case 2:
                    System.out.println("\nRandom data will be created");
                    seg = true;
                    break;
                case 3:
                    System.out.println("\nRecall to take care instructions to insert data");
                    seg = true;
                    break;
                default:
                    System.out.println("Data provided were incorrect");
                    seg = false;
                    System.out.println("");
                    System.out.println("Select your desired option:");
                    System.out.println("1. Insert manually asked data");
                    System.out.println("2. Create random info");
                    System.out.println("3. Data extracted from TXT File");
                    System.out.println("");
                    opt = n.nextInt();
                }
            
        } while (seg==false);
        return opt;
    }
    public static int[] readTxt(int op){
        int num[] = new int[13];
        try {
            String file = "";
            switch(op){
                case 1:
                    file = "C:\\Users\\mateo\\Proyectos_GIT\\OOP_GitHub\\RestaurantProject\\InventoryIngredients.txt";
                    break;
                case 2:
                    file = "C:\\Users\\mateo\\Proyectos_GIT\\OOP_GitHub\\RestaurantProject\\InventoryDishes.txt";
                    break;
                    
                default:
                    file = "C:\\Users\\mateo\\Proyectos_GIT\\OOP_GitHub\\RestaurantProject\\InventoryIngredients.txt";
            }
            Scanner s = new Scanner(new File(file));
            int i = 0;
            while(s.hasNextInt()){
                num[i] = s.nextInt();
                i++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException e){
            System.out.println("Error de codificación");
        }
    return num;
    }
    public static int randomIngInv(){
        int num = new Random().nextInt(201)+100;
        return num;
    }
    public static int randomIngInvS(){
        int num = new Random().nextInt(101)+50;
        return num;
    }
    public static Inventory initInv(int opt1){
        int num[] = new int[13];
        int gTofu=0; int gOnion=0; int gPasta=0; int mSauce=0; int gHersheys=0; int mMilk=0; int gCoffee=0; int mVodka=0; int qLemon=0; int qApple=0; int gPastry=0; int gChips=0; int gIceCr=0;
        
        Scanner entry = new Scanner(System.in);
        
        switch(opt1){
            case 1:
                System.out.println("Manually\n");
                System.out.println("Grams of tofu in stock");
                gTofu = entry.nextInt();
                System.out.println("Grams of onion in stock");
                gOnion = entry.nextInt();
                System.out.println("Grams of pasta in stock");
                gPasta = entry.nextInt();
                System.out.println("mL of sauce in stock");
                mSauce = entry.nextInt();
                System.out.println("Grams of Hersheys in stock");
                gHersheys = entry.nextInt();
                System.out.println("mL of milk in stock");
                mMilk = entry.nextInt();
                System.out.println("Grams of coffee in stock");
                gCoffee = entry.nextInt();
                System.out.println("mL of vodka in stock");
                mVodka = entry.nextInt();
                System.out.println("Number of lemons in stock");
                qLemon = entry.nextInt();
                System.out.println("Number of apples in stock");
                qApple = entry.nextInt();
                System.out.println("Grams of pastry in stock");
                gPastry = entry.nextInt();
                System.out.println("Grams of chips in stock");
                gChips = entry.nextInt();
                System.out.println("Grams of ice cream in stock");
                gIceCr = entry.nextInt();
                
                break;
            case 2:
                float nn = 2f;
                gTofu = (int)nn*randomIngInv();
                gOnion = (int)nn*randomIngInv();
                gPasta = (int)nn*randomIngInv();
                mSauce = (int)nn*randomIngInv();
                gHersheys = (int)nn*randomIngInv();
                mMilk = (int)(2*nn*randomIngInv());
                gCoffee = (int)nn*randomIngInv();
                mVodka = (int)nn*randomIngInv();
                qLemon = (int)nn*randomIngInv();
                qApple = (int)nn*randomIngInv();
                gPastry = (int)nn*randomIngInv();
                gChips = (int)nn*randomIngInv();
                gIceCr = (int)nn*randomIngInv();
                break;
            case 3:
                num = readTxt(1);
                gTofu = num[0];
                gOnion = num[1];
                gPasta = num[2];
                mSauce = num[3];
                gHersheys = num[4];
                mMilk = num[5];
                gCoffee = num[6];
                mVodka = num[7];
                qLemon = num[8];
                qApple = num[9];
                gPastry = num[10];
                gChips = num[11];
                gIceCr = num[12];
                break;
            default:
                System.out.println("Error");
        }
        
        Inventory inv = new Inventory(gTofu, gOnion, gPasta, mSauce, gHersheys, mMilk, gCoffee, mVodka, qLemon, qApple, gPastry, gChips, gIceCr);
        return inv;
        
    }
    public static int[] initDish(int opt2){
        int num[] = new int[14];
        int gTofu=0; int gOnion=0; int gPasta=0; int mSauce=0; int gHersheys=0; int mMilk=0; int gCoffee=0; int mMilkC=0; int mVodka=0; int qLemon=0; int qApple=0; int gPastry=0; int gChips=0; int gIceCr=0;
        
        Scanner entry = new Scanner(System.in);
        
        switch(opt2){
            case 1:
                System.out.println("Manually\n");
                System.out.println("Grams of tofu for vegan sausage");
                gTofu = entry.nextInt();
                System.out.println("Grams of onion for vegan sausage");
                gOnion = entry.nextInt();
                System.out.println("Grams of pasta for lasagna");
                gPasta = entry.nextInt();
                System.out.println("mL of sauce for lasagna");
                mSauce = entry.nextInt();
                System.out.println("Grams of Hersheys for chocolate milkshake");
                gHersheys = entry.nextInt();
                System.out.println("mL of milk for chocolate milkshake");
                mMilk = entry.nextInt();
                System.out.println("Grams of coffee for cafe");
                gCoffee = entry.nextInt();
                System.out.println("mL of milk for cafe");
                mMilkC = entry.nextInt();
                System.out.println("mL of vodka for mojito");
                mVodka = entry.nextInt();
                System.out.println("Number of lemons for mojito");
                qLemon = entry.nextInt();
                System.out.println("Number of apples for pie");
                qApple = entry.nextInt();
                System.out.println("Grams of pastry for pie");
                gPastry = entry.nextInt();
                System.out.println("Grams of chips for ice cream");
                gChips = entry.nextInt();
                System.out.println("Grams of ice cream");
                gIceCr = entry.nextInt();
                
                break;
            case 2:
                gTofu = randomIngInv();
                gOnion = randomIngInv();
                gPasta = randomIngInv();
                mSauce = randomIngInv();
                gHersheys = randomIngInv();
                mMilk = randomIngInv();
                gCoffee = randomIngInv();
                mMilkC = randomIngInv();
                mVodka = randomIngInv();
                qLemon = randomIngInv();
                qApple = randomIngInv();
                gPastry = randomIngInv();
                gChips = randomIngInv();
                gIceCr = randomIngInv();
                break;
            case 3:
                num = readTxt(2);
                gTofu = num[0];
                gOnion = num[1];
                gPasta = num[2];
                mSauce = num[3];
                gHersheys = num[4];
                mMilk = num[5];
                gCoffee = num[6];
                mMilkC = num[7];
                mVodka = num[8];
                qLemon = num[9];
                qApple = num[10];
                gPastry = num[11];
                gChips = num[12];
                gIceCr = num[13];
                break;
            default:
                System.out.println("Error");
        }
        
        int[] qtIng = {gTofu,  gOnion,  gPasta,  mSauce,  gHersheys,  mMilk,  gCoffee,  mMilkC, mVodka,  qLemon,  qApple,  gPastry,  gChips,  gIceCr};
        return qtIng;
        
    }
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int opt1 = autoTextFile();
        Inventory inv = initInv(opt1);
        
        int opt2 = autoTextFile();
        int[] qtIng = initDish(opt2);
        
        boolean vegS = false;boolean lasg = false;boolean chMilk = false;boolean moj = false;boolean cof = false;boolean iceC = false;boolean pi = false;
                
        
        //VEGAN SAUSAGE
        VeganSausage vSau = null;
        if ((inv.sTofu(qtIng[0])!=-1)&&(inv.sOnion(qtIng[1])!=-1)) {
            vSau = new VeganSausage(qtIng[0], qtIng[1], randomIngInvS());
            vegS = true;
        }else{
            System.out.println("Vegan sausage was not created due to missing quantities");
        }
        //LASAGNA
        Lasagna lna= null;
        if ((inv.sPasta(qtIng[2])!=-1)&&(inv.sSauce(qtIng[3])!=-1)) {
            lna = new Lasagna(qtIng[2], qtIng[3], randomIngInvS());
            lasg = true;
        }else{
            System.out.println("Lasagna was not created due to missing quantities");
        }
        //CHOCOLATE MILKSHAKE
        ChocMilkshake cMil= null;
        if ((inv.sHersheys(qtIng[4])!=-1)&&(inv.sMilk(qtIng[5])!=-1)) {
            cMil = new ChocMilkshake(qtIng[4], qtIng[5], randomIngInvS());
            chMilk = true;
        }else{
            System.out.println("Chocolate milkshake was not created due to missing quantities");
        }
        //COFFEE
        Coffee cfe= null;
        if ((inv.sCoffee(qtIng[6])!=-1)&&(inv.sMilk(qtIng[7])!=-1)) {
            cfe = new Coffee(qtIng[6], qtIng[7], randomIngInvS());
            cof = true;
        }else{
            System.out.println("Coffee was not created due to missing quantities");
        }
        //MOJITO
        Mojito mjt= null;
        if ((inv.sVodka(qtIng[8])!=-1)&&(inv.sLemon(qtIng[9])!=-1)) {
            mjt = new Mojito(qtIng[8], qtIng[9], randomIngInvS());
            moj = true;
        }else{
            System.out.println("Mojito was not created due to missing quantities");
        }
        //PIE
        Pie pieA= null;
        if ((inv.sApple(qtIng[10])!=-1)&&(inv.sPastry(qtIng[11])!=-1)) {
            pieA = new Pie(qtIng[10], qtIng[11], randomIngInvS());
            pi = true;
        }else{
            System.out.println("Pie was not created due to missing quantities");
        }
        //ICE CREAM
        IceCream iCream= null;
        if ((inv.sChips(qtIng[12])!=-1)&&(inv.sIceCream(qtIng[13])!=-1)) {
            iCream = new IceCream(qtIng[12], qtIng[1], randomIngInvS());
            iceC = true;
        }else{
            System.out.println("Ice cream was not created due to missing quantities");
        }
        
        double money = 100000;
        
        String menu = "\n\nMENU'S RESTAURANT"
                + "\nSelect an option below\n"
                + "\n1. Print my current money amount"
                + "\n2. Print my current ingredient inventory"
                + "\n3. Buy some amount of any ingredient"
                + "\n4. Print my dishes inventory"
                + "\n5. Make a dish (reducing the ingredients inventory)"
                + "\n6. Sell a dish"
                + "\n7. Exit";
        
        System.out.println(menu);
        int c = entry.nextInt();
        while(c!=7) {            
            switch(c){
                case 1:
                        System.out.println("My current amount is: "+money);
                        break;
                case 2:
                        System.out.println("\nMy current ingredient inventory:\n\n"
                                + "Tofu "+inv.getgTofu()+" gr\n" +
                                "Onion "+inv.getgOnion()+" gr\n" +
                                "Pasta "+inv.getgPasta()+" gr\n" +
                                "Sauce "+inv.getmSauce()+" mL\n" +
                                "Hersheys "+inv.getgHersheys()+" gr\n" +
                                "Milk "+inv.getmMilk()+" mL\n" +
                                "Coffee "+inv.getgCoffee()+" gr\n" +
                                "Vodka "+inv.getmVodka()+" mL\n" +
                                "Lemon "+inv.getqLemon()+"\n" +
                                "Apple "+inv.getqApple()+"\n" +
                                "Pastry "+inv.getgPastry()+" gr\n" +
                                "Chips "+inv.getgChips()+" gr\n" +
                                "Ice Cream "+inv.getgIceCr()+" gr");
                        break;
                case 3:
                        System.out.println("Buy some ingredients:\n"
                                + "1.Tofu\n" +
                                "2.Onion\n" +
                                "3.Pasta\n" +
                                "4.Sauce\n" +
                                "5.Hersheys\n" +
                                "6.Milk\n" +
                                "7.Coffee\n" +
                                "8.Vodka\n" +
                                "9.Lemon\n" +
                                "10.Apple\n" +
                                "11.Pastry\n" +
                                "12.Chips\n" +
                                "13.IceCream");
                        int sIn = entry.nextInt();
                        int extra=0;
                        switch(sIn){
                            
                            case 1:
                                System.out.println("Insert grams to buy of Tofu");
                                extra = entry.nextInt();
                                inv.bTofu(extra);
                                money -= randomIngInvS();
                                break;
                            case 2:
                                System.out.println("Insert grams to buy of Onion");
                                extra = entry.nextInt();
                                inv.bOnion(extra);
                                money -= randomIngInvS();
                                break;
                            case 3:
                                System.out.println("Insert grams to buy of Pasta");
                                extra = entry.nextInt();
                                inv.bPasta(extra);
                                money -= randomIngInvS();
                                break;
                            case 4:
                                System.out.println("Insert mL to buy of Sauce");
                                extra = entry.nextInt();
                                inv.bSauce(extra);
                                money -= randomIngInvS();
                                break;
                            case 5:
                                System.out.println("Insert grams to buy of Hersheys");
                                extra = entry.nextInt();
                                inv.bHersheys(extra);
                                money -= randomIngInvS();
                                break;
                            case 6:
                                System.out.println("Insert mL to buy of Milk");
                                extra = entry.nextInt();
                                inv.bMilk(extra);
                                money -= randomIngInvS();
                                break;
                            case 7:
                                System.out.println("Insert grams to buy of Coffee");
                                extra = entry.nextInt();
                                inv.bCoffee(extra);
                                money -= randomIngInvS();
                                break;
                            case 8:
                                System.out.println("Insert grams to buy of Vodka");
                                extra = entry.nextInt();
                                inv.bVodka(extra);
                                money -= randomIngInvS();
                                break;
                            case 9:
                                System.out.println("Insert grams to buy of Lemon");
                                extra = entry.nextInt();
                                inv.bLemon(extra);
                                money -= randomIngInvS();
                                break;
                            case 10:
                                System.out.println("Insert grams to buy of Apple");
                                extra = entry.nextInt();
                                inv.bApple(extra);
                                money -= randomIngInvS();
                                break;
                            case 11:
                                System.out.println("Insert grams to buy of Pastry");
                                extra = entry.nextInt();
                                inv.bPastry(extra);
                                money -= randomIngInvS();
                                break;
                            case 12:
                                System.out.println("Insert grams to buy of Chips");
                                extra = entry.nextInt();
                                inv.bChips(extra);
                                money -= randomIngInvS();
                                break;
                            case 13:
                                System.out.println("Insert grams to buy of Ice Cream");
                                extra = entry.nextInt();
                                inv.bIceCream(extra);
                                money -= randomIngInvS();
                                break;
                            default:
                                System.out.println("Corrupted entry\n");
                        } System.out.println("");
                        
                        break;
                case 4:
                        System.out.println("Inventory of dishes\n");
                        String ds = "";
                        double cP = 0;
                        if(vegS == true){
                            cP = vSau.calcPrice(randomIngInvS(), randomIngInvS());
                            ds = vSau.printPrice(qtIng[0],qtIng[1], cP);
                            System.out.println(ds);
                        }if (lasg == true) {
                            cP = lna.calcPrice(randomIngInvS(), randomIngInvS());
                            ds = lna.printPrice(qtIng[2],qtIng[3], cP);
                            System.out.println(ds);
                        }if (chMilk == true) {
                            cP = cMil.calcPrice(randomIngInvS(), randomIngInvS());
                            ds = cMil.printPrice(qtIng[4],qtIng[5], cP);
                            System.out.println(ds);
                        }if (cof == true) {
                            cP = cfe.calcPrice(randomIngInvS(), randomIngInvS());
                            ds = cfe.printPrice(qtIng[6],qtIng[7], cP);
                            System.out.println(ds);
                        }if (moj == true) {
                            cP = mjt.calcPrice(randomIngInvS(), randomIngInvS());
                            ds = mjt.printPrice(qtIng[8],qtIng[9], cP);
                            System.out.println(ds);
                        }if (pi == true) {
                            cP = pieA.calcPrice(randomIngInvS(), randomIngInvS());
                            ds = pieA.printPrice(qtIng[10],qtIng[11], cP);
                            System.out.println(ds);
                        }if (iceC == true) {
                            cP = iCream.calcPrice(randomIngInvS(), randomIngInvS());
                            ds = iCream.printPrice(qtIng[12],qtIng[13], cP);
                            System.out.println(ds);
                        }else{
                            System.out.println("No stoke of dishes");
                        }
                        break;
                case 5:
                        System.out.println("\n\nChoose dish to prepare:"
                                + "\n1.Vegan Sausage"
                                + "\n2.Lasagna"
                                + "\n3.Chocolate milkshake"
                                + "\n4.Coffee"
                                + "\n5.Mojito"
                                + "\n6.Apple pie"
                                + "\n7.Ice Cream\n");
                        int dP = entry.nextInt();
                        int i1=0;int i2=0;
                        double pC=0;
                        String ppC ="";
                        switch(dP){
                            case 1:
                                System.out.println("Insert grams of Tofu:");
                                i1 = entry.nextInt();
                                System.out.println("Insert grams of Onion:");
                                i2 = entry.nextInt();
                                
                                VeganSausage vS = null;
                                if ((inv.sTofu(i1)!=-1)&&(inv.sOnion(i2)!=-1)) {
                                    vS = new VeganSausage(i1, i2, randomIngInvS());
                                    pC = vS.calcPrice(randomIngInvS(), randomIngInvS());
                                    ppC = vS.printPrice(i1, i2, pC);
                                    System.out.println("Thanks for your order\n"+ppC+"\n");
                                    money+=pC;
                                }else{
                                    System.out.println("Vegan sausage was not created due to missing quantities");
                                }
                                                             
                                break;
                            case 2:
                                System.out.println("Insert grams of Pasta:");
                                i1 = entry.nextInt();
                                System.out.println("Insert mL of Sauce:");
                                i2 = entry.nextInt();
                                
                                Lasagna lS = null;
                                if ((inv.sPasta(i1)!=-1)&&(inv.sSauce(i2)!=-1)) {
                                    lS = new Lasagna(i1, i2, randomIngInvS());
                                    pC = lS.calcPrice(randomIngInvS(), randomIngInvS());
                                    ppC = lS.printPrice(i1, i2, pC);
                                    System.out.println("Thanks for your order\n"+ppC+"\n");
                                    money+=pC;
                                }else{
                                    System.out.println("Lasagna was not created due to missing quantities");
                                }
                                break;
                            case 3:
                                System.out.println("Insert grams of Hersheys:");
                                i1 = entry.nextInt();
                                System.out.println("Insert mL of Milk:");
                                i2 = entry.nextInt();
                                
                                ChocMilkshake cM = null;
                                if ((inv.sHersheys(i1)!=-1)&&(inv.sMilk(i2)!=-1)) {
                                    cM = new ChocMilkshake(i1, i2, randomIngInvS());
                                    pC = cM.calcPrice(randomIngInvS(), randomIngInvS());
                                    ppC = cM.printPrice(i1, i2, pC);
                                    System.out.println("Thanks for your order\n"+ppC+"\n");
                                    money+=pC;
                                }else{
                                    System.out.println("Chocolate milkshake was not created due to missing quantities");
                                }
                                break;
                            case 5:
                                System.out.println("Insert grams of Vodka:");
                                i1 = entry.nextInt();
                                System.out.println("Insert number of Lemons:");
                                i2 = entry.nextInt();
                                
                                Mojito mJ = null;
                                if ((inv.sVodka(i1)!=-1)&&(inv.sLemon(i2)!=-1)) {
                                    mJ = new Mojito(i1, i2, randomIngInvS());
                                    pC = mJ.calcPrice(randomIngInvS(), randomIngInvS());
                                    ppC = mJ.printPrice(i1, i2, pC);
                                    System.out.println("Thanks for your order\n"+ppC+"\n");
                                    money+=pC;
                                }else{
                                    System.out.println("Mojito was not created due to missing quantities");
                                }
                                break;
                            case 4:
                                System.out.println("Insert grams of Coffee:");
                                i1 = entry.nextInt();
                                System.out.println("Insert mL of Milk:");
                                i2 = entry.nextInt();
                                
                                Coffee cF = null;
                                if ((inv.sCoffee(i1)!=-1)&&(inv.sMilk(i2)!=-1)) {
                                    cF = new Coffee(i1, i2, randomIngInvS());
                                    pC = cF.calcPrice(randomIngInvS(), randomIngInvS());
                                    ppC = cF.printPrice(i1, i2, pC);
                                    System.out.println("Thanks for your order\n"+ppC+"\n");
                                    money+=pC;
                                }else{
                                    System.out.println("Coffee was not created due to missing quantities");
                                }
                                break;
                            case 6:
                                System.out.println("Insert number of Apples:");
                                i1 = entry.nextInt();
                                System.out.println("Insert grams of Pastry:");
                                i2 = entry.nextInt();
                                
                                Pie pE = null;
                                if ((inv.sApple(i1)!=-1)&&(inv.sPastry(i2)!=-1)) {
                                    pE = new Pie(i1, i2, randomIngInvS());
                                    pC = pE.calcPrice(randomIngInvS(), randomIngInvS());
                                    ppC = pE.printPrice(i1, i2, pC);
                                    System.out.println("Thanks for your order\n"+ppC+"\n");
                                    money+=pC;
                                }else{
                                    System.out.println("Apple pie was not created due to missing quantities");
                                }
                                break;
                            case 7:
                                System.out.println("Insert grams of Chips:");
                                i1 = entry.nextInt();
                                System.out.println("Insert grams of Ice Cream:");
                                i2 = entry.nextInt();
                                
                                IceCream iC = null;
                                if ((inv.sChips(i1)!=-1)&&(inv.sIceCream(i2)!=-1)) {
                                    iC = new IceCream(i1, i2, randomIngInvS());;
                                    pC = iC.calcPrice(randomIngInvS(), randomIngInvS());
                                    ppC = iC.printPrice(i1, i2, pC);
                                    System.out.println("Thanks for your order\n"+ppC+"\n");
                                    money+=pC;
                                }else{
                                    System.out.println("Ice cream was not created due to missing quantities");
                                }
                                break;
                            default:
                                System.out.println("Corrupted entry");
                        }
                        break;
                case 6:
                        System.out.println("\n\nSelect dish of inventory to buy:"
                                + "\n1.Vegan Sausage"
                                + "\n2.Lasagna"
                                + "\n3.Chocolate milkshake"
                                + "\n4.Coffee"
                                + "\n5.Mojito"
                                + "\n6.Apple pie"
                                + "\n7.Ice Cream\n");
                        int dS = entry.nextInt();
                        double pS = 0;
                        String sS = "";
                        switch(dS){
                            case 1:
                                if(vegS==true){
                                    pS = vSau.calcPrice(randomIngInv(), randomIngInvS());
                                    sS = vSau.printPrice(vSau.getGrTofu(), vSau.getGrOnion(), pS);
                                    System.out.println("Thanks for your order\n"+sS+"\n");
                                    money += pS;
                                    vSau = null;
                                    vegS = false;
                                }else{
                                    System.out.println("No stock of vegan sausages");
                                }
                                break;
                            case 2:
                                if(lasg==true){
                                    pS = lna.calcPrice(randomIngInv(), randomIngInvS());
                                    sS = lna.printPrice(lna.getGrPasta(), lna.getMlSauce(), pS);
                                    System.out.println("Thanks for your order\n"+sS+"\n");
                                    money += pS;
                                    lna = null;
                                    lasg = false;
                                    
                                }else{
                                    System.out.println("No stock of lasagna");
                                }
                                break;
                            case 3:
                                if(chMilk==true){
                                    pS = cMil.calcPrice(randomIngInv(), randomIngInvS());
                                    sS = cMil.printPrice(cMil.getGrHersheys(), cMil.getMlMilk(), pS);
                                    System.out.println("Thanks for your order\n"+sS+"\n");
                                    money += pS;
                                    cMil = null;
                                    chMilk = false;
                                }else{
                                    System.out.println("No stock of chocolate milkshake");
                                }
                                break;
                            case 5:
                                if(moj==true){
                                    pS = mjt.calcPrice(randomIngInv(), randomIngInvS());
                                    sS = mjt.printPrice(mjt.getMlVodka(), mjt.getQtLemon(), pS);
                                    System.out.println("Thanks for your order\n"+sS+"\n");
                                    money += pS;
                                    mjt = null;
                                    moj = false;
                                }else{
                                    System.out.println("No stock of mojito");
                                }
                                break;
                            case 4:
                                if(cof==true){
                                    pS = cfe.calcPrice(randomIngInv(), randomIngInvS());
                                    sS = cfe.printPrice(cfe.getGrCoffee(), cfe.getMlMilk(), pS);
                                    System.out.println("Thanks for your order\n"+sS+"\n");
                                    money += pS;
                                    cfe = null;
                                    cof = false;
                                }else{
                                    System.out.println("No stock of coffee");
                                }
                                break;
                            case 7:
                                if(iceC==true){
                                    pS = iCream.calcPrice(randomIngInv(), randomIngInvS());
                                    sS = iCream.printPrice(iCream.getGrChips(), iCream.getGrChips(), pS);
                                    System.out.println("Thanks for your order\n"+sS+"\n");
                                    money += pS;
                                    iCream = null;
                                    iceC = false;
                                }else{
                                    System.out.println("No stock of Ice cream");
                                }
                                break;
                            case 6:
                                if(pi==true){
                                    pS = pieA.calcPrice(randomIngInv(), randomIngInvS());
                                    sS = pieA.printPrice(pieA.getQtApple(), pieA.getGrPastry(), pS);
                                    System.out.println("Thanks for your order\n"+sS+"\n");
                                    money += pS;
                                    pieA = null;
                                    pi = false;
                                }else{
                                    System.out.println("No stock of Apple pies");
                                }
                                break;
                            default:
                                System.out.println("Corrupted entry");
                        }
                        break;
                default:
                    System.out.println("Corrupted entry, try again");
            }
            System.out.println(menu);
            c = entry.nextInt();
        } 
        System.out.println("Thanks for your order");
        
    }
    
    
}
