package customermanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import binarysearchtree.Node;

public class Main {
	
	public static Customer addCustomer(Customer root, Customer newCustomer) {
		if(root==null) return newCustomer;
		if(newCustomer.label<root.label) {
			if(root.left==null) root.left = newCustomer;
			else root.left = addCustomer(root.left, newCustomer);
		}
		else
		{
			if(root.right==null) root.right = newCustomer;
			else root.right = addCustomer(root.right, newCustomer);
		}
		return root;
	}
	
	public static void readtree(Customer root) {
		if(root!=null) {
			readtree(root.left);
			System.out.print(root.toString()+" ");
			readtree(root.right);
		}
	}
	
	public static boolean findCutomer(Customer root, int newCustomer) {
		if (root==null) return false;
		if (newCustomer==root.label) return true;
		else if (newCustomer<root.label) return findCutomer(root.left, newCustomer);
		else return findCutomer(root.right, newCustomer);
	}
	
	public static Customer deleteCustomer(Customer root,int newCustomer) {
		if(root==null) return null;
		if(root.label == newCustomer) {
			if(root.left==null) return root.right;
			if(root.right==null) return root.left;
			Customer T = theleftCustomer(root.right);
			Customer L = root.left;
			Customer R = deleteCustomer(root.right, T.label);
			T.left = L;
			T.right = R;
			return T;
		}
		if (newCustomer<root.label) root.left = deleteCustomer(root.left, newCustomer);
		else root.right = deleteCustomer(root.right, newCustomer);
		return root;
	}
	
	public static Customer theleftCustomer(Customer root) {
		if(root==null) return null;
		if(root.left==null) return root;
		else return theleftCustomer(root.left);
	}
	
	
	public static void main(String[] args) {
		Customer u1 = new Customer(107, "an", "nam", 30);
		Customer u2 = new Customer(101, "hoa", "nu", 20);
		Customer u3 = new Customer(105, "khanh", "nam", 35);
		Customer u4 = new Customer(103, "mai", "nu", 28);
		Customer u5 = new Customer(109, "huy", "nam", 40);
		Customer u6 = new Customer(102, "binh", "nam", 25);
		Customer u7 = new Customer(104, "thuan", "nam", 37);
		Customer root = u1;
		root = addCustomer(root, u2);
		root = addCustomer(root, u3);
		root = addCustomer(root, u4);
		root = addCustomer(root, u5);
		root = addCustomer(root, u6);
		root = addCustomer(root, u7);
		System.out.println("Danh sách khách hàng (cau truc BST) :");
		readtree(root);
		System.out.println();
		System.out.println("FindNode 100: "+findCutomer(root, 100));
		root = deleteCustomer(root, 107);
		System.out.println("Cay root sau khi xoa node 55: ");
		readtree(root);
//		ArrayList<Customer> list = new ArrayList<>(); 
//		list.add(u1);list.add(u2);list.add(u3);list.add(u4);list.add(u5);list.add(u6);list.add(u7);
//		System.out.println("Danh sach khach hang: ");
//		for (Customer e:list) System.out.println(e.toString());
//		System.out.println();
//		
//		double avg=0, sum = 0;
//        for (Customer e:list) sum+=e.getCustomer_Age();
//        if (sum!=0) avg = sum / list.size();
//        System.out.println("Tính tuổi trung bình khách hàng là: "+avg);
//        System.out.println();
//        
//        int g=0, s=0;
//        for (Customer e:list) if(e.getCustomer_Age()>avg) g++; else s++;
//        System.out.println("Số khách hàng có tuổi lớn hơn trung bình là: "+g + ", nhỏ hơn trung bình là:" +s);
//        System.out.println();
//        
//        System.out.println("Danh sách khách hàng nam là: ");
//        for (Customer e:list) if(e.getCustomer_Gender().compareTo("nam")==0) System.out.println(e);
//        System.out.println();
//        
//        System.out.println("Danh sách khách hàng nữ là: ");
//        for (Customer e:list) if(e.getCustomer_Gender().compareTo("nu")==0) System.out.println(e);
//        System.out.println();
//        
//        System.out.println("Danh sách khách hàng sắp xếp theo ID là: ");
//        list.sort(new IDComparator());
//        for (Customer e:list) System.out.println(e.toString());
//        System.out.println();
//        
//        System.out.println("Danh sách khách hàng sắp xếp theo tên là: ");
//        list.sort(new NameComparator());
//        for (Customer e:list) System.out.println(e.toString());
		
		
	}
}
