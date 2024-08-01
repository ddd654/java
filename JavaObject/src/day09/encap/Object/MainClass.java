package day09.encap.Object;

public class MainClass {
	public static void main(String[] args) {
		
		Chef chef = new Chef();
//		Hotel hotel = new Hotel(쉐프객체);
		Hotel hotel = new Hotel(chef);
		
		
//		Hotel hotel = new Hotel(new Chef());
		
		// 반환 유형 주의
		Chef c = hotel.getChef();
		
		
		//setter
		Chef chef = new Chef();
		hotel.setChef(chef);
		
		//getter
		Chef c1 = hotel.getChef();
		c1.cooking();
	}
}
