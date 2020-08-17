/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupchattingapplication;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CallingClass {
    
    public static void main(String[] args) {
        

     Thread t1=new Thread(){
         @Override
         public void run(){
             try {
                 Server.main(args);
             } catch (Exception ex) {
                 Logger.getLogger(CallingClass.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     };
     t1.start();
       
      Thread t2=new Thread(){
          @Override
          public void run(){
              UserOne.main(args);
         }
     };
     t2.start();
       
      
      Thread t3=new Thread(){
          @Override
          public void run(){
              UserSecond.main(args);
         }
     };
     t3.start();
     
     
      Thread t4=new Thread(){
          @Override
          public void run(){
              UserThird.main(args);
         }
     };
     t4.start();
     
     
     
      Thread t5=new Thread(){
          @Override
          public void run(){
              UserFour.main(args);
         }
     };
     t5.start();
      
     
     
     
     
     
       
    }
    
}
