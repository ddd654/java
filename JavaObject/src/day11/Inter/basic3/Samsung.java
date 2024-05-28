package day11.Inter.basic3;

public class Samsung implements Print{

	@Override
	public void print(String document) {
		
		System.out.println("삼성");
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println("삼성 컬러 프린트");
		
	}

	@Override
	public int copy(int cpy) {
		// TODO Auto-generated method stub
		return 0;
	}

}
