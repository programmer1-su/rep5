package datetimeformat;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		LocalDateTime local = LocalDateTime.of(2018, 11,2,2,34,22);
		System.out.printf("Local date time is %tY %<tB %<td %<tH %<tM %<tM \n", local);
		System.out.printf("Local date time is %tY %<tB %<td %<tT", local);
	}

}
