/*Q1.java
package team14.quiz3 ;
Nasim hosseini.fatemehzahra pormosavi;
*/

public class Q1 {
    public static void main (String[] args) {
        char confirm='x' ;
        double number=0 ;
        double max=0 ;
        double min=0 ;
        double total=0 ;
        int p=1 ;
        
        while (confirm=='x') {
            String input1=JOptionPane.showInputDialog (null,"Enter your desired number please :","Number input",JOptionPane.QUESTION_MESSAGE) ;
            number=Double.parseDouble (input1) ;
           
            if (p!=0) {
                p=0 ;
                max=number ;
                min=number ;
            } 
            
            total+=number ;
            if (number>=max) {
                max=number ;
            } // end of second if
            if (number<=min) {
                min=number ;
            } 
            
            String input2=JOptionPane.showInputDialog (null,"Do you want to continue ?!","Letter input",JOptionPane.QUESTION_MESSAGE) ;
            input2=input2.toLowerCase () ;
            confirm=input2.charAt (0) ;
        } 
      
        System.out.println ("The largest number among the numbers entered is \""+max+"\"") ;
		System.out.println ("The smallest number among the numbers entered is \""+min+"\"") ;
		System.out.println ("The sum of the numbers entered is \""+total+"\"") ;
        
    } 
} 