
public class BitInsertion {
	public static void main(String[] args) {
	
		int n = 1024;
		int m = 23;
		
		int i = 2;
		int j = 6;
		
		System.out.println(bitManipulation(n, m, i, j));
	}
	
	public static int bitManipulation(int n, int m, int i, int j){
		
		int allOnes = ~0;
		
		int left = allOnes << (j + 1);
		
		int right = ((1 << i) - 1);
		
		//异或运算，相同为0不同为1
		int mask = left | right;
		
		int n_cleaed = n & mask;
		
		int m_shifted = m << i;
		
		int result = n_cleaed | m_shifted;
		
		return result;
	}
}
