package recors;

public class Recors {
	public class cw {
		public static int q1(int n) {
			return n+q1(n-1);
		}
		public static int q2(int n) {
			if(n==1) {
				return 1;
			}
			return n*q2(n-1);
		}
		public static int q3(int n) {
			if(n%2==0) {
				return 0;
			}
			return n*q3(n-1);
		}
		public static int q4(int n,int counter) {
			if(n/10 == 0) {
				return counter;
			}
			return q4(n/10,counter);
		}
		public static int q5(int n, int k, int counter) {
			if(n<k) {
				return counter;
			}
			counter++;
			return q5(n-k,k,counter);
		}
		public static int q6(int n, int k) {
			if(n<k) {
				return n;
			}
			return q6(n-k,k);
		}
		public static boolean q7(int x, int y) {
			if(x==0) {
				return true;
			}
			return q7(x-y,x);
		}
		public static boolean q8(int n) {
			int counter = 9;
			if(counter == 1) {
				return true;
			}
			if(n%counter == 0 && counter!=1) {
				return false;
			}
			counter--;
			return q8(n);
		}
		public static boolean q9(int n, boolean flag1, boolean flag2) {
			if(n%2 != 0 && flag2 == false) {
				flag1 = true;
			}
			if(n%2 == 0 && flag1 == false) {
				flag2 = true;
			}
			else {
				return false;
			}
			return true;
			return q9(n/10, flag1, flag2);
		}
	public static void main(String[] args) {
		
	}

}

class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
