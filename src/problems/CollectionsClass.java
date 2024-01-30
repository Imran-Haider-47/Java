package problems;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClass {

    public static void arrayListFnInt(){
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(5);
    numbers.add(10);
    numbers.add(9);
    numbers.add(10);
    for(Integer number: numbers){
        System.out.print(number+" ");
    }
    System.out.println("2 is present : "+ numbers.contains(2));
    System.out.println("Size of Array List is : "+ numbers.size());
    //numbers.remove(3);
        Collections.sort(numbers);
    for(Integer number1: numbers){
        System.out.print(number1+" ");
    }
    System.out.println("Size of Array List is : "+ numbers.size());

    }

    public static void arrayListFnStr(){
        ArrayList<String> arrayListStr = new ArrayList<>();
        arrayListStr.add("Haider");
        arrayListStr.add("Imran");
        arrayListStr.add("Ali");
        arrayListStr.add("abc");
        arrayListStr.add(3,"Ali");
        arrayListStr.set(4,"ALI");
        arrayListStr.add(arrayListStr.size(),"End");

        for(String data: arrayListStr){
            System.out.print(data+" ");
        }
        System.out.println("Size of String Array List is : "+ arrayListStr.size());

        arrayListStr.remove(3);
        for(String data: arrayListStr){
            System.out.print(data);
        }
        System.out.println("Size of array List string is : "+arrayListStr.size());

    }
}
