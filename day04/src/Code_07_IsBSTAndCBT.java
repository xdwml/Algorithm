import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Code_07_IsBSTAndCBT {
	public static class Node {
		public int value;
		public Node left;
		public Node right;
		public Node(int data) {
			this.value = data;
		}
	}
	//判断搜索二叉树
	public static boolean isBST(Node head) {
		boolean b=false;
		int tmp=0;
		if (head != null) {
			Stack<Node> stack = new Stack<Node>();
			while (!stack.isEmpty() || head != null) {
				if (head != null) { //把左边界全压栈
					stack.push(head);
					head = head.left;
				} else { //左边界压完运行此
					head = stack.pop();//弹出来
					b=head.value>tmp?true:false;
					tmp=head.value;
					head = head.right;//当前节点右移
				}
			}
		}
		return b;
	}
	public static boolean isBST2(Node head) {
		if (head == null) {
			return true;
		}
		boolean res = true;
		Node pre = null;
		Node cur1 = head;
		Node cur2 = null;
		while (cur1 != null) {
			cur2 = cur1.left;
			if (cur2 != null) {
				while (cur2.right != null && cur2.right != cur1) {
					cur2 = cur2.right;
				}
				if (cur2.right == null) {
					cur2.right = cur1;
					cur1 = cur1.left;
					continue;
				} else {
					cur2.right = null;
				}
			}
			if (pre != null && pre.value > cur1.value) {
				res = false;
			}
			pre = cur1;
			cur1 = cur1.right;
		}
		return res;
	}
	//判断完全二叉树
	public static boolean isCBT(Node head) {
		if (head == null) {
			return true;
		}
		Queue<Node> queue = new LinkedList<Node>();
		boolean leaf = false;
		Node l = null;
		Node r = null;
		queue.offer(head);
		while (!queue.isEmpty()) {
			head = queue.poll();
			l = head.left;
			r = head.right;
			if ((leaf && (l != null || r != null))//一旦开启阶段，后续节点必须是空，否则返回false
					||
					(l == null && r != null)) {//情况1：左孩子为空，右孩子不空，直接返回false
				return false;
			}
			if (l != null) {
				queue.offer(l);//先加左
			}
			if (r != null) {
				queue.offer(r);//再加右
			}
			if(l==null || r==null){
				leaf = true;//开启阶段，后续节点都必须是叶节点
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Node head = new Node(4);
		head.left = new Node(2);
		head.right = new Node(6);
		head.left.left = new Node(1);
		head.left.right = new Node(3);
		head.right.left = new Node(5);
		head.right.right = new Node(4);//此处设置为非搜索二叉树
		System.out.println("二叉搜索树:"+isBST(head));
		System.out.println("二叉搜索树:"+isBST2(head));
		System.out.println("完全二叉树:"+isCBT(head));

	}
}