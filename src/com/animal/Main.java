package com.animal;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        
       // Integer массивден жуп сандарды терип алынызда алардын квадраттарынын эн чонун табыныз
        Integer[]arr= {45,63,55,13,47,20,21,22,23,14,69,71};
        Stream.of(arr).filter(x->x%2==0).map(x->x*x).max(Integer::compare).ifPresent(System.out::println);
    }
}
