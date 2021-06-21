package com.react.ipl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.react.ipl.model.Team;

@Component
public interface TeamRepository extends CrudRepository<Team,Long> {
	Team findByTeamName(String TeamName);
}
