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
public class BTreeTest {
    
    public BTreeTest() {
    }

    /**
     * Test of getRoot method, of class BTree.
     */
    @Test
    public void testGetRoot() {
       
        BTree instance = new BTree();
        Node expResult = null;
        Node result = instance.getRoot();
        assertEquals(expResult, result);
    }


    /**
     * Test of getCurrentNode method, of class BTree.
     */
    @Test
    public void testGetCurrentNode() {
        BTree instance = new BTree();
        Node expResult = null;
        Node result = instance.getCurrentNode();
        assertEquals(expResult, result);
    }
    
    
     Node root = new Node("Does this animal have fur?");
     Node node2 = new Node("It is a wolf?");
   /**
     * Test of getRoot method, of class BTree.
     */
    @Test
    public void testGetRoot2() {
        BTree instance = new BTree();
        instance.setRoot(root);
        String expResult = "Does this animal have fur?";
        String result = instance.getRoot().getData();
        assertEquals(expResult, result);
    }


    /**
     * Test of getCurrentNode method, of class BTree.
     */
    @Test
    public void testGetCurrentNode2() {
        root.setYes(node2);
        BTree instance = new BTree();
        instance.setCurrentNode(root.getYes());
        String expResult = "It is a wolf?";
        String result = instance.getCurrentNode().getData();
        assertEquals(expResult, result);
    }
    
}
