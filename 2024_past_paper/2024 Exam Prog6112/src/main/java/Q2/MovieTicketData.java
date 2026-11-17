package Q2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author obayat
 */
public class MovieTicketData {
    private String movieName;
    private int numTickets;
    private double ticketPrice;

    public MovieTicketData(String movieName,
            int numTickets, double ticketPrice) {
        this.movieName = movieName;
        this.numTickets = numTickets;
        this.ticketPrice = ticketPrice;
    }
    public double getTicketPrice() {
        return ticketPrice;
    }
    public String getMovieName(){
        return movieName;
    }
    public int getNumTickets(){
        return numTickets;
    }
    
    
    
    
    
}
