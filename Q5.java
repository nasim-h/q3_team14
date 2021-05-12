/*Q5.java
package team14.quiz3 ;
Nasim hosseini.fatemehzahra pormosavi;
*/
public class Q5 {
    public static int[] Array_Create () {
        int[] array1=new int[100] ;
        int a=0 ;
        
        for (a=0;a<array1.length;a++) {
            array1[i]=(int) (Math.random()*101) ;
        } 
        
        return array1 ;
    }
    public static int[] Array_Sort () {
        int[] array2=new int[100] ;
        int backup=0 ;
        int b=0 ;
        int c=1 ;
      
        array2=Array_Create () ;
        
        for (b=0 ; b<array2.length ; b++) {
            for (c=1 ; c<array2.length ; c++) {
                if (array2[c-1]>array2[c]) {
                    backup=array2[c-1] ;
                    array2[c-1]=array2[c] ;
                    array2[c]=backup ;
                } 
            } 
        }
       
        return array2 ;
    } 
    public static int Array_Search (int[] array4,int search1,int start,int end) {
        int middle=0 ;
        
        middle=(int) ((start+end)/2) ;
        
        if (start>end) {
            return -1 ;
        } 
        .
        if (array4[middle]==search1) {
            return middle ;
        } 
        
        else if (array4[middle]<search1) {
            return Array_Search (array4,search1,middle+1,end) ;
        } 
       
        else {
            return Array_Search (array4,search1,start,middle-1) ;
        }
    } 
    public static int Array_Check (int[] array5,int search2) {
        int counter=0 ;
        int d=0 ;
       
        for (d=0;d<array5.length;d++) {
            if (array5[d]==search2) {
                counter++ ;
            }
        } 
        
        return counter ;
    }
    public static void main (String[] args) {
        int[] array3=new int[100] ;
        int number=0 ;
        int result=0 ;
        int amount=0 ;
        int e=0 ;
        int f=1 ;
        
        String input=JOptionPane.showInputDialog (null,"Enter your desired number please :","Number search",JOptionPane.QUESTION_MESSAGE) ;
        number=Integer.parseInt (input) ;
        
        array3=Array_Sort () ;
        result=Array_Search (array3,number,0,array3.length-1) ;
        amount=Array_Check (array3,number) ;
        
      
        System.out.println ("The designed array :") ;
        
       
        for (e=0;e<array3.length;e++) {
            if (e%10==0) {
                System.out.println () ;
            } 
                 
            System.out.print (array3[e]+"\t") ;
        } 
        
       
        if (result==-1) {
            System.out.println ("The number \""+number+"\" does not exist in the array") ;
        } 
        
        else {
            System.out.print ("The number \""+number+"\" is in the array and is in cell number \""+result+"\"") ;
            
            if (amount==1) {
                System.out.println () ;
            } 
           
            for (f=1;f<amount;f++) {
                result+=1 ;
               
                System.out.print (" , \""+result+"\"") ;
            } 
            
            if (amount>1) {
                System.out.println () ;
            } 
        }
       
    } 
} 