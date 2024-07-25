import java.util.Scanner;
public class main{
	public static void greet(){
		System.out.print("Enter Your Name :: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Welcome " + name+ "!");
	}
	public static int option(){
		System.out.println("1.Math Calcualator");
		System.out.println("2.Age Calculator");
		System.out.println("3.College List");
		System.out.println("4.tables");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Choose a option :: ");
		int user_option = sc.nextInt();
		return user_option;
	}	
	public static void calculator(){
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Division");
		System.out.println("4.Multiplication");
		Scanner sc = new Scanner(System.in);
		System.out.print("Select a option ::");
		int user = sc.nextInt();


		System.out.print("Enter first number :: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number :: ");
		int num2 = sc.nextInt();


		if (user == 1){
			System.out.println("sum of two numbers = "+(num1+num2));
		}
		else if (user == 2){
			System.out.println("Subtraction of two numbers = "+(num1-num2));
		}
		else if (user == 3){
			System.out.println("Division of two numbers = "+(num1/num2));
		}
		else if (user == 4){
			System.out.println("Multiplication of two numbers = "+(num1*num2));
		}
		else {
			System.out.println("Please enter a correct option");
		}

	}
	public static void tables(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to get table :: ");
		int a = sc.nextInt();
		for (int i = 1 ; i <= 10 ; i++){
			System.out.println(a+"x"+i+"="+(i*a));
		}
	}

