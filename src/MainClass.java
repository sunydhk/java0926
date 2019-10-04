
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열
		// 아래는 선언과 동시에 a라는 이름에 문자열이라는 데이터 담음
		String a = "문자열";
		// 숫자
		int b = 1;
		// 논리형 참, 거짓
		boolean flg = false; // true
		
		//문자열 변수 a를 출력
		System.out.println("a = " + a);
		a = "나는 에이";
		System.out.println(a);
		
		// 숫자 변수 b를 출력
		System.out.println("b = " + b);
		b = 2;
		System.out.println("b = " + b);
		
		// 논리 변수 flg를 사용 해봄
		// 만약에 참이면 a를 출력 만약에 거짓이면 b를 출력
		flg = true;
		if (flg == true) {
			// flg가 참이면 여기 실행
			System.out.println("flg : a = " + a);
		}
		
		if (flg == false) {
			System.out.println("flg : b = " + b);
		}
		
		if (flg) {
			System.out.println("flg = " + flg);
		}
		
		else {
			System.out.println("flg = " + flg);
		}
		
		// 돈이 있으면 밥을 먹고 없으면 집에 간다.
		int don = 0;
		System.out.println("내가 가진 돈은 ? " + don);
		System.out.println("길을 가다가 돈을 100원 주웠다");
		don = don + 100;
		if (don > 0) {
			System.out.println("밥을 먹을 수 있다");
		} else { System.out.println("밥을 먹을 수 없다");}
		
		// 교통카드가 있으면 차타고 가고 없으면 걸어간다
		
	}

}
