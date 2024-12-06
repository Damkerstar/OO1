package ar.edu.unlp.objetos.uno.ejer16;

import java.util.HashSet;

public class EvenNumberSet<Integer> extends HashSet<Integer> {
	
	@Override
	public boolean add(Integer num) {
		if((int) num % 2 == 0) {
			super.add(num);
			return true;
		}
		return false;
	}
}
