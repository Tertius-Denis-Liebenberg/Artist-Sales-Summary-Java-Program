package com.mycompany.jd521.sa;
import java.util.Scanner;

// Created interface
interface Interface1{
    public void salesSummary();
}

// Artist Table abstract class
abstract class ArtistTable implements Interface1{
    public int rows, columns;
    
    // Initializes variables in constructor
    public ArtistTable(int rowSum, int colSum){
        this.rows = rowSum;
        this.columns = colSum;
    }
    
    // Main sales summary
    public void salesSummary(){
        String[] artistNames = {"Master KG", "DJ B Coffee", "Bruno Mars", "F Fighters", "T Swift"};
        int[][] artistSales = {{900000, 800000, 500000}, {700000, 500000, 500000}, {800000, 100000, 50000}, {100000, 200000, 200000}, {300000, 100000, 50000}};
        
        int totalCol1 = 0;
        int totalCol2 = 0;
        int totalCol3 = 0;
        // Retrieves totals
        for (int i = 0; i < 5; i++){
            for (int x = 0; x < 3; x++){
                // Switch between 3 totals
                switch (x){
                    case 0:
                        totalCol1 += artistSales[i][x];
                        break;
                    case 1:
                        totalCol2 += artistSales[i][x];
                        break;
                    case 2:
                        totalCol3 += artistSales[i][x];
                        break;
                }
            }
        }
        
        // Prints table summary
        System.out.printf("%-22s%-22s%-22s%-22s", "Artist Name", "DVD Sales", "Blu Ray Sales", "CD Sales");
        System.out.println("\n_________________________________________________________________________________\n");
        
        for (int i = 0; i < artistNames.length; i++){
            int total1 = 0;
            int total2 = 0;
            int total3 = 0;
            
            for (int x = 0; x < 3; x++){
                // Switch between 3 totals
                switch (x){
                    case 0:
                        total1 = artistSales[i][x];
                        break;
                    case 1:
                        total2 = artistSales[i][x];
                        break;
                    case 2:
                        total3 = artistSales[i][x];
                        break;
                }
            }
            
            System.out.printf("%-22s%-22d%-22d%-22d", artistNames[i], total1,  total2, total3);
            System.out.println("\n");
        }
        
        System.out.println("_________________________________________________________________________________\n");
        System.out.printf("%-22s%-22d%-22d%-22d", "Total", totalCol1, totalCol2, totalCol3);
    }
} 

// Overriding subclass
class Overrider extends ArtistTable{
    public int index;
    public String[] artistNames = {"Master KG", "DJ B Coffee", "Bruno Mars", "F Fighters", "T Swift"};
    public int[][] artistSales = {{900000, 800000, 500000}, {700000, 500000, 500000}, {800000, 100000, 50000}, {100000, 200000, 200000}, {300000, 100000, 50000}};
           
    public Overrider(int rowSum, int colSum, int index) {
        super(rowSum, colSum);
        this.index = index;
    }
    
    @Override
    public void salesSummary(){
        
        int totalCol1 = 0;
        int totalCol2 = 0;
        int totalCol3 = 0;
        // Retrieves totals
        for (int i = 0; i < 5; i++){
            for (int x = 0; x < 3; x++){
                // Switch between 3 totals
                switch (x){
                    case 0:
                        totalCol1 += artistSales[i][x];
                        break;
                    case 1:
                        totalCol2 += artistSales[i][x];
                        break;
                    case 2:
                        totalCol3 += artistSales[i][x];
                        break;
                }
            }
        }
        
        // Prints table summary
        // printf is used for formatting
        System.out.printf("%-22s%-22s%-22s%-22s", "Artist Name", "DVD Sales", "Blu Ray Sales", "CD Sales");
        System.out.println("\n\n_________________________________________________________________________________\n");
        
        for (int i = 0; i < artistNames.length; i++){
            int total1 = 0;
            int total2 = 0;
            int total3 = 0;
            
            for (int x = 0; x < 3; x++){
                // Switch between 3 totals
                switch (x){
                    case 0:
                        total1 = artistSales[i][x];
                        break;
                    case 1:
                        total2 = artistSales[i][x];
                        break;
                    case 2:
                        total3 = artistSales[i][x];
                        break;
                }
            }
            
            System.out.printf("%-22s%-22d%-22d%-22d", artistNames[i], total1,  total2, total3);
            System.out.println("\n");
        }
        
        System.out.println("_________________________________________________________________________________\n");
        System.out.printf("%-22s%-22d%-22d%-22d", "    Total", totalCol1, totalCol2, totalCol3);
    }
    
