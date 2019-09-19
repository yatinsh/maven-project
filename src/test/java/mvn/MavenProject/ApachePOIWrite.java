package mvn.MavenProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOIWrite 
{

	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:\\Users\\Yatin\\Desktop\\monika.xlsx");
		FileOutputStream fo=new FileOutputStream(f);
		XSSFWorkbook xw=new XSSFWorkbook();
		XSSFSheet xs=xw.createSheet("yatin");
		for(int i=0;i<5;i++)
		{
			XSSFRow xr=xs.createRow(i);
			for(int j=0;j<5;j++)
			{
				XSSFCell xc=xr.createCell(j);
				xc.setCellValue("yatin");
			}
		}
		xw.write(fo);
		fo.flush();
		fo.close();

	}

}
