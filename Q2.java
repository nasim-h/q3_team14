/*Q2.java
package team14.quiz3 ;
Nasim hosseini.fatemehzahra pormosavi;
*/
public class Q2 {
    public static boolean Test (String Hex1) {
        String check1="0123456789ABCDEF" ;
        int[] check2=new int[Hex1.length ()] ;        
        int counter=0 ;
        int sum=0 ;
        int a=0 ;
        int b=0 ;
        int c=0 ;
        
        for (a=0;a<Hex1.length ();a++) {
            for (b=0;b<check1.length ();b++) {
                if (Hex1.charAt (a)==check1.charAt (b)) {
                    counter++ ;
                }
            } 
            
            if (counter>0) {
                check2[a]=1 ;
            } 
            
            else {
                check2[a]=0 ;
            } 
           
            counter=0 ;
        } 
        
        for (c=0 ; c<Hex1.length (); c++) {
            sum+=check2[c] ;
        } 
        
        if (sum==Hex1.length ()) {
            return true ;
        } 
        
        else {
            return false ;
        }
    } 
    public static void Convert (String Hex2) {
        int[] Hex=new int[Hex2.length ()] ;
        int dec=0 ;
        int e=0 ;
        int f=0 ;
        int g=0 ;
        
        for (e=0 ; e<Hex2.length () ; e++) {
            switch (Hex2.charAt (l)) {
                case 'A' :
                    Hex[e]=10 ;
                    break ;
                case 'B' :
                    Hex[e]=11 ;
                    break ;
                case 'C' :
                    Hex[e]=12 ;
                    break ;
                case 'D' :
                    Hex[e]=13 ;
                    break ;
                case 'E' :
                    Hex[e]=14 ;
                    break ;
                case 'F' :
                    Hex[e]=15 ;
                    break ;
                default :
                    Hex[e]=Integer.parseInt (String.valueOf (Hex2.charAt (e))) ;
                    break ;
            } 
        } 
        
        for (f=Hex.length-1;f>-1;f--,g++) {
            dec+=(Hex[f]*(Math.pow (16,g))) ;
        } 
      
        System.out.println ("The number \""+Hex2+"\" in Hexadecimal base is equal to \""+dec+"\" in Decimal base") ;
    }
    public static void main (String[] args) {
        Scanner input=new Scanner (System.in) ;
       
        String hex ;
        boolean confirm ;
        
        System.out.print ("Enter your desired \"Hexadecimal Number\" please : ") ;
        hex=input.next () ;
      
        hex=hex.toUpperCase () ;
        confirm=Test (hex) ;
       
        if (confirm) {
            System.out.println ("The entered string is valid") ;
            Convert (hex) ;
            System.out.println ("The converter function that defined in \"Java\" answers : "+Integer.parseInt (hex,16)) ;
        } 
       
        else {
            System.out.println ("The entered string is not valid") ;
        }
        
       
    } 
} 