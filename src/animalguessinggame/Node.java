/*
 * Node class
 * sets and gets the node for the binary tree
 */
package animalguessinggame;

/**
 *
 * @author V244682
 */
public class Node implements java.io.Serializable{
   private String data; //type of data
  private Node Yes; //two different nodes 
  private Node No;
    
    public Node(String data){
        this.data = data;
        Yes = null;
        No = null;
    }

    //Setters & getters 
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getYes() {
        return Yes;
    }

    public void setYes(Node Yes) {
        this.Yes = Yes;
    }

    public Node getNo() {
        return No;
    }

    public void setNo(Node No) {
        this.No = No;
    
    }
  }  

