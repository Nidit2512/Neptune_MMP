package JavaAssignments;

public class DuplicateCharacter_String {

	public static void main(String[] args) {
		String str = "GeeksforGeeks";
		int cnt = 0;
		
		char[] inp = str.toCharArray();
		System.out.println("Duplicate Character are:");
		
		for(int i=0; i< str.length(); i++) {
			for(int j = i+1; j< str.length(); j++) {
				
				if(inp[i] == inp[j]) {
					
					System.out.println(inp[j]);
					cnt++;
					break;
				}
			}
		}

	}

}
