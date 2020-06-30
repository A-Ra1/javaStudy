import com.sun.javafx.image.IntPixelAccessor;

// 갯수
public class 배열_빈도수계산 {

	public static void main(String[] args) {
		
		int[] arr=new int[10]; //1~9
		int[] count=new int[10];
		// 초기값
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10);
		}
	    // 출력 => 빈도수 계산할 데이터
		for(int i:arr) {
			System.out.print(i+" ");
		}
			System.out.println("\n====결과====");
		
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
			// 5 7 1 5 9 2 3 2 5 8
			// count[0] ~ count[9] => 0
			// count[5]=1 count[7]=1
		}
			
		//출력
		for(int i=0; i<arr.length; i++) {
			if(count[i]!=0) {
			System.out.println(i+"갯수:"+count[i]);
			}
		
		}
			

	}

}
