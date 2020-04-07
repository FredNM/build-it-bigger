package com.frednm.jokeslibrary;

public class Joke {

    // Some jokes taken here https://short-funny.com/
    private static String[] jokes = {
            "I'm not lazy. I'm just naturally a very relaxed person.",
            "Doctor: You're obese." +"\n" + "Patient: For that I definitely want a second opinion."
            +"\n" + "Doctor: You're quite ugly, too.",
            "I've been single for so many years I believe I will soon become an album.",
            "I dreamed I was forced to eat a giant marshmallow. When I woke up, my pillow was gone.",
            "Stressed is just desserts spelled backwards.",
            "Where do pencils spend their vacations?" + "\n" + "In Pencilvania.",
            "An old grandma brings a bus driver a bag of peanuts every day."
            +"\n" + "First the bus driver enjoyed the peanuts but after a week of eating them he asked: \"Please granny, don't bring me peanuts anymore. Have them yourself.\"."
            +"\n" + "The granny answers: \"You know, I don't have teeth anymore. I just prefer to suck the chocolate around them.\"",
            "And where would you see yourself in five years' time Mr. Jeffries?"
            +"\n" + "Mr. Jeffries: \"Personally I believe my biggest weakness is in listening.\"",
            "All my life I thought air was for free. That was until I bought a bag of crisps.",
            "Of course you're not fat. Just grab a couple of chairs and come sit with us.",
            "He who wakes up early, yawns all day long.",
            "I Googled \"how to start a wildfire\"."
            + "\n" + "I got 48,500 matches.",
            "If you spent your day in a well, can you say your day was well-spent?",
            "Apparently taking a day off is not something you should do when you work for a calendar company.",
            "I wasn't that drunk yesterday."
            + "\n" + "Oh boy you took the shower head in your arms and told it to stop crying.",
            "Of course I should clean my windows. But privacy is important too.",
            "When my wife starts to sing I always go out and do some garden work so our neighbors can see there's no domestic violence going on."
    };

    // Read this https://www.geeksforgeeks.org/java-math-random-method-examples/
    private static int getRandomNumberBetweenMinMax(int min, int max){
        return (int)(Math.random()*(max-min) + min);
    }

    // Call outside to generate a Joke
    public static String getJoke(){
        return jokes[getRandomNumberBetweenMinMax(0, jokes.length-1)];
    }
}
