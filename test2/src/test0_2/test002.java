package test0_2;

public class test002 {

	public static void main(String[] args) {
		String cp[][]= {{"产品名称：Mac","15.6寸 ","内存4G","2","3454","6908"},
				        {"产品名称：华为 ","15.7寸 ","内存5G","3","3454","10362"},
				        {"产品名称：联想  ","15.8寸 ","内存6G","4","3454","13816"},
				        {"产品名称：华硕 ","15.9寸","内存7G","5","3454","17270"},
				        {"产品名称：dell","15.10寸","内存8G","6","3454","20724"},
				        {"产品名称：hp","15.11寸","内存9G","7","3454","24178"}
				       };
		int i=0,a;
		int avg1=(6908+10362+13816+17270+24178)/6;
		String avg=""+avg1;
		System.out.println("平均值为："+avg);
		 a=(int)(Math.round(Math.random()*5)); 
		 for(i=0;i<6;i++) {
			 System.out.printf("%7s",cp[a][i]);
			 
		 }
		 System.out.printf("\n");
		 if(Integer.parseInt(cp[a][5])>avg1) 
		 {
			 cp[a][5]=avg;
		 }else {
			 
			int c1=(int)(Math.round(Math.random()));
			String c=""+c1;
			cp[a][5]=c;
		 }
		 for(i=0;i<6;i++) {
			 System.out.printf("%7s",cp[a][i]);
		 } 
      
	}
       
}
