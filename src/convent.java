

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/**
 * 已字符流的方式控制字节流
 * @author Administrator
 *
 */
public class convent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));){
			String msg="";
			while(!msg.equals("exit")) {
				msg=br.readLine();//逐行读取
				bw.write(msg);//逐行写出
				bw.newLine();
				bw.flush();//强制刷新
			}
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("操作有误");
		}
		System.out.println("dsdsd");
	}

}
