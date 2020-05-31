package wooteco.subway.admin.dto;

import wooteco.subway.admin.domain.Station;

public class StationCreateRequest {
    private String name;

    private StationCreateRequest() {
    }

    public StationCreateRequest(String name) {
        this.name = name;
    }

    public Station toStation() {
        return new Station(name);
    }

    public String getName() {
        return name;
    }
}