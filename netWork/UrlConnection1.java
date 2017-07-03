package wenge.netWork;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnection1 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.qq.com");
		
//		可以用这种形式，也可以直接用url获取流，本质是一样的只不过java给我们简化了
		URLConnection connection = url.openConnection();
		InputStream is = connection.getInputStream();
		
//		InputStream is = url.openStream();
		
		OutputStream os = new FileOutputStream("D:\\info.txt");
		
		byte[] buffer = new byte[2048];
		int length = 0;
		while(-1 != (length = is.read(buffer, 0, buffer.length))) {
			os.write(buffer, 0, length);
		}
		
		is.close();
		os.close();
	}
}
