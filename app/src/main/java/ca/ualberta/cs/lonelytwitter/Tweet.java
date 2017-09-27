/*
 * Tweet
 *
 * September 26 2017
 *
 * Copyright (c) 2017. Team X - COMPUT 301. University of Alberta - All rights reserved.
 * You may use, distribute, or modify thise code under terms and conditions of the Code of
 * Student Behavior at University of Alberta. You may find a copy of this license in this
 * project. Otherwise please contact barboza@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author barboza
 * @see NormalTweet, ImportantTweet
 */
public abstract class Tweet {

    private String message;
    private Date date;

    /**
     * Constructs a tweet object.
     * @param message the tweet message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs a tweet object
     * @param message the tweet message
     * @param date the tweet date
     */
    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     * Checks whether a tweet is important.
     * @return true or false
     */
    public abstract Boolean isImportant();


    /**
     * Sets the tweet message.
     * @param message the tweet message
     * @throws TweetTooLongException when tweet message is too long
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     * Gets the tweet message.
     * @return the tweet message
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * Gets the tweet date.
     * @return the tweet date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set the tweet date.
     * @param date the tweet date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Represent a tweet object as a string.
     * @return a string describing the tweet
     */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
