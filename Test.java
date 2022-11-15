public class Test{
 
	int cnt = 2;
	
	void m1() {
		cnt++;
		m2();
	}
	
	void m2() {
		cnt++;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			Test test = new Test();
			test.m1();
		}
		System.out.println(new Test().cnt);
	}
}