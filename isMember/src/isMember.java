import java.util.Scanner;


public class isMember 
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
        
        isMember(list, item, startIndex);
    }
    
    public static boolean isMember(int[] list, int item, int startIndex)
    {
        boolean result;
        //check, is the list empty?
        if(startIndex==list.length)
        {
            //is empty
            result = false;
            System.out.println(result);
        }
        //exists at least one item in the list, is this is the correct item?
        else if(list[startIndex]==item)
        {
            result = true;
             System.out.println(result);
        }
        else
        {
            //recur
            result = isMember(list, item, (startIndex+1));
        }
        return result;
    }
    
}
