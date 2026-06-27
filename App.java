public class A {
    public static void main(String[] args) {
    	String s = "programming is language";
//    	List<String>list = Arrays.asList("springboot","java");
    	List<Integer>list = Arrays.asList(1,2,3,4,5);
//    	List<Employee>list = Arrays.asList(
//    			new Employee("A",4000,"IT"),
//    			new Employee("B",6000,"CS"));
    	String result = s.chars().mapToObj(c->(char)c).map(String::valueOf).distinct().collect(Collectors.joining());
    	System.out.println(result);
    }
# Feature 102 code changes added by shiva

private String name;
	private int salary;
	private String dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

}