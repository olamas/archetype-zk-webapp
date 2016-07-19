package co.centauri.archetype.zk.webapp.service;

import java.util.List;

import co.centauri.archetype.zk.webapp.domain.User;

public interface UserService {
	/**
     * Retrieve all users in the catalog.
     * @return all users
     */
    public List<User> findAll();
     
    /**
     * search users according to keyword in  model and make.
     * @param keyword for search
     * @return list of user that match the keyword
     */
    public List<User> search(String keyword);
	
}
