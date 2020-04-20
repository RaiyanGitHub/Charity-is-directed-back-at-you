/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package naynareey;

import java.util.ArrayList;

/**
 *
 * @author سعدي
 */
public class Teacher extends Person {
    private int numCourses = 0;
    private ArrayList<String> courses = new ArrayList<String>(20);
    Teacher(String name, String address){
        super(name,address);
    }

    public int getNumCourses() {
        return numCourses;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }
    
    public String toString(){
        String cours = "";
        for(String x : courses){
            cours += x+"\t";
        }
        return super.toString()
                +"\n Number of Courses: "+numCourses
                +"\n Courses: "+cours;
    
    }//to String
    
    public boolean addCourse(String course){
        
        if(this.courses.indexOf(course) == -1){//this method returns -1 if the argument object does not exist in the collection
            this.courses.add(course);
            return true;
        }
        
        return false;
    }//add Course
    
    public boolean removeCourse(String course){    
        return this.courses.remove(course);
        
    }//remove course
    
    
    
    
}
