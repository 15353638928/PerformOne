public class FirstCount {
	public static void main(String[] args) {
		String[] arr = "you are right? you are wrong? you are fin? you are better!".split(" ");
		Map<String, Integer> aMap = new HashMap<String, Integer>();
		for(String key:arr){
			if(!aMap.containsKey(key)){
				aMap.put(key, 1);	
			}else{
				aMap.put(key, aMap.get(key)+1);
			}
		}
		//第一种：普遍使用，二次取值
		System.out.println("通过Map.keySet遍历key和value：");
		for(String key:aMap.keySet()){
			System.out.println(key+"数字:"+aMap.get(key));
		}
		//第二种
		 System.out.println("通过Map.entrySet使用iterator遍历key和value：");
		 Iterator<Map.Entry<String, Integer>> iterator = aMap.entrySet().iterator();
		 while(iterator.hasNext()){
			 Map.Entry<String, Integer> entry = iterator.next();
			 System.out.println("key="+entry.getKey()+"   value="+entry.getValue());
		 }
		//第三种：推荐，尤其是容量大时
		  System.out.println("通过Map.entrySet遍历key和value");
		  for(Map.Entry<String, Integer> entry:aMap.entrySet()){
			  System.out.println("key="+entry.getKey()+"   value="+entry.getValue());
		  }
		//第四种
		  System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
		  for(Integer integer:aMap.values()){
			  System.out.println(integer);
		  }
	}
}
