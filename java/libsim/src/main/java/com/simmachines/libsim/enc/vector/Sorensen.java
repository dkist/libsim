package com.simmachines.libsim.enc.vector;

import com.simmachines.libsim.asserts.Asserts;

/**
 * [Sorensen distance]
 * <p>
 * :: The Sorensen is a distance on \( \mathbb{R}^n \) in data analysis for numerical data.
 * <p>
 * [Definition]
 * <p>
 
 
 The Sorensen distance between two vectors \(a,b\) is given by:
 <p>
 \( d= \frac{\sum|a_i-b_i|}{\sum(a_i+b_i)} \)
 
 
 * 
 * <p>
 * [Reference]
 * <p>
 * Deza, Michel Marie, Deza, Elena :: [Encyclopedia of Distances] :: Springer |
 * 2009
 * <p>
 * | 17.1 :: Similarities and distances for numerical data :: P.300 |
 * 
 * @author Jose Daniel Salazar-Vargas
 * 
 */


public class Sorensen {

	/**
	 * Received two double vectors and calculates the Sorensen distance.
	 * @param v1 vector number 1.
	 * @param v2 vector number 2.
	 * @return The Sorensen distance.
	 */
	public static double distance(double[] v1,double[] v2){
		Asserts.assertEqualLength(v1, v2);
		Asserts.assertGreaterOrEqualThanValue(v1, 0);
		Asserts.assertGreaterOrEqualThanValue(v2, 0);
		Asserts.assertHasAllZeros(v1);
		Asserts.assertHasAllZeros(v2);
		double sumNum = 0;
		double sumDenom = 0;
		for(int i=0;i<v1.length;i++){
			sumNum += Math.abs(v1[i] - v2[i]);
			sumDenom += v1[i] + v2[i];
		}
		return sumNum/sumDenom;
	}
	
}
