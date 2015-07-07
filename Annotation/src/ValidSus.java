
public class ValidSus extends ValidationSuper  {
	
	public static final Integer PRODUCTO1 = 1;
	public static final Integer PRODUCTO2 = 2;
	
	
	public Boolean validate(Integer product, Integer user){
		if (product == PRODUCTO1)
			getPoliza().setProductType(product);
		
		if ( user != null)
			getPoliza().setUser(user);
		
		return false;
	}


	public ValidSus() {		
		super(new Poliza());		
	}

}
