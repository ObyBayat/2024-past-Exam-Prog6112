/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q1;

import java.util.Arrays;
public class Main {
   
    public static void main(String[] args) {
        //1D arrays
        String[] movies = {"Napolean   ","Oppenheimer"};
        int[] totalSales = new int[2];
        //2D array
        int[][] ticketsSold = {
            {3000,1500,1700},
            {3500,1200,1600}
        };
        
        for(int i =0;i<ticketsSold.length;i++){
             int total = 0;
            for(int j = 0;j<ticketsSold[i].length;j++){
                total += ticketsSold[i][j];
            }
             totalSales[i] = total;
        }
        int[] nopoleanSales = ticketsSold[0];
        int[] oppenheimerSales = ticketsSold[1]; 
       
        MovieTickets movieTickets = new MovieTickets();
        
        int totalSalesNapolean =  movieTickets.TotalMovieSales(nopoleanSales);
        int totalSalesOppenheimer =  movieTickets.TotalMovieSales(oppenheimerSales);
        String topMovie = movieTickets.TopMovie(movies, totalSales);
        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        System.out.println("             Jan   Feb   Mar");
        System.out.println("--------------------------------------");
        
        for(int i = 0;i<ticketsSold.length;i++){
            System.out.println(movies[i]+ " "+Arrays.toString(ticketsSold[i]));
        }
        System.out.println("");
        System.out.println("Total movie ticket sales for Napolean : "+totalSalesNapolean);
        System.out.println("Total movie ticket sales for Oppenheimer : "+totalSalesOppenheimer);
        System.out.println("");
        System.out.println("Top performing Movie : "+ topMovie);
    }    
}
