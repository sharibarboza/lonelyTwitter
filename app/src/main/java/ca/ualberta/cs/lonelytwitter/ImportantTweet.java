/*
 * ImportantTweet
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
 * Represents an important tweet.
 *
 * @author sharidanbarboza
 * @see Tweet
 */
public class ImportantTweet extends Tweet implements Tweetable {

    /**
     * Constructs an important tweet object.
     * @param message the tweet message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs an important tweet object.
     * @param message the tweet message
     * @param date the tweet date
     */
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Sets an important tweet as important.
     * @return true
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
