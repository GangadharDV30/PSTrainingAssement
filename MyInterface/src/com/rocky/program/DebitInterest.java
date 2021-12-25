package com.rocky.program;

public interface DebitInterest extends Interest {
	 void deductMonthlyInt();
	 void deductHalfYearlyInt();
	 void deductAnnualInt();
}
