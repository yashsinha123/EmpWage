public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("yash", 1,20);
        int workingdays = 20;
        int workinghours = 100;
        int currentdays =0;
        //int curenthour =0;
        while(currentdays<workingdays && e1.curenthour<workinghours) {

            int ischeck = (int) ((Math.random() * 10)) % 3;
            if (ischeck == 0) {
                e1.attendance = 0;

            } else if (ischeck == 1) {
                e1.attendance = 1;

            } else {
                e1.attendance = 2;

            }
            switch (e1.attendance) {
                case 1:
                    System.out.println("Employee is present");
                    e1.workhour = 8;
                    currentdays++;
                    e1.curenthour +=e1.workhour;

                    break;
                case 2:
                    System.out.println("Employee is absent");
                    break;
                default:
                    System.out.println("Employee is part time");

                    e1.workhour = 4;
                    currentdays++;
                    e1.curenthour +=e1.workhour;

            }
            //currentdays++;
            //curenthour +=e1.workhour;
            System.out.println("Total working days: " + currentdays);
            System.out.println("Total working hours: " + e1.curenthour);
            System.out.println("Monthly salary is: " + calculatesalary(e1));
            System.out.println(" total Monthly salary considering 20 days: " + calculatemonthlysalary(e1));

            //Main m1 = new Main();
            //System.out.println(calculatesalary(e1));

            //System.out.println("monthly salary is:" + " " + calculatemonthlysalary(e1));
        }

    }
    static double  calculatesalary(Employee e){

        return e.curenthour*e.wageperhour;
    }
    static double calculatemonthlysalary(Employee e){
        return e.workhour*e.wageperhour*20;
    }



}