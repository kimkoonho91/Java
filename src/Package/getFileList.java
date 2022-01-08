package Package;
import java.io.File;

public class getFileList {
	// 폴더의 파일 목록 가져오기
    public static void main(String[] args) {
        File file = new File("D:\\정보");
        
        for (File data : file.listFiles()) {
            
            System.out.println("SELECT '" + data.getName() + "' AS NAME FROM DUAL UNION ALL");
        }
    }
}
