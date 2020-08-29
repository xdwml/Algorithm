import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Code_01_BFS {
	//宽度优先遍历
	public static void bfs(Node node) {
		if (node == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<>();//队列
		HashSet<Node> set = new HashSet<>();//HashSet表示该点进没进过队列
		queue.add(node);//把源节点加入队列
		set.add(node);//把源节点加入set，注册节点
		while (!queue.isEmpty()) {
			Node cur = queue.poll();//从队列中拿出当前节点，打印
			System.out.println(cur.value);
			for (Node next : cur.nexts) {//遍历当前节点的所有邻居节点
				if (!set.contains(next)) {//没有加入到队列的节点，全部加入到队列中去
					set.add(next);//节点加入队列
					queue.add(next);//节点注册
				}
			}
		}
	}

}
