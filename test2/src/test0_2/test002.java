package test0_2;

public class test002 {

	public static void main(String[] args) {
		String cp[][]= {{"��Ʒ���ƣ�Mac","15.6�� ","�ڴ�4G","2","3454","6908"},
				        {"��Ʒ���ƣ���Ϊ ","15.7�� ","�ڴ�5G","3","3454","10362"},
				        {"��Ʒ���ƣ�����  ","15.8�� ","�ڴ�6G","4","3454","13816"},
				        {"��Ʒ���ƣ���˶ ","15.9��","�ڴ�7G","5","3454","17270"},
				        {"��Ʒ���ƣ�dell","15.10��","�ڴ�8G","6","3454","20724"},
				        {"��Ʒ���ƣ�hp","15.11��","�ڴ�9G","7","3454","24178"}
				       };
		int i=0,a;
		int avg1=(6908+10362+13816+17270+24178)/6;
		String avg=""+avg1;
		System.out.println("ƽ��ֵΪ��"+avg);
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
