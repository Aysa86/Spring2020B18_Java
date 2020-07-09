package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testersTeam = new ArrayList<>();
    ArrayList<Developer> developersTeam = new ArrayList<>();

    public void hireTester(Tester tester){
        testersTeam.add(tester);
    }

    public void fireTester(long ID){
        testersTeam.removeIf(p -> p.employeeID == ID);// ID is unique in every company, thats why we use it for this action
    }

    public void hireDeveloper(Developer developer){
        developersTeam.add(developer);
    }

    public void fireDeveloper(long id){
        developersTeam.removeIf(p -> p.employeeID == id);
    }





}
