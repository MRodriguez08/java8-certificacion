package com.javacert.j84tri.chapter1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.javacert.j84tri.models.Person;

public class Exercise9 {
    
    

    public interface Collection2<T> extends Collection<T> {
        
        public default void forEachIf(Consumer<T> action, Predicate<T> filter){
            Objects.requireNonNull(action);
            for (T t : this) {
                if ( filter.test(t) ) 
                    action.accept(t);
            }
        }
        
    }

    public static void main(String... args) {
       
        /*
        Collection2<Person> people = (action, filter) -> {
            
        }; 
        */
        
    }

}