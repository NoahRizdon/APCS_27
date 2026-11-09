public class StepTracker{
	int minSteps;
	int steps;
	int days;
	int activeDays;

	public StepTracker(int a){
	minSteps = a;
	steps = 0;
	days = 0;
	activeDays = 0;
	}

	public void addDailySteps(int moreSteps){
		steps+=moreSteps;
		days++;
		if(moreSteps>=minSteps){
		activeDays++;
	}
	}

	public int activeDays(){
	return activeDays;
	}

	public double averageSteps(){
		if(days==0){
			return 0.0;
		}
		else{
		return (double)(steps)/days;
	}
}
}