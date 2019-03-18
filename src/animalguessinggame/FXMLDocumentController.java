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
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javax.swing.JOptionPane;

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
    private RadioButton CheckYes;
    @FXML
    private RadioButton CheckNo;
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
    
    //Variables for program
      BTree btree = new BTree();
      Node root = new Node("Does this animal have fur?");
      Node node2 = new Node("It is a wolf?");
      String newanimal;
      Boolean Question;
      
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
        root.setYes(node2);
        LQuestion.setText(root.getData());
        btree.setCurrentNode(root);
    }

    /***
     * Adds new Animal to the binary tree
     * @param event 
     */
    @FXML
    private void addNewAnimal(ActionEvent event) {
        
          Node i = new Node(txtQuestion.getText());
        if(Question == false) { 
            btree.getCurrentNode().setNo(i);
            
           
        }else if(Question == true){ 
            btree.getCurrentNode().setYes(i);
        

        }else{
            JOptionPane.showMessageDialog(null, "There was an error");
        }
        btree.setCurrentNode(i);
            animalquestion();
    }
    
    /**
     * Adds what is the animal question
     */
    public void animalquestion(){
    
        Node n = new Node("Is it " + newanimal + "?");
        if(CheckNo.isSelected() == true){
             btree.getCurrentNode().setNo(n);
        } else if(CheckYes.isSelected() == true){
            btree.getCurrentNode().setYes(n);
        }else{
               JOptionPane.showMessageDialog(null, "Must pick Yes or No not both");
        }
    }
            

    /***
     * Shows the menu to add new animals
     * @param event 
     */
    @FXML
    private void showNewAnimal(ActionEvent event) {
         newanimal = txtnewAnimal.getText();
        PgiveUp.setVisible(false);
        PaddQuestion.setVisible(true);
        LaddQuestion.setText("What Yes or No question would you ask to tell the difference between the animal I said and " + newanimal + "?");
    }

    /***
     * enters the user answer
     * @param event 
     */
    @FXML
    private void enterInput(ActionEvent event) {
            boolean yes = CheckQYes.isSelected();
             boolean no = CheckQNo.isSelected(); 
             
        Answer(yes,no, btree.getCurrentNode());
    }
    
    /***
     * If statement event 
     * see what is answer to last question to then display the correct data
     * @param yes
     * @param no 
     * @param node 
     */
    public void Answer(boolean yes, boolean no, Node node){
        if(yes == true){
             if(node.getYes() == null){
                 txtnewAnimal.clear();
                  Pmain.setVisible(false);
                  PgiveUp.setVisible(true);
                  Question = true;
             }else{
                  btree.setCurrentNode(node.getYes());
                   LQuestion.setText(btree.getCurrentNode().getData());
             }
        } else if (no == true){
            if(node.getNo() == null){
                  txtnewAnimal.clear();
                  Pmain.setVisible(false);
                  PgiveUp.setVisible(true);
                   Question = false;
             }else{
                  btree.setCurrentNode(node.getNo());
                   LQuestion.setText(btree.getCurrentNode().getData());
             }
        }
        else{
          JOptionPane.showMessageDialog(null, "Must pick Yes or No not both");
        }
    }   

    @FXML
    private void continuePlaying(ActionEvent event) {
          Pmain.setVisible(true);
          PaddQuestion.setVisible(false);
          LQuestion.setText(root.getData());
    }

    @FXML
    private void stopPlaying(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void amIRight(ActionEvent event) {
        
        
    }
}
