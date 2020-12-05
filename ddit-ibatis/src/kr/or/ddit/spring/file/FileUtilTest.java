package kr.or.ddit.spring.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileUtilTest {
	public static void main(String[] args) {
		
		File file = new File("d:/temp/write.txt");
		
//		List<String> lineList = new ArrayList<String>();
//		for(int i=0;i<10;i++){
//			lineList.add((i+1)+"번째 데이터 쓰기");
//		}
//		
//				 
//		try {
//			FileUtils.writeLines(file, lineList);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		File file = new File("d:/temp/test.txt");
//		  
		try {
			List<String> lineList = FileUtils.readLines(file, "UTF-8");
			for(String line:lineList){
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		String fileFullName = "c:/temp/upload/test.doc";
//		System.out.println("fileFullName: "+fileFullName);
//		System.out.println("baseName: "+FilenameUtils.getBaseName(fileFullName));
//		System.out.println("extension: "+FilenameUtils.getExtension(fileFullName));
//		System.out.println("name: "+FilenameUtils.getName(fileFullName));
//		System.out.println("path: "+FilenameUtils.getPath(fileFullName));
//		System.out.println("prefix: "+FilenameUtils.getPrefix(fileFullName));
		
		
	}
}
