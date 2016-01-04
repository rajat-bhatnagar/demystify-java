package com.thoughtworks.corejava.temp;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/**
 * Created by rajatbhatnagar on 1/3/16.
 * This class does the sum of two vectors a1,a2, up to a^n and b1 , b2 uu tp b^n
 * Output is a1 * b1 + a2 * b2 + _______ + a^n * b^n
 */
public class ComputeDotProductOfVectors {
    public static void main(String[] args) {
        List<Double> aElements = Arrays.asList(1.0,2.0,5.0,7.0);
        List<Double> bElements = Arrays.asList(1.0,2.0,6.0,8.0);
        ComputeDotProductOfVectors obj = new ComputeDotProductOfVectors();
        System.out.println("Dot Product of Vectors :: "+obj.dotProductOfVectors(aElements,bElements));
    }

    public double dotProductOfVectors(List<Double> vectorA , List<Double> vectorB){
        double sum = 0;
        if(vectorA.size() != vectorB.size()){
            throw new IllegalArgumentException("Sizes of Vectors are not equal , Cannot compute product");
        }
        Iterator<Double> iteratorA = vectorA.iterator();
        Iterator<Double> iteratorB = vectorB.iterator();
        assert iteratorA.hasNext() && iteratorB.hasNext();
        while(iteratorA.hasNext()){
            sum += iteratorA.next() * iteratorB.next();
        }
        assert !iteratorA.hasNext() && !iteratorB.hasNext();
        return sum;
    }
}
