/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

import java.math.*;
public class MovieTickets implements IMovieTickets {
    public MovieTickets(){
        
    }

    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) {
       double total = (double) numberOfTickets*ticketPrice*1.14;
       double roundedTotal = Math.round(total);
       return roundedTotal;
    }

    @Override
    public boolean ValidateData(MovieTicketData movieTicketData) {
        if(movieTicketData.getMovieName().isEmpty()
           || movieTicketData.getNumTickets()<=0
           || movieTicketData.getTicketPrice()<=0){
           return false; 
        }
        return true;
    }
}
