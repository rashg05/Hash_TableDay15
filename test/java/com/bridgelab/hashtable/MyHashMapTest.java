package com.bridgelab.hashtable;

import org.junit.Test;
import org.junit.Assert;

public class MyHashMapTest {
	@Test
	public void givenASentenceWhenWordsAreAddedToListShouldReturnWordFrequency() {
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> myHashMap= new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = myHashMap.getValue(word);
			if(value == null)
				value = 1;
			else
				value += 1;
			myHashMap.add(word, value);
		}
		int frequency = myHashMap.getValue("to");
		System.out.println(myHashMap);
		Assert.assertEquals(2, frequency);
	}
}
