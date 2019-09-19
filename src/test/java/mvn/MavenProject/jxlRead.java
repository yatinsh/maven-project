package mvn.MavenProject;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class jxlRead {

	public static void main(String[] args) throws BiffException, IOException 
	{
		File f=new File("C:\\Users\\Yatin\\Desktop\\resignation\\yatin.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet(0);
		int r=s.getRows();
		int c=s.getColumns();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell c1=s.getCell(j,i);
				System.out.println(c1.getContents());
			}
			
		}
	}

}

