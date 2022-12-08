package org.perscholas;

import org.perscholas.models.FireMonster;
import org.perscholas.models.Monster;
import org.perscholas.models.StoneMonster;
import org.perscholas.models.WaterMonster;

public class TestMonster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Monster m1 = new FireMonster("r2u2");
 Monster m2 = new WaterMonster("u2r2");  
 Monster m3 = new StoneMonster("r2r2"); 
 System.out.println(m1.attack()); 
 System.out.println(m2.attack()); 
 System.out.println(m3.attack()); 


	/*
	 * m1.attack(); m2.attack(); m3.attack();
	 */

Monster m4 = new Monster("u2u2");
//m4.attack();
System.out.println(m4.attack()); 
	}

}
