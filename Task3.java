import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Task3 {

	public static void main(String[] args) throws IOException {
		String filePath = "MyFile.txt";
		HashMap<String, String> map = new HashMap<String, String>();

		String line;
		BufferedReader reader = new BufferedReader(new FileReader("MyFile.txt"));
		while ((line = reader.readLine()) != null) {
			String[] parts = line.split(":", 2);
			if (parts.length >= 2) {
				String key = parts[0];
				String value = parts[1];
				map.put(key, value);
			} else {
				System.out.println(line);
			}
		}

		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
		reader.close();
	}

}

