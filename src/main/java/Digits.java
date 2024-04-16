import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	    String s = Integer.toString(num);
	    for(int i = s.length()-1 ; i >=0; i--) {
	    	ans[i] = num%10;
		num/=10;
	    }
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i = 0; i < digitList.size()-1; i++) {
			if(digitList.get(i) >= digitList.get(i+1)) {
				return false;
		}
		return true;

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
