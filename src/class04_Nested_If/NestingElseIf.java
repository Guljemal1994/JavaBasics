package class04_Nested_If;

public class NestingElseIf {

	public static void main(String[] args) {

		
		/*If student completed a quiz we will check score
		 * if score>90-->geart job
		 * if score >80-->well done
		 * if score>70-->you could done better
		 * 
		 * If student did not completed the quiz--> not good pleasedo hw ontime
		 */
	
		boolean quizCompleted=true; //try false if i confused
		int score=46;
		
		if(quizCompleted) {
			System.out.println("Let's check your score");
		
			if(score>90) {
				System.out.println("Great job you study alot");
			}else if(score>80) {
				System.out.println("Well done");
			}else if (score>70) {
				System.out.println("you could done better");
			}else { 
				System.out.println("You faild");
			}
		}else {
			System.out.println("Please do HW intime");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
