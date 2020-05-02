/*class Main {
	public static void main(String[] args) {
		전사 a전사 = new 전사();

		String 이름 = "칸";
		a전사.이름 = 이름;
		a전사.나이 = 20;
		a전사.자기소개();

		a전사.나이++;
		a전사.자기소개();

		a전사.나이 = 30;
		a전사.이름 = "카니";
		a전사.자기소개();

		a전사.a무기 = new 활();
		a전사.공격();
		// 출력 : 카니가 활로 공격합니다.

		a전사.a무기 = new 칼();
		a전사.공격();
		// 출력 : 카니가 칼로 공격합니다.
	}
}

class 전사 {
	// 인스턴스 변수
	String 이름;
	// 인스턴스 변수
	int 나이;
	// 인스턴스 변수
	무기 a무기;

	void 자기소개() {
		System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
	}

	public void 공격() {
		// TODO Auto-generated method stub
		this.a무기.작동(this.이름);
	}
}

class 무기 {

	void 작동(String 이름) {
		// TODO Auto-generated method stub
	}

}

class 칼 extends 무기 {
	void 작동(String 이름) {
		System.out.printf(이름 + "가 칼로 공격합니다.\n");
	}
}

class 활 extends 무기 {
	void 작동(String 이름) {
		System.out.printf(이름 + "가 활로 공격합니다.\n");
	}
}*/
// 문제 : 아래가 실행되도록 해주세요.
/*
class Main {
	public static void main(String[] args) {
		전사 a전사 = new 전사();

		String 이름 = "칸";
		a전사.이름 = 이름;
		a전사.나이 = 20;
		a전사.자기소개();

		a전사.나이++;
		a전사.자기소개();

		a전사.나이 = 30;
		a전사.이름 = "카니";
		a전사.자기소개();

		a전사.a무기 = new 활();
		a전사.공격();
		// 출력 : 카니가 활로 공격합니다.

		a전사.a무기 = new 칼();
		a전사.공격();
		// 출력 : 카니가 칼로 공격합니다.
	}
}

class 전사 {
	// 인스턴스 변수
	String 이름;
	// 인스턴스 변수
	int 나이;
	// 인스턴스 변수
	무기 a무기;

	void 자기소개() {
		System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
	}

	void 공격() {
		this.a무기.사용자 = this.이름;
		this.a무기.작동();
		// TODO Auto-generated method stub
	}
}

class 무기 {
	String 사용자;
	void 작동() {
		// TODO Auto-generated method stub
		
	}

}

class 칼 extends 무기 {
	
	void 작동() {
		// TODO Auto-generated method stub
		System.out.printf(사용자 + "가 칼로 공격합니다.\n");
	}
	
}

class 활 extends 무기 {
	
	void 작동() {
		// TODO Auto-generated method stub
		System.out.printf(사용자 + "가 활로 공격합니다.\n");
	}
	
}*/

class Main {
	public static void main(String[] args) {
		사람 a김철수 = new 사람();
		a김철수.이름 = "김철수";
		a김철수.전화번호 = "010-1234-1234";
		a김철수.a좋아하는_음식점 = new 영화반점();
		a김철수.선호하는_음식의_매운정도 = "매운";
		a김철수.선호하는_음식 = "짬뽕";
		
		사람 a김영희 = new 사람();
		a김영희.이름 = "김영희";
		a김영희.전화번호 = "010-4321-4321";
		a김영희.a좋아하는_음식점 = new 북경반점();
		a김영희.선호하는_음식의_매운정도 = "안매운";
		a김영희.선호하는_음식 = "짬뽕";
		
		a김철수.배달_음식_주문하다();
		// 영화반점에서 김철수(010-1234-1234)에게 매운 짬뽕(을)를 배달합니다.
		
		a김영희.배달_음식_주문하다();
		// 북경반점에서 김영희(010-4321-4321)에게 안매운 짬뽕(을)를 배달합니다.
		
		a김영희.a좋아하는_음식점 = a김철수.a좋아하는_음식점;
		a김영희.선호하는_음식의_매운정도 = "아주 매운";
		a김영희.선호하는_음식 = "짜장";
		
		a김영희.배달_음식_주문하다();
		// 영화반점에서 김영희(010-4321-4321)에게 아주 매운 짜장(을)를 배달합니다.
	}
}

class 사람 {
	String 이름;
	String 전화번호;
	String 선호하는_음식의_매운정도;
	String 선호하는_음식;
	
	음식점 a좋아하는_음식점;
	
	void 배달_음식_주문하다() {
		this.a좋아하는_음식점.주문(this.이름, this.전화번호, this.선호하는_음식의_매운정도, this.선호하는_음식);
	}
}

class 음식점 {
	
	void 주문(String 주문자이름, String 주문자번호, String 맵기, String 음식이름 ) {
		
	}
}

class 영화반점 extends 음식점 {
	
	void 주문(String 주문자이름, String 주문자번호, String 맵기, String 음식이름) {
		System.out.printf("영화반점에서" + 주문자이름 + "(" + 주문자번호 + ") 에게 " + 맵기 + " " + 음식이름 + "(을)를 배달합니다.\n");
		
	}
}

class 북경반점 extends 음식점 {
	void 주문(String 주문자이름, String 주문자번호, String 맵기, String 음식이름) {
		System.out.printf("북경반점에서" + 주문자이름 + "(" + 주문자번호 + ") 에게 " + 맵기 + " " + 음식이름 + "(을)를 배달합니다.\n");
	}
}
