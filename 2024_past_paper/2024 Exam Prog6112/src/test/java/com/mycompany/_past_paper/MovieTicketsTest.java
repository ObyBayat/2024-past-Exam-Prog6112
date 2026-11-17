/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany._past_paper;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author obayat
 */
public class MovieTicketsTest {
    MovieTickets movieTickets;
    
    @BeforeEach
    public void setUp() {
        //movieTickets = new MovieTickets();
    }
    
    @Test
    public void testCalculateTotalTicketPrice() {
        movieTickets = new MovieTickets();
        double result = movieTickets.CalculateTotalTicketPrice(2, 100);
        double expected = 228;
        assertEquals(result,expected);
    }

    @Test
    public void testValidateTicketPriceLessThanZero() {
        movieTickets = new MovieTickets();
        MovieTicketData data = new MovieTicketData("Spiderman",3,-100);
        boolean result = movieTickets.ValidateData(data);
        boolean expected = false;
        assertEquals(result,expected);
    }
    
}
