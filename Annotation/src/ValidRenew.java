import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


public class ValidRenew extends ValidationSuper{

	public ValidRenew() {
		super(new Poliza());
	}
	
	public static final Integer PRODUCTO1 = 1;
	public static final Integer PRODUCTO2 = 2;
	
	@Renew
	public Boolean validate(Integer product, Integer user) throws NoSuchMethodException, SecurityException{
		if (product == PRODUCTO1)
			getPoliza().setProductType(product);
		
		if ( user != null)
			getPoliza().setUser(user);
		
		validOne();
		validTwo();
		
		checkRenew();
		
		return false;
	}
	


}
