package estDatos;

public final class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListSet<Integer> linkList= new LinkedListSet<Integer>();
		
		int[] list= {1,2,5,33,3,22,56,66,22,44,14,0};
		for(int i=0; i<list.length;i++) {
			linkList.add(list[i]+2);
		}
		System.out.println(linkList);
		
		OrderedListSet<Integer> orderedList= new OrderedListSet<Integer>();
		for(int i=0; i<list.length;i++) {
			orderedList.add(list[i]-2);
		}
		System.out.println(orderedList);
	}

}
