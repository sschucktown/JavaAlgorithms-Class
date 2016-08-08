/*
Author:   Scott Sandie
Date:   2-19-2016
Class: CSCI 230
Assignment:   Gerrymander.java
Task:  
Input:
Output:
Certificate of Authenticity:
   I certify that this code is my own work, but I received some assistance from:
   Paul Kyser
*/

/*
Nucleotide class
Instantiates ALWAYS with an Object, pointer to Next, pointer to Across
So if you're the first node you are the header(leftHelix or rightHelix) and you will 
ALWAYS be pointing to the next Node on YOUR strand and, also, the parallel Node on the other strand.  

*/
import java.util.Scanner;



public class DNA 
{
   public static Scanner scanner = new Scanner(System.in);
   public static int index;
   public static String basePair;
   public static int inputNums;
   public static int methodNum;
   public static Character nextChar;
   public static Character acrossChar;
   public static int startIndex;
   public static int endIndex;
   public static int helix;
   
   
   public static void main(String[] args) 
    {

    /*System.out.println("Enter amount of input : ");
    inputNums = scanner.nextInt();
    System.out.println("Pick a method :  ");
    methodNum = scanner.nextInt();*/
    DNA dna = new DNA();
    //dna.insert(0, "ta");
    //dna.insert(1, "cg");
    //dna.insert(2, "at");
    dna.remove(2);
    }
   
public static class Nucleotide
    {
      public static Character base;
      public static Nucleotide next;
      public static Nucleotide across;
      
    }
    
    private Nucleotide leftHelix;
    private Nucleotide rightHelix;
    private int numElements;
       
    public DNA()
    {
        this.leftHelix = null;
        this.rightHelix = null;
        this.numElements = 0;
    }
    
    public void insert(int index, String basePair) //done
       //need to double the normal amount of instructions
    {
        nextChar = basePair.charAt(0); //break String input into primitive type Char 
        acrossChar = basePair.charAt(1);
        if(index < 0 || index > numElements) // check for out of bounds
        {
            System.out.println("out of bounds error");
        }
        else
        {
            Nucleotide newNext = new Nucleotide();
            newNext.next.base = nextChar; //"next" node
            Nucleotide newAcross = new Nucleotide();
            newNext.across.base = acrossChar; //"across" node
            System.out.println(newNext.next.base);
            //System.out.print(newNext.across.base);
            
            int i = 0;
            Nucleotide currentBasePair = leftHelix; // the left head of the helix
            Nucleotide acrossBasePair = rightHelix; // the right head of the helix
            if (index == 0) 
            { //user inserting at the front of the chain
                newNext.next = currentBasePair;
                newNext.across = acrossBasePair;
                newAcross.next = acrossBasePair;
                newAcross.across = currentBasePair;
                leftHelix = newNext;
                rightHelix = newAcross;
                //return;
            }
            while (i != index - 1 && currentBasePair != null) 
            {
                currentBasePair = currentBasePair.next;
                acrossBasePair = acrossBasePair.next;
                i++;
            }
            newNext.next = currentBasePair.next;
            newNext.across = acrossBasePair.next;
            newAcross.next = acrossBasePair.next;
            newAcross.across = currentBasePair.next;
            currentBasePair.next = newNext;
            acrossBasePair.next = newAcross;
            
            numElements = numElements +1;
        }
        
    }
    
   public String remove(int index)
    {
        int i = 0;
        if(index <0 || index>=numElements)
        {
            System.out.println("out of bounds error");
            return null;
        }
        Nucleotide current = this.leftHelix;
        Nucleotide currentAcross = this.rightHelix;
        
        if (index == 0)
        {
            char char0 = leftHelix.base;
            char char1 = rightHelix.base;
            this.leftHelix = leftHelix.next;
            this.rightHelix = rightHelix.next;
            char[] chars = new char[2];
            chars[0] = char0;
            chars[1] = char1;
            String answer = new String(chars);
            //return answer;
        }
        while (i !=index -1)
        {
            current = current.next;
            currentAcross = currentAcross.next;
            i++;
        }
        char char0 = current.next.base;
        char char1 = current.across.base;
        current.next = current.next.next;
        currentAcross.next = currentAcross.next.next;
        StringBuilder sb = new StringBuilder();
        sb.append(char0);
        sb.append(char1);
        String str = sb.toString();
        return str;
    }
    
    public void print(int startIndex, int endIndex)//done
    {
       Nucleotide printNext = this.leftHelix;
       Nucleotide printAcross = this.rightHelix;
       
       for(int i=startIndex; i<endIndex; i++)
       {
           while(printNext != null)
           {
               System.out.print(printNext);
               System.out.print(printAcross);
           }
       }
    }
    
    public void clear() //done
    {
        this.leftHelix = null;
        this.rightHelix = null;
        this.numElements = 0;
    }
    
   public boolean isEmpty() //done
    {
       return this.leftHelix == null;
    }
    
   public int getLength()//done
    {
        return numElements;
    }
    
    public int find(String basePair)
    {
        
        return -1;
    }
    
    public void printLeft()//done
    {
         Nucleotide printNext = this.leftHelix;
         while(printNext != null)
           {
               System.out.print(printNext);
           }
    }
    
   public void printRight()//done
    {
        Nucleotide printAcross = this.rightHelix;
         while(printAcross != null)
           {
               System.out.print(printAcross);
           }
    }
    
   public void printBasePair(int index, int helix)
    {
        
    }
  
    
}
