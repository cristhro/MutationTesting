
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num_ifs=2;
		int num_while=2;
		int size_while=10;
		int num_for=2;
		int size_for=100;
		int size_cond=2;
		int size_expLogics=2;
		int size_expArit=2;
		double[] test_inputs= {1,2,3,4,5,6,7,8,9};
		
		Generardor g=new Generardor(test_inputs, num_ifs, num_while, size_while,  num_for,  size_for, size_cond,
				 size_expLogics, size_expArit);
				
		
		//System.out.println("getWhile con 3:"+g.getWhiles(num_anidado,num_iteracion,size_cond));
		//System.out.println("getFor con 3:"+g.getFors(num_anidado,num_iteracion));
		//System.out.println("getIfs con 3:"+g.getIfs(num_anidado));
		//System.out.println("exp_simple: "+g.exp_simple());
		//System.out.println("getIf anidado a dos: "+g.getIfs(2));
		//System.out.println("condIf: "+(g.condIf()));
		//System.out.println("condWhile: "+g.condWhile());
		//System.out.println("condFor: "+g.condFor(100));
		//System.out.println("exp_logic: "+g.exp_logic());
		//System.out.println("exp_logics: "+g.exp_logics(2));
		//System.out.println("exp_as: "+g.exp_as(2));
		//System.out.println("exp_a: "+g.exp_a());
		//System.out.println("op_art: "+g.op_art());
		//System.out.println("op_rel: "+g.op_rel());
		//System.out.println("op_logic: "+g.op_logic());
		//System.out.println("getNum: "+g.getNum());
		//System.out.println("getBool: "+g.getBool());
		
		
		System.out.println("programa ");
		System.out.println(g.s);
		System.out.println("%%%%%%%%%%%%%%%%%");
		System.out.println("programa test");
		System.out.println(g.programa_test);
		
		
	};

};
