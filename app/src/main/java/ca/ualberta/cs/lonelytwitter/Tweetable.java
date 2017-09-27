/*
 * Tweetable
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
 * Makes a tweet object tweetable.
 */
public interface Tweetable {
    String getMessage();
    Date getDate();
}
