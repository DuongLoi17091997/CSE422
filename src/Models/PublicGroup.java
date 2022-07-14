package Models;
import Models.User;
import java.io.*;
import java.util.List;

public class PublicGroup extends Group{
	List<User> list;

	public PublicGroup(List<User> list) {
		super();
		this.list = list;
	}
	
}
