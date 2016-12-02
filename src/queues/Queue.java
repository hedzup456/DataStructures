package queues;

public class Queue {
	public Queue next, previous;
	public Job job;
	
	public Queue(Job job, Queue next, Queue previous){
		this.job = job;
		this.next = next;
		this.previous = previous;
	}
	public void removeQueItem(){
		if (next != null) next.previous = previous;
		if (previous != null) previous.next = next;
	}
	public void addNewQueueItem(Queue next){
		Queue lastItem = this;
		while (lastItem != null){
			lastItem = lastItem.next;
		}
		lastItem.next = next;
	}
	public void addNewQueueItem(Job nextJob){
		Queue qi = new Queue(nextJob, null, null);
		addNewQueueItem(qi);
	}
	public static void main(String[] args){
		Queue q = new Queue(new Job("Do a thing", "It must be done"), null, null);
		q.addNewQueueItem(new Job("DO MORE THING", "DO IT"));
		q.next.addNewQueueItem(new Job("Stop doing things"));
		System.out.println("BREAK");
	}
}
