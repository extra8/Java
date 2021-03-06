package Tema;

import java.util.List;
import java.util.stream.Collectors;

public class Ex3 
{
	public static List<String> filteringQAndE(List<String> params, String letter)
	{ 
		return params.stream()
				.map(String::toUpperCase)
		        .filter(w -> w.length() < 4)
		        .filter(w -> w.contains(letter))
		        .collect(Collectors.toList());
	}
}
