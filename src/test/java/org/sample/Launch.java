package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Launch {
	
	public static void main(String[] args) throws IOException   {
		
		//Accessing File
		
		File file=new File("C:\\Users\\USER\\Desktop\\Prakash\\newbook.xlsx");
		
		//InputStream
		
		FileInputStream stream=new FileInputStream(file);
		
		//Accessing Workbook
		
		Workbook book=new XSSFWorkbook(stream);
		
		//Accessing Sheet
		
		Sheet sheet = book.getSheet("Sheet1");
		
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			
			Row row = sheet.getRow(i);
			
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				
				Cell cell = row.getCell(j);
				
				//To find the cell type
				
				CellType cellType = cell.getCellType();
				
				switch(cellType) {
				
				case STRING:
					
					String stringCellValue = cell.getStringCellValue();
					
					if(stringCellValue.equals("Hanno")){
						
						cell.setCellValue("Breeza");
						
						FileOutputStream out=new FileOutputStream(file);
						
						book.write(out);
					}
					
					System.out.print(stringCellValue+"\t");
					
					break;
					
				case NUMERIC:
					
					double numericCellValue = cell.getNumericCellValue();
					
					int x=(int) numericCellValue;
					
					BigDecimal valueOf = BigDecimal.valueOf(x);
					
					String string = valueOf.toString();
					
					System.out.print(string);
					
					break;
					
					default:
						
						break;
						
				}
				
			}
			
			System.out.println();
				}
				
			}
	
		
		
		
	}

