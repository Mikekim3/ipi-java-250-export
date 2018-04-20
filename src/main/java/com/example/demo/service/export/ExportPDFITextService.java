package com.example.demo.service.export;


import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.ServletOutputStream;

import com.example.demo.dto.LigneFactureDTO;
import com.itextpdf.text.*;
import com.lowagie.text.pdf.PdfTable;
import org.springframework.stereotype.Service;
import com.example.demo.dto.FactureDTO;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPCell;
import java.io.IOException;


// Je sèche. Après le run, lorsque je clique sur le lien, le message est "Ce site est inaccessible".
//Et à cette heure, j'ai plus la force...
//Par contre si tu pouvais m'expliquer ce que je n'ai pas fais, parce que je me perds dans tous ces fichiers.


@Service
public class ExportPDFITextService {


	public void export(ServletOutputStream servletOutputStream, FactureDTO facture) throws DocumentException, IOException
	{
		Document document = new Document();

		try
		{
			PdfWriter.getInstance(document, servletOutputStream);
			document.open();
			document.add(new Paragraph("La Facture de " +  facture.getClient().getNom() + " " + facture.getClient().getPrenom()));
			document.add(new Paragraph(" "));

			//On créer un objet table dans lequel on intialise ça taille.
			PdfPTable table = new PdfPTable(4);
			Double total = 0d;


			for(LigneFactureDTO row : facture.getLigneFactures()) {
				table.addCell(row.getDesignation());
				table.addCell(String.valueOf(row.getQuantite()));
				table.addCell(row.getMarque());
				table.addCell(String.valueOf(row.getPrixUnitaire()));
				table.addCell(String.valueOf(total = total + row.getPrixUnitaire() * row.getQuantite()));

			}

		}
		catch (DocumentException docEx)
		{
			docEx.printStackTrace();
		}
		document.close();
		}

}



