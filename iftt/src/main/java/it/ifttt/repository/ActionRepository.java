package it.ifttt.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import it.ifttt.domain.Action;
import it.ifttt.domain.Channel;

@Repository
public interface ActionRepository extends MongoRepository<Action, Long>{
	List<Action> findByChannel(Channel channel);
	Action findByName(String name);

}
