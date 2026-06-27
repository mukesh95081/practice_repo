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
}