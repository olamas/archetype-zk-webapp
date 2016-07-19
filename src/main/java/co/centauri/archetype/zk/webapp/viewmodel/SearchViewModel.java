package co.centauri.archetype.zk.webapp.viewmodel;

import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

import co.centauri.archetype.zk.webapp.domain.User;
import co.centauri.archetype.zk.webapp.service.UserService;
import co.centauri.archetype.zk.webapp.service.UserServiceImpl;

public class SearchViewModel {

		private String keyword;
		
		private List<User> userList;
		
		private User selectedUser;
		
		private UserService userService = new UserServiceImpl();
						
		public String getKeyword() {
			return keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public List<User> getUserList() {
			return userList;
		}

		public void setUserList(List<User> userList) {
			this.userList = userList;
		}

		public User getSelectedUser() {
			return selectedUser;
		}

		public void setSelectedUser(User selectedUser) {
			this.selectedUser = selectedUser;
		}

		public UserService getUserService() {
			return userService;
		}

		public void setUserService(UserService userService) {
			this.userService = userService;
		}

		@Command
		@NotifyChange("userList")
		public void search(){
			userList = userService.search(keyword);
		}
	
}
