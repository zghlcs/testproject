/*
	����static������ͨ������ֱ�ӵ���(����.��Ա����/����)������ͨ���������
	���÷�static��������ͨ���ȴ����Ķ���������(�� ���� = new ��();����.��Ա)
*/
import java.util.Scanner;
class ArrayTools {

	//�o���鸳ֵ���������Ѿ���������������ĳ��ȴ����˺������β�
	public void InputArray(int[] arr,int a){
		Scanner s = new Scanner(System.in);
		int b = a;	//b������¼a��ֵ
		System.out.println("��ѡ�񴴽�����ķ�ʽ(�����1��2)��");		
		while (true) {
			System.out.println("1.ϵͳ�Խ�\n2.�ֶ�����");
			int a1 = s.nextInt();
			if (a1==1) {				
				for (int i=0;i<=b-1;i++ ) {
					a = (int)(Math.random()*100)+1;
					arr[i] = a;
				}
				break;
			}else if(a1==2){
				for (int i=0;i<=b-1;i++ ) {
					System.out.println("�����"+(i+1)+"������Ԫ�أ�");
					a = s.nextInt();
					arr[i] = a;
				}
				break;
			}else{
				System.out.println("��ѡ����ȷ��ѡ�(�����a��b)��");
				continue;
			}
		}		
		s.close();
		System.out.println("������������Ϊ "+"arr["+b+"]��");
	}

//*****************************************************************
	//�з���ֵ�������������
	public String printArray1(int[] arr){
		String a = "";
		for (int i=0;i<=arr.length-1 ;i++ ) {			
			a += arr[i]+" ";
		}	
		return a+"\n";
	}

	//�޷���ֵ�������������
	public void printArray2(int[] arr){
		for (int i=0;i<=arr.length-1 ;i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
//*****************************************************************
	//ʵ�ֽ������������е�ֵ
	public void Swap(int[] arr,int a,int b){
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	
	//������Ԫ�����
	public int getArraySum(int[] arr){
		int sum=0;
		for(int i=0;i<=arr.length-1;i++){
			sum+=arr[i];
		}
		return sum;
	}

//*****************************************************************

	//���������ѡ������
	public void selectSort(int[] arr){
		for (int i=0;i<=arr.length-2 ;i++ ) {
			for (int j=i+1;j<=arr.length-1 ;j++ ) {//j��i����һ����ʼ
				if (arr[i]>arr[j]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	//ð������
	public void BubbleSort(int[] arr){
		for(int i=1;i<=arr.length-1;i++){//��ʾ��i�ֱȽϣ���arr.length-1��			
			for(int j=1;j<=arr.length-i;j++) {//j��ÿһ�ֱȽϴ���
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
		int[] temp = new int[arr.length];//����������������ʱ�ռ����������򣿺Ǻ�
		temp[0] = arr[0];
		
		for (int i=1;i<=arr.length-1 ;i++ ) {//��i��Ԫ��
			
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

	//ʵ��һ����ҡ��з���ֵ����ֹһ����
	public String search(int[] arr,int key){
		for (int i=0;i<=arr.length-1 ;i++ ) {
			if (arr[i]==key) {
				return " " + i;
			}
		}
		return "û���ҵ���ӦԪ��";
	}

	//�۰���ң�Ҫ�����򣩡��з���ֵ��һ������������int[],int key��
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
		return "û���ҵ���";	
	}


}