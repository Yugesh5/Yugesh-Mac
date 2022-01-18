package org.excel.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelwrite {
	public static void main(String[] args) throws IOException {
		File f = new File("");
		
		Workbook w = new XSSFWorkbook();
		
		Sheet sh = w.getSheet("yugesh");
		
		Row r = sh.getRow(2);
		
		Cell c = r.getCell(2);
		
		Row re = c.getRow();
		
		Cell cc = re.createCell(2);
		
		cc.setCellValue("yugesh");
		
		FileOutputStream o = new FileOutputStream(f);
		
		w.write(o);

		
		
	}
}
