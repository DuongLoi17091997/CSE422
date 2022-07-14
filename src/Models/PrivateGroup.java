package Models;

import java.util.List;

public class PrivateGroup extends Group{
	User user;
	List<User> list;
	
	public PrivateGroup(User user, List<User> list) {
		super();
		this.user = user;
		this.list = list;
	}


	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}
	
	
}
