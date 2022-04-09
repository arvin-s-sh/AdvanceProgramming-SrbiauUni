package session3_2;

public class English implements ILesson {
    String name = "english";
    int unitCount = 2;
    String[] pishniaz = {"zaban oomoomi"};
    String[] hamniaz ={ "nothing"};


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
