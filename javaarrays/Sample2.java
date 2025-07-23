package javaarrays;

public class Sample2 {
	public static void main(String[] args) {
		String[] names;
		names = new String[6];
		names[0]="sangram";
		names[1] ="rahul";
		names[2] = "shubham";
		names[3] = "ketan";
		names[4]="samadhan";
		names[5]="Suresh";
		
		System.out.println(names[0]);
		for(String i : names) {
			System.out.println(i);
		}
		
	}

}
