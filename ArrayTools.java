/*
	调用static方法可通过类名直接调用(类名.成员函数/变量)，不用通过对象调用
	调用非static方法必须通过先创建的对象来调用(类 对象 = new 类();对象.成员)
*/
import java.util.Scanner;
class ArrayTools {

	//給数组赋值函数，将已经创建的数组和它的长度传给此函数的形参
	public void InputArray(int[] arr,int a){
		Scanner s = new Scanner(System.in);
		int b = a;	//b用来记录a的值
		System.out.println("请选择创建数组的方式(填序号1或2)：");		
		while (true) {
			System.out.println("1.系统自建\n2.手动创建");
			int a1 = s.nextInt();
			if (a1==1) {				
				for (int i=0;i<=b-1;i++ ) {
					a = (int)(Math.random()*100)+1;
					arr[i] = a;
				}
				break;
			}else if(a1==2){
				for (int i=0;i<=b-1;i++ ) {
					System.out.println("输入第"+(i+1)+"个数组元素：");
					a = s.nextInt();
					arr[i] = a;
				}
				break;
			}else{
				System.out.println("请选择正确的选项！(填序号a或b)：");
				continue;
			}
		}		
		s.close();
		System.out.println("所创建的数组为 "+"arr["+b+"]：");
	}

//*****************************************************************
	//有返回值的数组遍历函数
	public String printArray1(int[] arr){
		String a = "";
		for (int i=0;i<=arr.length-1 ;i++ ) {			
			a += arr[i]+" ";
		}	
		return a+"\n";
	}

	//无返回值的数组遍历函数
	public void printArray2(int[] arr){
		for (int i=0;i<=arr.length-1 ;i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
//*****************************************************************
	//实现交换两个变量中的值
	public void Swap(int[] arr,int a,int b){
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	
	//对数组元素求和
	public int getArraySum(int[] arr){
		int sum=0;
		for(int i=0;i<=arr.length-1;i++){
			sum+=arr[i];
		}
		return sum;
	}

//*****************************************************************

	//对数组进行选择排序
	public void selectSort(int[] arr){
		for (int i=0;i<=arr.length-2 ;i++ ) {
			for (int j=i+1;j<=arr.length-1 ;j++ ) {//j从i的下一个开始
				if (arr[i]>arr[j]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	//冒泡排序
	public void BubbleSort(int[] arr){
		for(int i=1;i<=arr.length-1;i++){//表示第i轮比较，共arr.length-1轮			
			for(int j=1;j<=arr.length-i;j++) {//j表每一轮比较次数
				if (arr[j-1]>arr[j]) {
					Swap(arr,j-1,j);
				}
			}
		}
	}

/*
	public void FastSort(int[] arr){
		int start = 0;
		int end = 0;
		int mid = (start+end)/2;
		int[] temp = new int[arr.length];//不开辟新数组作临时空间就想快速排序？呵呵
		temp[0] = arr[0];
		
		for (int i=1;i<=arr.length-1 ;i++ ) {//第i个元素
			
			while (start<=end) {
				mid = (start+end)/2;
				if (arr[i]==temp[mid]) {
					arr[i] = temp[mid+1];
					break;
				}else if (temp[mid]<arr[i]) {
					start = mid+1;
					continue;
				}else{
					end = mid-1;
					continue;
				}
			}
			mid = (start+end)/2;
			
			start = 0;
			end = i;
			
		}

	}
*/
//************************************************************************

	//实现一般查找。有返回值（不止一个）
	public String search(int[] arr,int key){
		for (int i=0;i<=arr.length-1 ;i++ ) {
			if (arr[i]==key) {
				return " " + i;
			}
		}
		return "没有找到对应元素";
	}

	//折半查找（要求有序）。有返回值（一个），参数（int[],int key）
	public String BinarySearch(int[] arr,int key){
		int start = 0;
		int end = arr.length-1;
		int mid;

		while (start<=end) {
			mid = (start+end)/2;
			if (arr[mid]==key) {
				return mid+" ";
			}else if (arr[mid]<key) {
				start = mid + 1;
			}else if(arr[mid]>key){
				end = mid - 1;
			}
		}
		return "没有找到呃";	
	}


}