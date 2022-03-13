public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    double tax () {
        double tax;
        if (salary < 1000) {
            return tax = 0;
        }
        else {
            return tax=(salary*3)/100;
        }
    }
    double bonus (){
        if(workHours>40){
            salary=((workHours-40)*30)+salary;
            return salary;
        }
        else{
            return salary;
        }
    }
    double raiseSalary (){
        if(2021-hireYear<10){
            return salary=salary+(salary/20);
        }
        else if(10<=2021-hireYear && 2021-hireYear<20){
            return salary=salary+(salary/10);
        }
        else{
            return salary=salary+((salary*15)/100);
        }
    }
    public String toString(){
        double totalMaas=this.salary+raiseSalary()+bonus()-tax();
        return "ADI: " + name +'\n' +
                "MAAŞI: "+ this.salary + '\n'+
                "ÇALIŞMA SAATİ: " + workHours + '\n' +
                "BAŞLANGIÇ YILI: " + hireYear + '\n' +
                "VERGİ: " + tax() + '\n' +
                "BONUS: " + bonus() + '\n' +
                "MAAŞ ARTIŞI: =" + raiseSalary() + '\n' +
                "TOPLAM MAAŞ: =" + totalMaas +  '\n' +
                "NET MAAŞ: " + (totalMaas-tax()) +'\n' ;

    }
}
