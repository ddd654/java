package quiz10.Interface;

public class BugsMusic implements SongList {
	/*
	 * SongList인터페이스를 상속받습니다. 마음대로 작성.
	 * 
	 */

	private String[] list = new String[100];
	private int count = 0;

	@Override
	public void insertList(String song) {
		System.out.println("기능1");
	}

	@Override
	public void playList() {
		System.out.println("기능2");

	}

	@Override
	public int playLength() {
		System.out.println("기능3");
		return 0;
	}

}
