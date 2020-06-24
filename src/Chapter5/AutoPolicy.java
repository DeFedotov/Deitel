package Chapter5;

import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

public class AutoPolicy {

	private int accountNumber;
	private String makeAndModel;
	private String state;

	public AutoPolicy(int accountNumber, String makeAndModel, String state){
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getMakeAndModel() {
		return makeAndModel;
	}

	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public boolean isNoFaultState(){

		boolean noFaultState;

		switch (getState()){
			case "MA" :case "NJ": case "NY": case "PA":
				noFaultState = true;
				break;
			default:
				noFaultState = false;
				break;
		}

		return noFaultState;
	}
}

class AutoPolicyTest{
	public static void main(String[] args) {

		AutoPolicy policy1 = new AutoPolicy(11111, "Toyota Camry", "NJ");
		AutoPolicy policy2 = new AutoPolicy(22222, "Ford Fusion", "ME");

		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
	}

	public static void policyInNoFaultState(AutoPolicy policy){
		System.out.println("The auto policy:");
		System.out.printf(
				"Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
				policy.getAccountNumber(), policy.getMakeAndModel(),
				policy.getState(),
				(policy.isNoFaultState() ? "is": "is not"));

	}
}