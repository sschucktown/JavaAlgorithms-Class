
import java.util.Scanner;

public class countItems 
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
        
        countItems(list,startIndex);
    }
    
    public static int countItems(int [] list, int startIndex)
    {
        int result = 0;
        
        //check if list empty
        if(startIndex==list.length)
        {
            result = 0;
            System.out.println(result);
        }
        else
        {
            result = 1+countItems(list, startIndex +1);   
        }
        return result;
        //exists at least one item in list
       
    }
}
