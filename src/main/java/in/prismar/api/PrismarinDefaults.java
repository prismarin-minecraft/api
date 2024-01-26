package in.prismar.api;

import in.prismar.api.discord.DefaultDiscordProvider;
import in.prismar.api.discord.DiscordProvider;
import in.prismar.api.tournament.DefaultTournamentProvider;
import in.prismar.api.tournament.TournamentProvider;

public final class PrismarinDefaults {


    public static void registerDefaultProviders() {
        PrismarinApi.registerProvider(DiscordProvider.class, new DefaultDiscordProvider());
        PrismarinApi.registerProvider(TournamentProvider.class, new DefaultTournamentProvider());
    }

}
