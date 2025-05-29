package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Data_driven {	
	@DataProvider(name="exceldata")
	public static Object[][] getExcelData() throws IOException {
		FileInputStream file = new FileInputStream(
				"E:\\eclipse-workspace\\Checking\\src\\test\\java\\testNG\\Excel datafile\\Seleniumdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int totalRowNum = sheet.getLastRowNum();
		int totaltCellNum = sheet.getRow(1).getLastCellNum();
		System.out.println("Toatl number of rows  " + totalRowNum);
		System.out.println("Total number of cells " + totaltCellNum);
		int a = 128;
		int b = 128;
		System.out.println(a == b);
		 Object[][] data = new Object[totalRowNum][totaltCellNum];
		 DataFormatter formatter = new DataFormatter();

		for (int r = 1; r <= totalRowNum; r++) {
			XSSFRow currentrow = sheet.getRow(r);
			
			for (int c = 0; c < totaltCellNum; c++) {
				data[r - 1][c] = formatter.formatCellValue(currentrow.getCell(c));
//				XSSFCell cell = currentrow.getCell(c);
//				System.out.print(cell.toString() + "\t");
			}

			System.out.println();
		}
		return data;

	}

}
