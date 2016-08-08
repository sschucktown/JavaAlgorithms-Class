/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class TagNode{
	String tag;
	TagNode next;
    public TagNode(String tag) { 
       this.tag = tag;
       next=null;
    }
}

class LinklistNode {
    String word;
    TagNode head;
    LinklistNode next;
    public LinklistNode(String word) { 
    	this.word=word;
    	next=null;
    	head=null;
    }
    public void addtag(String tag){
    	TagNode node=new TagNode(tag);
    	node.next=head;
    	head=node;
    }
}

class Linklist{
	int size;
	LinklistNode head;
	public Linklist(){
		head=null;
		size=0;
	}
	public void addnode(String value){
		size++;
		LinklistNode temp = new LinklistNode(value);
    	temp.next=head;
    	head=temp;
	}
}

class HashTable {
	private ArrayList<Linklist> hashes;
    private int noofcollisions; //the total amount of collisions that have occurred
    private int longestcollision;//the length of maximum collision
    private int longestindex; // index wrt max collision
    private int size; //size of hash table
    public HashTable(int size) {
        this.hashes = new ArrayList<Linklist>();
        for (int i = 0; i < size; i++) {
            hashes.add(new Linklist());
        }
        this.noofcollisions= 0;
        this.longestcollision = 0;
        this.size = size;
        this.longestindex=0;
    }
    public int getTotalCollision() {
        return noofcollisions;
    }
    public int getLongestIndex() {
        return this.longestindex;
    }
    //inserts into hash table keeps track of number of collisions and the longest chain
    public void insert(String element){
    	StringTokenizer st = new StringTokenizer(element);
		String word=st.nextToken();
		int index = this.hash(word);  
        this.hashes.get(index).addnode(word);
        while (st.hasMoreTokens()) {
        	this.hashes.get(index).head.addtag(st.nextToken());
        }
        if (this.hashes.get(index).size > 1) {
            this.noofcollisions++;
            if(this.hashes.get(index).size > this.longestcollision) {
                this.longestcollision = this.hashes.get(index).size;
                longestindex=index;
            }
        }
    }
    //printing max colliding word 
    public void printingmaxcollidingword() {
        int index =longestindex;
        LinklistNode node = this.hashes.get(index).head;
        while(node!=null){
        	System.out.print(node.word.toString()+" ");
            node=node.next;
        }
    }
    
    //printing tags of a word
    public void printingtag(String text){
    	int index =this.hash(text);
        LinklistNode node = this.hashes.get(index).head;
        while(node!=null){
        	if(node.word.equals(text)){
        		System.out.println(node.word);
        		break;
        	}
            node=node.next;
        }
        if(node!=null){
        	TagNode tagnode=node.head;
        	while(tagnode!=null){
        		System.out.print(tagnode.tag.toString()+" ");
        		tagnode=tagnode.next;
        	}
        }
        System.out.print("\n");
    }
    
    //no of collision for a particular word
    public int getnumberofCollision(String text) {
        int index =this.hash(text);
        return this.hashes.get(index).size;
    }
    
    //hash function
    public int hash(String key) {
    	int sum=0;
    	for(int i=0;i<key.length();i++){
    		sum+=key.charAt(i)*(i+1);
    	}
    	return (sum%size);
    }
}

public class lexicon {
	public static void main(String[] args) {
		HashTable hashtable=new HashTable(24593);
		int size=0;
		FileInputStream fstream = null;
		try {
			fstream = new FileInputStream("data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		String strLine;
		//Read File Line By Line
		try {
			while ((strLine = br.readLine()) != null)   {
			  size++;
			  // Print the content on the console
			  if(strLine.length()>0){
				  hashtable.insert(strLine);
			  }
			}
			//Close the input stream
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The total number of lexical entries: "+String.valueOf(size));
		System.out.println("The total number of collisions: "+String.valueOf(hashtable.getTotalCollision()));
		System.out.println("The average number of collisions per lexical entry: "+String.valueOf((int)Math.ceil(size/hashtable.getTotalCollision())));
		System.out.println("The array index that had the most number of collisions and the associated colliding words : "+String.valueOf(hashtable.getLongestIndex()));
		hashtable.printingmaxcollidingword();
		System.out.println("");
		// to input from user in infinite loop
		Scanner scan = new Scanner(System.in);
		while(true){
			 System.out.println("Enter Text:");
		     String text = scan.nextLine();
		     System.out.println("Number of Collision:"+String.valueOf(hashtable.getnumberofCollision(text)));
		     System.out.println("Tags: ");
		     hashtable.printingtag(text);
		}
	}
}

