import java.util.ArrayList;

public class FindNextSmallest {
	public static void main(String[] args) {
		int n = 11;
		int m = findNextSmallest(n);
		System.out.println(m);
	}
	
	public static int findNextSmallest(int n){
		ArrayList<Integer> binaryList = new ArrayList<Integer>();
		
		binaryList = integerTransformBinary(n);
		
		//count the number of 1
		int countOne = 0;
		
		for(int i=0;i<binaryList.size();i++){
			if(binaryList.get(i) == 1){
				countOne++;
			}
		}
		
		int m = n + 1;
		
		while(true){
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp = integerTransformBinary(m);
			int countOneM = 0;
			for(int i=0;i<temp.size();i++){
				if(temp.get(i) == 1){
					countOneM++;
				}
			}
			if(countOne == countOneM){
				break;
			}
			m++;
		}
		return m;
	}
	
	public static int binaryTransformInteger(ArrayList<Integer> binaryList){
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for(int i=binaryList.size()-1;i>=0;i--){
			temp.add(binaryList.get(i));
		}
		
		int result = 0;
		
		for(int i=0;i<temp.size();i++){
			result = result + (int)(Math.pow(2, i)) * temp.get(i);
		}
		
		return result;
	}
	
	public static ArrayList<Integer> integerTransformBinary(int n){
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		while(n != 0){
			if(n%2 == 1){
				result.add(1);
			}
			else{
				result.add(0);
			}
			
			n = n/2;
		}
		
		ArrayList<Integer> finalResult = new ArrayList<Integer>();
		
		for(int i=result.size() - 1;i>=0;i--){
			finalResult.add(result.get(i));
		}
		return finalResult;
	}
}
