/*
 *   선택 조건문
 *   if (조건문)
 *   {
 *     조건문이 true면 수행하는 문장 구현
 *   }
 *   else
 *   {
 *     조건문이 false일때 수행하는 문장 구현
 *   }
 *   
 *   조건문 => 핵심 (조건 제작)
 *   
 *   =======> 137 page
 *   == 단일
 *   <
 *   >
 *   !=
 *   ======= 
 *   &&
 *   || 조건이 여러개일 경우
 *   =======
 *  
 *   ch>='A' && ch<='Z'
 *   ch>='0' && ch<='9'
 *   ch>='가' && ch<='힣'  => 번호가 일률적으로 이루어짐
 *   
 *   문자열 => !=, == 사용하지 않는다
 *   equals() 
 *   !equals() 
 *   
 *   
 *   
 */
import java.util.*;


public class 제어문_선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         문자한개를 입력을 받아서 => 알파벳인지 여부 확인
	    // 변수 설정
		char a = 'A'; //변수 => 초기화
		/* 
		 *  int => 0
		 *  double => 0.0
		 *  long => 0L
		 *  boolean => false
		 */
		// 문자 한개 입력
		Scanner scan=new Scanner(System.in);
		System.out.print("입력:");
		//"ABC" => 012 자바는 모든 시작 번호 0부터 시작한다
		a=scan.next().charAt(0);
		// a>='0' && a<='9'
		
		
		if((a>='A' && a<='Z') || (a>='a' && a<='z'))
		{
		 System.out.println(a+"는 알파벳입니다!");
		}
		else
		{
	     System.out.println(a+"는 알파벳이 아닙니다!");		
		}
	
	
	}

	
}
