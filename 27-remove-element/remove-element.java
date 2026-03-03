class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=nums.length-1,k=0;
        while(i<=j){
            if(nums[i]!=val){
                i++;
                k++;
            }
            else{
                if(nums[j]!=val){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    j--;
                    k++;
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return k;
    }
}