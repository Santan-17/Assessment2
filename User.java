package AssignmentExam;
public class User{
	 private int id;
	  private String username;
	  private String email;
	  private double walletBalance;

	  public User(int id, String username, String email, double walletBalance) {
	    this.id = id;
	    this.username = username;
	    this.email = email;
	    this.walletBalance = walletBalance;
	  }

	  public int getId() {
	    return id;
	  }

	  public void setId(int id) {
	    this.id = id;
	  }

	  public String getUsername() {
	    return username;
	  }

	  public void setUsername(String username) {
	    this.username = username;
	  }
	  public String getEmail() {
		    return email;
		  }

		  public void setEmail(String email) {
		    this.email = email;
		  }

		  public double getWalletBalance() {
		    return walletBalance;
		  }

		  public void setWalletBalance(double walletBalance) {
		    this.walletBalance = walletBalance;
		  }

		  public boolean makePayment(double billAmount) {
			  if(billAmount <= getWalletBalance()) {
					setWalletBalance(getWalletBalance()-billAmount);
					return true;
				}
				return false;
			}
		}


class KYCUser extends User {
	private int rewardPoints;
	public KYCUser(int id, String userName, String emailId, double walletBalance) {
		super(id, userName, emailId, walletBalance);
	}
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
	
	public boolean makePayment(double billAmount) {
		if(billAmount <= getWalletBalance()) {
			setRewardPoints(getRewardPoints()+(int)(billAmount*0.1));
		}
		return super.makePayment(billAmount);

	}
}

