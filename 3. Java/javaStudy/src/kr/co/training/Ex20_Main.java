package kr.co.training;

public class Ex20_Main {

	public static void main(String[] args) {
		
		// getter/setter를 사용하는 경우
		// - 객체 생성 푸에도 자유롭게 데이터 변경 가능
		// - 필요한 필드만 setter로 값을 넣을 수있음
		//	> 초기값 이후 값을 변경할 필요가 없다면  SETTER 안 만들면 됨
		Ex20_1_Animal am = new Ex20_1_Animal();
		am.setName("초코");
		am.setAge(2);
		am.eat();
		
		
		// 생성자로만 필드를 초기화 하는 경우
		// - 데이터가 불변(객체 생성 후 값이 변하지 않음)
		
		
		
		Ex20_2_Bookinfo bookInfo = new Ex20_2_Bookinfo();
		bookInfo.setBookCount(100); // 초기에 100권 있다.
		
		Ex20_2_Book book = new Ex20_2_Book(); //도서관 객체
		//				도서관 정보, 빌릴 책의 수
		book.borrowBook(bookInfo, 3);
		
		book.returnBook(bookInfo, 6);
		
		Ex20_3_Memberinfo minfo = new Ex20_3_Memberinfo();
		minfo.setname("홍길동");
		minfo.setage(15);
		minfo.setaddr("인천");
		minfo.setisStudent(true);
		Ex20_3_Member m = new Ex20_3_Member();
		m.introduce(minfo);
	}

}
