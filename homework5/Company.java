package Random;

import java.util.ArrayList;

/**
 * Created by blinky on 14.01.15.
 */
public class Company {

    private String name;
    private String address;
    private int employee;
    private String web;

    public Company() {
    }

    public Company(String name, String address, int employee, String web) {
        this.name = name;
        this.address = address;
        this.employee = employee;
        this.web = web;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEmployees() {
        return employee;
    }

    public void setEmployees(int employees) {
        this.employee = employees;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public static void main(String[] args) {

        ArrayList<Company> companies = new ArrayList<Company>();
        companies.add(new Company("Coca Cola", "Sofia", 100,
                "www.cocacola.bg"));
        companies
                .add(new Company("Fanta", "Sofia", 200, "www.cocacola.bg"));
        companies.add(new Company("Sprite", "Sofia", 150,
                "www.cocacola.bg"));

        int maxIdx = -1;
        int maxEmployees=-1;
        for (int i = 0; i < companies.size(); i++) {
            if (maxEmployees < companies.get(i).getEmployee()) {
                maxEmployees=companies.get(i).getEmployee();
                maxIdx = i;
            }
        }
        System.out.println("Company to remove: "
                + companies.get(maxIdx).getName() + " " + maxIdx);

        companies.remove(maxIdx);

        companies.add(new Company("Mercedes", "Sofia", 250,
                "www.cocacola.bg"));
        companies.add(new Company("BMW", "Sofia", 300, "www.cocacola.bg"));

        for (int i = 0; i < companies.size(); i++) {
            System.out.println("Company "+i+" "
                    + companies.get(i).getName());
        }

        int currMaxNameLen=-1;
        int maxLenNameIdx=-1;
        for (int i = 0; i < companies.size(); i++) {
            if (currMaxNameLen < companies.get(i).getName().length()) {
                currMaxNameLen=companies.get(i).getName().length();
                maxLenNameIdx = i;
            }
        }
        System.out.println("Company with longest name: "
                + companies.get(maxLenNameIdx).getName() + " " + maxLenNameIdx);
        companies.set(maxLenNameIdx, new Company("Honda","Dobrich",20,"honda.bg"));
        for (int i = 0; i < companies.size(); i++) {
            System.out.println("Final companies "+i+" "
                    + companies.get(i).getName());
        }
    }

}

