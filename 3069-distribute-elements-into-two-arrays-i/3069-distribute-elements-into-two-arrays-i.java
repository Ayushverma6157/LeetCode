class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)) arr1.add(nums[i]);
            else arr2.add(nums[i]);
        }
        int[] array1  = arr1.stream().mapToInt(Integer::intValue).toArray();
        int[] array2  = arr2.stream().mapToInt(Integer::intValue).toArray();
        int[] result = new int[array1.length+array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }
}