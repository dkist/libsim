package com.simmachines.libsim.r01.vector;

import com.diapai.ramiel.RA;
import com.simmachines.libsim.enc.vector.L1;
import com.simmachines.libsim.r01.abst.AbstractVector;

/**
 * [L1 distance]
 * <p>
 * :: The L1 distance is a metric where the distance between two points is the sum of the absolute differences of their coordinates.
 * <p>
 * @see com.simmachines.libsim.enc.vector.L1
 * @author Arnoldo Jose Muller-Molina
 */


public class RAL1 extends AbstractVector{
		
		public RAL1(){
				
		}
		
		public RAL1(double[] vector){
			super(vector);
		}
		
		/**
		 * Parse a vector from a tab separated list of values. 
		 * @param line
		 */
		public RAL1(String line){
				super(line);
		}
		
		
		/**
		 * Clone must be implemented by all classes. 
		 */
		@Override
				public Object clone() {	
				return new RAL1(cloneHelper());
		}
		
		
		@Override
				public Double distance(RA<Double> other) {
				return L1.distance(getVector(), ((RAL1)other).getVector());
		}
		
}
