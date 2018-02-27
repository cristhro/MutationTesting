package estDatos;

public class MapVectorMain {
		
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
     
        MapVector a = new MapVector(10,0);
        MapVector b = new MapVector(10,0);
        a.put(3, 22.0);
        a.put(9, 10.5);
        a.put(6, 13.5);
        a.put(6, 34.0);
        a.put(1, 11.5);
        
        b.put(3, 33.0);
        b.put(4, 11.0);
        b.put(1, 22.5);
        
        System.out.println("Elemento 0 de a="+a.get(0));
        System.out.println("Elemento 3 de a="+a.get(3));
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("10 * a   = " + a.scale(10));
        System.out.println("a + b   = " + a.plus(b));		
        System.out.println("a dot b = " + a.dot(b));
        System.out.println("a dotMerge b = " + a.dotMerge(b));
      
        
// OUTPUT        
//Elemento 0 de a=0.0
//Elemento 3 de a=22.0
//a = (1, 11.5) (3, 22.0) (6, 34.0) (9, 10.5) 
//b = (1, 22.5) (3, 33.0) (4, 11.0) 
//10 * a   = (1, 115.0) (3, 220.0) (6, 340.0) (9, 105.0) 
//a + b   = (1, 34.0) (3, 55.0) (4, 11.0) (6, 34.0) (9, 10.5) 
//a dot b = 984.75
//a dotMerge b = 984.75
	}

}
