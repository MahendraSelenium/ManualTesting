package CtsDemo;

public class SumAvg {
	public static void main(String []args){
		int [] Arr= {1,2,3,4,5,6};
		int sum =0; 
		for(int j:Arr) {
			sum=sum + Arr[j];
		}
		sum=sum/Arr.length;
		System.out.println("sum");
	}
	
}
