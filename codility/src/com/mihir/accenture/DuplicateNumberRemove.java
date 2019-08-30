package com.mihir.accenture;

public class DuplicateNumberRemove {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,23,4,5,2,9};
		 boolean isDistinct = false;
		int size=a.length;
		for(int i=0;i<a.length;i++) {
			int j;
			for(j=0;j<i;j++) {
				if(a[i]==a[j]) {
					isDistinct = true;
					break;
				}
				
					
			}
			if(!isDistinct){
                System.out.print(a[i]+" ");
            }
		}
		
	}

}
