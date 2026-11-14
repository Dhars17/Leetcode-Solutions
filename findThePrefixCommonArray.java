class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int nums[]=new int[A.length];
        int count=0;
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }
            else{
                map.put(A[i],0);
            }
            if(map.get(A[i])==1){
                count++;
            }
            if(map.containsKey(B[i])){
                map.put(B[i],map.get(B[i])+1);
            }
            else{
                map.put(B[i],0);
            }
            if(map.get(B[i])==1){
                count++;
            }
            nums[i]=count;
        }
        return nums;
    }
}