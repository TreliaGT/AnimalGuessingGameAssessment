/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackages;

import animalguessinggame.BTree;
import animalguessinggame.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author V244682
 */
public class GuessingAnimalJUnitTest {
    
    public GuessingAnimalJUnitTest() {
    }
    
     @Test
    public void testAnimalQuestion(){
        BTree btree = new BTree();
        Node i = new Node("Does it eat grass?");                
        btree.getCurrentNode().setYes(i);
        btree.setCurrentNode(i);
       String getData = btree.getCurrentNode().getData();
        assertEquals("Does it eat grass?", getData);
    }
    
     @Test
    public void testAnswer(boolean yes , boolean answer, String nulls){
        yes = false;
        nulls = null; 
        if(yes == true){
          if(nulls == null){
              answer = true;
          }else{
              answer = false;
          }
        }else{
              if(nulls == null){
              answer = true;
          }else{
              answer = false;
          } 
        }
        assertEquals(true , answer );
    }
    
         @Test
    public void testAnswer2( boolean no , boolean answer, String nulls){
        no = false;
        nulls = null; 
        if(no == true){
          if(nulls == null){
              answer = true;
          }else{
              answer = false;
          }
        }else{
           if(nulls == null){
              answer = true;
          }else{
              answer = false;
          } 
        }
        assertEquals(true , answer );
    }
    
    @Test 
    public void testaddNewAnimal(){
        boolean question = false;
        String Answer;
       if(question == false){
              Answer = "false";
        }else if (question == true){
           Answer = "true";
          }else{
            Answer = "null";
        }
        
        assertEquals("false" , Answer );
    }
    
    @Test 
    public void testaddNewAnimal2(){
        boolean question = false;
        String Answer;
       if(question == false){
              Answer = "false";
        }else if (question == true){
           Answer = "true";
          }else{
            Answer = "null";
        }
        
        assertEquals("true" , Answer );
    }
}
