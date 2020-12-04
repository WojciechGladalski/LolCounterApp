package com.example.lolcounters.repositories;

import com.example.lolcounters.Champion;

import java.util.List;

public interface ChampionRepository {


    Champion getChampionById(Integer id);

    List<Champion> getAllChampions();
}
