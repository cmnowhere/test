package filetest;

class statictest{
	public static String test;
	
	public void tt() {
		if(test==null) {
			test="123";
			System.out.println(test);
	}else {
		System.out.println("lkajsdlkfjasdlkf");
	}
//		else {
//			System.out.println(test);
//		}
}
}
	
public class test {
	
	public static void main(String[] args) {
//		File test = new File("C:/Users/마들/Documents/카카오톡 받은 파일");
//		File filename = new File("C:/Users/마들/Documents/카카오톡 받은 파일/lgCardDirect.zip");
//		String files[] = test.list();
//		
//		for(int i=0;i<files.length;i++) {
//			System.out.println(files[i]);
//		}
		String fileName="SQMS_TEST";
			
		String test = "   abcd wefwef eroihgjerh     ";
		String test2 = "   cccdw  ef";
		StringBuffer buf = new StringBuffer(1123);
		
		
	
		
		System.out.println(buf.append(test.replace(" ","")).append("|").append(test2.trim()));
	
//		statictest t = new statictest();
//		for(int i=0;i<3;i++) {
//			t.tt();
//		}
		
//		if(filename.isFile())
//			System.out.println("파일 존재");
	}
}
