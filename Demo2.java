package demo1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * 字符流的练习:FileWriter和FileReader
 * 1.给定一个文件的路径,如果此文件不存在,就创建它,显示"新创建了文件"
 * 2.在里面写入一句"hello world",显示"文件已写入内容",
 * 3.在文件末尾换行,追加一句"你好,世界",显示"文件已追加内容"
 * 4.显示文件全部内容
 * */
public class Demo2 {

	public static void main(String[] args) {
		File file = new File("E:"+File.separator+"01.txt");
		try {
			if(!file.exists()) {
			file.createNewFile();
			System.out.println("新创建了文件01.txt");
			}
			Writer output = new FileWriter(file);
			//Writer output = new OutputStreamWriter(new FileOutputStream(file));
			String str = "hello world";
			output.write(str);
			output.close();
			System.out.println("文件已写入内容");
			Writer output1 = new FileWriter(file,true);
			// "\r\n"表示换行
			String str1 = "\r\n你好,世界";
			output1.write(str1);
			output1.close();
			System.out.println("文件已追加内容");
			Reader input = new FileReader(file);
			/* 第一种方法
			char[] c = new char[1024];
			int len =input.read(c);
			input.close();
			System.out.println(""+new String(c,0,len));
			*/
			
			// 第二种方法
			char[] c = new char[1024];
			int len = 0;
			int temp = 0;
			while((temp=input.read()) != -1) {
				c[len] = (char)temp;
				len++;
			}
			input.close();
			String fileContent = new String(c,0,len);
			System.out.println("文件内容为:\n"+fileContent);
		}catch(Exception e){
			e.printStackTrace();
		}	
	}
}
