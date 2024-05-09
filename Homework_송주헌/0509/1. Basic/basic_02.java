package homework_05_09;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class basic_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(2023, 2, 24);
	
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		String formattedDate = dateFormat.format(calendar.getTime());
		
        System.out.println(formattedDate);
        
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        String formattedDate2 = dateFormat2.format(calendar.getTime());
        
        System.out.println(formattedDate2);
		
		
		
		
		
		
		
		
	}

}
