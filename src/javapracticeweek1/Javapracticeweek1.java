/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapracticeweek1;

/**
 *
 * @author Himmat singh
 */
public class Javapracticeweek1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] studentlist2 = new Student[4];

    studentlist2[0] = new Student();
    studentlist2[0].setName("Harry");

    studentlist2[1] = new Student();
    studentlist2[1].setName("Himmat");

    for(Student s: studentlist2){
        System.out.println(s.getName());
        //sorry buddy!
    }
    }
    
}
