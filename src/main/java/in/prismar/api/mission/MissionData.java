package in.prismar.api.mission;

import lombok.Data;

@Data
public class MissionData {

    private long startTimestamp;
    private long resetTimestamp;

    private int stage;
    private long progress;
}
