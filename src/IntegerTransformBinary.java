import java.util.ArrayList;


public class IntegerTransformBinary {
	public static void main(String[] args) {
		ArrayList<Integer> result = integerTransformBinary(8);
		
		System.out.println(result);
	}
	
	public static ArrayList<Integer> integerTransformBinary(int n){
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		while(n != 0){
			if(n%2 == 1){
				result.add(1);
				n = n/2;
			}
			else{
				result.add(0);
				n = n/2;
			}
		}
		
		ArrayList<Integer> finalResult = new ArrayList<Integer>();
		
		for(int i=result.size()-1;i>=0;i--){
			finalResult.add(result.get(i));
		}
		
		return finalResult;
		
	}
}
