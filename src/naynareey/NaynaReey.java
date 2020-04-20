/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package naynareey;

import java.util.Scanner;

/**
 *
 * @author ريان احمد سعدي
 */
public class NaynaReey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO' code application logic here
        Person raiyan = new Person("Raiyan","Mohammadpur, Dhaka");
        Person rana = new Person("Rana Sikder", "Jessore, Khulna");
        Teacher Ara = new Teacher("Tasnim Ara Mim","Khalishpur, Khulna");
        Student Afridi = new Student("Shahid Afridi","Karachi, Pakistan");
        
        System.out.println("\nperson's getname() does this:--\t"+raiyan.getName()+"\nPerson's getAddress() does this:--\t "+raiyan.getAddress());
        System.out.println("\nperson's getname() does this:--\t"+rana.getName()+"\nPerson's getAddress() does this:--\t "+rana.getAddress());
        System.out.println("\nperson's toString() does this:--\t"+rana.toString()+"\nPerson's toString() does this:--\t "+raiyan.toString());
        
        System.out.println("Teacher's getName() does this:--\t"+Ara.getName()
                          +"\nTeacher's getAddress() does this:--\t"+Ara.getAddress()
                          +"\nTeacher's toString() does this:--\t"+Ara.toString()
                          +"\nTeacher's getNumCourses() does this:--\t"+Ara.getNumCourses()
                          +"\nTeacher's getCourses() does this:--\t"+Ara.getCourses());
        //good. Now we'll initialize some of the properties of the teacher
        for(int i=0; i<5; i++){
            String course;
            System.out.println("What Course would you like to add?");
            Scanner input = new Scanner(System.in);
            course = input.next();
            
            Ara.addCourse(course);
        }
        //Now print 'em again:
        System.out.println("Teacher's getName() does this:--\t"+Ara.getName()
                          +"\nTeacher's getAddress() does this:--\t"+Ara.getAddress()
                          +"\nTeacher's toString() does this:--\t"+Ara.toString()
                          +"\nTeacher's getNumCourses() does this:--\t"+Ara.getNumCourses()
                          +"\nTeacher's getCourses() does this:--\t"+Ara.getCourses());
        
        System.out.println("");
    }

}
