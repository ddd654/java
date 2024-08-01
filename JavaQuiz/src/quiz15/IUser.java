package quiz15;

public interface IUser {
	public void insert(String name, int age);
	public void prinList();
	public boolean search(String name);
	public boolean delete(String name);
}
