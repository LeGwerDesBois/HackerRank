import java.util.*;

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

class TrierTab implements Comparator<Student> {
	@Override
	public int compare(Student a, Student b) {
		if (Double.compare(b.getCgpa(), a.getCgpa()) > 0)
			return 1;
		if (Double.compare(b.getCgpa(), a.getCgpa()) < 0)
			return -1;
		else {
			return a.getFname().equalsIgnoreCase(b.getFname()) ? b.getId() - a.getId()
					: a.getFname().compareTo(b.getFname());
		}

	}
}

// Complete the code
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		TrierTab trierTab = new TrierTab();
		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);

			studentList.add(st);

			testCases--;
		}
		Collections.sort(studentList, trierTab);
		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}
}

/*
 * 33 Rumpa 3,68 85 Ashis 3,85 56 Samiha 3,75 19 Samara 3,75 22 Fahim 3,76
 */
