package wenge.annotation;

public class MyTest {
	@Deprecated
	@MyAnnotation(name = "admin", pass = "*****")
	public void output(){
		System.out.println("output something!");
	}
}
