package itemoccurence;
import java.util.Scanner;

public class itemOccurrence 
{
    private static Scanner scanner = new Scanner(System.in);
    private static int arraySize=0;
    private static int [] list;
    private static int item;
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
        
        System.out.println("Enter the item: ");
        item = scanner.nextInt();
            
        System.out.println("Enter the  startindex: ");
        startIndex = scanner.nextInt();
        
        itemOccurrence(list, item, startIndex);
    }
    
    public static int itemOccurrence(int [] list, int item, int startIndex)
    {
        int result;
        
        if(startIndex==list.length)
        {
            result = 0;
        }
        else if(list[startIndex] == item)
        {
            result = 1+itemOccurrence(list,item,startIndex+1);
        }
        else
        {
            result=itemOccurrence(list, item, startIndex+1);
        }
        System.out.println(result);
        return result;
    }
}
