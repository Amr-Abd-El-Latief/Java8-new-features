package java8newfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        Stream<String> stream = stringList.stream();

        long count = stream
            .map((value) -> { return value.toLowerCase(); })
            .count();

        System.out.println("count = " + count);

        Stream<String> stream1 =  stringList.stream().map((value) -> { return value.toLowerCase(); })
        		  .map((value) -> { return value.toUpperCase(); })
        		  .map((value) -> { return value.substring(0,3); });
        
        Stream<String> longStringsStream =  stringList.stream().filter((value) -> {
            return value.length() >= 1;
        });
        
        
        // map
        
        List<String> list = new ArrayList<String>();
        Stream<String> stream2 = list.stream();

        Stream<String> streamMapped = stream2.map((value) -> value.toUpperCase());
  
    
    // flat map
        
        List<String> stringListFM = new ArrayList<String>();

        stringListFM.add("One flew over the cuckoo's nest");
        stringListFM.add("To kill a muckingbird");
        stringListFM.add("Gone with the wind");

        Stream<String> streamFM = stringListFM.stream();

        streamFM.flatMap((value) -> {
            String[] split = value.split(" ");
            return (Stream<String>) Arrays.asList(split).stream();
        })
        .forEach((value) -> System.out.println(value));
        
        
        // distinct stream 
        
        
        // distinct stream
        
        List<String> stringListDS = new ArrayList<String>();

        stringListDS.add("one");
        stringListDS.add("two");
        stringListDS.add("three");
        stringListDS.add("one");

        Stream<String> streamDS = stringListDS.stream();

        List<String> distinctStrings = streamDS
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctStrings);
        
        
        // Limit stream 
        
        List<String> stringListLS = new ArrayList<String>();

        stringListLS.add("one");
        stringListLS.add("two");
        stringListLS.add("three");
        stringListLS.add("one");

        Stream<String> streamLS = stringListLS.stream();
        streamLS
            .limit(2)
            .forEach( element -> { System.out.println(element); });    
        
        // peek stream
        
        List<String> stringListPS = new ArrayList<String>();

        stringListPS.add("abc");
        stringListPS.add("def");

        Stream<String> streamPS = stringListPS.stream();

        Stream<String> streamPeeked = streamPS.peek((value) -> {
            System.out.println("value");
        });
        
        
        
        
        
        
        
    }
    
   
}