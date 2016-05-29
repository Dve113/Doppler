package io;

import java.util.ArrayList;

import model.Firma;

public class PrintObjectList {
	
	public static void printList(ArrayList<Firma> List) {
		
		for (int i = 0; i < List.size(); i++) {
			System.out.println(List.get(i).toString());
		} 
		System.out.println(List.size());
	}

}
