import java.util.Scanner;

public class main {

	public static void main(String [] args) throws Exception{
	
		Scanner scan = new Scanner(System.in);
		
		int select;
        boolean condition = true;

        do {
            System.out.println("Choose an option:");
            System.out.println("1: Student List");
            System.out.println("2: Lecturer List");
            System.out.println("3: Absent Students");
            System.out.println("4: System out");
            select = scan.nextInt();
        switch(select) {

        case 1    :
        	student student= new student ("Tugberk", "Basaran", 20453216);
        	student student1 = new student ("Ali", "Yılmaz", 22564516);
        	student student2 = new student("Zehra","Gün", 21516546);
        	student student3 = new student("Hüseyin","Katırcı", 21516546);
        	student assistant = new lecturer("Kemal","Doğan", 2314564);
        	student student4 = new student("Çisem","Ateş", 865740123);
        	student student5 = new student("Cansel","Kar", 865740123);
            
            student.showInspection();
            student1.showInspection();
            student2.showInspection();
            student3.showInspection();
            student4.showInspection();
            student5.showInspection();
            assistant.showInspection();


            break;
            
        case 2:
        	lecturer lecturer= new lecturer ("Anıl", "Tilki", 20453216);
        	lecturer lecturer1 = new lecturer ("Erkan", "Nacar", 22564516);
        	lecturer lecturer2 = new lecturer("Eda","Sadık", 2177786);
        	lecturer lecturer3 = new lecturer("Göker","Doğan", 2314564);
        	lecturer lecturer4= new lecturer("Hüsnü","Değirmenci", 1074564);
           	lecturer lecturer5= new lecturer("Toprak","Barlas", 1518964);
            
        	lecturer.showInspection();
        	lecturer1.showInspection();
        	lecturer2.showInspection();
        	lecturer3.showInspection();
        	lecturer4.showInspection();
        	lecturer5.showInspection();
        	break; 
        	
        case 3:
        	student Absentstudent= new student ("Hüseyin","Katırcı", 21516546);
        	student Absentstudent1 = new student ("Ali", "Yılmaz", 22564516);
        	student Absentstudent2 = new student("Zehra","Gün", 21516546);
        	student Absentassistant = new lecturer("Kemal","Doğan", 2314564);
        	student Absentstudent3 = new student("Çisem","Ateş", 865740123);
        
        	
        	        	
        	
        	Absentstudent.showInspection();
        	Absentstudent1.showInspection();
        	Absentstudent2.showInspection();
        	Absentassistant.showInspection();
        	Absentstudent3.showInspection();
        	
        	break; 
        	
        case 4: 
            System.out.println("program terminated.");
            condition = false;

            break;
        default:
        }
        }
        while(condition);
	}	
}
