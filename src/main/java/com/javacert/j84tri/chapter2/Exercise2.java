package com.javacert.j84tri.chapter2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import org.apache.commons.lang3.RandomStringUtils;

public class Exercise2 {
	
	public static final Integer LENGTH = 5;
	
	
	public static void main(String... args){
		
		Random ran = new Random();
		List<String> words = new ArrayList<String>();
		for (int i = 0; i< 100000; i++){
			int count = ran.nextInt(10);
			words.add(RandomStringUtils.randomAlphabetic(count));
		}
		
		long start = (new Date()).getTime();
		Stream<String> wordsStream = words.stream().peek(System.out::println).limit(5).filter(w -> w.length() == LENGTH);
		long end = (new Date()).getTime();
		System.out.println("elapsed time: " + (end-start));
		System.out.println("number of words with length " + LENGTH + ": " + wordsStream.count());
		
	}

}
