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

    /** Registered components **/
    private static final Map<Class<?>, Object> COMPONENTS = new ConcurrentHashMap<>();

    /**
     * Register a component with the given class type and instance
     *
     * @param clazz the interface on the api side that is annotated with {@link PrismarinComponent}
     * @param instance
     * @param <T>
     * @throws IllegalArgumentException = when instance is not annotated with {@link PrismarinComponent}
     */
    public static <T> void registerComponent(Class<?> clazz, @NonNull T instance) throws IllegalArgumentException {
        if(!clazz.isAnnotationPresent(PrismarinComponent.class)) {
            throw new IllegalArgumentException("Missing PrismarinComponent annotation for: " + clazz.getSimpleName());
        }
        COMPONENTS.put(clazz, instance);
    }

    /**
     * Get component by class typr (mostly interface)
     *
     * @param component
     * @return
     * @param <T> returns the instance that is registered for this clazz type
     */
    public static <T> T getComponent(Class<?> component) {
        Object instance = COMPONENTS.get(component);
        return (T) instance;
    }

    /**
     * Check if a class type is registered as a component
     *
     * @param component
     * @return
     */
    public static boolean existsComponent(Class<?> component) {
        return COMPONENTS.containsKey(component);
    }
}
