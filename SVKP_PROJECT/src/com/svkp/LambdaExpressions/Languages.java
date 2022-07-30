package com.svkp.LambdaExpressions;

import java.util.Set;

public class Languages {

	public static void main(String[] args) {
		Set languages=Set.of("java","Ruby","python","C");
		languages.forEach(language->System.out.println("Language is:"+language));
		
	}

}
