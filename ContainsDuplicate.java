package DSA;

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println((checkContainsDuplicate(new int[]{1,3,4,4,8,9})));
    }

    public static boolean checkContainsDuplicate(int[] input){
        if(input.length <= 1 ) return false;
        Set<Integer> seen = new HashSet<>();
        for(int value : input){
           if(seen.contains(value)) return true;
            seen.add(input[value]);
        }
        return false;
    };
}
