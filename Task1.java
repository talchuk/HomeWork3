import java.util.ArrayList;
import java.util.Random;

public class Task1 {

	private static final String CHAR_LIST = "fghijklqrstuvwxyzABCDEFGST567890";
	static ArrayList<String> array = new ArrayList<>();

	public static void main(String[] args) {

		generateRandomString(5);

		System.out.println(array.toString());
	}

	public static void generateRandomString(int numberStrings) {

		int stringSymbolQuantity = (int) (6 + Math.random() * 10);
		char ch = 0;

		for (int i = 0; i < numberStrings; i++) {

			StringBuffer randStr = new StringBuffer();

			for (int y = 0; y <= stringSymbolQuantity; y++) {

				int number = getRandomNumber();
				ch = CHAR_LIST.charAt(number);
				randStr.append(ch);

			}

			array.add(String.valueOf(randStr));
		}
	}

	private static int getRandomNumber() {
		int randomInt = 0;
		Random randomGenerator = new Random();
		randomInt = randomGenerator.nextInt(CHAR_LIST.length());
		if (randomInt - 1 == -1) {
			return randomInt;
		} else {
			return randomInt - 1;
		}
	}

}
