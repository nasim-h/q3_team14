/*Q4_2.java
package team14.quiz3 ;
Nasim hosseini.fatemehzahra pormosavi;
*/
public class Q4_2 {
    public static char[] String_Chop (String string) {
        char[] array2=new char[string.length ()] ;
        int a=0 ;
        
        for (a=0 ; a<array2.length; a++) {
            array2[a]=string.charAt (a) ;
        } 
        
        return array2 ;
    }
    public static char[] Shift_Right (char[] array3,int number2) {
        char backup1 ;
        int move1=0 ;
        int b=0 ;
        
        for (b=0 ; b<number2 ; b++) {
            backup1=array3[array3.length-1] ;
            
            for (move1=array3.length-2;move1>-1;move1--) {
                array3[move1+1]=array3[move1] ;
            } 
            array3[0]=backup1 ;
        }
        
        return array3 ;
    }
    public static char[] Shift_Left (char[] array4,int number3) {
        char backup2 ;
        int move2=0 ;
        int c=0 ;
        
        for (c=0 ; c<number3 ; c++) {
            backup2=array4[0] ;
            
            for (move2=1;move2<array4.length;move2++) {
                array4[move2-1]=array4[move2] ;
            } 
            
            array4[array4.length-1]=backup2 ;
        } 
       
        return array4 ;
    }
    public static void main (String[] args) {
        String input1=JOptionPane.showInputDialog (null,"Enter your desired string please :","String input",JOptionPane.QUESTION_MESSAGE) ;
        String input2=JOptionPane.showInputDialog (null,"In which direction do you want to create shift ?!","Letter input",JOptionPane.QUESTION_MESSAGE) ;
        String input3=JOptionPane.showInputDialog (null,"How many shifts do you want to do ?!","Number input",JOptionPane.QUESTION_MESSAGE) ;
        input1=input1.toLowerCase () ;
        input2=input2.toLowerCase () ;
        
        char[] array1=new char[input1.length ()] ;
        char[] output=new char[input1.length ()] ;
        char direction ;
        int number1=0 ;
        int d=1 ;
        int e=1 ;
        
        array1=String_Chop (input1) ;
        direction=input2.charAt (0) ;
        number1=Integer.parseInt (input3) ;
        
        if (direction=='r') {
            output=Shift_Right (array1,number1) ;
           
           System.out.println ("The original array :") ;      
           System.out.print ("[ "+input1.charAt (0)) ;
               
           for (d=1 ; d<input1.length () ; d++) {
               System.out.print (" , "+input1.charAt (d)) ;        
           } 
          
           System.out.print (" ]\n") ;
           System.out.println ("The shifted array with \""+number1+"\" shift :") ;

           for (e=1 ; e<output.length;e++) {
               System.out.print (" , "+output[e]) ;
           } 
           
           
        } 
        
        else if (direction=='l') {
            output=Shift_Left (array1,number1) ;
           
           System.out.println ("The original array :") ;      
           System.out.print ("[ "+input1.charAt (0)) ;
                   
           for (d=1 ; d<input1.length ();d++) {
               System.out.print (" , "+input1.charAt (d)) ;        
           } 
          
           System.out.print (" ]\n") ;
           System.out.println ("The shifted array with \""+number1+"\" shift :") ;
           System.out.print ("[ "+output[0]) ;        
         
           for (e=1 ; e<output.length ; e++) {
               System.out.print (" , "+output[e]) ;
           } 
          
           System.out.print (" ]\n") ;
          
        } 
        
        else {
            
            System.out.println ("The entered direction is not valid") ;
            
        } 
    } 
} 