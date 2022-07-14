package Repositories;

import Models.User;

public interface IRepository {
	User get(String id);
	void addUser(User user);

	void updateUser(User user);

	void removeUser(User user);
}
