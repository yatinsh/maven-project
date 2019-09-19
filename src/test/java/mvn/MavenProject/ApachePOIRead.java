package mvn.MavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOIRead 
{

	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:\\Users\\Yatin\\Desktop\\yatin.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook xw=new XSSFWorkbook(fi);
		XSSFSheet xs=xw.getSheetAt(0);
		int r=xs.getPhysicalNumberOfRows();
		for(int i=0;i<r;i++)
		{
			XSSFRow xr=xs.getRow(i);
			int c=xr.getPhysicalNumberOfCells();
			for(int j=0;j<c;j++)
			{
				XSSFCell xc=xr.getCell(j);
				System.out.println(xc.getStringCellValue());
			}
		}

	}

}
