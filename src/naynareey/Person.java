/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package naynareey;

/**
 *
 * @author سعدي
 */
public class Person {
    private String name;
    private String address;
    
    Person(String nam, String addr){
        name=nam;
        address=addr;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String a){
        address = a;
    }
    public void setName(String b){
        name = b;
    }
    @Override
    public String toString(){
        return "Name: "+name+"\naddress: "+address;
    }
}
