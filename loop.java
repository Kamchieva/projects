package EachLoop;

import java.util.ArrayList;

public class loop {
    public static void main(String[] args) {
        //String[] animals = {"cat", "dog", "fish", "bird"};

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("monkey");
        
        for(String i : animals){
            System.out.println(i);
        }
    }
}
