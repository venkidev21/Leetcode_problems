class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char arr[]=answerKey.toCharArray();
        int Tflip=flip(arr,k,'T');
        int Fflip=flip(arr,k,'F');
        return Math.max(Tflip,Fflip);
        
    }
    int flip(char arr[], int k,char t){
        int c=0;
        int max=0;
        int l=0;
        for(int e=0;e<arr.length;e++){
            if(arr[e]==t) c++;
            while(k<c){
                if(arr[l]==t) c--;
                l++;
            }
            max=Math.max(max,e-l+1);
        }
        return max;
    }
}