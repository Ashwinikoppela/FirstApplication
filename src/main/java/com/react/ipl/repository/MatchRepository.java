package com.react.ipl.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.react.ipl.model.Match;

@Component
public interface MatchRepository extends CrudRepository<Match,Long> {
	
	List<Match> getByTeam1OrTeam2(String teamName1,String teamName2,Pageable pagable);

}
