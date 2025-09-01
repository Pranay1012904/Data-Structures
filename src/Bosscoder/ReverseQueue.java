package Bosscoder;

import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> input=new LinkedList<>();
        input.add(1); input.add(2); input.add(3); input.add(4);
        List<Integer> list=new ArrayList<>();
        //int i=0;
        Iterator it=input.iterator();
        while(it.hasNext()){
            list.add((Integer)it.next());

        }
        //List<Integer> l = Arrays.toList(arr);
        input.clear();
        for(int j=list.size()-1;j>=0;j--){
            input.add(list.get(j));
        }
        System.out.println("REVERSE::"+input);

    }


}
