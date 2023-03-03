package com.jobrotation.main;

import com.jobrotation.sequences.Sequences;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequences sequences = new Sequences();
		int quant = 10;
		 //first sequence
//		System.out.println("Números ímpares");
//		sequences.sequenceA(quant);
		
		//second sequence
//		System.out.println("progressão geométrica");
//		sequences.sequenceB(quant);
		
		
		//third sequence
//		System.out.println("quadrado perfeito");
//		sequences.sequenceC(quant);
		
		//fourth sequecence
//		System.out.println("potenciação ");
//		sequences.sequenceD(quant);
		
		//fifth sequecence
		System.out.println("soma do antepenúltimo com o penultimo");
		sequences.sequenceE(quant);
	}

}
