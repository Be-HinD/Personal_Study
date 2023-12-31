import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AdjListTest {
	static class Node {
		int vertex; //관계를 맺고 있는 타 정점 정보
		Node next; //연결리스트 유지를 위한 다음 노드 참조
		
		public Node(int vertex, Node next) {
			super();
			this.vertex = vertex;
			this.next = next;
		}

		@Override
		public String toString() {
			return "Node [vertex=" + vertex + ", next=" + next + "]";
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		
		Node adjList[] = new Node[V]; //헤드 리스트 : 연결리스트가 정점 수만큼 관리
		
		for(int i=0; i< E; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			adjList[from] = new Node(to, adjList[from]); //첫 원소 삽입
			adjList[to] = new Node(from, adjList[to]);
		}
		
		for(Node node : adjList) { //node : 각 정점의 인접리스트의 헤드
			System.out.println(node);
		}
    
	}
}
