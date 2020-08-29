import java.util.HashSet;
import java.util.Stack;

public class Code_02_DFS {
	//深度优先遍历
	public static void dfs(Node node) {
		if (node == null) {
			return;
		}
		Stack<Node> stack = new Stack<>();//栈
		HashSet<Node> set = new HashSet<>();//防止重复加入栈
		stack.add(node);//进栈
		set.add(node);//进集合
		System.out.println(node.value);//打印
		while (!stack.isEmpty()) {//栈是否为空
			Node cur = stack.pop();//从栈中弹出一个当前节点
			for (Node next : cur.nexts) {//遍历当前节点的所有邻居节点
				if (!set.contains(next)) {//如果当前节点的任何一个孩子存在一个没走过的
					stack.push(cur);//再把当前节点进栈
					stack.push(next);//把下一个节点进栈
					set.add(next);//集合注册
					System.out.println(next.value);//打印下一节点值
					break;//退出循环
				}
			}
		}
	}

}
