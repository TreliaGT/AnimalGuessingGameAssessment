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
   private int data;
  private Node Left;
  private Node Right;
    
    public Node(int data){
        this.data = data;
        Left = null;
        Right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return Left;
    }

    public void setLeft(Node Left) {
        if(this.Left == null)
        this.Left = Left;
    }

    public Node getRight() {
        return Right;
    }

    public void setRight(Node Right) {
        if(this.Right == null)
        this.Right = Right;
    }
}
