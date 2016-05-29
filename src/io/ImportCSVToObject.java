package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import model.Firma;

public class ImportCSVToObject {

	public static ArrayList<Firma> importCSVToFirma(String file_name) {
		
		
		BufferedReader br = null;
		String line = "";
		String csvSplitBy =";";
		ArrayList<Firma> loaded_file = new ArrayList<Firma>();
		String csv_file = "C:\\Users\\David\\Desktop\\" + file_name + ".csv";
		
		
		try {
			br = new BufferedReader(new FileReader(csv_file));
			while ((line = br.readLine()) != null) {
				Firma f = new Firma();
				String[] firma = line.split(csvSplitBy);
				

				if (firma.length == 12) {
					f.setFirma(firma[0].toString());
					f.setTelefon(firma[1].toString());
					f.setAdresse1(firma[2].toString());
					f.setAdresse2(firma[3].toString());
					f.setStadt(firma[4].toString());
					f.setBundesland(firma[5].toString());
					f.setPLZ(firma[6].toString());
					f.setWebsite(firma[7].toString());
					f.setBranche(firma[8].toString());
					f.setID(firma[9].toString());
					f.setDatensatzverwalter(firma[10].toString());
					f.setLand(firma[11].toString());
					loaded_file.add(f);
				}		

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println(loaded_file.size());
		return loaded_file;
		
	}

}
