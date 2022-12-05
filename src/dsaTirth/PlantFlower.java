package dsaTirth;

public class PlantFlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,0,1,0,0,1,0,0};
		int target =2;
		int count = 0;
		for(int i=0;i<arr.length;) {
			System.out.print(i+" ");
			if(arr[i]==0&&arr.length==1||arr[i]==0&&i==0&&i<arr.length-1&&arr[i+1]==0 ||arr[i]==0&&i>0&&arr[i-1]==0&&i<arr.length-1&&arr[i+1]==0
					||i==arr.length-1&&arr[i]==0&&i>0&&arr[i-1]==0) {
				count++;
				i +=2;
			}else if(arr[i]==0) {
				i++;
			}
			else {
				i +=2;
			}
		}
		if(count>=target) {
			System.out.println(true);
		}else {
			System.out.println(false);

		}
		System.out.println(count);
	}

}
