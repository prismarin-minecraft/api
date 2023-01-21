package in.prismar.api.user;

import in.prismar.api.user.data.SeasonData;
import in.prismar.api.user.data.UserData;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
public interface User {

    /**
     * Get global data
     *
     * @return {@link UserData}
     */
    UserData getData();

    /**
     * Get current season data (it will create the current one if not found)
     *
     * @return {@link SeasonData}
     */
    SeasonData getSeasonData();

    /**
     * Wait for a given time (timestamp) (non-blocking)
     *
     * @param key
     * @param millis
     * @return
     */
    boolean wait(String key, long millis);

    /**
     * Set a local cached key-value tag
     *
     * @param key
     * @param value
     */
    void setTag(String key, Object value);

    /**
     * Remove a tag
     *
     * @param key
     */
    void removeTag(String key);

    /**
     * Get a tag by key
     *
     * @param key
     * @param <T>
     * @return
     */
    <T> T getTag(String key);

    /**
     * Check if a tag exists
     *
     * @param key
     * @return
     */
    boolean containsTag(String key);

    /**
     * Check if a timestamp is available by time
     * Saved as a until timestamp
     *
     * @param key
     * @return
     */
    boolean isTimestampAvailable(String key);

    /**
     * Get until timestamp by key
     *
     * @param key
     * @return
     */
    long getTimestamp(String key);

    /**
     * Set until timestamp by ket
     *
     * @param key
     * @param until
     */
    void setTimestamp(String key, long until);

    /**
     * Check if local cached timestamp is available
     * if not automatically add it with the given until timestamp
     *
     * @param key
     * @param until = timestamp
     * @return
     */
    boolean isLocalTimestampAvailable(String key, long until);

    /**
     * Check if local cached timestamp is available
     *
     * @param key
     * @return
     */
    boolean isLocalTimestampAvailable(String key);

    /**
     * Get local cached timestamp
     *
     * @param key
     * @return = 0 if key does not exists
     */
    long getLocalTimestamp(String key);

    /**
     * Set local cached timestamp
     *
     * @param key
     * @param until
     */
    void setLocalTimestamp(String key, long until);
}
