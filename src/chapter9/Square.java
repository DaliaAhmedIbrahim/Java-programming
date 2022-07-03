/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

/**
 *
 * @author user
 */
public class Square extends Rectangle{
    
    @Override
    public double calculatePerimeter(){
        return sides * length;
    }

    public void print(String what){
        System.out.println("I am a " + what);
    }
    
}
