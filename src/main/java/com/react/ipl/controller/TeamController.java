package com.react.ipl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.react.ipl.model.Match;
import com.react.ipl.model.Team;
import com.react.ipl.repository.MatchRepository;
import com.react.ipl.repository.TeamRepository;

@RestController
@Component
@CrossOrigin
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;

	 @Autowired 
	 private MatchRepository matchRepository;
	

	TeamController() {

	}

	@GetMapping("team/{teamName}")
	public Team getTeam(@PathVariable String teamName) {
		Team team = teamRepository.findByTeamName(teamName);
		Pageable pageable = PageRequest.of(0, 4);
		List<Match> matchResponses = matchRepository.getByTeam1OrTeam2(teamName,teamName,pageable);
		
		if(!matchResponses.isEmpty()) {
			//List<Match> match = new ArrayList<>();
			//match.add(matchResponses.get(0));
			team.setMatches(matchResponses);
		}
		return team;
	}
	
	@GetMapping("team/{teamName}/matches")
	public List<Match> getMatchesForTeam(@PathVariable String teamName,@RequestParam int year) {	
		return null;	
	}
	

}
