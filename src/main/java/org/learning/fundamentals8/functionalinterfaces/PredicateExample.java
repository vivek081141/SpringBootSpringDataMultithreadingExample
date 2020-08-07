/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.fundamentals8.functionalinterfaces;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public List<String> removeElement(List<String> list, String element) {
        list.removeIf( x -> x.equals(element));
        return list;
    }

    public boolean test(int var) {
        Predicate<Integer> predicate1 = x -> x > 10;
        Predicate<Integer> predicate2 = x -> x < 20;
        return predicate1.and( predicate2 ).test( var );
    }
}
