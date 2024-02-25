package assignment;

public class VotingEligible {
	public static boolean votingCheck(int age)
	{
	return(age>=18);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean eligibility=VotingEligible.votingCheck(25);
		System.out.println("Eligibility of Candidate for Voting is: " +eligibility);

	}

}
