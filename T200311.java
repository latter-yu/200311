import java.util.Scanner;

public class T200311 {
	public static void main4(String[] args) {
		//方法重载
		//针对同一个类:
		//1.方法名相同
		//2.方法的参数不同(参数个数或者参数类型)
		//3.方法的返回值类型不影响重载.

		int a = 10;
		int b = 20;
		int ret = add(a, b);
		System.out.println("ret = " + ret);
		double a2 = 21.4;
		double b2 = 28.5;
		double ret2 = add(a2, b2);
		System.out.println("ret2 = " + ret2);
	}
	public static int add(int x, int y) {
	    return x + y;
	}
	public static double add(double x, double y) {
	    return x + y;
	}

	public static int facSum(int n) {
		//阶乘和
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum = sum + fac(i);
		}
		return sum;
	}
	public static int fac(int i) {
		//求阶乘
		int ret = 1;
		for(int j = 1; j <= i; j++) {
			ret = ret*j;
		}
		return ret;
	} 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fac(num);
        int ret = facSum(num);//阶乘和
        System.out.println(ret);
	}

	public static void main3(String[] args) {
		//阶乘和
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int facSum = 0;
        for(int i = 1; i <= num; i++) {
        	int fac = 1;
        	for(int j = 1; j <= i; j++) {
        		fac = fac*j;
        	}
        	facSum += fac;
        }
        System.out.println(facSum);
	}

	public static int max(int x, int y) {
		//int ret = x > y ? x : y;
		return x > y ? x : y;
	}

	public static int max1(int x, int y, int z) {
		//int max = x > y ? x : y;
		//max = max > z ? max : z;
		return max(max(x,y),z);
	} 

	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int ret = max(num1, num2);
        int ret1 = max1(num1, num2, num3);
        System.out.println(ret);
        System.out.println(ret1);
	}


	public static int addSum(int num) {
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		//System.out.println(sum);
		//方法内的打印只是输出，是void类型，结果并没有保存
		//若要传回main函数，需用return
		return sum;
	}  

	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		//int addSum();//方法命名：小驼峰
		//实参给形参的传递是按值传递
		//实参和形参的类型和个数都需要匹配
		//一般情况下，不建议在方法中直接打印
		int ret = addSum(n);
		System.out.println(8*ret);
	}
}