package com.xworkz.palace;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PalaceDetails {

	public static void main(String[] args) throws IOException {
	
File file=new File("C:\\Users\\Chaitra\\MobiDrive\\Palacedetails.xlsx");
FileInputStream fis= new FileInputStream(file);
XSSFWorkbook workbook= new XSSFWorkbook(fis);
XSSFSheet sheet= workbook.getSheetAt(0);
//String cell=sheet.getRow(0).getCell(0).getStringCellValue();
int rowcount=sheet.getPhysicalNumberOfRows();
for(int i=0; i<rowcount; i++){
	XSSFRow row=sheet.getRow(i);
	
	int cellcount=row.getPhysicalNumberOfCells();
	for(int j=0; j<cellcount; j++){
		XSSFCell cell=row.getCell(j);
		System.out.print("||"+getCellValues(cell));
	}
	System.out.println();
}
workbook.close();
fis.close();
	}
public static String getCellValues(XSSFCell cell){
	switch(cell.getCellType()){
	case NUMERIC:	
		return String.valueOf(cell.getNumericCellValue());
	case STRING:	
		return cell.getStringCellValue();
	default:
		return cell.getStringCellValue();
	}
	
	
}
}
