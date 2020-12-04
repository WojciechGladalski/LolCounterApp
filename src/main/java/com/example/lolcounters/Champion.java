package com.example.lolcounters;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor

public class Champion {

    private Integer id;
    private String name;
    private String title;

    private List<Integer> countersIds;
    private List<Integer> goodMatchupIds;

    @Override
    public String toString() {
        return getName() + " " + getTitle();

    }

    public String getImagePath() {

        return "/squares/" + name + "Square.png";
    }
    public String getLscreenPath() {

        return "/Loading screeny/LoadingScreen"+name+".jpg";
    }


}
