package com.epam.maven_task;

/**
 * Hello world!
 *
 */
import java.util.*;

public class App{
    public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
    	
        ArrayList<Sweet> gifts = new ArrayList<Sweet>();

        Sweet s1 = new Chocolate("Dairy Milk",60,30,100);
        gifts.add(s1);
        Sweet s2 = new Chocolate("Snickers", 20, 15,70);
        gifts.add(s2);
        Sweet s3 = new Candy("Lollypop",5,8,50);
        gifts.add(s3);
        Sweet s4 = new Candy("Medallions",10,15,30);
        gifts.add(s4);
        Sweet s5 = new Chocolate("Perk",5,10,30);
        gifts.add(s5);
        Sweet s6 = new Chocolate("BarOne",40,20,90);
        gifts.add(s6);
        Sweet s7 = new Candy("Peppermints",2,5,30);
        gifts.add(s7);
        Sweet s8 = new Jellybean("Apple Flavour", 45, 25, 40);
        gifts.add(s8);
        Sweet s9 = new Jellybean("Mango Flavour", 55, 25, 60);
        gifts.add(s9);
        
        ArrayList<Sweet> chocs = new ArrayList<Sweet>();
        for(Sweet s : gifts){
            if(s instanceof Chocolate) chocs.add(s);
        }
        System.out.println("Options : ");
        System.out.println("1 - Cost");
        System.out.println("2 - Weight");
        System.out.println("3 - Sweetness");
        System.out.println("Enter option to sort the chocolates ");
        int op = in.nextInt();
        if(op == 1) {
            System.out.println("Sorted order of Chocolates by Cost");
            Collections.sort(chocs,new Sortedoncost());
            for(Sweet s : chocs){
            	System.out.println(s.name + " cost is " + s.cost + " weigth of chocolate is " + s.weight + "gms" + " sweetness is " + s.sweetfactor);
            }
            System.out.println();
        }
        else if(op == 2) {
            System.out.println("Sorted order of Chocolates by Weight");
            Collections.sort(chocs,new Sortedonweight());
            for(Sweet s : chocs){
            	System.out.println(s.name + " cost is " + s.cost + " weigth of chocolate is " + s.weight + "gms" + " sweetness is " + s.sweetfactor);
            }
            System.out.println();
        }
        else if(op == 3) {
            System.out.println("Sorted order of Chocolates by Sweet Factor");
            Collections.sort(chocs,new Sortedonfactor());
            for(Sweet s : chocs){
            	System.out.println(s.name + " cost is " + s.cost + " weigth of chocolate is " + s.weight + "gms" + " sweetness is " + s.sweetfactor);
            }
            System.out.println();
        }

        
        int Totalweight = 0;
        for(Sweet s : gifts){
        	Totalweight += s.weight;
        }
        System.out.println("Total weight of gifts is : "+Totalweight);
        System.out.println();

        
        System.out.println("Enter option to Categorize candies by");
        int cop = in.nextInt();
        System.out.println("Enter range of values");
        int low = in.nextInt();
        int high = in.nextInt();
    	int CandyCount = 0;
    	ArrayList<Sweet> cd = new ArrayList<Sweet>();
    	
        if(cop == 1) {
            for(Sweet s : gifts){
            	if(s instanceof Candy && s.cost >= low && s.cost <= high) {
            		CandyCount++;
            		cd.add(s);
            	}
            }
        }
        else if(cop == 2) {
            for(Sweet s : gifts){
            	if(s instanceof Candy && s.weight >= low && s.weight <= high) {
            		CandyCount++;
            		cd.add(s);
            	}
            }
        }
        else if(cop == 3) {
            for(Sweet s : gifts){
            	if(s instanceof Candy && s.sweetfactor >= low && s.sweetfactor <= high) {
            		CandyCount++;
            		cd.add(s);
            	}
            }
        }
        System.out.println("Number of Candies is given range: " + CandyCount);
        System.out.println("Candies are");
        for(Sweet s:cd) {
        	System.out.println(s.name + " cost is " + s.cost + " weigth of chocolate is " + s.weight + "gms" + " sweetness is " + s.sweetfactor);
        }
        in.close();
    }

}

