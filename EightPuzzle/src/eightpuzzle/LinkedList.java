/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle;

/**
 *
 * @author Scott
 */

public class LinkedList
{
	protected int size;
	protected LinkedListNode head;
	
	//Creates a new instance of LinkedList
	public LinkedList()
	{
		head=null;
	}
	
	//Returns the head position of the linked list
	public LinkedListNode getHead()
	{
		return head;
	}
	
	//Sets the head of the linked list
	public void setHead(LinkedListNode head)
	{
		head = head.getNext();
	}
	
	//Adds items to the front of the linked list
	public void insertFront(Object item)
	{
		LinkedListNode node = new LinkedListNode(item);
		
		if(head == null)
		{
			head = node;
		}
		else
		{
			node.setNext(head);//makes node point to the first node
			head = node; //makes variable head point to the new node and set it;
		}
	}
	
	//Adds items to linked list from the back end
	public void insertBack(Object item)
	{
		LinkedListNode node = new LinkedListNode(item);
		LinkedListNode current = head;
		
		//If list is empty node will be inserted and be set as head.
		if(current == null)
		{
			head = node;
		}
		else
		{
			while(current.getNext() != null) 
			   {
			    current = current.getNext();
			   }
			     current.setNext(node); 
	    }
	}
	
	//Removes item at the front of the linked list
	public Object removeFront()
	{
		LinkedListNode node;
		
		Object item = head.getData();
		node = head;
		head = head.getNext();
		node.setNext(null);
		return item;
	}
	
	//Removes item at the back of the linked list
	public Object removeBack()
	{
		LinkedListNode current; 
		
		Object item = head.getData();
		current = head;
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		current.setNext(null);
		return item;
	}
	
	
}
