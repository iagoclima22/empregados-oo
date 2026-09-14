package application;

import entities.Address;
import entities.Department;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String departmentName = sc.nextLine();
        System.out.print("Dia do pagamento: ");
        int payday = sc.nextInt();
        System.out.print("Email: ");
        sc.nextLine();
        String email = sc.nextLine();
        System.out.print("Telefone: ");
        String phone = sc.nextLine();

        Address address = new Address(email, phone);
        Department department = new Department(departmentName, payday, address);

        System.out.print("Quantos funcionários tem o departamento? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Dados do funcionários " + (i+1) + ":");
            System.out.print("Nome: ");
            String employeeName = sc.nextLine();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();
            Employee employee = new Employee(employeeName, salary);
            department.addEmployee(employee);
        }
        System.out.println();

        showReport(department);

        sc.close();
    }

    private static void showReport(Department department) {
        System.out.println("Folha de pagamento:");
        System.out.printf("Departamento %s = R$ %.2f%n", department.getName(), department.payroll());
        System.out.println("Pagamento realizado no dia " + department.getPayDay());
        System.out.println("Funcionários:");
        for (Employee employee : department.getEmployees()) {
            System.out.println(employee.getName());
        }
        System.out.println("Para dúvidas favor entrar em contato: " + department.getAddress().getEmail());
    }
}
