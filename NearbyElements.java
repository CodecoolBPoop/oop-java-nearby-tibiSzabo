import java.util.Arrays;

public class NearbyElements{


	private int[][] multi = new int[][]{
        { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
        { 1, 3, 5, 7 },
        { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
	};
	
	
	public int[] nearby(int x, int y, int range){
		
		int leftRange = y - range;
		
		if (leftRange < 0) {
			leftRange = 0;
		}
		
		int rightRange = y + range;
		
		if (rightRange > multi[x].length){
			rightRange = multi[x].length;
		}
		
		int[] arraySlice = Arrays.copyOfRange(multi[x], leftRange, rightRange+1);
		int result[] = new int[arraySlice.length - 1];
		int resultIndex = 0;
		int sliceIndex = 0;
		while (resultIndex != result.length){
			if (arraySlice[sliceIndex] != multi[x][y]){
				result[resultIndex] = arraySlice[sliceIndex];
				resultIndex++;
				sliceIndex++;
			} else {
				sliceIndex++;
			}
			
		}
		
		return result;
	
	}
	
	
	public static void main(String [] args){
		
		NearbyElements element = new NearbyElements();
		
		for (int i:element.nearby(0, 2, 2)){
			System.out.println(i);
		}
	
	}
	
	
}