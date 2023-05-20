
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GrootsPieFinder {
	public static void main(String[] args) {

		int[] sweetnessValues1 = { 1, 2, 3, 2, 1 };
		int desiredSweetness1 = 6;
		List<int[]> pies1 = sweetPieFinder(sweetnessValues1, desiredSweetness1);
		for (int[] is : pies1) {
			System.out.println(Arrays.toString(is));
			
		} // Output: [0, 1, 2] or [2, 1, 0]
		System.out.println();

		int[] sweetnessValues2 = { 8, 4, 3, 2, 6, 5 };
		int desiredSweetness2 = 6;
		List<int[]> pies2 = sweetPieFinder(sweetnessValues2, desiredSweetness2);
		for (int[] is : pies2) {
			System.out.println(Arrays.toString(is));
			
		}
	}

	static List<int[]> sweetPieFinder(int[] a, int swt) {
		String str = "";
		List<int[]> l1 = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {

			if (a[i] == swt) {
				str = "" + i;

				l1.add(con(str));
			} else {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] + a[j] == swt) {
						str = "" + i + j;
						l1.add(con(str));
					} else {
						for (int k = j + 1; k < a.length; k++) {
							if (a[i] + a[j] + a[k] == swt) {
								str = "" + i + j + k;
								l1.add(con(str));
							}
						}

					}

				}

			}

		}
		return l1;
	}

	static int[] con(String str) {

		int[] res = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			String s = "" + str.charAt(i);
			res[i] = Integer.parseInt(s);
		}
		return res;
	}
}
