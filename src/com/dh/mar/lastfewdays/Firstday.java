package com.dh.mar.lastfewdays;
/**
 * 
 * @author admin-DH
 *
 */
public class Firstday {
	public static void main(String[] args) {
	 	//int[] a = {22,25,14,3,74,1,85,77,102,3,8};
		int[] a = {4,3,2,1};
	 	Firstday.Compare(a);
	 	for(int s:a){
	 		System.out.println(s);
	 	}
	}
	public static void Compare(int[] a){
		
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
		/**
		 * Ϊʲô��Ҫ�м�ֵ��ʱ�洢ջ��ַ�����û����ô�����
		 */
//					temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
					a[j]=a[j+1];
					a[j+1]=a[j];
					
				}
				System.out.println(a[j]);
				
			}
				
		}
	}
}
