
public class Cliente {

	
	public static void case1(){
		ValidSus v1 =  new ValidSus();		
		ValidSus v2 =  new ValidSus();

		v1.validate(1,1);
		v2.validate(2,1);
		
	}
	
	
	public static void case2() throws NoSuchMethodException, SecurityException{

		ValidRenew v1 =  new ValidRenew();		
	
		v1.validate(1,1);
		
	}
	
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {		
		
		case1();
		case2();	

	}

}
