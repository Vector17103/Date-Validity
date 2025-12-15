import java.util.*;

class DatePrint {

    void main() {

        // I create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // I declare integer variables for date, month and year
        int n, n1, n2, n3;

        // I declare string variables to split the date
        String s, s1, s2, s3;

        // I ask the user to enter the date in six-digit format (DDMMYY)
        System.out.println("Date Validity");
        System.out.println("Enter the date in six digit format:");
        n = sc.nextInt();

        // I convert the integer input into a string
        s = Integer.toString(n);

        // I extract day, month and year from the string
        s1 = s.substring(0, 2);   // day
        s2 = s.substring(2, 4);   // month
        s3 = s.substring(4);      // year

        // I convert day, month and year back to integers
        n1 = Integer.valueOf(s1);
        n2 = Integer.valueOf(s2);
        n3 = Integer.valueOf(s3);

        // I check if the year is a leap year
        if (n3 % 4 == 0) {

            // I check the month and validate the date for a leap year
            if (n2 == 1) {
                if (n1 >= 1 && n1 <= 31) {
                    System.out.println(n1 + "th January," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 2) {
                if (n1 >= 1 && n1 <= 29) {
                    System.out.println(n1 + "th February," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 3) {
                if (n1 >= 1 && n1 <= 31) {
                    System.out.println(n1 + "th March," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 4) {
                if (n1 >= 1 && n1 <= 30) {
                    System.out.println(n1 + "th April," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 5) {
                if (n1 >= 1 && n1 <= 31) {
                    System.out.println(n1 + "th May," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 6) {
                if (n1 >= 1 && n1 <= 30) {
                    System.out.println(n1 + "th June," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 7) {
                if (n1 >= 1 && n1 <= 31) {
                    System.out.println(n1 + "th July," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 8) {
                if (n1 >= 1 && n1 <= 31) {
                    System.out.println(n1 + "th August," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 9) {
                if (n1 >= 1 && n1 <= 30) {
                    System.out.println(n1 + "th September," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 10) {
                if (n1 >= 1 && n1 <= 31) {
                    System.out.println(n1 + "th October," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 11) {
                if (n1 >= 1 && n1 <= 30) {
                    System.out.println(n1 + "th November," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 12) {
                if (n1 >= 1 && n1 <= 31) {
                    System.out.println(n1 + "th December," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else {
                System.out.println("INVALID DATE");
            }
        }

        // I check the date for a non-leap year
        else {

            if (n2 == 1) {
                if (n1 >= 1 && n1 <= 31) {
                    System.out.println(n1 + "th January," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 2) {
                if (n1 >= 1 && n1 <= 28) {
                    System.out.println(n1 + "th February," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 3) {
                if (n1 >= 1 && n1 <= 31) {
                    System.out.println(n1 + "th March," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 4) {
                if (n1 >= 1 && n1 <= 30) {
                    System.out.println(n1 + "th April," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 5) {
                if (n1 >= 1 && n1 <= 31) {
                    System.out.println(n1 + "th May," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 6) {
                if (n1 >= 1 && n1 <= 30) {
                    System.out.println(n1 + "th June," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 7) {
                if (n1 >= 1 && n1 <= 31) {
                    System.out.println(n1 + "th July," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 8) {
                if (n1 >= 1 && n1 <= 31) {
                    System.out.println(n1 + "th August," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 9) {
                if (n1 >= 1 && n1 <= 30) {
                    System.out.println(n1 + "th September," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 10) {
                if (n1 >= 1 && n1 <= 31) {
                    System.out.println(n1 + "th October," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 11) {
                if (n1 >= 1 && n1 <= 30) {
                    System.out.println(n1 + "th November," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else if (n2 == 12) {
                if (n1 >= 1 && n1 <= 31) {
                    System.out.println(n1 + "th December," + n3);
                    System.out.println("VALID DATE");
                } else {
                    System.out.println("INVALID DATE");
                }
            } 
            else {
                System.out.println("INVALID DATE");
            }
        }
    }
}
