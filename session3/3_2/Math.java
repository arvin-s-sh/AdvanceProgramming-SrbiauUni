package session3_2;

public class Math implements ILesson{
    String name = "math";
    int unitCount = 3;
    String[] pishniaz = {"fizik"};
    String[] hamniaz ={ "gossaste","difransiyel"};


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
