/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Pmain.setVisible(true);
    }    
    
    
}
