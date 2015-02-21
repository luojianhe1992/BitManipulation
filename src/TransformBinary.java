import java.util.ArrayList;


public class TransformBinary {
	public static void main(String[] args) {
		ArrayList<Integer> result = transformBinary(0.625);
		
		System.out.println(result);
	}
	
	public static ArrayList<Integer> transformBinary(double n){
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		while(n != 0.0 && result.size() < 32){
			n = n * 2;
			if(n >= 1){
				result.add(1);
				n = n - 1;
			}
			else{
				result.add(0);
			}
		}
		
		if(result.size() == 32){
			System.out.println("error");
		}
		
		return result;
		
	}
}
