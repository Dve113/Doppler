package main;

import java.util.ArrayList;

import io.ImportCSVToObject;
import io.PrintObjectList;
import model.Firma;

public class Main {

	public static void main(String[] args) {

		ArrayList<Firma> List = ImportCSVToObject.importCSVToFirma("csv_act_firmen");
		PrintObjectList.printList(List);
		
	}
}
