package day21_multyDimentionalArrays;

public class ScrumTeam {
    public static void main(String[] args) {
                          //    0         1         2         3
        String [] DevTeam = {"Zeynep", "Haider", "Jovid", "Muhtar"};

        String [] TestTeam = {"Rahman", "Aishan", "Osman", "Ali"};

        String [] PO = {"Barzy", "Donald"};

        String [] TestTeam2 = {"Ilham", "Zarina", "Aizhan", "Asiman"};

       String ScrumTeam [][]= {DevTeam, TestTeam, PO};
       //                         0    ,    1   ,  2

        ScrumTeam[0][3] = "Jean"; //reassigned to another name

        ScrumTeam[1] = TestTeam2;// reassigned testers team
        System.out.println(TestTeam2);

        System.out.println(ScrumTeam[0][3]);

        String info = ScrumTeam[1][2];
        System.out.println(info);

        System.out.println("===========================================================");

        for(String eachEmployee : ScrumTeam[0]){ //       DEVELOPERS
            System.out.println(eachEmployee);
        }

        for(String eachEmployee : ScrumTeam[1]){
            System.out.println(eachEmployee); //           TESTERS
        }

        for(String eachEmployee : ScrumTeam[2]){
            System.out.println(eachEmployee); //           PO
        }

        System.out.println(ScrumTeam[2][1]); // Donald







    }
}
