/*
 * NormalTweet
 *
 * September 16 2017
 *
 * Copyright (c) 2017. Team X - COMPUT 301. University of Alberta - All rights reserved.
 * You may use, distribute, or modify thise code under terms and conditions of the Code of
 * Student Behavior at University of Alberta. You may find a copy of this license in this
 * project. Otherwise please contact barboza@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a normal tweet.
 *
 * @author sharidanbarboza
 * @see Tweet
 */
public class NormalTweet extends Tweet {

    /**
     * Constructs a normal tweet.
     * @param message the tweet message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructs a normal tweet.
     * @param message the tweet message
     * @param date the tweet date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Sets a normal tweet as non important.
     * @return false
     */
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
