/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Scott
 */
public class LinkedListTest
{
    
    public LinkedListTest()
    {
    }

    @Test
    public void testIsEmpty()
    {
        System.out.println("isEmpty");
        LinkedList instance = new LinkedList();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemove()
    {
        System.out.println("remove");
        Comparable<Object> item = null;
        LinkedList instance = new LinkedList();
        Comparable<Object> expResult = null;
        Comparable<Object> result = instance.remove(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testFind()
    {
        System.out.println("find");
        Comparable<Object> item = null;
        LinkedList instance = new LinkedList();
        Comparable<Object> expResult = null;
        Comparable<Object> result = instance.find(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testInsert()
    {
        System.out.println("insert");
        Comparable<Object> item = null;
        LinkedList instance = new LinkedList();
        instance.insert(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testPrint()
    {
        System.out.println("print");
        LinkedList instance = new LinkedList();
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString()
    {
        System.out.println("toString");
        LinkedList instance = new LinkedList();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetHead()
    {
        System.out.println("getHead");
        LinkedList instance = new LinkedList();
        LinkedListNode expResult = null;
        LinkedListNode result = instance.getHead();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetHead()
    {
        System.out.println("setHead");
        LinkedListNode head = null;
        LinkedList instance = new LinkedList();
        instance.setHead(head);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
