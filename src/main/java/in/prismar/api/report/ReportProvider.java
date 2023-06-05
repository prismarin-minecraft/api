package in.prismar.api.report;

import in.prismar.api.PrismarinProvider;

/**
 * Copyright (c) Maga, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Maga
 **/
@PrismarinProvider
public interface ReportProvider {

    void deleteById(String id);
}
