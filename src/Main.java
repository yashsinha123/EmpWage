public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("yash", 1,20);

        int ischeck = (int)((Math.random()*10))%3;
        if (ischeck == 0) {
            e1.attendance=0;

        }
        else if(ischeck==1){
            e1.attendance=1;

        }
        else {
            e1.attendance=2;

        }
        if(e1.attendance==1){
            System.out.println("Employee is present");
            e1.workhour =8;
        }
        else if(e1.attendance==0){
            System.out.println("Employee is not present");
        }
        else{
            System.out.println("EMployee is part time");
            e1.workhour=4;
        }
        //Main m1 = new Main();
        System.out.println(calculatesalary(e1));

    }
    static double  calculatesalary(Employee e){
        return e.workhour*e.wageperhour;
    }


}