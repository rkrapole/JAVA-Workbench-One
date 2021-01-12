package com.strings.examples;

public class EStringExample5BufferAndBuilderComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//**buffer - synchronised and thread safe - less performance, takes more time
		//**builder - not synchronised and not thread safe - more performance, takes less time
		
		long beginTime = System.currentTimeMillis();
		System.out.println("beginning time at stringBuffer: "+beginTime);
		StringBuffer p1 = new StringBuffer("ram");
		for (int i = 0; i < 100000; i++) {
			p1.append("krishna");
			//System.out.println(p1);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("ending time at stringBuffer: "+endTime);
		System.out.println("time taken for stringBuffer code execution: " +(endTime-beginTime));
		
		long beginTime1 = System.currentTimeMillis();
		System.out.println("beginning time at stringBuilder: "+beginTime1);
		StringBuilder p2 = new StringBuilder("ram");
		for (int i = 0; i < 100000; i++) {
			p2.append("krishna");
			//System.out.println(p2);
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("ending time at stringBuilder: "+endTime1);
		System.out.println("time taken for stringBuilder code execution: " +(endTime1-beginTime1));

	}

}
