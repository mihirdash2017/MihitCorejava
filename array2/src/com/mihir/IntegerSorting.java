package com.mihir;

public class IntegerSorting {

	public static void main(String[] args) {
		int a[]= {2,4,3,5,8,78,45,34};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.println("acessding order :");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
