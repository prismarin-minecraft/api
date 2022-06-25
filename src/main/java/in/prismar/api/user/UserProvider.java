package in.prismar.api.user;

import in.prismar.api.PrismarinProvider;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface UserProvider<U extends User> {

    /**
     * Load user (if user does not exists, it will create one)
     * It will also cache the user locally
     *
     * @param uuid {@link UUID}
     * @return
     */
    U load(UUID uuid);

    /**
     * Load user async
     *
     * @param uuid {@link UUID}
     * @return
     */
    CompletableFuture<U> loadAsync(UUID uuid);

    /**
     * Unload cached user that is registered by UUID
     *
     * @param uuid {@link UUID}
     */
    void unload(UUID uuid);

    /**
     * Unload cache completely (meaning all User cached will be removed)
     *
     */
    void unloadAll();

    /**
     * Get user by UUID, it can return also the cached one
     *
     * @param uuid {@link UUID}
     * @return
     */
    U getUserByUUID(UUID uuid);

    /**
     * Check if user exists by UUID
     *
     * @param uuid {@link UUID}
     * @return
     */
    boolean existsUserByUUID(UUID uuid);

    /**
     * Save user (persist)
     *
     * @param user {@link User}
     * @return
     */
    U save(U user);

    /**
     * Save user async (and delayed if true)
     *
     * @param user {@link User}
     * @param delayed User will be saved in n seconds,
     * @return
     */
    CompletableFuture<U> saveAsync(U user, boolean delayed);

    /**
     * Get database count of registered users
     *
     * @return
     */
    long getRegisteredCount();
}
