package cale;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ParseAnnotation {
	
	public static void parseTypeAnnotion() throws ClassNotFoundException
	{
		Class class1= Class.forName("cale.UserAnnotation");
		Annotation [] annotation=class1.getAnnotations();
		for (Annotation annotation2 : annotation) {
			AnnotationDemo annotationDemo=(AnnotationDemo) annotation2;
			System.out.println("id="+annotationDemo.num()+";name="+annotationDemo.name()+";gid="+annotationDemo.gid());
			
		}
	}
	public static void parseMethodAnnotation()
	{
		Method [] method = UserAnnotation.class.getDeclaredMethods();
		for (Method method2 : method) {
			boolean hasAnnotation=method2.isAnnotationPresent(AnnotationDemo.class);
			if(hasAnnotation)
			{
				AnnotationDemo annotation=method2.getAnnotation(AnnotationDemo.class);
				System.out.println("method = " + method2.getName()  
                + " ; id = " + annotation.num() + " ; description = "  
                + annotation.name() + "; gid= "+annotation.gid()); 
			}
		}
	}
	public static void parseConstructAnnotation(){
		Constructor[] constructors = UserAnnotation.class.getConstructors();  
		        for (Constructor constructor : constructors) { 
		         
		            boolean hasAnnotation = constructor.isAnnotationPresent(AnnotationDemo.class);  
		            if (hasAnnotation) {  
		                 
		            	AnnotationDemo annotation =(AnnotationDemo) constructor.getAnnotation(AnnotationDemo.class);  
		                System.out.println("constructor = " + constructor.getName()  
		                        + " ; id = " + annotation.num() + " ; description = "  
		                        + annotation.name() + "; gid= "+annotation.gid());  
		            }  
		        }  
		}
	public static void main(String[] args) throws ClassNotFoundException {
		parseTypeAnnotion();
		parseMethodAnnotation();
		parseConstructAnnotation();
		}
}
