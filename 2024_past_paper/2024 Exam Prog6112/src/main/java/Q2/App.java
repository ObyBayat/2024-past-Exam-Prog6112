/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Q2;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
public class App extends JFrame  {
     
    public App(){
      setSize(400,300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("Movie Tickets");
      
///////////////////////////Declaring UI components///////////////////////////////
      JPanel panel = new JPanel();
      //menu bar
      JMenuBar menuBar = new JMenuBar();
      //menus
      JMenu fileMenu = new JMenu("File");
      JMenu editMenu = new JMenu("Edit");
      //add menus to menu bar
      menuBar.add(fileMenu);
      menuBar.add(editMenu);
      //Menu items
      //HERE
      JMenuItem exitItem = new JMenuItem("Exit");
      JMenuItem processItem = new JMenuItem("Process");
      JMenuItem clearItem = new JMenuItem("Clear");
      //Add menu items to menus
      fileMenu.add(exitItem);
      editMenu.add(processItem);
      editMenu.add(clearItem);
      //JLabels
      JLabel movieLabel =        new JLabel("Movie                            ");
      JLabel ticketPriceLabel =  new JLabel("Ticket price                     ");
      JLabel numTicketsLabel =   new JLabel("Number of tickets                ");
      JLabel ticketReportLabel = new JLabel("Ticket Report                    ");
      //Combo box
      String[] movies = {"Napolean","Oppenheimer"
              ,"Damsel"};
      JComboBox movieDropdown = new JComboBox(movies);
      //JTextFields
      JTextField numTicketsField = new JTextField(20);
      JTextField ticketPriceField = new JTextField(20);
      //Text Area
      JTextArea textArea = new JTextArea(10,30);
      
/////////////////MENU ITEMS FUNCTIONALITY//////////////////
      //Exit item
      exitItem.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              System.exit(0);
          }   
      });
      //Process item
      processItem.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
             MovieTickets movieTickets = new MovieTickets(); 
             String selectedMovie = movieDropdown.getSelectedItem().toString();
             int numTickets = Integer.parseInt(numTicketsField.getText());
             double ticketPrice = Double.parseDouble(ticketPriceField.getText());
             
             MovieTicketData movieData = new MovieTicketData(selectedMovie,numTickets,ticketPrice);
             boolean validData = movieTickets.ValidateData(movieData);
             if(validData == false){
                 return;
             }
             
             double totalPrice = movieTickets.CalculateTotalTicketPrice(numTickets, ticketPrice);
             textArea.append("Movie name : "+selectedMovie+"\n");
             textArea.append("Movie ticket price : "+ticketPrice+"\n");
             textArea.append("Number of tickets : "+numTickets+"\n");
             textArea.append("Total price : "+totalPrice+"\n");
             
             try{
             FileWriter fw = new FileWriter("Data.txt");
             fw.write("Movie name : "+selectedMovie+"\n");
             fw.write("Movie ticket price : "+ticketPrice+"\n");
             fw.write("Number of tickets : "+numTickets+"\n");
             fw.write("Total price : "+totalPrice+"\n");
            
             fw.close();
             }
             catch(IOException exception){
               System.out.println("Error handling file");  
             }       
             }     
      });
      //Clear item
      clearItem.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              textArea.setText("");
              numTicketsField.setText("");
              ticketPriceField.setText("");
              movieDropdown.setSelectedIndex(0);
          }
          
      });
      //Setting the textArea to not be editable
      textArea.setEditable(false);
      //Adding elements to panel
      panel.add(movieLabel);
      panel.add(movieDropdown);
      panel.add(numTicketsLabel);
      panel.add(numTicketsField);
      panel.add(ticketPriceLabel);
      panel.add(ticketPriceField);
      panel.add(ticketReportLabel);
      panel.add(textArea);
      //add panel to Jframe
      add(panel);
      //use JFrame function to set the menu bar
      setJMenuBar(menuBar);
      setVisible(true);
    }
    
    public static void main(String[] args) {
       App app = new App();
    }
}
