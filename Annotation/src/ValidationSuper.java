import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ValidationSuper {

	private Poliza poliza;

	public Poliza getPoliza() {
		return poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

	public ValidationSuper(Poliza poliza) {
		this.poliza = poliza;
	}

	public void validOne() {

	}

	public void validTwo() {

	}
	
	public void checkRenew() throws NoSuchMethodException, SecurityException {
		Class<?> c = this.getClass();
		Method method = c.getMethod("validate", Integer.class, Integer.class);
		//Method method = c.getDeclaredMethod("validate", Integer.class, Integer.class);
		System.out.println(c);
//		try {
//			// iterates all the annotations available in the method
//			for (Annotation anno : method.getDeclaredAnnotations()) {
//				System.out.println("Annotation in Method '" + method
//						+ "' : " + anno);
//				
//				
//			}
//		} catch (Throwable ex) {
//			ex.printStackTrace();
//		}
		
		if (method.isAnnotationPresent(Renew.class)) {
			Renew renew = method.getAnnotation(Renew.class);
			System.out.println(renew);
		
		}
	}
	

	
	
	
	
	
	
//	
//	
//	
//	package com.javapapers.annotations;
//	import java.lang.annotation.Annotation;
//	import java.lang.reflect.Method;
//	public class TestAnnotation {
//		public static void main(String args[]) throws SecurityException,
//				ClassNotFoundException {
//			for (Method method : Class.forName(
//					"com.javapapers.annotations.BuildHouse").getMethods()) {
//				// checks if there is annotation present of the given type Developer
//				if (method
//						.isAnnotationPresent(com.javapapers.annotations.Developer.class)) {
//					try {
//						// iterates all the annotations available in the method
//						for (Annotation anno : method.getDeclaredAnnotations()) {
//							System.out.println("Annotation in Method '" + method
//									+ "' : " + anno);
//							Developer a = method.getAnnotation(Developer.class);
//							if ("Popeye".equals(a.value())) {
//								System.out.println("Popeye the sailor man! "
//										+ method);
//							}
//						}
//					} catch (Throwable ex) {
//						ex.printStackTrace();
//					}
//				}
//			}
//	
//	
//	

}
