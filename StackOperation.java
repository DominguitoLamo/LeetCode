public class StackOperation{
	public static void operate(String[] str){
		int result = 0;
		Stack<String> oper = new Stack<String>();
		String operator = "+-*/";
		for(int i = 0; i < str.length; i++){
			if(!operator.contains(str[i])){
				oper.push(str[i]);
			}else{
				int a = Integer.valueOf(oper.pop());
				int b = Integer.valueOf(oper.pop());
				int index = operator.indexOf(str[i]);
				switch(index){
					case 0:
						oper.push(String.valueOf(a + b));
						break;
					case 1:
						oper.push(String.valueOf(b - a ));
						break;
					case 2:
						oper.push(String.valueOf(b * a ));
						break;
					case 3:
						oper.push(String.valueOf(b / a));
						break;
				}
			}
		}
				result = Integer.valueOf(oper.pop()); 
				return result;
	}
	}
	}
}
