package stundents;
		import java.util.HashMap;
		import java.util.Map;
		import java.util.Scanner;

		public class StudentAttendanceManagement {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Map<String, Boolean> attendance = new HashMap<>();

		        while (true) {
		            System.out.println("\nStudent Attendance Management");
		            System.out.println("1. Mark Attendance");
		            System.out.println("2. View Attendance");
		            System.out.println("3. Exit");
		            System.out.print("Enter your choice (1-3): ");
		            int choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    markAttendance(scanner, attendance);
		                    break;
		                case 2:
		                    viewAttendance(attendance);
		                    break;
		                case 3:
		                    System.out.println("Thank you for using the Student Attendance Management. Goodbye!");
		                    return;
		                default:
		                    System.out.println("Invalid choice! Please try again.");
		                    break;
		            }
		        }
		    }

		    private static void markAttendance(Scanner scanner, Map<String, Boolean> attendance) {
		        System.out.print("Enter the student name: ");
		        String studentName = scanner.next();

		        System.out.print("Is the student present? (true/false): ");
		        boolean isPresent = scanner.nextBoolean();

		        attendance.put(studentName, isPresent);
		        System.out.println("Attendance marked successfully!");
		    }

		    private static void viewAttendance(Map<String, Boolean> attendance) {
		        System.out.println("Attendance:");
		        for (Map.Entry<String, Boolean> entry : attendance.entrySet()) {
		            String studentName = entry.getKey();
		            boolean isPresent = entry.getValue();
		            System.out.println(studentName + ": " + (isPresent ? "Present" : "Absent"));
		        }
		    }
		

	}


