package Data_Driven_Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.biff.WorkbookMethods;

public class ExcelDataConfig {
	Workbook wb;
	  Sheet sd;


public ExcelDataConfig(String Excelpath) throws Exception {
	
	try {
		File fm=new File("C:\\Users\\sandeep.mandhala\\Downloads\\Excel1.xls");
		FileInputStream fi=new FileInputStream(fm);
		
		wb = Workbook.getWorkbook(fi);
		   
		 
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		
	}
}
	//public String getData(int Sheetnumber,int row,int column) {
		  
	//sd=wb.getSheet(Sheetnumber).getRow(row);
	//String data =get
	//return null;
	
	}
	



