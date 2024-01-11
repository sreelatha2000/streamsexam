package week10_java_srilatha_exam;

public class Rectangle {
	public static void main(String[] args) {
		int n=5;
		int m=6;
		for(int index1=1 ; index1<=n ;index1++)
		{
			
			for(int index3=1 ; index3<=n ;index3++)
			{
					if(index1==1 || index1==5 || index3==1 || index3==4)
					{
						System.out.print(" * ");
					}
					else
					{
						System.out.print("      ");
					}
			}
			System.out.println();
		}
		
	}

}
