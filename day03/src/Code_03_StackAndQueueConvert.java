import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *如何仅用队列结构实现栈结构？
 如何仅用栈结构实现队列结构？
 */
public class Code_03_StackAndQueueConvert {
	//两个栈实现队列
	public static class TwoStacksQueue {
		private Stack<Integer> stackPush;
		private Stack<Integer> stackPop;
		public TwoStacksQueue() {
			stackPush = new Stack<Integer>();
			stackPop = new Stack<Integer>();
		}
		public void push(int pushInt) {
			stackPush.push(pushInt);
		}
		public int poll() {
			if (stackPop.empty() && stackPush.empty()) {
				throw new RuntimeException("Queue is empty!");
			} else if (stackPop.empty()) {
				while (!stackPush.empty()) {
					stackPop.push(stackPush.pop());
				}
			}
			return stackPop.pop();
		}
		public int peek() {
			if (stackPop.empty() && stackPush.empty()) {
				throw new RuntimeException("Queue is empty!");
			} else if (stackPop.empty()) {
				while (!stackPush.empty()) {
					stackPop.push(stackPush.pop());
				}
			}
			return stackPop.peek();
		}
	}
	//两个队列实现栈
	public static class TwoQueuesStack {
		private Queue<Integer> queue;
		private Queue<Integer> help;
		public TwoQueuesStack() {
			queue = new LinkedList<Integer>();
			help = new LinkedList<Integer>();
		}
		public void push(int pushInt) {
			queue.add(pushInt);
		}
		public int pop() {
			if (queue.isEmpty()) {
				throw new RuntimeException("Stack is empty!");
			}
			while (queue.size() > 1) {
				help.add(queue.poll());
			}
			int res = queue.poll();
			swap();
			return res;
		}
		public int peek() {
			if (queue.isEmpty()) {
				throw new RuntimeException("Stack is empty!");
			}
			while (queue.size() != 1) {
				help.add(queue.poll());
			}
			int res = queue.poll();//弹出最后一个数
			help.add(res);//再压回去
			swap();//交换引用
			return res;
		}
		private void swap() {
			Queue<Integer> tmp = help;
			help = queue;
			queue = tmp;
		}
	}

}
