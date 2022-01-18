package org.excel.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelread {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("ff");
		FileInputStream r = new FileInputStream(f);
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet();
		Row r1 = s.createRow(2);
		Cell c = r1.createCell(2);
		int in = c.getCellType();
		
		if (in==1) {
			String st = c.getStringCellValue();
			System.out.println(st);
		}
		
		else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			
			SimpleDateFormat sf = new SimpleDateFormat();
			
			String stt = sf.format(d);
			
			System.out.println(stt);
		}
		
		else {
			double nu = c.getNumericCellValue();
			
			long l = (long) nu;
			
			String fs = String.valueOf(l);
			
			System.out.println(fs);
		}
	}
}
