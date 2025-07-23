package javaarrays;

public class Sample3 {
	
	static void sum(int[] arr) {
		int res=0;
		for(int i=0; i<arr.length;i++) {
			res +=arr[i];
			
		}
		System.out.println("the summ of array "+res);
	}
	public static void main(String[] args) {
		int[] arr = {324,43,34,45,748,6,324,547};
		sum(arr);
		
	}

}
