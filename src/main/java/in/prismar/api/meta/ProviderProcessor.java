package in.prismar.api.meta;

import in.prismar.api.PrismarinApi;
import in.prismar.library.meta.MetaEntity;
import in.prismar.library.meta.MetaRegistry;
import in.prismar.library.meta.processor.AbstractMetaProcessor;
import in.prismar.library.meta.processor.MetaProcessorPhase;

import java.lang.reflect.Field;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
public class ProviderProcessor extends AbstractMetaProcessor {

    public ProviderProcessor(MetaRegistry registry) {
        super(registry, MetaProcessorPhase.INJECTION);
    }

    @Override
    public void process(Class<?> target) throws Exception {
        MetaEntity self = getRegistry().getEntity(target);
        for(Field field : target.getDeclaredFields() ) {
            Class<?> type = field.getType();
            if(!field.isAnnotationPresent(Provider.class)) {
                continue;
            }
            if(PrismarinApi.existsProvider(type)) {
                boolean success = field.trySetAccessible();
                if(success) {
                    field.set(self.getInstance(), PrismarinApi.getProvider(type));
                }
            }
        }
    }
}
