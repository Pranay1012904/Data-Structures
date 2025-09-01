package Algorithms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Hashset {

    public static void main(String[] args) {
        List<Integer> iList=List.of(1,2,3,4,2,6,7,5,9);
        hSImpl(iList);
    }

    public static void hSImpl(List<Integer> iList){
        Set<Integer> hs=new HashSet<>(iList);
        Iterator it=hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(hs);
    }
}
