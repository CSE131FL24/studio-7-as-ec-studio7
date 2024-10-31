package studio7;

public class Die {
	
	private int face;
	private int result;
	
	public Die(int initialFace) {
		face = initialFace;
		
		result = (int)(Math.random()*(face))+1;
		
	}
	public String toString() {
		return ("the result would be " + result);
		
	}
	public static void main(String[] args)
	{
		Die d1 = new Die (6);
		System.out.println(d1);
	}

}
