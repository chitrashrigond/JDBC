package com.xworkz.palace;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class PalaceDetails1 {

	public static void main(String[] args) throws IOException {
	XSSFWorkbook wb=new XSSFWorkbook();
	XSSFSheet sheet=wb.createSheet();
	sheet.createRow(0);
	sheet.getRow(0).createCell(0).setCellValue("ID");
	sheet.getRow(0).createCell(1).setCellValue("Palace");
	sheet.getRow(0).createCell(2).setCellValue("State");
	sheet.getRow(0).createCell(3).setCellValue("Country");
	
	sheet.createRow(1);
	sheet.getRow(1).createCell(0).setCellValue("1");
	sheet.getRow(1).createCell(1).setCellValue("Mysore Palace");
	sheet.getRow(1).createCell(2).setCellValue("Karnataka");
	sheet.getRow(1).createCell(3).setCellValue("India");
	
	sheet.createRow(2);
	sheet.getRow(2).createCell(0).setCellValue("2");
	sheet.getRow(2).createCell(1).setCellValue("Banglore Palace");
	sheet.getRow(2).createCell(2).setCellValue("Karnataka");
	sheet.getRow(2).createCell(3).setCellValue("India");
	
File file=new File("C:\\Users\\Chaitra\\workspace\\palace\\ExcelSheet\\PalaceDetails.xlsx");
	FileOutputStream fos=new FileOutputStream(file);
	wb.write(fos);
	wb.close();

	}

}
