package com.ntt.Collections;

public class CurrentBankAccount {
	public void checkAccRemainingBlanceCurrent() {
		System.out.println("Balance of IDBI current acc is: ");
		
	}

	public void validateUser() {
		System.out.println("the owner of savings account can access this ");
	}
}

package com.ntt.Collections;

public class SavingsBankAccount {
	public void checkAccRemainingBlanceSavings() {
				System.out.println("Balance of IDBI savings acc is: ");
				}
		
	

	public void validateUser() {
		System.out.println("the owner of savings account can access this");
		
	}
	
}

package com.ntt.Collections;

public class Main {

	public static void main(String[] args) {
		CurrentBankAccount c=new CurrentBankAccount();
		SavingsBankAccount s=new SavingsBankAccount();
		c.checkAccRemainingBlanceCurrent();
		c.validateUser();
		s.checkAccRemainingBlanceSavings();
		s.validateUser();

	}

}

OUTPUT:
Balance of IDBI current acc is: 
the owner of savings account can access this 
Balance of IDBI savings acc is: 
the owner of savings account can access this
