/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author obayat
 */
public class MovieTickets implements IMovieTickets {
    public MovieTickets(){
        
    }

    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
        int total = 0;
        for(int i = 0;i<movieTicketSales.length;i++){
            total += movieTicketSales[i];
        }
        return total;
    }

    @Override
    public String TopMovie(String[] movies, int[] totalSales) {
        String topMovie = "";
        int highest = 0;
        for(int i = 0;i<totalSales.length;i++){
           if(totalSales[i]>highest){
               highest = totalSales[i];
               topMovie = movies[i];
           } 
        }
        return topMovie;
    }
    
}
