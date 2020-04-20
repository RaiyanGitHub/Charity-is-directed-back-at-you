
package naynareey;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author سعدي
 */
public class Student extends Person {
    private int numCourses = 0;
    private ArrayList<String> courses = new ArrayList<String>(20);
    private ArrayList<Double> grades = new ArrayList<Double>(20);//initial ekta capacity dilam

    public ArrayList<String> getCourses() {
        return courses;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }
    //Code  above are getters and setters
    Student(String name, String address){
        super(name,address);
    }
    
    public int getNumCourses(){
        return numCourses;
    }
    public void setNumCourses(int a){
        this.numCourses = a;
    }
    @Override
    public String toString(){
        String coury = "";
        for(String sss:courses){
            coury += sss+"\t";
        }
    
        String gary = "";
        for(double sss:grades){
            gary += sss+"\t";
        }
        
        return super.toString()+
                "\nnumber of courses: "+numCourses
                +"\n Courses: "+coury
                +"\nGrades: "+gary;
    }//toString
    
    
    public void addCourseGrade(String course, double grade){
        this.courses.add(course);
        this.grades.add(grade);
        //this.setNumCourses(this.getNumCourses()+1); 
        numCourses += 1;        //since number of couses has increased
    }
    
    public void printGrades(){
        Iterator itrC = this.courses.iterator();
        Iterator itrG = this.grades.iterator();
        while(itrC.hasNext() && itrG.hasNext()){
            //itrC.next();
            //itrG.next();
            
            System.out.println("Result for course "+itrC.next()+" is: "+itrG.next()+"\n");
        }
        
    }//printGrades
    
    public double getAverageGrades(){
        double a = 0.0000;int divCount = 0;
        
        for(double x: grades){
            a+=x;
            divCount++;
        }
        a /= divCount;
        
        
        return a;
    }//getAverage Grade
    
}
