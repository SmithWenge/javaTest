package wenge.ftp;

public class FavFTPUtilTest {
	public static void main(String[] args) {
		String hostname = "www.sullivan.top";
		 int port = 21;
		 String username = "sullivan";
		 String password = "keepreading";
		 String pathname = "/home/sullivan"; 
		 String filename = "Python学习手册(第4版).pdf"; 
		 String originfilename = "C:\\Users\\Downloads\\Downloads.rar";
//		 FavFTPUtil.uploadFileFromProduction(hostname, port, username, password, pathname, filename, originfilename);
		 String localpath = "D:\\";
		  
//		 FavFTPUtil.downloadFile(hostname, port, username, password, pathname, filename, localpath);
		 System.out.println(FavFTPUtil.getFileNames("www.sullivan.top",21,"sullivan","keepreading","/home/sullivan/"));
		 }
}
