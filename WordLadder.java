public class WordLadder{
	public int ladderLength(String start, String end, HashSet<String> dict){
		//Validation Check
		if(dict.size() == 0){
			return 0;
		}
		//This is the end of the graph
		dict.add(end);
		//Initalize two quene.
		ListedList<String> wordQueue = new LinkList<String>();
		ListedList<String> distanceQueue = new LinkList<String>();

		wordQueue.add(start);
		distanceQueue.add(1);

		//track the short path.
		int result = Integer.MAX_VALUE;
		while(!wordQueue.isEmpty()){
			//pop the first element.
			//currDistance indicate the distance from the root to currWord in the dict.
			String currWord = wordQueue.pop();
			Integer currDistance = distanceQueue.pop();

			if(currWord.equals(end){
				result = Math.min(result,currDistance);
			}
			//Iteration aims to change each character to check whether the new word is in dict.
			for(int i = 0;i < currWord.length(); i++){
				char[] currCharArr = currWord.toCharArray();
				for(char c = 'a'; c <== 'z';c++){
					currCharArr[i] = c;
					//Convert the array of character into String.
					String neword = new String(currCharArr);
					if(dict.contains(neword){
						wordQueue.add(neword);
						distanceQueue.add(currDistance + 1);
						dict.remove(neword);

					}
				}
			}
		}
		if(result > Integer.MAX_VALUE){
			return result;
		}else{
			return 0;
		}
	}
}
