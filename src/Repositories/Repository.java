package Repositories;

import java.util.List;
import Models.User;

public class Repository implements IRepository{
	List<User> list;
	@Override
	public boolean addUser(User user) {
		boolean res = false;
		if (this.get(user.getUserName()) == null) {
			list.add(user);
			res = true;
		}
		return res;
	}

	@Override
	public boolean updateUser(User user) {
		boolean res = false;
		for (int i = 0; i < list.size(); i++) {
			if(this.list.get(i).getUserName().equalsIgnoreCase(user.getUserName())) {
				this.list.remove(i);
				this.list.add(i, user);
				res = true;
				break;
			}
		}
		
		return res;
	}
	

	@Override
	public boolean removeUser(String username) {
		boolean res = false;
		User tempUser = this.get(username);
		if (tempUser != null) {
			this.list.remove(tempUser);
			res = true;
		}
		return res;
	}

	@Override
	public User get(String username) {
		User user = null;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getUserName().equals(username)) {
				return list.get(i);
			}
		}
		return user;
	}
	
	
}
