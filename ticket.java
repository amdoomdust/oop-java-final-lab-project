
package project;

import java.io.*;

import java.util.Scanner;


public class ticket {
private String desti;  
private String dedate;
private String redate;

    public ticket() {
        this.desti="";
        this.dedate="";
        this.redate="";
    }

    public ticket(String desti, String dedate, String redate) {
        this.desti = desti;
        this.dedate = dedate;
        this.redate = redate;
    }

    public String getDesti() {
        return desti;
    }

    public String getDedate() {
        return dedate;
    }

    public String getRedate() {
        return redate;
    }

    public void setDesti(String desti) {
        this.desti = desti;
    }

    public void setDedate(String dedate) {
        this.dedate = dedate;
    }

    public void setRedate(String redate) {
        this.redate = redate;
    }





 public String pick_desti(){
     int a=0;
     String b = null;
     Scanner input= new Scanner(System.in);
     System.out.println("pick the destination number :");
     System.out.println("1-jeddah to riyad\n"
             +"2-jeddah to madina\n"
             +"3-jeddah to dammam\n"
             +"4-riyad to jeddah\n"
             +"5-riyad to dammam\n"
             +"6-riyad to madina\n"
             +"7-dammam to riyad\n"
             +"8-dammam to jeddah\n"
             +"9-dammam to madina");
     while(a<=0||a>9){
         a=input.nextInt();
     }
     switch(a){
         case 1:
             b="jeddah to riyad";
             break;
         case 2:
             b="jeddah to madina";
             break;
         case 3:
             b="jeddah to dammam";
             break;
         case 4:
             b="riyad to jeddah";
             break;
         case 5:
             b="ryiad to dammam";
             break;
         case 6:
             b="ryiad to madina";
             break;
         case 7:
             b="dammam to riyad";
             break;
         case 8:
             b="dammam to jeddah";
             break;
         case 9:
             b="dammam to madina";
             break;
             
     }
     return b;
 }
 public String pick_dedate(){
     int day=0;
     int mon=0;
     String a;
     Scanner input= new Scanner(System.in);
     System.out.println("enter departer day");
     while(day<=0||day>=32){
         day=input.nextInt();
     }
         System.out.println("enter departer month");
     while(mon<=0||mon>13){
         mon=input.nextInt();
         
     }
     a= Integer.toString(day)+"/"+Integer.toString(mon);
     
     return a;
 }
 public String pick_redate(){
     int day=0;
     int mon=0;
     String a;
     Scanner input= new Scanner(System.in);
     System.out.println("enter return day");
     while(day<=0||day>=32){
         day=input.nextInt();
     }
         System.out.println("enter return month");
     while(mon<=0||mon>13){
         mon=input.nextInt();
         
     }
     a= Integer.toString(day)+"/"+Integer.toString(mon);
     
     return a;
 }
 
     
 
}
