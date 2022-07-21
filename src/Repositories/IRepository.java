package Repositories;

import Models.User;

public interface IRepository {
	User get(String username);
	boolean addUser(User user);

	boolean updateUser(User user);

	boolean removeUser(String username);
}
