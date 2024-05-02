package homework_05_02;

public class PublicOfficial extends Worker {

	@Override
	public void attendance() {
		// TODO Auto-generated method stub
		System.out.println("공무원 출근 확인.");
	}

	@Override
	public void working() {
		// TODO Auto-generated method stub
		System.out.println("공무원 업무 확인.");
	}

	@Override
	public void leave() {
		// TODO Auto-generated method stub
		System.out.println("공무원 퇴근 확인.");
	}

}
