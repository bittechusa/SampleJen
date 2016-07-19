import org.junit.Test;

public class Encap 
{
	private int a;
	private int b;
	private int c;
	private int d = 10;
	
	public Encap(int a, int b, int c) 
	{
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	private static void main(String[] args) {
		Encap e=new Encap(5,7,9);
		e.getA();
		e.setA(10);
		e.getA();
		
		Encap e1=new Encap(15,17,10);
		e1.getC();
		e1.setC(100);
		e1.getC();
		

	}

}
