
package project;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dddoo
 */
public class airlineticket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String desti;
        String dedate;
        String redate;
        String mobnum;
        String id;
        String name;
        int age=0;
        int time;
        double money;
        int Options;
        //receipt 
        receipt rep;
        rep = new receipt();

        Scanner input= new Scanner(System.in);
        
        
        
       
        String[] repa = new String[9];
        //customer info
        System.out.println("Customer info");
        
        System.out.println("enter your name");
        name=input.nextLine();
        customer info = new customer();
        info.setName(name);
        System.out.println("enter id ");
        id=input.nextLine();
        info.setId(id);
        System.out.println("enter mobile number:");
        mobnum=input.nextLine();
        info.setMobnum(mobnum);
        while(age<18){
            System.out.println("enter your age(over 18 to book a ticket");
            age=input.nextInt();
        }
        
        info.setAge(age);
        
       //ticket info
       System.out.println("Ticket info");
       ticket tic = new ticket();
       System.out.println("pick you flight");
       desti= tic.pick_desti();
       tic.setDesti(desti);
       
       dedate=tic.pick_dedate();
       tic.setDedate(dedate);
       
       redate=tic.pick_redate();
       tic.setRedate(redate);
      
       //receipt 
      
        
       money= rep.money(desti);
       rep.setMoney(money);
       
       time=rep.count_time(desti);
       rep.setTime(time);
       
       id= info.getId();
       repa[0]=id;
       
       name=info.getName();
       repa[1]=name;
       
       mobnum= info.getMobnum();
       repa[2]=mobnum;
       
       age=info.getAge();
       repa[3]= Integer.toString(age);
       
       
       desti=tic.getDesti();
       repa[4]=desti;
       
       dedate=tic.getDedate();
       repa[5]=dedate;
       
       redate=tic.getRedate();
       repa[6]=redate;
       
       money=rep.getMoney();
       repa[7]=Double.toString(money);
       
       time=rep.getTime();
       repa[8]= Integer.toString(time);
       
        for (int i = 0; i <=8 ; i++) {
            rep.setRepa(repa, i);
        }
       
        rep.write_file();
       
       
       rep.diplayall();
       
       
       
        
    }
    
}
