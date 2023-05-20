
import java.util.Arrays;

public class IronmanLegacy {
	public static void main(String[] args) {

		int[][] arr = { { 2, 4, 5 }, { 1, 3, 6 }, { 2, 4, 7 } };
		System.out.println(Arrays.toString(findTheRange(5, arr)));

	}

	static int[] findTheRange(int size, int[][] abb) {
		int[] arr = new int[size];
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}

		for (int[] is : abb) {
			n = is.length;
			int min = is[0];
			int max = is[1];
			int value = is[2];

			for (int j = min; j < max; j++) {
				arr[j] = arr[j] + value;
			}

		}
		int[] res = new int[n];
		res[0] = endInd(arr) - 1;
		res[1] = endInd(arr);
		res[2] = largest(arr);
		return res;
	}


	static int largest(int[] arr) {
		int big = arr[0];
		int end = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > big) {
				big = arr[i];
				end = i;
			}

		}
		return big;
	}


	static int endInd(int[] arr) {
		int big = arr[0];
		int end = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > big) {
				end = i;
			}

		}
		return end;
	}
}
