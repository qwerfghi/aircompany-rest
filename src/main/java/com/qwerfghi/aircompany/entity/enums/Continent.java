package com.qwerfghi.aircompany.entity.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Continent {
    ASIA,
    EUROPE,
    @JsonProperty("NORTH AMERICA")
    NORTH_AMERICA,
    AFRICA,
    OCEANIA,
    ANTARCTICA,
    @JsonProperty("SOUTH AMERICA")
    SOUTH_AMERICA
}
