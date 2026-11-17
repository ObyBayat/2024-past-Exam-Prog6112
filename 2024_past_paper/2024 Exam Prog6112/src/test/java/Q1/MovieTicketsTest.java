/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Q1;

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
        movieTickets = new MovieTickets();
    }
       
    @Test
    public void testTotalMovieSales() {
        int[] sales = {10,20,30,40};
        int result = movieTickets.TotalMovieSales(sales);
        int expected = 100;
        assertEquals(result, expected);
    }

    @Test
    public void testTopMovie() {
       int[] totalSales = {100,250,50};
       String[] movies = {"Damsel","Napolean","Oppenheimer"};
       String result = movieTickets.TopMovie(movies, totalSales);
       String expected = "Napolean";
       assertEquals(result,expected);
    }
    
}
