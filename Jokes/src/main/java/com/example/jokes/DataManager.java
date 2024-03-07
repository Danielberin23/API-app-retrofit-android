package com.example.jokes;

import java.util.ArrayList;

public class DataManager {
    public static  ArrayList<Joke> generateDB(){
        ArrayList<Joke>  jokes = new ArrayList<>();

        jokes.add(new Joke()
                .setJoke("Chuck Norris can divide by zero")
                .setCategory("Math")
        );
        jokes.add(new Joke()
                .setJoke("Why was the math book sad? Because it had too many problems.")
                .setCategory("Math")
        );
        jokes.add(new Joke()
                .setJoke("Parallel lines have so much in common. It's a shame they'll never meet.")
                .setCategory("Math")
        );
        jokes.add(new Joke()
                .setJoke("Why did the two fours skip lunch? Because they already eight (ate)")
                .setCategory("Math")
        );
        jokes.add(new Joke()
                .setJoke("When Chuck Norris enters a room, he doesn't turn the lights on. He turns the dark off")
                .setCategory("Light")
        );

        jokes.add(new Joke()
                .setJoke("Chuck Norris can slam a revolving door")
                .setCategory("Strength")
        );
        jokes.add(new Joke()
                .setJoke("Chuck Norris counted to infinity. Twice")
                .setCategory("Counting")
        );
        jokes.add(new Joke()
                .setJoke("Seven eight (ate) nine because seven was scared of six!")
                .setCategory("Counting")
        );

        jokes.add(new Joke()
                .setJoke("The calendar was sad because its days were numbered!")
                .setCategory("Counting")
        );
        jokes.add(new Joke()
                .setJoke("Chuck Norris can hear sign language")
                .setCategory("Hearing")
        );
        jokes.add(new Joke()
                .setJoke("Chuck Norris can hear sign language")
                .setCategory("Hearing")
        );



        return jokes;
    }



}
