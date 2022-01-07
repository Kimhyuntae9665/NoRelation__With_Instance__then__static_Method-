
public class 긴문자열안에서___작은문자열__유무 {
	
	public static boolean contains(String src,String target) { //왜 static Method()?
		
		return src.indexOf(target)!=-1;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));

	

	}
}
