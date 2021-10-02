class gradeBook
{
		public static void main(String args[])
		{
			int grade;
			
			if(grade>=90) {
				System.out.println('A');
			}
			else if(grade>=80) {
				System.out.println('B');
			}
		
			else if(grade>=70) {
				System.out.println('C');
			}
			else if(grade>=55) {
				System.out.println('D');
			}
			else{
				System.out.println("Fail");
			}
			
			
		}
}

	class weekday
	{
		public static void main(String args[])
		{
		int day;
		Scanner console = new Scanner(System.in);
		System.out.print("Enter number 1-7 : ");
		day = console.nextInt();
		switch(day)
		{
			case 1 :
         System.out.println("Sunday");

         break;

      case 2 :
         System.out.println("Monday");

         break;

      case 3 :
         System.out.println("Tuesday");

         break;

      case 4 :
         System.out.println("Wednesday");

         break;

      case 5 :
         System.out.println("Thursday");

         break;

      case 6 :
         System.out.println("Friday");

         break;

      case 7 :
         System.out.println("Saturday");

         break;

      default :
         System.out.println("Invalid input");
		}
	}
}

class weekday
{
	public static void main(String args[])
	{
		int num = 6;

        if(num % 2 == 1) {
            System.out.println("Cool!");
        }
        else if (num % 2 ==0 && num >=2 && num < 5) {
            System.out.println("Not Cool!");
        }
        else if (num % 2 ==0 && num >=6 && num < 20) {
            System.out.println("Cool!");
        }

        else {
            System.out.println("Not Cool!");
        }
	}
	}


