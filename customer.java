
package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class customer {

   private String mobnum;
   private String id;
   private String name;
   private int age;

    public customer() {
        this.mobnum="";
        this.id="";
        this.name="";
        this.age=0;
    }

    public customer(String mobnum, String id, String name, int age) {
        this.mobnum = mobnum;
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getMobnum() {
        return mobnum;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setMobnum(String mobnum) {
        this.mobnum = mobnum;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    

   
    
}
