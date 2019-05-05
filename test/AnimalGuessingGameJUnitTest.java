/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import animalguessinggame.BTree;
import animalguessinggame.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Trelia
 */
public class AnimalGuessingGameJUnitTest {
    
    public AnimalGuessingGameJUnitTest() {
    }

    @Test
    public void testAnimalQuestion(){
        BTree btree = new BTree();
        Node i = new Node("Does it eat grass?");                
        btree.getCurrentNode().setYes(i);
        btree.setCurrentNode(i);
           
        assertEquals("Does it eat grass?", btree.getCurrentNode().getData());
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
 }

