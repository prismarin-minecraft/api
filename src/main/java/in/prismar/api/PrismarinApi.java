package in.prismar.api;

import lombok.NonNull;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
public final class PrismarinApi {

    /** Registered providers **/
    private static final Map<Class<?>, Object> PROVIDERS = new ConcurrentHashMap<>();

    /**
     * Register a provider with the given class type and instance
     *
     * @param clazz the interface on the api side that is annotated with {@link PrismarinProvider}
     * @param instance
     * @param <T>
     * @throws IllegalArgumentException = when instance is not annotated with {@link PrismarinProvider}
     */
    public static <T> void registerProvider(Class<?> clazz, @NonNull T instance) throws IllegalArgumentException {
        if(!clazz.isAnnotationPresent(PrismarinProvider.class)) {
            throw new IllegalArgumentException("Missing PrismarinProvider annotation for: " + clazz.getSimpleName());
        }
        PROVIDERS.put(clazz, instance);
    }

    /**
     * Get provider by class type (mostly interface)
     *
     * @param provider
     * @return
     * @param <T> returns the instance that is registered for this clazz type
     */
    public static <T> T getProvider(Class<?> provider) {
        Object instance = PROVIDERS.get(provider);
        return (T) instance;
    }

    /**
     * Check if a class type is registered as a provider
     *
     * @param provider
     * @return
     */
    public static boolean existsProvider(Class<?> provider) {
        return PROVIDERS.containsKey(provider);
    }
}
