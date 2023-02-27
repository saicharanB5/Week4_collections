package Collections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Queue1_Tester {
	
	public static List<Deque<Queue1>> splitQueue(Deque<Queue1> patientsQueue) {
		List<Deque<Queue1>> queuesList = new ArrayList<Deque<Queue1>>();
		Deque<Queue1> seniorQueue = new ArrayDeque<Queue1>();
		Deque<Queue1> normalQueue = new ArrayDeque<Queue1>();
		
		for (Queue1 patient : patientsQueue) {
			if(patient.getAge() >= 60) {
				seniorQueue.add(patient);
			}
			else {
				normalQueue.add(patient);
			}
		}
		
		queuesList.add(seniorQueue);
		queuesList.add(normalQueue);
		
		return queuesList;
	}
	
	public static void main(String[] args) {
		
		Queue1 patient1 = new Queue1("Jack","Male",25);
		Queue1 patient2 = new Queue1("Tom","Male",64);
		Queue1 patient3 = new Queue1("Simona","Female",24);
		
		Deque<Queue1> patientsQueue = new ArrayDeque<Queue1>();
		patientsQueue.add(patient1);
		patientsQueue.add(patient2);
		patientsQueue.add(patient3);
		
		List<Deque<Queue1>> queuesList = splitQueue(patientsQueue);
	
		int counter=0;
		for (Deque<Queue1> queue : queuesList) {
			if(counter==0)
				System.out.println("Patients in the senior queue\n============================");
			else
				System.out.println("Patients in the normal queue\n============================");
			
			for (Queue1 patient : queue) {
				System.out.println("Name : "+patient.getName());
				System.out.println("Age : "+patient.getAge());
				System.out.println();
			}
			counter++;
		}	
	}
	
}