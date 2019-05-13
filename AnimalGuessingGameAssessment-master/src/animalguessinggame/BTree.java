/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalguessinggame;


/**
 *
 * @author 5002104
 */
public class BTree {
    private Node root;
    private Node currentNode;

    public BTree() {
        root = null;
    }
//setters and getters
    public Node getRoot() {
        return root;
    }
 
     public void setRoot(Node root) {
        this.root = root;
    }
      
    public Node getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(Node currentNode) {
        this.currentNode = currentNode;
    }       
}