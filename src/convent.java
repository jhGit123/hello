

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/**
 * ���ַ����ķ�ʽ�����ֽ���
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
				msg=br.readLine();//���ж�ȡ
				bw.write(msg);//����д��
				bw.newLine();
				bw.flush();//ǿ��ˢ��
			}
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("��������");
		}
		System.out.println("dsdsd");
	}

}
