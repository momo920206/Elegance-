package cale;

import java.util.HashMap;
import java.util.Map;

@AnnotationDemo(name="type",gid=Long.class)
public class UserAnnotation {
	@AnnotationDemo(name="type",num=1,gid=Long.class)
	private Integer age;
	@AnnotationDemo(name="type",num=2,gid=Long.class)
	public UserAnnotation() {
		// TODO Auto-generated constructor stub
	}
	@AnnotationDemo(name="type",num=3,gid=Long.class)
	public void a()
	{
		Map map=new HashMap(0);
	}
	@AnnotationDemo(name="type",num=4,gid=Long.class)
	public void b()
	{
		Map map=new HashMap(0);
	}
	public void b(Integer a)
	{
		
	}
}
