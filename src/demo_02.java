

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * �ļ��ֽ����������ļ�
 * @author Administrator
 *
 */
public class demo_02 {
	public static void main(String[] args) {
		//1.����Դ
		File src=new File("E:\\Users\\Administrator\\eclipse-workspace\\IO\\aaa.txt");
		//2.ѡ����
		InputStream is=null;
		try {
			is=new FileInputStream(src);
			byte[] flush=new byte[1024]; //��������
			//����
			int len=-1;//���ܳ���
			while((len=is.read(flush))!=-1) {
				//�ֽ�����<-�ַ���   ����
				String s=new String(flush,0,len);
					System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
					if(is!=null) {
						is.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	
		
	}

}
