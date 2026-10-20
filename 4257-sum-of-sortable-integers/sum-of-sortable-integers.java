class Solution {
    public int sortableIntegers(int[] nums) {
        int n=nums.length;
        // Copy the array and sort for checking
        int[] Sorted_Array=nums.clone();
        Arrays.sort(Sorted_Array);

        List<Integer> divs=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                divs.add(i);
                if(i!=n/i) divs.add(n/i);

            } 

        }

        int ans=0;

        for(int div:divs){
            boolean allGood=true;
            for(int left=0;left<n;left+=div){
                int right=left+div;
            // take two arrays sub part (orginal ,sorted);
                int sub1[]=Arrays.copyOfRange(nums,left,right);
                int sub2[]=Arrays.copyOfRange(Sorted_Array,left,right);
                if(!check(sub1,sub2)){
                    allGood=false;
                    break;
                }

            }

            if(allGood) ans+=div;
        }
        return ans;
    }

    // HOW IT WORK
                // Chech the sub1 is sort  so compare with sub2
                // if Cyclic<->rotion for find first element element whose next element is small
                // [5,4,1,2,3] here (4) next elemet 1 is small
                // use another  arr3=array[]
                // fist copy (1-3) {1,2,3}
                // next Copy (5-4) usinf System.arraysCopy() ; now arr3=[1,2,3,4,5]
                // After compare the compare arr3 with sub2(sorted arrays sub part)
                // Return true if same else return false;

    boolean check(int[] arr1,int[] arr2){
        int n=arr1.length;
        if( Arrays.equals(arr1,arr2)) return true;
        for(int i=0;i<n-1;i++){
            //  find first element element whose next element is small
            if(arr1[i]>arr1[i+1]){
                 // use another  arr3=array[] eg:[5,4,1,2,3]
                int rotated[]=new int[n];
                 // fist copy (i+1 -last) 
                System.arraycopy(arr1,i+1,rotated,0,n-i-1);
                // next Copy (0 - i+1)
                System.arraycopy(arr1,0,rotated,n-i-1,i+1);
                // Return true if same 
                return Arrays.equals(rotated,arr2);
            }
        }
        return Arrays.equals(arr1,arr2);
    }
}