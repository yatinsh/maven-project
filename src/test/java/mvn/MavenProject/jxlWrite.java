package mvn.MavenProject;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class jxlWrite {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException 
	{
		File f=new File("C:\\Users\\Yatin\\Desktop\\resignation\\monika.xls");
		WritableWorkbook ww=Workbook.createWorkbook(f);
		WritableSheet ws=ww.createSheet("yatin",0);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				Label l=new Label(j, i, "monika");
				ws.addCell(l);
				
			}
		}
		ww.write();
		ww.close();
	}

}
