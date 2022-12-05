package gfgDsa;

import java.util.ArrayList;

public class SubarrayGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 96, 104, 12, 123, 134};
		int n=42, s=468;
		System.out.println(subarraySum(arr,n,s));
	}
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        
        ArrayList<Integer> list = new ArrayList<Integer> ();
        int start =0, sum =0;
        for(int i=0; i<n; i++){
          sum +=arr[i];
          if(sum>s){
              sum -=arr[start];
              System.out.println(arr[start]+" Left ->"+start+"--> "+sum+"-- "+i);
              start++;
          }
          if(sum==s){
             list.add(start+1);
             list.add(i+1);
             return list;
          }
          
        }
        System.out.println(start+"-> "+sum);
        if(list.size()==0) {
        	if(sum-arr[start]==s) {
        		list.add(start+2);
                list.add(n);
        	}else
        		list.add(-1);
        }
        return list;
    }
}
