
package calendar;


public class Stuff implements Comparable<Object>
{
    private int s;

	public Stuff(int s) {
		this.s = s;
	}
	
	
	public int compareTo(Object item){
		return this.s - ((Stuff)item).getS();
		
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}
}
