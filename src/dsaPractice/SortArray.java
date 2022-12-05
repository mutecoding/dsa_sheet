package dsaPractice;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long []nums = {0,25063,5,25062,7,-25061,9,25060,11,25059};
		int lp=0, hp=nums.length-1;
        System.out.println(hp+1);
        while(lp<=hp) {
            if(nums[lp]>nums[hp]){
                swap(nums,lp,hp);
                rightPosition(nums,lp,hp); 
                while(lp<hp&&nums[lp]==nums[lp+1]) lp++;
                while(lp<hp&&nums[hp]==nums[hp-1]) hp--;
            }else if(nums[lp]==nums[hp]){
                hp--;
            }else{
                rightPosition(nums,lp,hp);
                hp--; 
            }
            
            if(lp==hp){
                rightPosition(nums,lp,hp);
                lp++;
                hp--;
            }
            
        }
        System.out.print(Arrays.toString(nums));
	}
	public static void swap(long []nums, int lp, int hp){
        nums[lp] = nums[lp]^nums[hp];
        nums[hp] = nums[lp]^nums[hp];
        nums[lp] = nums[lp]^nums[hp];
    }
    public static void rightPosition(long []nums, int lp, int hp){
        while(lp>0&&nums[lp]<nums[lp-1]){
            swap(nums,lp,(lp-1));
            lp--;
        }
        while(hp<nums.length-1&&nums[hp]>nums[hp+1]){
            swap(nums,hp,(hp+1));
            hp++;
        }
    }

}
