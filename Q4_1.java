/*Q4_1.java
package team14.quiz3 ;
Nasim hosseini.fatemehzahra pormosavi;
*/
public class Q4_1 {
    public static char[] String_Chop (String string) {
        char[] array2=new char[string.length ()] ;
        int a=0 ;
        
        for (a=0 ; a<array2.length ; a++) {
            array2[a]=string.charAt (a) ;
        } 
       
        return array2 ;
    }
    public static char[] Shuffle (char[] array4) {
        char backup ;
        int random1=0 ;
        int random2=0 ;
        int c=0 ;
        
        for (c=0 ; c<array4.length ; c++) {
            random1=(int) (Math.random ()*array4.length) ;
            random2=(int) (Math.random ()*array4.length) ;
           
            backup=array4[random1] ;
            array4[random1]=array4[random2] ;
            array4[random2]=backup ;
        } 
        
        return array4 ;
    } 
    public static void main (String[] args) {
        String input=JOptionPane.showInputDialog (null,"Enter your desired string please :","String input",JOptionPane.QUESTION_MESSAGE) ;
        input=input.toLowerCase () ;
        
        char[] array1=new char[input.length ()] ;
        char[] array3=new char[input.length ()] ;
        int c=1 ;
        int d=1 ;
        
        array1=String_Chop (input) ;
        array3=Shuffle (array1) ;
       
        System.out.println ("The original array :") ;
        System.out.print ("[ "+input.charAt (0)) ;
       
        for (c=1 ; c<input.length ();c++) {
            System.out.print (" , "+input.charAt (c)) ;
        } 
       
        System.out.print (" ]\n");
        System.out.println ("The shuffled array :") ;
        System.out.print ("[ "+array3[0]) ;
        //...
        for (d=1; d<array3.length; d++) {
            System.out.print (" , "+array3[d]) ;
        } 
       
        System.out.print (" ]\n") ;
    } 
} 