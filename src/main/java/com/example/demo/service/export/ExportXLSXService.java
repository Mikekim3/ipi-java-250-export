package com.example.demo.service.export;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;

import com.example.demo.dto.ClientDTO;
import com.example.demo.dto.FactureDTO;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

@Service
public class ExportXLSXService {
	
	public void export(ServletOutputStream servletOutputStream, List<ClientDTO> clients) throws IOException {
	/*	XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("clients");

		workbook.write(servletOutputStream);
		workbook.close();*/


		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Clients");
		Row headerRow = sheet.createRow(0);
		Cell cellNom = headerRow.createCell(0);
		cellNom.setCellValue("Nom");
		Cell cellPrenom = headerRow.createCell(1);
		cellPrenom.setCellValue("Prénom");
		Cell cellAge = headerRow.createCell(2);
		cellAge.setCellValue("Âge");
		Cell cellAdresse = headerRow.createCell(3);
		cellAdresse.setCellValue("Adresse");
		Cell cellCodePostal = headerRow.createCell(4);
		cellCodePostal.setCellValue("Code Postal");
		Cell cellVille = headerRow.createCell(5);
		cellVille.setCellValue("Ville");
		workbook.write(servletOutputStream);
		workbook.close();
	}
	public void export2(ServletOutputStream servletOutputStream, List<FactureDTO> facture) throws IOException{
		//export pour un client avec onglets pour chaque facture
		XSSFWorkbook workbook2 = new XSSFWorkbook();
		XSSFSheet sheet2 = workbook2.createSheet("Facture");
		Row headerRow2 = sheet2.createRow(0);
		Cell cellDesignation = headerRow2.createCell(0);
		cellDesignation.setCellValue("Désignation");
		Cell cellQuantite = headerRow2.createCell(1);
		cellQuantite.setCellValue("Quantité");
		Cell cellMarque = headerRow2.createCell(2);
		cellMarque.setCellValue("Marque");
		Cell cellPrixUnitaire = headerRow2.createCell(3);
		cellPrixUnitaire.setCellValue("Prix unitaire");
		workbook2.write(servletOutputStream);
		workbook2.close();
	}

	public void exportFacturesUnClient(ServletOutputStream outputStream,List<FactureDTO>factures) throws IOException{
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("facture1");
		workbook.write(outputStream);
		workbook.close();

	}
}
