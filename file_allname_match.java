import java.io.File;
import java.util.ArrayList;
import java.util.List;
//��ȡ�ļ����µ��ļ����ƣ�ģ��ƥ���ļ���
public class fileallname {
	public static void main(String[] args) {
		String path = "C:/Users/Administrator/Desktop/������"; // ·��
		//String match1="(.*).PNG";
		String match1="�½�(.*)";
		List<String> filename1=getFileName(path,match1);
		System.out.println("------------------------------------------------");
		for(int i = 0 ; i < filename1.size() ; i++) {
			System.out.println("result:  "+filename1.get(i));
		}
		System.out.println("end");
	}

	/**
	 * ��������ļ������ļ�������
	 */
	public static List<String> getFileName(String path,String match1) {
		
		File f = new File(path);
		if (!f.exists()) {
			System.out.println(path + " not exists");
		}
		File fa[] = f.listFiles();

		
		List<String> fn1 = new ArrayList<String>();
		String fn2="";
		List<String> fn3 = new ArrayList<String>();
		for (int i = 0; i < fa.length; i++) {
			File fs = fa[i];
			if (fs.isDirectory()) {
				System.out.println(fs.getName() + " [Ŀ¼]");
				fn1.add(fs.getName());
			} else {
				System.out.println(fs.getName());
				fn1.add(fs.getName());
			}
		}
		System.out.println("------------------------------------------------");
		//for(String attribute : fn1) {
			//System.out.println(attribute);
		for(int i = 0 ; i < fn1.size() ; i++) {
			//System.out.println(fn1.get(i));
				fn2=fn1.get(i);
				if(fn2.matches(match1)){
					fn3.add(fn2);
					System.out.println(fn2);
				}
					
		}
		return fn3;
	}
}
