package ca.ualberta.cs.lonelytwitter;

import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by sharibarboza on 2017-10-13.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    // Add tweet to a list of tweets
    public void addTweet(Tweet tweet) throws IllegalArgumentException {
        if (tweets.contains(tweet)) {
            throw new IllegalArgumentException();
        } else {
            tweets.add(tweet);
        }
    }

    // Get the list of tweets in chronologial order
    public ArrayList<Tweet> getTweets() {
        Collections.sort(tweets, new Comparator<Tweet>() {
            public int compare(Tweet tweet1, Tweet tweet2) {
                return tweet1.getDate().compareTo(tweet2.getDate());
            }
        });
        return tweets;
    }

    // Delete tweet from a list of tweets
    public void deleteTweet(Tweet tweet) {
        tweets.remove(tweet);
    }

    // Check if a list has the specified tweet
    // If it does, return true; otherwise return false
    public boolean hasTweet(Tweet tweet) {
        if (tweets.contains(tweet)) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    public Tweet getTweet(int pos) {
        return tweets.get(pos);
    }

    public int getCount() {
        return tweets.size();
    }

}
