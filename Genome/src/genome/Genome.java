
package genome;
public class Genome 
{
	public static void main(String[] args) 
    {
        Genome testGene = new Genome();
        testGene.insert('a', 'g', 0);
        testGene.insert('t', 'c', 1);
        testGene.insert('t', 'g', 2);
        testGene.print();
        testGene.getLength();
        testGene.isEmpty();
        testGene.remove(0);
        testGene.clear();
        testGene.isEmpty();
        testGene.find('c');
        testGene.printLeft();
       
    }
    
    private Nucleotide leftHelix; //when Genome instantiated, this is the empty left-side
    //and it has a next pointer, a base for a character, and an across point
    private int numElements;
    private Nucleotide rightHelix; //when Genome instantiated, this is the empty right-side
    //and it has a next pointer, a base for a character, and an across point
    
    public Genome()//instance of Genome with initialized variables, 
       //with NO interaction between the helixes yet(even though they both have pointers, they are null)
    {
        rightHelix = null;
        leftHelix = null;
        numElements = 0;
    }
    public void insert(Character baseLeft, Character baseRight, int index)
    {
        if(index <0 || index > numElements)
            return;
        
        else
        {
            Nucleotide leftNuc = new Nucleotide(baseLeft); //create a nucleotide and wait
            Nucleotide rightNuc = new Nucleotide(baseRight);//create a nucleotide and wait
            if(index == 0) // check for insert at front of list CONDITION ***WORKING
            {
                leftNuc.next = this.leftHelix;
                rightNuc.next = this.rightHelix;
                this.leftHelix = leftNuc;
                this.rightHelix = rightNuc;
            }
            else
            {
                Nucleotide leftTrav = this.leftHelix;
                Nucleotide rightTrav = this.rightHelix;
                
                for(int i = 0; i < index -1; i++)
                    leftTrav = leftTrav.next;
                for(int j = 0; j < index - 1; j++)
                    rightTrav = rightTrav.next;
                leftNuc.next = leftTrav.next;
                rightNuc.next = rightTrav.next;
                leftTrav.next = leftNuc;
                rightTrav.next = rightNuc;
            }
        }
        numElements = numElements +1;
    }
    public int getLength()//working
    {
        System.out.println(numElements); //TEST
        return numElements;
    }
    public boolean isEmpty()//working
    {
        boolean result;
        result = leftHelix == null;
        System.out.println(result); //TEST
        return result;
    }
    
    public void print()//working
    {
        Nucleotide leftCurrent = this.leftHelix;
        Nucleotide rightCurrent = this.rightHelix;
        while(leftCurrent != null)
        {
            System.out.print(leftCurrent.base);
            System.out.println(rightCurrent.base);
            leftCurrent = leftCurrent.next;
            rightCurrent = rightCurrent.next;
        }
    }
    
    public String remove(int index)//working
    {
        String result;
        String lResult;
        String rResult;
        if(index<0 || index> numElements - 1)
            return "error";
        else
        {
            //find node BEFORE the given index
            Nucleotide lNuc = this.leftHelix;
            Nucleotide rNuc = this.rightHelix;
            for(int i = 0; i<index; i++)
            {
                lNuc = lNuc.next;
                rNuc = rNuc.next;
            }
            lResult = lNuc.base.toString();
            rResult = rNuc.base.toString();
            result = lResult + rResult;
            Nucleotide lTemp = lNuc.next;
            Nucleotide rTemp = rNuc.next;
            lTemp.next = null;
            rTemp.next = null;
            numElements = this.numElements - 1;
            System.out.println(result);
            System.out.println(numElements);
        }
        return result;
    }
    
    //doesn't leave anything for the garbage collector
    public void clear()
    {
        Nucleotide current; 
        Nucleotide next;
        this.numElements = 0;
        current = this.leftHelix;
        this.leftHelix = null;
        while(current != null)
        {
            next = current.next;
            current.next = null;
            current = next;
        }
    }
    public int find(Character base)
    {
        Nucleotide current = this.leftHelix;
        Nucleotide rCurrent = this.rightHelix;
        int index = 0;
        
        while (current != null)
        {
            if (current.base.equals(base))
            {
                System.out.println(index);
                return index;
            }
            else
            {
                current = current.next;
                index++;
            }
        }
        System.out.println(-1);//test
        return -1;
    }
    
    //
    public void printLeft()//working
    {
        Nucleotide leftCurrent = this.leftHelix;
        while(leftCurrent != null)
        {
            System.out.print(leftCurrent.base);
            leftCurrent = leftCurrent.next;
        }
    }
    
    //
    public void printRight()//working
    {
        Nucleotide rightCurrent = this.rightHelix;
        while(rightCurrent != null)
        {
            System.out.print(rightCurrent.base);
            rightCurrent = rightCurrent.next;
        }
    }
    
    public class Nucleotide
    {
        public Character base;
        public Nucleotide next;
        public Nucleotide across;
        
        public Nucleotide(Character base)
        {
            this.base = base;
        }
        
        public void display()
        {
            System.out.println(base);
        }
        
    }
}
