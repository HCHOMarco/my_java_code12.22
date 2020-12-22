import java.io.*;
import java.util.Scanner;
public class FileTest_1 {
    public static void main(String[] args) throws IOException{
        String src="E:/myIDEAcode/my_java_code12.22/src.txt";
        String dest="E:/myIDEAcode/my_java_code12.22/dest.txt";
        File srcFile = new File(src);
        File destFile = new File(dest);
        Scanner input = new Scanner(srcFile);
        PrintWriter output = new PrintWriter(destFile);
        while(input.hasNext()){
            String tmp=input.nextLine();
            output.println(tmp);
        }
        input.close();
        output.close();
    }
}
