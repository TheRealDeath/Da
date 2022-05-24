import java.util.Scanner;
import static java.lang.System.*;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String trav = sc.nextLine();
		trav = trav+trav;
		int largest = 0;
		for(int i = 0;i<trav.length();i++)
	    {
	        String s = "";
	        char c = trav.charAt(i);
	        s += c;
	        boolean second = false, help = true;
	        for(int j = i+1;j<trav.length();j++)
	        {
	            if(trav.charAt(j) != 'w' && trav.charAt(j) != c && c != 'w')
	            {
	                if(second) break;
	                second = true;
	                c = trav.charAt(j);
	            }
	            if(c == 'w' && trav.charAt(j) != 'w' && help){c = trav.charAt(j);help = false;}
	            s += trav.charAt(j);
	        }
	        if(s.length() > largest) {largest = s.length();}
	    }
	    out.println(largest);
	}
}
