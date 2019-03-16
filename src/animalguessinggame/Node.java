/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalguessinggame;

/**
 *
 * @author V244682
 */
public class Node {
   private String data;
  private Node Yes;
  private Node No;
    
    public Node(String data){
        this.data = data;
        Yes = null;
        No = null;
    }

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
