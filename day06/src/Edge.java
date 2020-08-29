public class Edge {
	public int weight;//边的权重
	public Node from;//出发点
	public Node to;//到达点
	public Edge(int weight, Node from, Node to) {
		this.weight = weight;
		this.from = from;
		this.to = to;
	}
}
