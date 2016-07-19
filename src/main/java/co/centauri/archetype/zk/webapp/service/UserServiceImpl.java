package co.centauri.archetype.zk.webapp.service;

import java.util.LinkedList;
import java.util.List;

import co.centauri.archetype.zk.webapp.domain.User;

public class UserServiceImpl  implements UserService{
	
     	//data model
		private List<User> userList= new LinkedList<User>();
		private static int id = 1;
	
		//initialize book data
		public UserServiceImpl() {
			userList.add(
					new User(id++,"Bruce","Wayne","bWayne", "/img/bruce.jpg","imbatman", "bruce.wayne@wayne.tech.com" ));
					
			userList.add(
					new User(id++,"Clark","Kent","cKent","/img/clark.jpg", "imsuperman", "clark.kent@daily.planet.com" ));
			
			userList.add(
					new User(id++,"Dick","Grayson","dGrayson","/img/dick.png", "imrobin", "dick.gryson@teen.titans.com" ));
			
			userList.add(
					new User(id++,"Jason","Tood","jTood", "/img/Jason.png","imredhood", "jayson.tood@wayne.tech.com" ));
		}
		
		public List<User> findAll() {
			return userList;
		}
		
		
    /**
     * search users according to keyword in  model and make.
     * @param keyword for search
     * @return list of user that match the keyword
     */
    public List<User> search(String keyword) {
    	List<User> result = new LinkedList<User>();
		if (keyword==null || "".equals(keyword)){
			result = userList;
		}else{
			for (User user: userList){
				if (user.getName().toLowerCase().contains(keyword.toLowerCase())
					||user.getUserName().toLowerCase().contains(keyword.toLowerCase())	
					||user.getLastName().toLowerCase().contains(keyword.toLowerCase())){
					result.add(user);
				}
			}
		}
		return result;
    }
	
}
