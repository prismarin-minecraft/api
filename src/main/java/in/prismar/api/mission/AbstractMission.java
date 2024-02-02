package in.prismar.api.mission;

import lombok.Getter;
import org.bukkit.Material;

@Getter
public abstract class AbstractMission implements Mission {

    private final String id;
    private final MissionType type;
    private final Material icon;
    private final String title;

    private final int maxStage;

    public AbstractMission(String id, MissionType type, int maxStage, Material icon, String title) {
        this.id = id;
        this.type = type;
        this.icon = icon;
        this.title = title;
        this.maxStage = maxStage;
    }
}
