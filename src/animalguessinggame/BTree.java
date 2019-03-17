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
    
    public boolean search(String data) {
        return search(root, data);
    }
    
    public boolean search(Node node, String data) {
        if (node.getData() == data) {
            return true;
        }
        if (node.getLeft()!=null)
            if (search(node.getNo(), data))
                return true;
            if (node.getYes()!=null)
                if (search(node.getYes(), data))
                    return true;
            return false;
    }
   
    
    public Node getRoot() {
        return root;
    }
    
    public boolean isEmpty() {
        return root == null;
    }
    
    public int countNodes() {
        return countNodes(root);
    }
    public int countNodes(Node node) {
        int count=1;
        if (node==null) {
            return 0;
        } else {
            count += countNodes(node.getNo());  
            count += countNodes(node.getYes());  
            return count;
        }        
    }
    
   
    public Node getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(Node currentNode) {
        this.currentNode = currentNode;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    
    
}