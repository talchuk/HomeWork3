import java.time.LocalDate;

public class Task2 {

	public static void main(String[] args) {
		LocalDate futureDate = LocalDate.now().plusYears(3).plusMonths(1).plusDays(2);

		System.out.println("Current date: " + LocalDate.now());
		System.out.println("Future date : " + futureDate);

	}

}
