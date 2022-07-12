public class Employee {

    String name;
    double salary;
    double weeklyWorkingHours;
    int yearsOfStart;

    Employee (String name, double salary, double weeklyWorkingHours, int yearsOfStart){
        this.name = name;
        this.salary = salary;
        this.weeklyWorkingHours = weeklyWorkingHours;
        this.yearsOfStart = yearsOfStart;
    }

    public double tax(){

        if (this.salary < 1000){
            return salary;
        }else {
            return salary * 0.03;
        }
    }

    double bonus(){
        if (weeklyWorkingHours > 40){
            return (weeklyWorkingHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary(){
        if (yearsOfStart<=0 || yearsOfStart>2021){
            System.out.println("Geçersiz bir çalışma yili girdiniz, tekrar kontrol ediniz!");

        }else {

            int farkYil = 2021 - yearsOfStart;

            double zam;

            if (farkYil>0 && farkYil <= 10){
                zam =  salary * 0.05;
                return zam;
            }
            if (farkYil > 10 && farkYil < 20){
                zam = salary * 0.1;
                return zam;
            }
            if (farkYil >= 20){
                zam = salary * 0.15;
                return zam;
            }
            return 0;
        }
        return 0;
    }

    double total = salary + this.salary + this.bonus() - tax();

    public  String toString(){
        System.out.println("Adi\t\t\t\t\t\t:" + " " + this.name);
        System.out.println("Maas\t\t\t\t\t:" + " " + this.salary );
        System.out.println("Calisma Saati\t\t\t:" + " " + this.weeklyWorkingHours);
        System.out.println("Baslangic Yili\t\t\t:" + " " + this.yearsOfStart);
        System.out.println("vergi\t\t\t\t\t:" + " " + tax());
        System.out.println("Bonus\t\t\t\t\t:" + " " + this.bonus());
        System.out.println("Bonus ve vergili maas\t:" + " " + (this.salary + this.bonus() - tax()));
        System.out.println("Maas artisi\t\t\t\t:" + " " + raiseSalary());
        System.out.println("Toplam Maas\t\t\t\t:"+ " " + (this.salary + this.bonus()-tax() + raiseSalary()));
        return null;
    }

}
