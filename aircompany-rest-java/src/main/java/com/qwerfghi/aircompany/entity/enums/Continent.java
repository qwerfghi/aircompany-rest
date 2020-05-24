package com.qwerfghi.aircompany.entity.enums;

public enum Continent {

    ASIA("ASIA"),
    EUROPE("EUROPE"),
    NORTH_AMERICA("NORTH AMERICA"),
    AFRICA("AFRICA"),
    OCEANIA("OCEANIA"),
    ANTARCTICA("ANTARCTICA"),
    SOUTH_AMERICA("SOUTH AMERICA");

    private final String name;

    Continent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
