public class SelectSort {
	public static void main(String[] args){
		int[] fisArray=new int[]{15,11,1,3,8};
		
		SelectSort.selectSort(fisArray);
	
	}
	
	public static void selectSort(int[]fisArray){
		int temp=0;
		
		for(int i=0; i<fisArray.length-1;i++){
			for(int j=i; j<fisArray.length-1;j++){
				if(fisArray[i]>fisArray[j+1]){
					temp=fisArray[i];
					fisArray[i]=fisArray[j+1];
					fisArray[j+1]=temp;
			}
		}
		}
		
		for(int val:fisArray){
			System.out.println(val);
	}
}
}
