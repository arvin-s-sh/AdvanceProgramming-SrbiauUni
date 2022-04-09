package session3_2;

public class Programming implements ILesson {
    String name = "programming";
    int unitCount = 3;
    String[] pishniaz = {"riazi" ,"mabani computer"};
    String[] hamniaz ={ "madar manteghi","gossaste"};


    @Override
    public void showPishniaz() {
        for (String item :
                pishniaz) {
            System.out.println(item);
        }
    }

    @Override
    public void showHamniaz() {
        for (String item :
                hamniaz) {
            System.out.println(item);
        }
    }

    @Override
    public void showUnitCount() {
        System.out.println(unitCount);
    }
}
