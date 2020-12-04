package com.example.lolcounters;

import com.example.lolcounters.repositories.ChampionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HomeController {

    @Autowired
    ChampionRepository championRepository;

    @GetMapping("/")
    public String getHome(ModelMap map) {
        List<Champion> championList = championRepository.getAllChampions();
        map.put("champions", championList);
        return "home";
    }

    @GetMapping("/{id}")
    public String getChampion(ModelMap map, @PathVariable String id) {
        Champion champion = championRepository.getChampionById(Integer.valueOf(id));
        map.put("champion", champion);

        List<Champion> counters = champion.getCountersIds().stream()
                .map(counterId -> championRepository.getChampionById(counterId))
                .collect(Collectors.toList());
        map.put("counters", counters);

        List<Champion> goodMatchup = champion.getGoodMatchupIds().stream()
                .map(goodMatchupId -> championRepository.getChampionById(goodMatchupId))
                .collect(Collectors.toList());
        map.put("goodMatchup",goodMatchup);

        return "championDetails";
    }
}
