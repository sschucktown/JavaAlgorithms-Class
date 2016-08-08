
package countitemsreverse;

import java.util.Scanner;

public class CountitemsReverse 
{
    private static Scanner scanner = new Scanner(System.in);
    private static int arraySize=0;
    private static int [] list;
    private static int startIndex;
    
    public static void main(String[] args) 
    {
        System.out.println("Select size of array: ");
        arraySize = scanner.nextInt();
        int list[] = new int[arraySize];
        System.out.println("Enter array elements: ");
        for(int j = 0; j<arraySize; j++)
        {
            list[j] = scanner.nextInt();
        }
        
        System.out.println("Enter the  startindex: ");
        startIndex = scanner.nextInt();
        
        countitemsReverse(list,startIndex);
    }
    
    public static int countitemsReverse(int [] list, int startIndex)
    {
        int result;
        if(startIndex==-1)//list empty?
        {
            result=0;//exists at least one item
        }
        else 
        {
            result = 1+countitemsReverse(list, startIndex-1);
        }
        System.out.println(result);
        return result;
    }
    
}
