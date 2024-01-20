package tricyprogramRelatedString;

public class DuplicateFind {
	public static void main(String[] args) {
		String name="Man Singhg";
		int count =0;
		char[] chArray=name.toCharArray();
		for(int i=0;i<chArray.length;i++) {
			for(int j=i+1;j<chArray.length;j++) {
				if(chArray[i]==chArray[j] && chArray[j]!=' ') {
					count=count+1;
					System.out.println("Duplicate character-"+chArray[i]);
					break;
								
				}
				
			}
			
		}
		System.out.println("duplicate count :-"+count);
		
	}

}
