package com.qa.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static Object[][] getDatas(String Sheet) throws IOException 
	{
		FileInputStream File = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\qa\\testdata\\ExcelData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(File);
		XSSFSheet worksheet = workbook.getSheet(Sheet);
		int RowCount = worksheet.getLastRowNum();
		int ColumnCount = worksheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[RowCount][ColumnCount];
		for (int i = 1; i <= RowCount; i++) 
		{
			for (int j = 0; j < ColumnCount; j++) 
			{
				DataFormatter formatter = new DataFormatter();
				data[i - 1][j] = formatter.formatCellValue(worksheet.getRow(i).getCell(j));
			}
		}
		return data;
	}
}
