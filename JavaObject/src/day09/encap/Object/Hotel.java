package day09.encap.Object;

public class Hotel {
	
	//호텔이 쉐프를 필요로 할때
	//쉐프 선언
	private Chef chef;
	
	//기본 생성자
//	public Hotel() {
//		this.chef = new Chef();
//	}
//	
	//호텔이 생성될 때, 생성자용 쉐프를 초기화
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	
	// getter, setter
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
  //접근제어자 타입
	public Chef getChef() {
		return chef;
	}
	
	
	
	
}
