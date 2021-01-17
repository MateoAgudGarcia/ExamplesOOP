/*
 * *Project coded by Mateo Agudelo Garc�a*
 * *GIT was used to manage versions*
 */
package FamilyRestaurant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
    
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int opt;
        int num[] = new int[13];
                
        int gTofu=0; int gOnion=0; int gPasta=0; int mSauce=0; int gHersheys=0; int mMilk=0; int gCoffee=0; int mVodka=0; int qLemon=0; int qApple=0; int gPastry=0; int gChips=0; int gIceCr=0;
        
        
        opt = autoTextFile();
        
        System.out.println("\nInitialize inventory");
        switch(opt){
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
                gTofu = randomIngInv();
                gOnion = randomIngInv();
                gPasta = randomIngInv();
                mSauce = randomIngInv();
                gHersheys = randomIngInv();
                mMilk = randomIngInv();
                gCoffee = randomIngInv();
                mVodka = randomIngInv();
                qLemon = randomIngInv();
                qApple = randomIngInv();
                gPastry = randomIngInv();
                gChips = randomIngInv();
                gIceCr = randomIngInv();
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
    }
    
    
}
