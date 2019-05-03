/*
 * This program is an animal guessing game which uses the follow:
 * Binary trees ai technology
 * Reading & Saving  a binary file
 */
package animalguessinggame;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    @FXML
    private Button btnContinue;
    @FXML
    private Button btnstop;
    @FXML
    private Label lagain;
    @FXML
    private Pane pAgain; 
    
      //Variables for program
      BTree btree = new BTree();
      Node root; 
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
          // settingNodes();
          readData();
    }  
    /**
     * read data file
     */
    public void readData(){
          try {
         FileInputStream fileIn = new FileInputStream("saveTreeData.dat");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         root = (Node) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
          JOptionPane.showMessageDialog(null, "There was an error");
         return;
      } catch (ClassNotFoundException c) {
            JOptionPane.showMessageDialog(null, "class was't found");
         return;
      }
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
         txtQuestion.clear();
         CheckNo.setSelected(false);
         CheckYes.setSelected(false);
         pAgain.setVisible(true);
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
        CheckQYes.setSelected(false);
         CheckQNo.setSelected(false);
    } 
    
    /**
    * Continue playing button, restarts the game
    * @param event 
    */
    @FXML
    private void continuePlaying(ActionEvent event) {
          Pmain.setVisible(true);
          pAgain.setVisible(false);
          PaddQuestion.setVisible(false);
          LQuestion.setText(root.getData());
          btree.setCurrentNode(root);
          
    }
    
    /**
    * end the game button loads save data method
    * @param event 
    */
    @FXML
    private void stopPlaying(ActionEvent event) {
        savedata();
    }

    public void savedata(){
          try {
         FileOutputStream fileOut =
         new FileOutputStream("saveTreeData.dat");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(root);
         out.close();
         fileOut.close();
          JOptionPane.showMessageDialog(null, "saved data");
      } catch (IOException i) {
         JOptionPane.showMessageDialog(null, "Error with saving");
      }
          System.exit(0);
    }
    /**
     * just shows the the pAgain panel
     * @param event 
     */
    @FXML
    private void amIRight(ActionEvent event) {
        Pmain.setVisible(false);
         pAgain.setVisible(true);
    }
}
