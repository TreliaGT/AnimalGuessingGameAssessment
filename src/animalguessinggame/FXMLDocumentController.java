/*
 * This program is an animal guessing game which uses the follow:
 * Binary trees ai technology
 * Reading & Saving  a binary file
 */
package animalguessinggame;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 *
 * @author V244682
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Pane PaddQuestion;
    @FXML
    private TextField txtQuestion;
    @FXML
    private Button CheckYes;
    @FXML
    private Button CheckNo;
    @FXML
    private Label LaddQuestion;
    @FXML
    private Button btnAddQuestion;
    @FXML
    private Pane PgiveUp;
    @FXML
    private Button btnEnterNewAnimal;
    @FXML
    private TextField txtnewAnimal;
    @FXML
    private Pane Pmain;
    @FXML
    private Label LQuestion;
    @FXML
    private RadioButton CheckQYes;
    @FXML
    private RadioButton CheckQNo;
    @FXML
    private Button btnEnterInput;
    
    /***
     * Start method which shows the main pane in the GUI 
     * calls settingNodes Method
     * @param url
     * @param rb 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Pmain.setVisible(true);
           settingNodes();
    }  
    
    /***
     * A method that sets some of the nodes for the binary tree
     */
    public void settingNodes(){
        Node root = new Node("Does this animal have fur?");
        Node node2 = new Node("It is a wolf?");
        root.setYes(node2);
        LQuestion.setText(root.getData());
        
    }

    /***
     * Adds new Animal to the binary tree
     * @param event 
     */
    @FXML
    private void addNewAnimal(ActionEvent event) {
    }

    /***
     * Shows the menu to add new animals
     * @param event 
     */
    @FXML
    private void showNewAnimal(ActionEvent event) {
    }

    /***
     * enters the user answer
     * @param event 
     */
    @FXML
    private void enterInput(ActionEvent event) {
            boolean yes = CheckQYes.isSelected();
             boolean no = CheckQNo.isSelected(); 
             
        Answer(yes,no );
    }
    /***
     * If statement event 
     * see what is answer to last question to then display the correct data
     * @param yes
     * @param no 
     */
    public void Answer(boolean yes, boolean no){
        if(yes == true){
                 
        } else if (no == true){
            
        } else{
            
        }
    }

    /***
     * Continue game after not being able to guessed the animal
     * @param event 
     */
    @FXML
    private void continueGame(ActionEvent event) {
    }
    
    /***
    * Close the game 
    * @param event 
    */
    @FXML
    private void endGame(ActionEvent event) {
    }

    
}
