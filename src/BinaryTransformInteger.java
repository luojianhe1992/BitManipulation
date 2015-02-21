import java.util.ArrayList;


public class BinaryTransformInteger {
	public static void main(String[] args) {
		
		ArrayList<Integer> binaryList = new ArrayList<Integer>();
		
		binaryList.add(1);
		binaryList.add(0);
		binaryList.add(0);
		binaryList.add(0);
		
		System.out.println(binaryTransformInteger(binaryList));
		
	}
	
	public static int binaryTransformInteger(ArrayList<Integer> binaryList){
		
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for(int i=binaryList.size() - 1;i>=0;i--){
			temp.add(binaryList.get(i));
		}
		
		System.out.println(temp);
		
		int result = 0;
		
		for(int i=0;i<temp.size();i++){
			result = (int) (result + Math.pow(2, i) * temp.get(i));
		}
		
		return result;
		
	}
}
