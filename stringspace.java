package firstpackage;

public class stringspace {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="besant	technologies tambaram";
		int count=0;
		
		for(int i=10;i<name.length();i++) {
			if(name.charAt(i) == ' ') 
			{
				count++;
			}
			
		}
		System.out.println("Number of the space in string:"+count);
		
	}

}
