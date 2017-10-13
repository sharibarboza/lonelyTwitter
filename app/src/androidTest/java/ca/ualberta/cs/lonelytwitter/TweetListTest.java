package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by sharibarboza on 2017-10-13.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);

        assertTrue(tweets.hasTweet(myTweet));
    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);
        tweets.deleteTweet(myTweet);

        assertFalse(tweets.hasTweet(myTweet));

    }


    public void testHasTweet() {
        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        assertFalse(tweets.hasTweet(myTweet));

        tweets.addTweet(myTweet);

        assertTrue(tweets.hasTweet(myTweet));
    }


    public void testGetTweet() {
        // takes an index, returns the tweet at that index

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        Tweet returnedTweet = tweets.getTweet(0);

        assertFalse(returnedTweet.getMessage() == myTweet.getMessage());
        assertFalse(returnedTweet.getDate() == myTweet.getDate());

        tweets.addTweet(myTweet);

        returnedTweet = tweets.getTweet(0);

        assertTrue(returnedTweet.getMessage() == myTweet.getMessage());
        assertTrue(returnedTweet.getDate() == myTweet.getDate());

    }

    public void testGetCount() {
        TweetList tweets = new TweetList();

        assertEquals(tweets.getTweets().size(), tweets.getCount());
    }

    public void testGetTweets() {
        TweetList tweets = new TweetList();

        for (int i = 0; i < tweets.getCount(); i++) {
            Tweet tweet = tweets.getTweet(i);
            Tweet nextTweet = tweets.getTweet(i+1);

            assertTrue(nextTweet.getDate().after(tweet.getDate()));
        }
    }
}
