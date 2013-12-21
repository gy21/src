package Chapter3;

public class printPath {
	
	private void printPaths(node n){
		int [] a = new int [50];
		printPaths(n, a, 0);
	}

	private void printPaths(node root, int[] a, int position) {
		if(root == null)
			return;
		a[position] = root.data;
		position ++;
		if(root.left == null && root.right == null){
			printArray(a,position);
		}
		else{
			printPaths(root.left, a, position);
			printPaths(root.right, a, position);
		}
		
		
	}
	//��һ��д���������ʱ��û�п��ǵ�len�����ƣ�ֱ���뵱Ȼ����Ϊ��Ӧ���ǰ����������ӡ����
	//��ʵ����Ӧ�ø���ÿ�����鼴ÿ��path��ͬ�ĳ�����������
	private void printArray(int[] ints, int len) {
		  int i;
		  for (i=0; i<len; i++) {
		   System.out.print(ints[i] + " ");
		  }
		  System.out.println();
	}
		  
	
	public static void main(String[] args){
		printPath pp = new printPath();
		tree t = new tree();
		node root = new node(5);
		t.root = root;
		t.insert(4, root);
		t.insert(2, root);
		t.insert(1, root);
		t.insert(7, root);
		
		t.insert(6, root);
		t.insert(3, root);
		
		pp.printPaths(root);
	}
	
	
}
