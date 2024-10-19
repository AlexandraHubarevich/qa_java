package com.example;
import java.util.List;


public class Alex extends Lion {

    public Alex(Feline feline) throws Exception {
        super("Самец",feline);
    }

    public List<String> getFriends() {
        List<String> AlexFriends = List.of("Zebra: Marty", "Hippopotamus: Gloria", "Giraffe: Melman");
        return AlexFriends;
    }

    public String getPlaceOfLiving() {
        return "New York Zoo";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}