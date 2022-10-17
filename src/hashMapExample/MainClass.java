package hashMapExample;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Map<String,Integer>map = new HashMap<String,Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext())  {
			String tmp = iterator.next();
			if(maxScore < map.get(tmp))  {
				maxScore = map.get(tmp);
				name = tmp;
			}
			totalScore += map.get(tmp);
			
		}
		
		System.out.println("평균점수 : " + (double) totalScore / map.size());
		System.out.println("최고점수 : " + maxScore);
		System.out.println("최고점수를 받은 아이디 : " + name);
		
	}

}
