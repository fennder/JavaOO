package atividades.unidade4.collection.factory;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactory {

	public static void main(String[] args) {
		
		//List;of()
		List<String> list = List.of("Banana", "Maçã", "Pera");
		System.out.println(list);
		
		//Set.of()
		Set<Integer> set = Set.of(1,2,3,4,5,6);
		//set.add(6);
		System.out.println(set);
		
		//Map.of()
		Map<String, Integer> map = Map.of("um",1, "dois", 2, "três", 3);
		System.out.println(map);

	}

}
