package week3.day1;

public class PrintDuplicates1 {
	public static void main(String[] args) {
		int [] a= {11,22,33,44,55,66,22,77,11};
		for (int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
			
			
			
			
		}
	}

}
