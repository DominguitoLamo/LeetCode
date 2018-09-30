public class DynamaticPartition{
	public ArrayList<String> palindromePartiton(String s){
		ArrayList<String> result = new ArrayList<String>();

		if(s == null)
			return result;

		if(s.length() <= 1)
			result.add(s);

		int length = s.length();
		int[][] table = new int[length][length];

		//Iteration, i is index of left boundry while j is index of right boundry.l is length.
		for(int l = 1; l <= length; l++){
			for(int i = 0; i <= length - l;i++){
				//The reduction of l delineate the boundry of i.
				int j = i + l - 1;
				if(s.charAt(i) == s.charAt(j)){
					if(l == 1 || l == 2){
					the length is one or two, so that the palindrome is sequential
					table[i][j] = 1;
					}else{
						//Length more than 2
						table[i][j] = table[i + 1][j - 1];
					}
					if(table[i][j] == 1){
						//endindex+1 because function substring doesn't includes the character of end index.
						result.add(s.substring(i,j + 1));
					}else{
						table[i][j] = 0;
					}
				}
			}
		}
		return result;
	}
}
}
