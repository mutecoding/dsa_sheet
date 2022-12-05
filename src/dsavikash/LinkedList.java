package dsavikash;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {10,20,30,40,50};
//		int []nums = {10};
		Node n1 = new Node(nums[0]);
		Node head = n1;
		Node currentNode = head;
		int idx=1;
		while(idx<nums.length) {
			currentNode.next = new Node(nums[idx]);
			currentNode = currentNode.next;
			idx++;
		}
//		Node.display(head);
//		head = null;
//		head=Node.Reverse(head);
//		Node.display(head);
//		head= Node.addAtFirst(head, 0);;
//		head=Node.removeAtFirst(head);
//		Node.display(head);
//		head=Node.removeAtEnd(head);
//		Node.display(head);
//		head = Node.removeAtGivenPosition(head, 5);
//		Node.display(head);
//		System.out.println(Node.size(head)+"-> "+head);
//		Node.display(head);
		
		//-----------------------------------
		
		int []nums1 = {10,20,30,40,50};
//		int []nums2 = {10};
		DNode Dn1 = new DNode(nums1[0]);
		DNode Dhead = Dn1;
		DNode DcurrentNode = Dhead;
		int Didx=1;
		while(Didx<nums1.length) {
			DNode node = new DNode(nums1[Didx]);
			DcurrentNode.next = node;
			node.pre = DcurrentNode;
			DcurrentNode = DcurrentNode.next;
			Didx++;
		}
		DNode.display(Dhead);
		Dhead = DNode.addAtFirstInD(Dhead, 0);
		DNode.display(Dhead);

	}

}
class DNode {
	int data;
	DNode pre;
	DNode next;
	DNode(int data){
		this.data=data;
		this.pre = null;
		this.next= null;
	}
	public static void display(DNode head) {
		if(head==null) {
			System.out.println("------------'Display' D Link-List is empty----------------");
			return;
		}
		System.out.println("------------Display D Link-List----------------");
		DNode temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
		System.out.println("-----------------------------------");
	}
	public static DNode addAtFirstInD(DNode head,int data) {
		DNode temp = new DNode(data);
		head.pre =temp;
		temp.next=head;
		head = temp;
		return head;
	}
	public static void addAtEnd(DNode head,int data) {
		DNode temp = head;
		while(temp.next!=null) {
			temp =temp.next;
		}
		DNode add = new DNode(data);
		temp.next = add;
		add.pre = temp;
	}
	public static void addAtGivenPosition(DNode head,int data, int position) {
//		DNode temp = head;
//		while(position>1) {
//			temp =temp.next;
//			position--;
//		}
//		DNode newNode = new DNode(data);
//		newNode.next = temp.next;
//		temp.next =newNode;
	}
}
class Node {
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
	public static void display(Node head) {
		if(head==null) {
			System.out.println("------------'Display' Link-List is empty----------------");
			return;
		}
		System.out.println("------------Display Link-List----------------");
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
		System.out.println("-----------------------------------");
	}
	public static int size(Node head) {
		int _size = 0;
		Node temp = head;
		while(temp!=null) {
			_size++;
			temp=temp.next;
		}
		return _size;
	}
	public static Node addAtFirst(Node head,int data) {
		Node temp = new Node(data);
		temp.next=head;
		head =temp;
		return head;
	}
	public static void addAtEnd(Node head,int data) {
		Node temp = head;
		while(temp.next!=null) {
			temp =temp.next;
		}
		temp.next = new Node(data);
	}
	public static void addAtGivenPosition(Node head,int data, int position) {
		Node temp = head;
		while(position>1) {
			temp =temp.next;
			position--;
		}
		Node newNode = new Node(data);
		newNode.next = temp.next;
		temp.next =newNode;
	}
	
	public static Node removeAtFirst(Node head) {
		Node temp = head;
		if (head==null) {
			System.out.println("'Remove': Linked List is empty");
			return head;
		}
		head =temp.next;
		return head;
	}
	
	public static Node removeAtEnd(Node head) {
		if(head==null||head.next==null) {
			return removeAtFirst(head);
		}
		Node temp = head;
		while(temp.next.next!=null) {
			temp =temp.next;
		}
		temp.next = null;
		return head;
	}
	
	public static Node removeAtGivenPosition(Node head, int position) {
		if(position<1) {
			System.out.println("'Remove': Position should be greater than 0.");
			return head;
		}else if(head==null) {
			System.out.println("'Remove': Linked List is empty");
			return head;
		}else if(head.next==null&&position==1) {
			return removeAtFirst(head);
		}else if(position==1) {
			return removeAtFirst(head);
		}else {
			Node temp = head;
			while(position>2&&temp!=null) {
				temp =temp.next;
				position--;
			}
			if(temp==null||temp.next==null) {
				System.out.println("'Remove': Position should be Less than Size of List.");
				return head;
			}else {
				temp.next = temp.next.next;
				return head;
			}
		}
	}
	public static Node Reverse(Node head) {
		if(head==null||head.next==null) return head;
		Node temp=head;		
		Node pre = null;
		Node next = null;
		while(temp!=null) {
			next = temp.next;
			temp.next = pre;
			pre = temp;
			temp = next;
		}
		return pre;
	}
	public static Node displayInReverseOrder(Node head) {
		if(head==null||head.next==null) return head;
		Node temp=head;		
		Node pre = null;
		Node next = null;
		while(temp!=null) {
			next = temp.next;
			temp.next = pre;
			pre = temp;
			temp = next;
		}
		return pre;
	}
	
	
}
