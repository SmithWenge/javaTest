package wenge.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyReflection {
	public static void main(String[] args) throws Exception {
		MyTest myTest = new MyTest();
		Class<MyTest> c = MyTest.class;
		Method method = c.getMethod("output", new Class[]{});
		
		//判断该方法是否有MyAnnotation注解
		if(method.isAnnotationPresent(MyAnnotation.class)) {
			method.invoke(myTest, new Class[]{});
			
			//通过反射获取myAnnotation对象
			MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
			String name = myAnnotation.name();
			String pass = myAnnotation.pass();
			
			System.out.println(name + ", " + pass);
		}
		
		//获取当前方法的所有注解的对象，注意必须是运行时注解这里才能获取。
		//因为是通过反射获取的所以显然应该是运行时的注解才会获取。
		Annotation[] annotations = method.getAnnotations();
		
		//遍历输出注解的名字
		for(Annotation annotation : annotations)
		{
			System.out.println(annotation.annotationType().getName());
		}
	}
}
