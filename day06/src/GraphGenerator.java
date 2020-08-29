public class GraphGenerator {
	//图的生成
	public static Graph createGraph(Integer[][] matrix) {
		Graph graph = new Graph();
		for (int i = 0; i < matrix.length; i++) {
			Integer weight = matrix[i][0];
			Integer from = matrix[i][1];
			Integer to = matrix[i][2];
			if (!graph.nodes.containsKey(from)) {
				graph.nodes.put(from, new Node(from));//建立from点
			}
			if (!graph.nodes.containsKey(to)) {
				graph.nodes.put(to, new Node(to));//建立to点
			}
			Node fromNode = graph.nodes.get(from);//拿出from点
			Node toNode = graph.nodes.get(to);//拿出to点
			Edge newEdge = new Edge(weight, fromNode, toNode);//建立一个新的边
			fromNode.nexts.add(toNode);//from增加一条边
			fromNode.out++;//from出度++
			toNode.in++;//to入度++
			fromNode.edges.add(newEdge);//from加上新的边
			graph.edges.add(newEdge);//图加上新的边
		}
		return graph;
	}

}
