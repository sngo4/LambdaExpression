package Predicate;

import java.util.function.*;
public class SimplyPredicateTesting {

	public static void main(String[] args) {
		Predicate<String> strPredicate = s ->
			{ return s.equals("Predicate");};
			
		System.out.println(strPredicate.test("Predicate")); // true
	    System.out.println(strPredicate.test("Predicate Simple")); // false
	    
	    Predicate<Integer> intPredicate = i ->
		{ return i > 0;};
		
	System.out.println(intPredicate.test(1000)); // true
    System.out.println(intPredicate.test(-999)); // false
    
    //AND 
    Predicate<String> andPredicate = strPredicate.and(s -> s.contains("e"));
    System.out.println(andPredicate.test("assd")); // false
    
    //OR
    Predicate<String> orPredicate = strPredicate.or(s -> s.contains("e"));
    System.out.println(orPredicate.test("etdw")); // true
    
    //Negate
    Predicate<String> negatePredicate = strPredicate.negate();
    System.out.println(negatePredicate.test("etdw")); // true
    
    //MIX
    Predicate<String> mixPredicate = strPredicate.and(orPredicate).or(negatePredicate);
    System.out.println(mixPredicate.test("etdw")); // true
    

	}

}
