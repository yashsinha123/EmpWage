public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("yash", 1,20);

        int ischeck = (int)((Math.random()*10))%2;
        if (ischeck == 0) {
            e1.attendance=false;

        }
        else{
            e1.attendance=true;

        }
        if(e1.attendance){
            System.out.println("Employee is present");
            e1.workhour =8;
        }
        else{
            System.out.println("Employee is not present");
        }
        //Main m1 = new Main();
        System.out.println(calculatesalary(e1));

    }
    static double  calculatesalary(Employee e){
        return e.workhour*e.wageperhour;
    }


}