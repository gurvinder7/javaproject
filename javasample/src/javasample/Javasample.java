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
        student s2=new student();
        student s3=new student();
        
        s1.setSname("gurvinder");
        s1.setResult("pass");
        s1.setRollnumber(12);
        System.out.println(s1.getSname());
        System.out.println(s1.getResult());
        System.out.println(s1.getRollnumber());
        
        
        s3.setSname("mangat");
        s2.setSname("mangat");
        s2.setResult("pass");
        s2.setRollnumber(134);
        
         System.out.println(s3.getSname());
        System.out.println(s2.getSname());
        System.out.println(s2.getResult());
        System.out.println(s2.getRollnumber());
    }
    
}
