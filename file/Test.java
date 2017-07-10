package wenge.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list = getAbsolutePaths("D:\\学习资料\\docuemnts\\python");
		for(String length : list) {
			int start = length.lastIndexOf("\\");
			System.out.println(start == -1 ? null : length.substring(start + 1));
		}
	}
	
	public static List<String> getAbsolutePaths(String pathName) {
        List<String> list = new ArrayList<>();
        File file = new File(pathName);
        File[] files = file.listFiles();

        for(File fileName : files) {
            list.add(fileName.getAbsolutePath());
        }

        return list;
    }
	
	
}
