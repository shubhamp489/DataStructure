package dynamicProgrammingPattern;

public class mergeTwosortedlist {
	public ListNode mergetwoLists(ListNode list1 ,ListNode list2) {
		if(list1!=null && list2!=null) {
			if(list1!=null && list2!=null) {
				list1.next=mergetwoLists(list1.next, list2);
				return list1;
			}
			else {
				list2.next=mergetwoLists(list1, list2.next);
				return list2;
			}
		}
		
		if(list1==null)return list2;
		
		
		
		return list1;
		
	}
	
	
	}

