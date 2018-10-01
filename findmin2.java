public int findmin(int[] arr){
	return findmin(arr,0,arr.length - 1);
}

public int findmin(int[]arr,int left,int right){
	if(right == left)
		return arr[left];
	if(right == left + 1)
		return Math.min(arr[left,arr[right]);
	int middle = (right - left)/2 + left;
	if(arr[right] > arr[left])
		return arr[left];
	if(arr[left] == arr[right]){
		return findmin(arr,left+1,right);
	}else if(arr[left] <= arr[middle]){
		return findmin(arr,middle,right);
	}else{
		return findmin(arr,left,middle);
	}
}

