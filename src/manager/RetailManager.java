package manager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import problemdomain.Gizmo;

public class RetailManager {
	private final String FILE_PATH = "res/gizmos.txt";
	private ArrayList<Gizmo> gizmos;
	private Scanner in;
	
	public RetailManager() throws IOException {
		gizmos = new ArrayList<>();
		loadGizmosFromFile();
		printGizmos();
		displayMenu();
		saveGizmoListToFile();
		
	}

	private void saveGizmoListToFile() throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter(FILE_PATH));
		for (Gizmo gizmo: gizmos) {
			out.println(gizmo);
		}
		out.close();
		
		
	}

	private void displayMenu() {
		System.out.println("1. Add");
		System.out.println("2. Delete");
		System.out.println("3. Update");
		System.out.println("4. Search");
		
		in = new Scanner(System.in);
		int choice = in.nextInt();
		in.nextLine();
		
		switch (choice) {
		case 1:{addGizmo();break;}
		case 2:{deleteGizmo();break;}
		case 3:{updateGizmo();break;}
		case 4:{searchGizmo();break;}
		default:break;
		}
	}

	private void addGizmo() {
		System.out.println("Enter the gizmo Info in the following format: name;quantity;price");
		String line = in.nextLine();
		String[] fields = line.split(";");
		
				//check
		int id = 123; //gizmos.get(gizmos.size()-1).getId()+1;
		String name = fields[0];
		int qty = Integer.parseInt(fields[1]);
		double price = Double.parseDouble(fields[2]);
				
		Gizmo gizmo = new Gizmo(id, name, qty, price);
		gizmo.add(gizmo);
		
		
	}

	private void deleteGizmo() {
		// TODO Auto-generated method stub
		
	}

	private void updateGizmo() {
		// TODO Auto-generated method stub
		
	}

	private void searchGizmo() {
		System.out.println("Enter the name");
		String name = in.nextLine();
		
		for (int i = 0; i < gizmos.size(); i++) {
			if(gizmos.get(i).getName().equalsIgnoreCase(name)) {
				System.out.println(gizmos.get(i));
				return;
			}
		}
		System.out.println(name + "Gizmo was not found.");
		
	}

	private void printGizmos() {
		for (Gizmo gizmo: gizmos) {
			System.out.println(gizmo);
		}
		
	}

	private void loadGizmosFromFile() throws FileNotFoundException {
		Scanner in = new Scanner(new File ("res/gizmos.txt"));	
		
		while (in.hasNext()) {
			String line = in.nextLine();
			String[] fields = line.split(";");
			
			int id = Integer.parseInt(fields[0]);
			String name = fields[1];
			int qty = Integer.parseInt(fields[2]);
			double price = Double.parseDouble(fields[3]);
			
			Gizmo gizmo = new Gizmo(id, name, qty, price);
			gizmo.add(gizmo);
			
			
		}
	}
	

}
