package DSA;

import java.util.*;

public class GroupAnagrams {

    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

        public static void main(String[] args) {
            System.out.println("Try programiz.pro");
            String[] inputs = new String[]{"cat", "dog", "act", "god", "tac", "bat"};
            System.out.println(groupAnagrams(inputs));

        }

        public static List<List<String>> groupAnagrams(String[] input){
            Map<String, List<String>> anagrams = new HashMap<>();

            for(String s: input){
                char[] word = s.toCharArray();
                Arrays.sort(word);
                String key = String.valueOf(word);
                if(anagrams.containsKey(key)){
                    anagrams.get(key).add(s);
                }else{
                    anagrams.put(key,
                            new ArrayList(List.of(s)));
                }

            }

            return new ArrayList<>(anagrams.values());

        }

}