    // Overload salesSummary
    public void salesSummary(int artistPosition){
        int attempt = 0;
        artistSearchOop obj = new artistSearchOop();
        artistPosition = artistPosition - 1;
        
        while (attempt < 5){
            // Checks user inputs
            if(artistPosition > 4){
                System.out.println("You have entered an invalid input ");
                attempt += 1;
                artistPosition = obj.userInput() - 1;
            }else if(artistPosition < 0){
                System.exit(0);
            }else{
                // Searches for artist
                switch(artistPosition){
                    case 0:
                        // Displays artist name and sales
                        System.out.println("Artist Name: " + artistNames[artistPosition]
                                + "\nCD Sale: " + artistSales[artistPosition][0]
                                + "\nDVD Sale: " + artistSales[artistPosition][1]
                                + "\nBlu Ray Sale: " + artistSales[artistPosition][2]
                                + "\nTotal: " + (artistSales[artistPosition][0] + artistSales[artistPosition][1] + artistSales[artistPosition][2]));
                        salesSummary(obj.userInput());
                        break;
                    case 1:
                        // Displays artist name and sales
                        System.out.println("Artist Name: " + artistNames[artistPosition]
                                + "\nCD Sale: " + artistSales[artistPosition][0]
                                + "\nDVD Sale: " + artistSales[artistPosition][1]
                                + "\nBlu Ray Sale: " + artistSales[artistPosition][2]
                                + "\nTotal: " + (artistSales[artistPosition][0] + artistSales[artistPosition][1] + artistSales[artistPosition][2]));
                        salesSummary(obj.userInput() - 1);
                        break;
                    case 2:
                        // Displays artist name and sales
                        System.out.println("Artist Name: " + artistNames[artistPosition]
                                + "\nCD Sale: " + artistSales[artistPosition][0]
                                + "\nDVD Sale: " + artistSales[artistPosition][1]
                                + "\nBlu Ray Sale: " + artistSales[artistPosition][2]
                                + "\nTotal: " + (artistSales[artistPosition][0] + artistSales[artistPosition][1] + artistSales[artistPosition][2]));
                        salesSummary(obj.userInput());
                        break;
                    case 3:
                        // Displays artist name and sales
                        System.out.println("Artist Name: " + artistNames[artistPosition]
                                + "\nCD Sale: " + artistSales[artistPosition][0]
                                + "\nDVD Sale: " + artistSales[artistPosition][1]
                                + "\nBlu Ray Sale: " + artistSales[artistPosition][2]
                                + "\nTotal: " + (artistSales[artistPosition][0] + artistSales[artistPosition][1] + artistSales[artistPosition][2]));
                        salesSummary(obj.userInput());
                        break;
                    case 4:
                        // Displays artist name and sales
                        System.out.println("Artist Name: " + artistNames[artistPosition]
                                + "\nCD Sale: " + artistSales[artistPosition][0]
                                + "\nDVD Sale: " + artistSales[artistPosition][1]
                                + "\nBlu Ray Sale: " + artistSales[artistPosition][2]
                                + "\nTotal: " + (artistSales[artistPosition][0] + artistSales[artistPosition][1] + artistSales[artistPosition][2]));
                        salesSummary(obj.userInput());
                        break;
                }
            }
        }
    }
}

// Main class
public class artistSearchOop {
    public static void main(String[] args){
        // Exception handling
        try{
            ArtistTable myObj = new Overrider(0, 0, 0);
            Overrider OvObj = new Overrider(0, 0, 0);
            myObj.salesSummary();
              
            OvObj.salesSummary(userInput());
        }catch (Exception e){
            System.out.println(e);
            main(args);
        }
    }
    
    // Call back for user input
    public static int userInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nPlease Enter a Number between 0 and 6");
        int artistPosition = input.nextInt();
        return artistPosition;
    }
}