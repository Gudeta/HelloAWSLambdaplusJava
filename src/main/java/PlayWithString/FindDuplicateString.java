package PlayWithString;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateString {
    public static void main(String[] args) {
        System.out.println(findDuplicatesUsingMaps("Mississippi River"));  // Time complexity =o(nLog n )
        System.out.println(findDuplicatesUsingArrays("Mississippi River"));  // Time complexity =o(n)
        System.out.println(findDuplicatesUsingNestedForLoop("Mississippi River"));  //Time complexity =o(n2)
    }
    private static Set<Character> findDuplicatesUsingMaps(String myInputString){
        Set<Character> duplicates= new LinkedHashSet<>();
        HashMap<Character,Integer> countMap= new HashMap<>();
        for(int i=0; i< myInputString.length(); i++) {
            if (countMap.containsKey(myInputString.charAt(i))) {
                countMap.put(myInputString.charAt(i), countMap.get(myInputString.charAt(i)) + 1); //where duplicate char catched
            } else {
                countMap.put(myInputString.charAt(i), 1); //first char

            }
        }
            //loop thr map to get deplicate print
            for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() > 1)
                    duplicates.add(entry.getKey());
            }
            return duplicates;

    }
    private static Set<Character> findDuplicatesUsingArrays(String myInputString){
        Set<Character> duplicates= new LinkedHashSet<>();
        int[] arrayForChar= new int[256];
        for (int i=0; i<myInputString.length(); i++) {   //o(n)
            arrayForChar[myInputString.charAt(i)] =arrayForChar[myInputString.charAt(i)] +1;

            for(int k=0; k< 256; k++){   //o(n)   time complexity id fine but space complexity not that good bc most of bit is wasted
                if (arrayForChar[k] >1){
                    duplicates.add((char) k);
                }
            }
        }
        return duplicates;
        }
    private static Set<Character> findDuplicatesUsingNestedForLoop(String myInputString){
        Set<Character> duplicates= new LinkedHashSet<>();
        for (int i=0; i<myInputString.length(); i++){
            for (int j =i+1; j<myInputString.length();j++){
                if(myInputString.charAt(i) ==myInputString.charAt(j)){
                    duplicates.add(myInputString.charAt(j));
                }
            }
        }

        return duplicates;
    }
}
