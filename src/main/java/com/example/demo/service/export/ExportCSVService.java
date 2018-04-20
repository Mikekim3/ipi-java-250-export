package com.example.demo.service.export;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.ClientDTO;

@Service
public class ExportCSVService {

	public void export(Writer printWriter, List<ClientDTO> clients) throws IOException {
		printWriter.write("Nom");
		printWriter.write(";");
		printWriter.write("Prénom");
		printWriter.write(";");
		printWriter.write("Âge");
		printWriter.write(";");
		printWriter.write("Adresse");
		printWriter.write(";");
		printWriter.write("Code Postal");
		printWriter.write(";");
		printWriter.write("Ville");
		printWriter.write(";");
		printWriter.write ("\n");

		for (ClientDTO client : clients) {

			printWriter.write(client.getNom());
			printWriter.write(";");
			printWriter.write(client.getPrenom());
			printWriter.write(";");
			printWriter.write(client.getAge());
			printWriter.write(";");
			printWriter.write(client.getAdresse());
			printWriter.write(";");
			printWriter.write(client.getCodePostal());
			printWriter.write(";");
			printWriter.write(client.getVille());
			printWriter.write ("\n");


		}
	}
}