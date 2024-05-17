package homework_05_17;

import java.util.List;
import java.util.stream.Stream;

public class _2_Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student(1, "홍길동", 100));
		studentList.add(new Student(2, "임꺽정", 75));
		studentList.add(new Student(3, "장길산", 86));
		studentList.add(new Student(4, "정도전", 97));
		studentList.add(new Student(5, "이순신", 95));
		
		Stream<Student> studentStream = studentList.stream();
		
		Stream<Student> overScoreStudent =
				studentStream.filter(student -> student.getScore() >= 95);
		
		
				   
					
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
