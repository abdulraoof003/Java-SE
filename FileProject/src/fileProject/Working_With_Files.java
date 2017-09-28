package fileProject;

import java.io.*;

import java.util.ArrayList;

public class Working_With_Files {

	//define array
	ArrayList<person> bobs = new ArrayList<person>();

	// Add person to add array and returns true or false dependent on whether person added to array or not 
	public boolean add_Vehicle(person v) {

		return bobs.add(v);

	}
	

	
	
	// write to the file. name of the file is set in the variable a
	public boolean to_File(String a) {

		try {

			// opens the file
			PrintWriter writer = new PrintWriter(a + ".txt", "UTF-8");

			// loops through unformatted array list person	
			for (int i = 0; i < bobs.size(); i++) {
				// gets formatted version of the person 
				writer.println(bobs.get(i).toString());

			}

			writer.close();

		} catch (IOException e) {

			return false;

			// do something

		}

		return true;

	}

	public boolean from_File(String a) {

		BufferedReader br = null;

		try {

			br = new BufferedReader(new FileReader(a + ".txt"));

		} catch (FileNotFoundException e) {

			return false;

		}

		try {

			StringBuilder sb = new StringBuilder();

			String line = br.readLine();

			while (line != null) {

				bobs.add(new person(line));

				line = br.readLine();

			}

		} catch (IOException e) {

			return false;

		} finally {

			try {

				br.close();

			} catch (IOException e) {

				return false;

			}

			return true;

		}

	}

	

	public boolean remove_Vehicle(person v) {

		return bobs.remove(v);

	}

}