package baitaplab1b;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInt {

	private int[] arr;
	private int n;

	// 🔹 Khởi tạo và nhập giá trị cho mảng
	public ArrayInt(int n) {
		this.n = n;
		arr = new int[n];
	}

	public void nhapMang() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập " + n + " phần tử:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
	}

	// 🔹 Xuất thông tin của mảng
	public void xuatMang() {
		System.out.println("Mảng hiện tại: " + Arrays.toString(arr));
	}

	// 🔹 Thêm phần tử Y vào đầu
	public void themDau(int y) {
		int[] newArr = new int[n + 1];
		newArr[0] = y;
		System.arraycopy(arr, 0, newArr, 1, n);
		arr = newArr;
		n++;
	}

	// 🔹 Thêm phần tử Y vào cuối
	public void themCuoi(int y) {
		arr = Arrays.copyOf(arr, n + 1);
		arr[n] = y;
		n++;
	}

	// 🔹 Thêm phần tử Y vào vị trí i
	public void themGiua(int y, int i) {
		if (i < 0 || i > n) {
			System.out.println("Vị trí không hợp lệ!");
			return;
		}
		int[] newArr = new int[n + 1];
		System.arraycopy(arr, 0, newArr, 0, i);
		newArr[i] = y;
		System.arraycopy(arr, i, newArr, i + 1, n - i);
		arr = newArr;
		n++;
	}

	// 🔹 Xóa phần tử có giá trị X
	public void xoaPhanTu(int x) {
		int count = 0;
		for (int value : arr) {
			if (value != x)
				count++;
		}
		int[] newArr = new int[count];
		int j = 0;
		for (int value : arr) {
			if (value != x)
				newArr[j++] = value;
		}
		arr = newArr;
		n = count;
	}

	// 🔹 Xóa phần tử thứ j
	public void xoaTheoViTri(int j) {
		if (j < 0 || j >= n) {
			System.out.println("Vị trí không hợp lệ!");
			return;
		}
		int[] newArr = new int[n - 1];
		System.arraycopy(arr, 0, newArr, 0, j);
		System.arraycopy(arr, j + 1, newArr, j, n - j - 1);
		arr = newArr;
		n--;
	}

	// 🔹 Sắp xếp tăng dần hoặc giảm dần (Radix Sort)
	public void radixSort(boolean tangDan) {
		int max = Arrays.stream(arr).max().getAsInt();
		for (int exp = 1; max / exp > 0; exp *= 10) {
			countingSort(exp);
		}
		if (!tangDan) {
			for (int i = 0; i < n / 2; i++) {
				int temp = arr[i];
				arr[i] = arr[n - i - 1];
				arr[n - i - 1] = temp;
			}
		}
	}

	private void countingSort(int exp) {
		int[] output = new int[n];
		int[] count = new int[10];
		Arrays.fill(count, 0);

		for (int i = 0; i < n; i++) {
			count[(arr[i] / exp) % 10]++;
		}
		for (int i = 1; i < 10; i++) {
			count[i] += count[i - 1];
		}
		for (int i = n - 1; i >= 0; i--) {
			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
			count[(arr[i] / exp) % 10]--;
		}
		System.arraycopy(output, 0, arr, 0, n);
	}

	// 🔹 Tìm kiếm phần tử B trong mảng chưa sắp xếp
	public int timKiemTuyenTinh(int b) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == b)
				return i;
		}
		return -1;
	}

	// 🔹 Tìm kiếm phần tử B trong mảng đã sắp xếp
	public int timKiemNhiPhan(int b) {
		int left = 0, right = n - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == b)
				return mid;
			if (arr[mid] < b)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}
}
