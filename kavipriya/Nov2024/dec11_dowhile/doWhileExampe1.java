import java.util.*;

class doWhileExampe1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean mainMenuFlag = true;
        System.out.println("welcome to Program1");

        System.out.println("ENTRY OF MAINMENU do while Loop");
        do {
            System.out.println("Select the Mainscreen Courses");
            System.out.println("1. QSPIDER\n2. SCHOOL\n3. EXIT");

            int mainscreenCh = sc.nextInt();

            switch (mainscreenCh) {//switch start
                case 1: {//qspider submenu repeat
                    int LoopCount = 1;
                    boolean qspiderFlag = true;

                    do {

                        System.out.println("Welcome to QSPIDER and Select the Course details");
                        System.out.println("1. JAVA\n2. SQL\n3. EXIT");
                        int qspiderchoice = sc.nextInt();

                        switch (qspiderchoice) {//qspider switch
									case 1:
										System.out.println("JAVA faculty is TABREZ SIRRR");
										break;
									case 2:
										System.out.println("SQL faculty is NAGARAJ SIRRR");
										break;
									case 3:
										qspiderFlag = false;
										break;
									default:
									 System.out.println("INVALID selection of qspider course");
									 break;
								}//qspider switch
						LoopCount++;
                        System.out.println("qspiderFlag: " + qspiderFlag + " LoopCount " + LoopCount);
                    } while (qspiderFlag);  // This should loop while qspiderFlag is true
                    System.out.println("EXIT OF QSPIDER do while Loop");
                    break;
                }//qspider submenu repeat

                case 2: {// School submenu repeat
                    // Add school submenu handling here
                     int LoopCount = 1;
                    boolean schoolFlag = true;

                    do {

                        System.out.println("Welcome to school and Select the Course details");
                        System.out.println("1. SSLC\n2.HSLC \n3. EXIT");
                        int qspiderchoice = sc.nextInt();

                        switch (qspiderchoice) {//qspider switch
									case 1:
										System.out.println("SSLC faculty is HEMANATH SIRRR");
										break;
									case 2:
										System.out.println("HSLC  faculty is ARUL SIRRR");
										break;
									case 3:
										schoolFlag = false;
										break;
									default:
									 System.out.println("INVALID selection of SCHOOL course");
									 break;
								}//qspider switch
						LoopCount++;
                        System.out.println("schoolFlag: " + schoolFlag + " LoopCount " + LoopCount);
                    } while (schoolFlag);  // This should loop while qspiderFlag is true
                    System.out.println("EXIT OF SCHOOL do while Loop");
                    break;
                }// School submenu repeat

                case 3: {//exit the main menu
                   
                    mainMenuFlag = false;
                    System.out.println("mainMenuFlag value while " + mainMenuFlag);
                    break;
                }//exit the main menu

            }//switch end

        } while (mainMenuFlag);  // This should loop while mainMenuFlag is true
       System.out.println("=======>>>>>>EXIT OF MAINMENU because  flag is false");
        System.out.println("******************EXIT OF program1.......:)**************");
    }
}




