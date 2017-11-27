import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*遍历文件夹下的txt文本，参数路径+格式txt*/
public class bianli_folder_txt {
	
	public static void main(String[] args) {
		String FILE_IN = "D:\\data\\test1";
		File f = new File(FILE_IN);
		List<String> list = new ArrayList<String>();
		list = getFileList(f);

		System.out.println(list.size());

		for (String l : list) {
			System.out.println(l);
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(new File(l)));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				String line = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	private static List<String> getFileList(File file) {
		// TODO Auto-generated method stub
		List<String> result = new ArrayList<String>();

		if (!file.isDirectory()) {
			System.out.println(file.getAbsolutePath());
			result.add(file.getAbsolutePath());
		} else {
			File[] directoryList = file.listFiles(new FileFilter() {
				public boolean accept(File file) {
					if (file.isFile() && file.getName().indexOf("txt") > -1) {
						return true;
					} else {
						return false;
					}
				}
			});
			for (int i = 0; i < directoryList.length; i++) {
				result.add(directoryList[i].getPath());
			}
		}

		return result;

	}
}