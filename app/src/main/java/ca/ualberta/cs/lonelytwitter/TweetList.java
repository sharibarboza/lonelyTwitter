package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetList {
    // Make declaration to have a final modifier
    final private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){

    }

    public Tweet getTweet(){
        // Actual value of parameter "index" is always "0"
        return tweets.get(0);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void add(Tweet tweet) {
        tweets.add(tweet);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }
}
