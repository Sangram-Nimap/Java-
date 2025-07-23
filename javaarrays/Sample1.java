package javaarrays;

public class Sample1 {
	public static void main(String[] args) {
		int[] marks = {67,45,99,88,77,67,87,85,56,83};
		System.out.println(marks.length);
		System.out.println(marks[0]);
		System.out.println("-----------------------------------------------");
		
		// display all array elements
		for(int i=0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		System.out.println("-----------------------------------------------");
		
		//foreach loop
		for (int i : marks) {
			System.out.println(i);
		}
	}

}
