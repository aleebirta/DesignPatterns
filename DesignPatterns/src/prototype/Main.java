/*

PROTOTYPE PATTERN

We are in a sale company which has several employees, one manager, developers,
cashiers and accountants.
Each of them has an ID in which their contributions in the company are counted.
At the end of the year, the owner of the company wants to give a promotion
and the title of employee of the year, to the employee who has the highest ID,
meaning he contributed the most in the company in this year.
Using prototype pattern, we will display all the employees of the company and then
the name of the employee of the year, but also the ID.

 */

package prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main (String[] args)
    {
        Manager man1 = new Manager(2002, "Kushagra Garg", "CEO Manager");

        Developer dev1 = new Developer(1067, "Lokesh Sharma", "Pro Developer");
        Developer dev2 = new Developer(4056, "Vinay Sharma", "Developer");
        Developer dev3 = new Developer(1623, "Jarek Iyov", "Pro Developer");

        Cashier cash1 = new Cashier(6283, "Theano Jannah", "Cashier");
        Cashier cash2 = new Cashier(3564, "Germund Waldhar", "Cashier");
        Cashier cash3 = new Cashier(7537, "Umukoro Rafael", "Cashier");

        Accountant acc1 = new Accountant(2740, "Pinhas Veronica", "Accountant");
        Accountant acc2 = new Accountant(1741, "Zaher Els", "Accountant");
        Accountant acc3 = new Accountant(4723, "John Olga", "Expert Accountant");

        Directory directory = new Directory();

        directory.addEmployee(man1);
        directory.addEmployee(dev1);
        directory.addEmployee(dev2);
        directory.addEmployee(dev3);
        directory.addEmployee(cash1);
        directory.addEmployee(cash2);
        directory.addEmployee(cash3);
        directory.addEmployee(acc1);
        directory.addEmployee(acc2);
        directory.addEmployee(acc3);

        directory.showEmployeeDetails();
        directory.showEmployeeID();

    }
}


