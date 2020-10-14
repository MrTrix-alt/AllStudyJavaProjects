package learning.java.streamapi.upperbase.operations.findanyfirst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindAnyFirst
{
    public static void main(String[] args)
    {
        List<String> nameList = new ArrayList<>();
        Collections.addAll(nameList, "Tim", "Max", "Fedor", "Alex");
        Stream<String> nameStream = nameList.stream();
        Optional<String> optionalName = nameStream.sorted().findFirst();
        String foundName = optionalName.get();
        System.out.println("\nFound name is: " + foundName);
    }
}
