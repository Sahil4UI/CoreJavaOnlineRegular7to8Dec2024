package CoreJava;

public class ArrayDemoND {
// 3d array
	
	public static void main(String[] args) {
		
//		int x [][][] = {
//				{
//					{1,2,3},
//					{4,5,6},
//					{7,8,9}
//				},
//				{
//					{10,11,12},
//					{13,14,15},
//					{16,17,18}
//				},
//				{	
//					{19,20,21},
//					{22,23,24},
//					{25,26,27}
//				}
//		};
//		
//		for (int i=0;i<x.length;i++)
//		{
//			for (int j=0;j<x[0].length;j++)
//			{
//				for (int k=0;k<x[0][0].length;k++)
//				{
//					System.out.print(x[i][j][k] + "   ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
		
//		public class Demo1 {
//
//			public static void main(String[] args) {
//				// TODO Auto-generated method stub
				for(int i=1;i<=15;i++){
				    for(int j=1;j<=17;j++){
				        if(i==1||i==2||i==3||i==7||i==8||i==9||i==13||i==14||i==15)
				        {
				            System.out.print("0");
				        }
				        else if((i==4||i==5||i==6)&& j<=4){
				            System.out.print("0");
				        }
				        else if((i==10||i==11||i==12)&& j>=14){
				            System.out.print("0");
				    }
				    else{
				        System.out.print("");
		    	    }
				    System.out.println();
			}
		  }
		 }
//		}

			
	}
	
//}

			
	

