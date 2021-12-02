package utilities.pack;

public class UtilityClass {
	// Countchar_occurance
	public static void main(String[] args) {

		String name = "king maker is always greater than king";
		int total_count = name.length();
		int afterRmvCount = name.replace("a", "").length();

		// int count = a - b;
		int c = total_count - afterRmvCount;
		System.out.println(c);
	}
}