	public static void agecalculator(){
		System.out.println("Welcome to age calculator");
		System.out.println("Work in progress will meet soon");
	}
	public static void list(){
		System.out.println("here are some colleges");
		System.out.println("1.Thakur college of science and commerce");
		System.out.println("2.st.francis");
		System.out.println("3.vartak college");
		System.out.println("4.nallasopara college");
		Scanner sc = new Scanner(System.in);
		System.out.print("Select a option :: ");
		int user = sc.nextInt();
		if (user == 1) {
			System.out.println("Thakur College of Science and Commerce (TCSC) is a prominent educational institution located in Mumbai, Maharashtra, India. It is part of the Thakur Educational Trust, which has a reputation for providing quality education in various fields. Here are some key points about Thakur College of Science and Commerce:\n" + //
								"\n" + //
								"    Establishment and Affiliation: TCSC was established in 1992 and is affiliated with the University of Mumbai. It offers a range of undergraduate and postgraduate programs in science, commerce, and management.\n" + //
								"\n" + //
								"    Campus and Infrastructure: The college boasts a modern campus with state-of-the-art facilities, including well-equipped laboratories, a comprehensive library, computer labs, and sports amenities. The infrastructure is designed to support both academic and extracurricular activities.\n" + //
								"\n" + //
								"    Academic Programs: TCSC offers a variety of courses in disciplines such as B.Sc. (Bachelor of Science), B.Com. (Bachelor of Commerce), BMS (Bachelor of Management Studies), and M.Sc. (Master of Science). The college also provides specialized courses and professional certifications.\n" + //
								"\n" + //
								"    Faculty and Research: The college is known for its experienced and qualified faculty members who are dedicated to providing high-quality education. TCSC encourages research and innovation, with various departments engaging in research projects and collaborations.\n" + //
								"\n" + //
								"    Student Support and Extracurricular Activities: TCSC emphasizes holistic development and offers numerous opportunities for students to engage in extracurricular activities. There are various clubs and societies, including those focused on cultural activities, sports, and social service. The college also provides career counseling and placement support to help students transition into the professional world.\n" + //
								"\n" + //
								"    Community Engagement: The college actively participates in community service and social initiatives, fostering a sense of social responsibility among students. Various outreach programs and initiatives are organized to give back to the community.\n" + //
								"\n" + //
								"    Achievements and Accolades: TCSC has received several accolades for its academic excellence and contributions to education. It is recognized for its student-centric approach and commitment to nurturing talent.\n" + //
								"\n" + //
								"Thakur College of Science and Commerce continues to be a preferred choice for students seeking quality education and a conducive learning environment in Mumbai.\n" + //
								"");
		}
		else if (user == 2) {
			System.out.println("St. Francis College is a well-regarded educational institution that typically offers a broad range of undergraduate and graduate programs. However, there are several colleges named St. Francis College around the world, each with its unique characteristics and offerings. Here, I'll provide an overview of St. Francis College in Brooklyn, New York, which is one of the more prominent institutions with that name:\n" + //
								"\n" + //
								"    Location and History: St. Francis College is located in Brooklyn Heights, New York City. It was founded in 1859 by the Franciscan Brothers and has a rich history of providing education rooted in the Franciscan tradition of service, humility, and respect for all individuals.\n" + //
								"\n" + //
								"    Academic Programs: The college offers a variety of undergraduate programs in fields such as Business, Health Sciences, Education, and the Arts. Additionally, there are several graduate programs available, including those in Accounting, Management, and Psychology.\n" + //
								"\n" + //
								"    Campus and Facilities: St. Francis College features a modern urban campus with state-of-the-art facilities. These include advanced laboratories, a comprehensive library, a fitness center, and spaces for student activities. The college's location in Brooklyn Heights provides students with access to the vibrant cultural and professional opportunities of New York City.\n" + //
								"\n" + //
								"    Faculty and Academics: The college is known for its dedicated and experienced faculty members who prioritize personalized education and student success. St. Francis College maintains small class sizes to ensure individualized attention and support for each student.\n" + //
								"\n" + //
								"    Student Life and Extracurriculars: St. Francis College offers a vibrant student life with numerous clubs, organizations, and sports teams. Students can engage in activities ranging from student government and academic clubs to arts and cultural societies. The college also emphasizes community service and encourages students to participate in volunteer work.\n" + //
								"\n" + //
								"    Career Services and Alumni Network: The college provides robust career services, including internships, job placements, and career counseling. St. Francis College boasts a strong alumni network that actively supports current students through mentorship and professional opportunities.");
		}
		else if (user == 3) {
			System.out.println("Vartak College, officially known as Vidyavardhini’s Annasaheb Vartak College of Arts, Kedarnath Malhotra College of Commerce and E.S. Andrades College of Science, is a prominent educational institution located in Vasai, Maharashtra, India. Here are some key points about Vartak College:\n" + //
								"\n" + //
								"    Establishment and Affiliation: Vartak College was established in 1970 and is affiliated with the University of Mumbai. It was founded by Vidyavardhini, an educational trust dedicated to promoting education in the region.\n" + //
								"\n" + //
								"    Academic Programs: The college offers a wide range of undergraduate and postgraduate programs in Arts, Commerce, and Science. These include B.A., B.Com., B.Sc., M.A., M.Com., and M.Sc. programs. The college also offers vocational and professional courses to cater to the diverse needs of students.\n" + //
								"\n" + //
								"    Campus and Infrastructure: Vartak College has a well-developed campus with modern facilities. The infrastructure includes spacious classrooms, well-equipped laboratories, a comprehensive library, and sports facilities. The college also has an auditorium and seminar halls for various academic and cultural events.\n" + //
								"\n" + //
								"    Faculty and Research: The college boasts a team of experienced and qualified faculty members who are committed to providing quality education. The faculty is actively involved in research and regularly publishes papers in national and international journals. The college encourages research activities and provides support for faculty and student research projects.\n" + //
								"\n" + //
								"    Student Support and Extracurricular Activities: Vartak College places a strong emphasis on holistic development and offers numerous opportunities for students to engage in extracurricular activities. There are various clubs and societies, including those focused on cultural activities, sports, and social service. The college also provides career counseling, placement support, and skill development programs to help students prepare for their future careers.\n" + //
								"\n" + //
								"    Community Engagement: The college actively participates in community service and social initiatives. Various outreach programs and activities are organized to contribute to the community and instill a sense of social responsibility in students.\n" + //
								"\n" + //
								"    Achievements and Recognition: Over the years, Vartak College has earned a reputation for academic excellence and has received several accolades and recognitions. The college's commitment to quality education and student development has made it a preferred choice for students in the region.\n" + //
								"\n" + //
								"    Alumni Network: The college has a strong and active alumni network that plays a significant role in supporting current students. Alumni often participate in college events, offer mentorship, and provide career guidance and opportunities to students.\n" + //
								"\n" + //
								"Vartak College continues to be a leading institution in Vasai, Maharashtra, known for its dedication to academic excellence and the overall development of its students.\n" + //
								"");
		}
		else if (user == 4){
		System.out.println(" Nallasopara has seen rapid population growth, leading to high population density. This has put pressure on housing and infrastructure, often resulting in overcrowded living conditions.\n" + //
						"Affordable housing is a significant concern. Many residents live in modest accommodations due to financial constraints. 100% placement garunteed in dmart");
		}
		else {
			System.out.println("select a correct option");
		}
	} 

	public static void main(String args[]){
		greet();
		int a = option();
		if (a == 1){
			calculator();
		}else if(a == 2){
			agecalculator();
		}
		else if(a ==3){
			list();
		}else if(a == 4){
			tables();
		}
		else{
			System.out.println("Enter a valid option ");
		}
	}
}
