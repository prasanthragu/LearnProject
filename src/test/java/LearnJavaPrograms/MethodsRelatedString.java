package LearnJavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class MethodsRelatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "This is the string count the duplicate string by using mapp";
		String[] s1=s.split(" ");
		int len=s1.length;
		Map<String, Integer> map=new HashMap<String,Integer>();
		int count;
		for (int i=0;i<len;i++) {
			if(map.containsKey(s1[i])) {
				count=map.get(s1[i]);
				map.put(s1[i], count+1);
			}
			else {
				map.put(s1[i], 1);
			}
		}
		
		System.out.println(map);
		for(Map.Entry<String, Integer> m:map.entrySet()) {
			System.out.println(m);
		}
		

	}

}
