package guimodule;

public class Airport {
	
	private String city;
	private String country;
	private String code3;
	
	
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public String getCode3() {
		return code3;
	}
	
	
	public static void main(String[] args) {
		
		Airport[] airports = new Airport[7];
		int[] arr = {76,7,2,3,5,123,57,2,1,45};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	
		insertionSort(arr);
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}

	public static String findAirportCode(String toFind, Airport[] airports) {
		
		int i = 0;
		int length = airports.length;
		
		while(i<length) {
			Airport a = airports[i];
			if(toFind.equals(a.getCity())) {
				return a.getCode3();
			}
			i++;
		}
		return "The City Cannot Find";
	}
	
	 public static String findAirportCodeBS(String toFind, Airport[] airports) {
		 
		 int low = 0;
		 int high = airports.length - 1;
		 int mid;
		 while (low<=high) {
			 mid = low +((high-low) / 2);
			 int compare = toFind.compareTo(airports[mid].getCity());
			 if(compare < 0) {
				 high = mid - 1;
			 }
			 else if(compare > 0) {
				 low = mid + 1;
			 }
			 else {
				 return airports[mid].getCode3();			 }
		 }
		 
		return "The City Cannot Find";
		 
	 }
	 
	 public static void selectionSort(int[ ] vals) {
		 
		 for(int i = 0; i<vals.length; i++) {
			 int indexMin = i;
			 for(int j = i+1;j<vals.length;j++) {
				 if(vals[j] < vals[indexMin]) {
					 indexMin = j;
				 }
			 }
			 swap(vals, indexMin, i);
		 }
		 
		 
	 }
	private static void swap(int[] vals, int indexMin, int i) {
		// TODO Auto-generated method stub
		int temp;
		temp = vals[i];
		vals[i] = vals[indexMin];
		vals[indexMin] = temp;
		
	}
		 
	
	public static void insertionSort(int[] vals) {
		int currInd;
		for(int pos = 1; pos< vals.length; pos++) {
			currInd=pos;
			while(currInd>0 && vals[currInd] < vals[currInd-1]) {
				swap(vals, currInd, currInd-1);
				currInd-=1;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	

}
