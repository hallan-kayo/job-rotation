package com.jobrotation.sequences;

public class Sequences {
	
	public void sequenceA(int quant) {
		for( int num = 1 ; num <= quant ; num +=2 ) {
			System.out.println(num);
		}
	}
	
	public void sequenceB(int quant) {
		int anterior = 1, num;
		for( int i = 1 ; i <= quant ; i++ ) {
			num = anterior*2;
			anterior = num;
			System.out.println(num);
		}
	}
	
	public void sequenceC(int quant) {
		for( int i = 0 ; i < quant ; i++ ) {
			System.out.println(i*i);
		}
	}
	
	public void sequenceD(int quant) {
		int num = 0;
		for( int i = 2 ; i <= quant ; i++ ) {
			if( i % 2 == 0) {
				num = i*i;
				System.out.println(num);
			}
			
		}
	}
	
	public void sequenceE(int quant) {
		int antepenultimo = 0, penultimo = 1, num = 0;
		System.out.println(penultimo);
		for( int i = 1 ; i <= quant ; i++ ) {
			num = penultimo + antepenultimo;
			System.out.println(num);
			antepenultimo = penultimo;
			penultimo = num;	
		}
	}
	
	public void sequenceF(int quant) {
		
		int counter = 1;
		while(counter < quant) {
			
		}
	}

}
