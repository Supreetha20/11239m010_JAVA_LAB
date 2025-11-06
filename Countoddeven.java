public class Countoddeven{
	public static void main(String[] args){
			int[] number = {12,4,8,3,9,6,1};
			int evenCount = 0;
			int oddCount = 0;
			for(int i=0;i<number.length;i++){
				if(i%2==0){
					evenCount++;
				}else{
					oddCount++;
				}
			} 
			System.out.println("Total even numbers: "+evenCount);
			System.out.println("Total odd numbers: "+oddCount);
		}
	}