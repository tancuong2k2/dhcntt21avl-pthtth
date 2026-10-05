package javacore.baitap2;

public class Bai8 {
	//Đây là hàm đệ quy tính số Fibonacci thứ n.
	public static int fibo(int n) {
		if (n==0) return 1; // ham tra ve 1(dieu kien dung)
		if (n==1) return 1;
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args) {
		for (int i=0;i<20;i++)
			System.out.println(fibo(i)+"");
	}
}
