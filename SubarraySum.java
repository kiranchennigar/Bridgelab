public class SubarraySum {
	public static void findSubarray(int[] arr,int target) {
		int start=0,currentSum=0;
		for(int i=0;i<arr.length;i++) {
			currentSum=currentSum+arr[i];
			
			while(currentSum>target && start<i) {
				currentSum=currentSum-arr[start];
				start++;
			}
			if(currentSum==target) {
				System.out.print("Subarray with given sum : ");
				for(int j=start;j<=i;j++) {
					System.out.println(arr[j]+" ");
				}
				return;
			}
		}
		System.out.println("No Subarray found with the given sum");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input= {1,2,3,7,5};
		int sum=12;
		findSubarray(input,sum);

	}

}