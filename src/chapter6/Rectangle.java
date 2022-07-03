/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(){
        length =0;
        width=0;
    }
    
    public Rectangle(double length, double width){
        setWidth(width); //can be set this way
        this.length= length; //or can be set this way.these are only diff here to demo alternative actions
    }
    
    public double getLength(){
        return length;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    public double getwidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
     public double calculatePerimeter(){
  
        return 2*(length+width);
    }
    
    public double calculateArea(){
  
        return length*width;
    }
}
