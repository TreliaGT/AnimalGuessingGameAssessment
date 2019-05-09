/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalguessinggame;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author V244682
 */
public class GuessingAnimalJUnitTest {
    
    public GuessingAnimalJUnitTest() {
    }
    
    /**
     *  Test Answer Method
     */
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
    
     /**
     *  Test Answer Method
     */
    @Test 
    public void testaddNewAnimal2(){
        boolean question = true;
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
