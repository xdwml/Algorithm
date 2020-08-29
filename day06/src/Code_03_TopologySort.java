import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//拓扑排序
public class Code_03_TopologySort {

	//先决条件：有向图，无环
	public static List<Node> sortedTopology(Graph graph) {
		HashMap<Node, Integer> inMap = new HashMap<>();//
		Queue<Node> zeroInQueue = new LinkedList<>();
		for (Node node : graph.nodes.values()) {//遍历所有的点
			inMap.put(node, node.in);//注册所有点的入度
			if (node.in == 0) {//找到入度为0的节点
				zeroInQueue.add(node);//入度为0的点进这个对列
			}
		}
		//拓扑排序过程
		List<Node> result = new ArrayList<>();
		while (!zeroInQueue.isEmpty()) {
			Node cur = zeroInQueue.poll();//从入度为0的对列中拿出一个节点
			result.add(cur);//将该节点放入到排序列表中
			for (Node next : cur.nexts) {//遍历当前节点的所有下一个节点
				inMap.put(next, inMap.get(next) - 1);//将所有下一个节点入度-1
				if (inMap.get(next) == 0) {//如果入度等于0
					zeroInQueue.add(next);//添加到入度为0的序列
				}
			}
		}
		return result;
	}
}
