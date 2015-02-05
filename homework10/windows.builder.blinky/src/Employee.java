package Company;

public class Employee {
	public Employee() {

	}

	private String contentPane;

	public String getContentPane() {
		return contentPane;
	}

	public void setContentPane(String contentPane) {
		this.contentPane = contentPane;
	}

	public String getTxtName() {
		return txtName;
	}

	public void setTxtName(String txtName) {
		this.txtName = txtName;
	}

	public String getTxtFamily() {
		return txtFamily;
	}

	public void setTxtFamily(String txtFamily) {
		this.txtFamily = txtFamily;
	}

	public long getAge() {
		return txtAge;
	}

	public void setTxtAge(long txtAge) {
		this.txtAge = txtAge;
	}

	public long getSalary() {
		return txtSalary;
	}

	public void setTxtSalary(long txtSalary) {
		this.txtSalary = txtSalary;
	}

	public String getTxtPhoneNumber() {
		return txtPhoneNumber;
	}

	public void setTxtPhoneNumber(String txtPhoneNumber) {
		this.txtPhoneNumber = txtPhoneNumber;
	}

	public String getTxtName_1() {
		return txtName_1;
	}

	public void setTxtName_1(String txtName_1) {
		this.txtName_1 = txtName_1;
	}

	private String txtName;
	private String txtFamily;
	private long txtAge;
	private long txtSalary;
	private String txtPhoneNumber;
	private String txtName_1;

	public Employee(String contentPane, String txtName, String txtFamily,
			long txtAge, long txtSalary, String txtPhoneNumber,
			String txtName_1) {
		super();
		this.contentPane = contentPane;
		this.txtName = txtName;
		this.txtFamily = txtFamily;
		this.txtAge = txtAge;
		this.txtSalary = txtSalary;
		this.txtPhoneNumber = txtPhoneNumber;
		this.txtName_1 = txtName_1;
	}

}