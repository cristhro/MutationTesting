import java.util.ArrayList;

public class C1{
	private int p_num=0;
	private ArrayList<Double> result_tmp_num=new ArrayList<Double>();
	private double[] result_final_num;
	private ArrayList<Boolean> result_tmp_bool=new ArrayList<Boolean>();
	private boolean[] result_final_bool;
	private double[] inputs_num;
	public C1(double[] inputs_num) {
		this.inputs_num=inputs_num;
	}
private void exe() {
double k0=  ( 3.6962834352699074  - (p_num<inputs_num.length ? inputs_num[p_num++] : 5) ) ;
result_tmp_num.add(k0);
double k1=   60.64306405838972  / (Math.abs((int)(p_num<inputs_num.length ? inputs_num[p_num++] : 5) )+1) ;
result_tmp_num.add(k1);
if( ( 83.90922551597295  < (p_num<inputs_num.length ? inputs_num[p_num++] : 5)) ){
boolean k3=  ( 56.18433699513599  < (p_num<inputs_num.length ? inputs_num[p_num++] : 5)) ;
result_tmp_bool.add(k3);
double k2=  ( 25.026319904304433  - (p_num<inputs_num.length ? inputs_num[p_num++] : 5) )  +  ( 44.28148457177661  * (p_num<inputs_num.length ? inputs_num[p_num++] : 5) )  -   77.84908997293559  / (-Math.abs((int)(p_num<inputs_num.length ? inputs_num[p_num++] : 5) )+1)  *  ( 86.27491848317294  * (p_num<inputs_num.length ? inputs_num[p_num++] : 5) ) ;
result_tmp_num.add(k2);
boolean k4=  ( 93.06569328394036  >= (p_num<inputs_num.length ? inputs_num[p_num++] : 5)) ;
result_tmp_bool.add(k4);
}else {
boolean k5=  ( 58.9346886790902  != (p_num<inputs_num.length ? inputs_num[p_num++] : 5)) ;
result_tmp_bool.add(k5);double k6=  ( 93.0319201101082  + (p_num<inputs_num.length ? inputs_num[p_num++] : 5) )  / (Math.abs((int)  56.71297941666368  - (p_num<inputs_num.length ? inputs_num[p_num++] : 5)  )+1) *  ( 85.66489615508674  / (Math.abs((int)(p_num<inputs_num.length ? inputs_num[p_num++] : 5) )+1))  / (-Math.abs((int) ( 67.01521312409795  * (p_num<inputs_num.length ? inputs_num[p_num++] : 5) ) )+1);
result_tmp_num.add(k6);double k7=   58.50881196644236  / (-Math.abs((int)(p_num<inputs_num.length ? inputs_num[p_num++] : 5) )+1) ;
result_tmp_num.add(k7);
}
int i8 = 0;
while(i8<1 && ( ( 10.44471991393828  == (p_num<inputs_num.length ? inputs_num[p_num++] : 5))  ||  ( 99.8513408178464  == (p_num<inputs_num.length ? inputs_num[p_num++] : 5))  &&  ( 36.786542250530566  >= (p_num<inputs_num.length ? inputs_num[p_num++] : 5)) )){

double k9=  ( 74.592754724389  * (p_num<inputs_num.length ? inputs_num[p_num++] : 5) )  *   91.41930782653212  + (p_num<inputs_num.length ? inputs_num[p_num++] : 5)   -   79.15456547238591  + (p_num<inputs_num.length ? inputs_num[p_num++] : 5)   / (-Math.abs((int)  15.876851323097352  - (p_num<inputs_num.length ? inputs_num[p_num++] : 5)  )+1);
result_tmp_num.add(k9);boolean k10=  ( 94.45961786398176  >= (p_num<inputs_num.length ? inputs_num[p_num++] : 5)) ;
result_tmp_bool.add(k10);double k11=   30.83682157944719  + (p_num<inputs_num.length ? inputs_num[p_num++] : 5)   +   88.32051122423839  - (p_num<inputs_num.length ? inputs_num[p_num++] : 5)   -  ( 4.723052396032076  - (p_num<inputs_num.length ? inputs_num[p_num++] : 5) )  +   4.949081018705968  / (-Math.abs((int)(p_num<inputs_num.length ? inputs_num[p_num++] : 5) )+1) ;
result_tmp_num.add(k11);
i8++;
}

for(int i12=5;i12>0;i12 -- ){
boolean k13=  ( 52.482288779831016  <= (p_num<inputs_num.length ? inputs_num[p_num++] : 5)) ;
result_tmp_bool.add(k13);
double k14=  ( 8.771526434787127  - (p_num<inputs_num.length ? inputs_num[p_num++] : 5) ) ;
result_tmp_num.add(k14);boolean k15=  ( 6.308799392252273  > (p_num<inputs_num.length ? inputs_num[p_num++] : 5))  ||  ( 2.923773004613513  != (p_num<inputs_num.length ? inputs_num[p_num++] : 5))  &&  ( 75.8658045530445  < (p_num<inputs_num.length ? inputs_num[p_num++] : 5))  ||  ( 19.384207749010226  != (p_num<inputs_num.length ? inputs_num[p_num++] : 5)) ;
result_tmp_bool.add(k15);

}
boolean k16=  ( 31.64438230197111  == (p_num<inputs_num.length ? inputs_num[p_num++] : 5)) ;
result_tmp_bool.add(k16);
double k17=   71.09861828001299  / (Math.abs((int)(p_num<inputs_num.length ? inputs_num[p_num++] : 5) )+1) ;
result_tmp_num.add(k17);
}
public boolean[] get_result_bool() {
		exe();
		result_final_bool=new boolean[result_tmp_bool.size()];
		for(int i=0;i<result_tmp_bool.size();i++) {
			result_final_bool[i]=result_tmp_bool.get(i);
		}
		return result_final_bool;
	}

	public double[] get_result_num() {
		exe();
		result_final_num=new double[result_tmp_num.size()];
		for(int i=0;i<result_tmp_num.size();i++) {
			result_final_num[i]=result_tmp_num.get(i);
		}
		return result_final_num;
	}
}
