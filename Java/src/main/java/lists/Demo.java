package lists;

import java.util.*;

public class Demo {



    public static void main(String[] args) {
        //just a little demo of how to use a few collections (Lists and Sets mostly)
        List<String> greetingList;
        String[] greetings = {"Hello", "Bonjour", "Hola", "Hallo", "Nihao"};
        greetingList = Arrays.asList(greetings);

        for(String greeting : greetingList){
            System.out.println(greeting);
        }

        System.out.println("Fourth element is:\t" +greetingList.get(3));

        List<String> newGreetingList = new ArrayList<>(greetingList);

        newGreetingList.add("Priviert");

        System.out.println("-- Elements in `newGretingList`: --");

        newGreetingList.add("Hello");
        Iterator<String> iter = newGreetingList.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }


        Set<String> greetingSet = new TreeSet<>(newGreetingList);
        greetingSet.add("Hola");
        for(String greeting : greetingSet){
            System.out.println("Unique greeting: " + greeting);
        }

        newGreetingList.add("Ahlan");
        if(greetingSet.containsAll(newGreetingList)){
            System.out.println("The Greeting Set has all the same elements as the greeting list.");
        }
        else {
            System.out.println("Something's missing from from the greetings set");
        }

        System.out.println("Size of set before removal:" + greetingSet.size());
        greetingSet.remove("Hallo");
        System.out.println("Size of set after removal:" + greetingSet.size());

    }
}
