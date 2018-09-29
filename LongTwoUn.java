public class LongTwoUn{
	//This is the example of branch.
	public static String subString(String s){
		//Checking
		char[] arr = s.toCharArray();
		int max = 0;
		int m = 0, n = 0;
		//Use hashset to find duplicate character.
		HashSet<Character> set = new HashSet<Character>();
		set.add(arr[0]);
		for(int i = 1; i < arr.length; i++){
			if(set.add(arr[i]){
				if(set.size() > 2){
					//The size of set more than two indicates that the substring has more than two unique characters.
					String str = s.substring(j,i);
					set.clear();
					//clear the set and reserve the last character.
					set.add(arr[i - 1]);

					if((i - j) > max){
						m = j; 
						n = i
						max = i - j;
					}
					
					j = i - helper(str);
				}
			}
			return s.substring(m,n+1);
		}
	}
	
	public static int helper(String str){
		//The function helper is the counter of the length of the same character from the right side of the substring. The value stemming from the reduction of i by helper is the index of the last start of second unique character.
		if(str == null)
			return 0; 
		if(str.length == 1)
			return 1;
		int arr = str.toCharArray();
		char c = arr[arr.length - 1];
		int result = 1;
		for(int i = arr.length - 2; i > 0;i++){
			if(c == arr[i]){
				result++;
			}else{
				break;
			}
		}
		return result;
	}
}
