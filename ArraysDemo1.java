package demo;

public class TwoD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Declaration : 
//		int [][] arr = new int [3][4];
//		3X4 Matrix
		
//		Initialization
//		int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
//		for (int i=0;i<a.length;i++)
//		{
//			for (int j=0;j<a[0].length;j++)
//			{
//				System.out.print(a[i][j]+ " ");
//			}
//			System.out.println();
//		}
		
//		find sum of all numbers in 2D Array
//		int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
//		int [][] b = {{1,2,3},{4,5,6},{7,8,9}};
//		int res[][] = {{0,0,0},{0,0,0},{0,0,0}};
//		for (int i=0;i<a.length;i++)
//			{
//				for (int j=0;j<a[0].length;j++)
//				{
//					res[i][j] = a[i][j]+b[i][j];
//				}
//				
//			}
//		System.out.println(res);
		
//		Find the Transpose of Matrix
		
//		int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
////		int res[][] = new int [3][3] ;
////		for (int i=0;i<a.length;i++)
////			{
////				for (int j=0;j<a[0].length;j++)
////				{
////					res[i][j] = a[j][i];
////				}
////				
////			}
//		
//		for (int i=0;i<res.length;i++)
//		{
//			for (int j=0;j<res[0].length;j++)
//			{
//				System.out.print(res[i][j]+"  ");
//			}
//				System.out.println();
			
//Print Upper Traingle and Lower Traingle
//		int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
//		int res[][] = new int [3][3] ;
//		for (int i=0;i<a.length;i++)
//			{
//				for (int j=0;j<a[0].length;j++)
//				{
//					if(i<=j)
//					System.out.print(a[i][j]+"  ");
//					else
//					System.out.print("   ");
//				}
//				System.out.println();				
//			}
		
//		MATRIX MULTIPLICATION
		
		int x[][] = {{1,2},{3,4}};
		int y[][] = {{5,6},{7,8}};   
		int res[][]= new int[2][2];
//		finding matrix multiplication
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				for (int k=0;k<2;k++)
				{
					res[i][j] += x[i][k]*y[k][j];
				}
			}
		}
//		matrix print
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				System.out.print(res[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		
		}
	}


