import java.util.ArrayList;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		StringBuffer s1=new StringBuffer("qwe");
		s+=s1;
		System.out.println(s);
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(3);
		
		System.out.println(l.contains(1));
		
		ArrayList<Character> l2=new ArrayList<Character>();
		l2.add('a');
		l2.add('b');
		
		System.out.println(l2.contains('v'));
		
	}

}
