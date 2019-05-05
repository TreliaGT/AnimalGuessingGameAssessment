/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import animalguessinggame.BTree;
import animalguessinggame.Node;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
       String getData = btree.getCurrentNode().getData().toString();
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

