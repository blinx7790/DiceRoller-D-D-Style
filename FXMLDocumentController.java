/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceroller;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Parks
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    
    Random rand = new Random();
    
    
    //
    //Die set of 7 total dice
    //the dice are 4,6,8,10,12,
    //20, and a Percent die
    //
    
    
    
    @FXML
    private void handleDie8(ActionEvent event) {
        System.out.println("8 roller");
       
        int dieRoll = rand.nextInt(8) + 1;
        
        label.setText("You rolled: " + dieRoll);
       
    }
    @FXML
    private void handleDie6(ActionEvent event){
        System.out.println("6 roller");
       
        int dieRoll = rand.nextInt(6) + 1;

        label.setText("You rolled: " + dieRoll);
    }
    
    @FXML
    private void handleDie20(ActionEvent event){
        System.out.println("20 roller");
        
        int dieRoll = rand.nextInt(20) + 1;
        
        label.setText("You rolled: " + dieRoll);
    }
    
    @FXML
    private void handleDie4(ActionEvent event){
        System.out.println("4 roller");
        
        int dieRoll = rand.nextInt(4) + 1;
        
        label.setText("You rolled: " + dieRoll);
    }
    
    @FXML
    private void handleDie10(ActionEvent event){
        System.out.println("10 roller");
        
        int dieRoll = rand.nextInt(10) + 1;
        
        label.setText("You rolled: " + dieRoll);
    }
    
    @FXML
    private void handleDie12(ActionEvent event){
        System.out.println("12 roller");
        
        int dieRoll = rand.nextInt(12) + 1;
        
        label.setText("You rolled: " + dieRoll);
    }
    
    @FXML
    private void handleDiePercent(ActionEvent event){
        System.out.println("Percent roller");
        
        int dieRoll = rand.nextInt(10) + 1;
        
        label.setText("You rolled: " + dieRoll + "0");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
