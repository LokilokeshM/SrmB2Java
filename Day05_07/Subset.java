package Day05_07;

	public class Subset {

		public static void SubString(String str, int n) {
			for (int i = 0; i < n; i++)
				for (int j = i + 1; j <= n; j++)

					System.out.println(str.substring(i, j));
		}

		public static void main(String[] args) {
			String str = "abcd";
			SubString(str, str.length());
		}
	}
