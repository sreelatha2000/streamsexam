package week10_java_srilatha_exam;

public class DiamondPattern {
	
	public static void main(String[] args) {
		int n=5;
		for(int index1=0 ; index1<=n ;index1++)
		{
			for(int index2=n-index1 ; index2>1 ;index2--)
			{
				System.out.print(" ");
			}
			for(int index3=1 ; index3<=index1 ;index3++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int index1=n ; index1>1 ;index1--)
		{
			for(int index2=n-index1 ; index2>1 ;index2--)
			{
				System.out.print(" ");
			}
			for(int index3=1 ; index3<index1 ;index3++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
