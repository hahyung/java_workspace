package day06;

public class T4 {
	public static void main(String[] args) {
		int arr[] = new int[] {10, 54, 13, 17, 25, 30};
		/*for(int s : arr) {
		if(s%2==0) {
			System.out.println("Â¦¼ö : "+s );
		}else if(s%2!=0) {
			System.out.println("È¦¼ö : " +s);
		}
		*/
		for(int i =0; i<arr.length;i++){
				if(arr[i]%2==0) {
					System.out.println("Â¦¼ö : "+arr[i] );
				}else if(arr[i]%2!=0) {
					System.out.println("È¦¼ö : " +arr[i]);
				}
		}
		
	}
}
