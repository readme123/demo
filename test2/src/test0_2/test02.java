package test0_2;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
//��ӡ�˷��ھ���		
//	    int i,j;
//	    for(i=1;i<=9;i++)
//	    {
//	    	for(j=1;j<=9;j++)
//	    	{
//	    		System.out.printf("%d*%d  ",j,i);
//	           if(i==j)
//	    		break;	             			    		
//	    	}    	
//	    	 System.out.printf("\n");	 
//	    }
//	--------------------------------------------------    
//	    int sum=0;
//	    for(int a=100 ;a<=200;a++)
//	    {
//	    	sum+=a;
//	    }
//	    System.out.println(sum);
//-----------------------------------------------------------	
//�����Сд��ĸת����
			char a=0;
		   String sss= "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		   a=sss.charAt((int)(Math.random()*52));
		   System.out.printf("���ֵ��%c \n",a);
		   if(a>='a'&&a<='z')
		   {
			   System.out.printf("ת����%c",a-32); 			   
		   }
		   if(a>='A'&&a<='Z')
		   {
			   System.out.printf("ת����%c",a+32); 		   
		   }		   
//-----------------------------------------------------------------------	     
	        	    
	    
//	    String a[]= {"hudhaidhiwasd"};
//	    for(int i=0;i<a.length;i++)
//	    {
//	    	if(a[i]>='a'&&a[i]<='z')
//	    	{
//	    		
//	    		System.out.printf("%c",a[i]-32);
//	    	}
//	    	
//	    }
	    
	    
	    
	    
	    
	}	   
}
