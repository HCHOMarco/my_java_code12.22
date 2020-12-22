import java.io.*;
public class FileText_2 {
    public static void main(String[] args) throws Exception {
        String src="E:/myIDEAcode/my_java_code12.22/src.txt";
        String dest="E:/myIDEAcode/my_java_code12.22/dest.txt";
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
        byte[] buff =new byte[1024];
        int len;
        while((len=in.read(buff))!=-1){
            out.write(buff,0,len);
        }
        in.close();
        out.close();
    }
}
