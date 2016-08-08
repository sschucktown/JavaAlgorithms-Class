/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypractice;

/**
 *
 * @author Scott
 */
public class ArrayPractice
{
    //[how many down][how many across][how many pages or matrices or groupings]
    private int[] theArray = new int[50];
    private int arraySize = 10;
    
    public void generateRandomArray()
    {
        for(int i = 0; i < arraySize; i++)
        {
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }
    
    public void printArray()
    {
        System.out.println("----------");
        for(int i = 0; i < arraySize; i++)
        {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
            
            System.out.println("----------");
        }
    }
    
    public int getValueAtIndex(int index)
    {
        if(index < arraySize) return theArray[index];
        return 0;
    }
    
    public boolean doesArrayContainThisValue(int searchValue)
    {
        boolean valueInArray = false;
        
        for(int i = 0; i < arraySize; i++)
        {
            if(theArray[i] == searchValue)
            {
                valueInArray = true;
            }
        }
        return valueInArray;
    }
    
    public void deleteIndex(int index)
    {
        if (index < arraySize)
        {
            for(int i = index; i <(arraySize-1); i++)
            {
                theArray[i] = theArray[i+1];
            }
        }
        arraySize --;
    }
    
    public void insertValue(int value)
    {
        if(arraySize< 50)
        {
            theArray[arraySize] = value;
            arraySize++;
        }
    }
    
    public String linearSearchForValue(int value)
    {
        boolean valueInArray = false;
        String indexsWithValue = "";
        System.out.print("The value was found in the following: ");
        for (int i = 0; i < arraySize; i++)
        {
            if(theArray[i] == value)
            {
                valueInArray = true;
                System.out.print(i + "");
                indexsWithValue+= i + " ";
                System.out.print(indexsWithValue);
            }
            
            
            
        }
        if(!valueInArray)
        {
            indexsWithValue = "None";
        }
        System.out.println();
        return indexsWithValue;
    }
    
    public static void main(String[] args)
    {
       ArrayPractice newArray = new ArrayPractice();
       
       newArray.generateRandomArray();
       
       newArray.printArray();
       System.out.println(newArray.getValueAtIndex(3));
       System.out.println(newArray.doesArrayContainThisValue(16));
       newArray.deleteIndex(4);
       newArray.printArray();
       newArray.insertValue(55);
       newArray.printArray();
       newArray.linearSearchForValue(17);
    }
    
}
