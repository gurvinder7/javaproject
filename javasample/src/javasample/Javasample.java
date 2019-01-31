/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasample;

/**
 *
 * @author macstudent
 */
public class Javasample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student s1=new student();
        s1.setSname("gurvinder");
        s1.setResult("pass");
        System.out.println(s1.getSname());
        System.out.println(s1.getResult());
    }
    
}
