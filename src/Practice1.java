import java.util.Arrays;

public class Practice1 {

	public static void main(String[] args) {
		int[] elements = {1, 2, 3, 4, 5};
		int firstElem = elements[0];
		int lastIdx = elements.length - 1;
		
		System.out.println("Before swap: " + (Arrays.toString(elements)));
		
		elements[0] = elements[lastIdx];
		elements[lastIdx] = firstElem;
		
		System.out.println("After swap: " + (Arrays.toString(elements)));
	}

}
