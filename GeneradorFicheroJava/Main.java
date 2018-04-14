
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num_ifs=1;
		int num_while=1;
		int size_while=1;
		int num_for=1;
		int size_for=5;
		int size_cond=2;
		int size_expLogics=2;
		int size_expArit=2;
		double[] test_inputs= {1,2,3,4,5,6,7,8,9};
		
		Generardor g=new Generardor("test1","C1",test_inputs, num_ifs, num_while, size_while,  num_for,  size_for, size_cond,
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
		
		/*
		
		System.out.println(g.s);
		System.out.println("%%%%%%%%%%%%%%%%%");
		
		System.out.println(g.programa_test);
		*/
		
		String route="C:/Users/yu/eclipse-workspace/TFG/GeneradorFicheroJava";
		GeneraFichero.crear(route,g.nom_test+".java",g.programa_test);
		GeneraFichero.crear(route,g.nom_program+".java",g.s);
		
		
		/*
		double[] inputs={1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
		C1 c1=new C1(inputs);
		System.out.println("hola");*/
		
	};

};
