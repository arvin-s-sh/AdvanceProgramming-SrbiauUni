package L7_1;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        //------------------------------------variable area------------------------------------
        String strMoney = null;
        PreparedStatement pst1 = null;
        PreparedStatement pst2 = null;
        String q1 = null;
        String query2 = null;
        String q2 = null;
        String query1 = null;
        String query_login = null;
        int money = 0;
        int passw = 0;
        int net = 0;
        ResultSet resultSet1 = null;
        ResultSet resultSet_login = null;
        ResultSet resultSet2 = null;
        boolean login = true;
        boolean loop = true;
        String strLoop = null;
        int pass = 0;
        String user = null;
        //------------------------------------database connection area------------------------------------
        String connectionUrl = "jdbc:jtds:sqlserver://Arvin:1433/java_DB;instance=MSSQLSERVER";


        try (Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement();) {

            //------------------------------------query area---------------------------------------------------


            while (login){
                System.out.println("write your user name : ");
                user = new Scanner(System.in).nextLine();
                System.out.println("write your password : ");
                pass = new Scanner(System.in).nextInt();

                query_login = String.format("SELECT password from users  WHERE username = '%s';" , user);
                resultSet_login = statement.executeQuery(query_login);
                while (resultSet_login.next())
                {
                    passw = resultSet_login.getInt(1);
                    //System.out.println(passw); //temporary
                }
                if (passw != pass){
                    login =true;
                    System.out.println("user or password is incorrect ! ");
                }
                if (passw == pass){
                    login =false;
                    System.out.println("you are login ! ");
                }
            }

            while (loop){
                System.out.println("select your internet package (type number) : ");
                System.out.println("1) 2G - 1000T");
                System.out.println("2) 4G - 2000T");
                System.out.println("3) 10G - 5000T");
                System.out.println("4) 25G - 10000T");
                System.out.println("5) show my wallet info");
                int netPackage = new Scanner(System.in).nextInt();

                if (netPackage == 1){
                    //---------------------get wallet------------------------------
                    query1 = String.format("SELECT wallet from users  WHERE username = '%s' and password = %s ;" , user,pass);
                    resultSet1 = statement.executeQuery(query1);
                    while (resultSet1.next())
                    {
                        money = resultSet1.getInt(1);
                        //System.out.println(money); //temporary
                    }
                    //-----------------------get net----------------------------
                    q1 = String.format("SELECT internet from users  WHERE username = '%s' and password = %s ;" , user,pass);
                    resultSet2 = statement.executeQuery(q1);
                    while (resultSet2.next())
                    {
                        net = resultSet2.getInt(1);
                        //System.out.println(net); //temporary
                    }
                    //------------------update money-------------------------
                    money = money - 1000;
                    query2 = String.format("UPDATE users set wallet = %s  WHERE username = '%s' and password = %s ;",money , user,pass);
                    pst1 = connection.prepareStatement(query2);
                    pst1.executeUpdate();
                    //------------------- update net--------------------------
                    net = net + 2;
                    q2 = String.format("UPDATE users set internet = %s  WHERE username = '%s' and password = %s ;",net , user,pass);
                    pst2 = connection.prepareStatement(q2);
                    pst2.executeUpdate();
                    //------------------- loop--------------------------
                    System.out.println("done");
                    System.out.println("do you want choose other options (yes,no) ? ");
                    strLoop = new Scanner(System.in).nextLine();
                    if (strLoop.equals("yes")){
                        loop = true;
                    }
                    if (strLoop.equals("no")){
                        loop = false;
                    }

                }
                if (netPackage == 2){
                    //---------------------get wallet------------------------------
                    query1 = String.format("SELECT wallet from users  WHERE username = '%s' and password = %s ;" , user,pass);
                    resultSet1 = statement.executeQuery(query1);
                    while (resultSet1.next())
                    {
                        money = resultSet1.getInt(1);
                        //System.out.println(money); //temporary
                    }
                    //-----------------------get net----------------------------
                    q1 = String.format("SELECT internet from users  WHERE username = '%s' and password = %s ;" , user,pass);
                    resultSet2 = statement.executeQuery(q1);
                    while (resultSet2.next())
                    {
                        net = resultSet2.getInt(1);
                        //System.out.println(net); //temporary
                    }
                    //------------------update money-------------------------
                    money = money - 2000;
                    query2 = String.format("UPDATE users set wallet = %s  WHERE username = '%s' and password = %s ;",money , user,pass);
                    pst1 = connection.prepareStatement(query2);
                    pst1.executeUpdate();
                    //------------------- update net--------------------------
                    net = net + 4;
                    q2 = String.format("UPDATE users set internet = %s  WHERE username = '%s' and password = %s ;",net , user,pass);
                    pst2 = connection.prepareStatement(q2);
                    pst2.executeUpdate();
                    //------------------- loop--------------------------
                    System.out.println("done");
                    System.out.println("do you want choose other options (yes,no) ? ");
                    strLoop = new Scanner(System.in).nextLine();
                    if (strLoop.equals("yes")){
                        loop = true;
                    }
                    if (strLoop.equals("no")){
                        loop = false;
                    }
                }
                if (netPackage == 3){
                    //---------------------get wallet------------------------------
                    query1 = String.format("SELECT wallet from users  WHERE username = '%s' and password = %s ;" , user,pass);
                    resultSet1 = statement.executeQuery(query1);
                    while (resultSet1.next())
                    {
                        money = resultSet1.getInt(1);
                        //System.out.println(money); //temporary
                    }
                    //-----------------------get net----------------------------
                    q1 = String.format("SELECT internet from users  WHERE username = '%s' and password = %s ;" , user,pass);
                    resultSet2 = statement.executeQuery(q1);
                    while (resultSet2.next())
                    {
                        net = resultSet2.getInt(1);
                        //System.out.println(net); //temporary
                    }
                    //------------------update money-------------------------
                    money = money - 5000;
                    query2 = String.format("UPDATE users set wallet = %s  WHERE username = '%s' and password = %s ;",money , user,pass);
                    pst1 = connection.prepareStatement(query2);
                    pst1.executeUpdate();
                    //------------------- update net--------------------------
                    net = net + 10;
                    q2 = String.format("UPDATE users set internet = %s  WHERE username = '%s' and password = %s ;",net , user,pass);
                    pst2 = connection.prepareStatement(q2);
                    pst2.executeUpdate();
                    //------------------- loop--------------------------
                    System.out.println("done");
                    System.out.println("do you want choose other options (yes,no) ? ");
                    strLoop = new Scanner(System.in).nextLine();
                    if (strLoop.equals("yes")){
                        loop = true;
                    }
                    if (strLoop.equals("no")){
                        loop = false;
                    }
                }
                if (netPackage == 4){
                    //---------------------get wallet------------------------------
                    query1 = String.format("SELECT wallet from users  WHERE username = '%s' and password = %s ;" , user,pass);
                    resultSet1 = statement.executeQuery(query1);
                    while (resultSet1.next())
                    {
                        money = resultSet1.getInt(1);
                        //System.out.println(money); //temporary
                    }
                    //-----------------------get net----------------------------
                    q1 = String.format("SELECT internet from users  WHERE username = '%s' and password = %s ;" , user,pass);
                    resultSet2 = statement.executeQuery(q1);
                    while (resultSet2.next())
                    {
                        net = resultSet2.getInt(1);
                        //System.out.println(net); //temporary
                    }
                    //------------------update money-------------------------
                    money = money - 10000;
                    query2 = String.format("UPDATE users set wallet = %s  WHERE username = '%s' and password = %s ;",money , user,pass);
                    pst1 = connection.prepareStatement(query2);
                    pst1.executeUpdate();
                    //------------------- update net--------------------------
                    net = net + 25;
                    q2 = String.format("UPDATE users set internet = %s  WHERE username = '%s' and password = %s ;",net , user,pass);
                    pst2 = connection.prepareStatement(q2);
                    pst2.executeUpdate();
                    //------------------- loop--------------------------
                    System.out.println("done");
                    System.out.println("do you want choose other options (yes,no) ? ");
                    strLoop = new Scanner(System.in).nextLine();
                    if (strLoop.equals("yes")){
                        loop = true;
                    }
                    if (strLoop.equals("no")){
                        loop = false;
                    }
                }
                if (netPackage == 5){
                    query1 = String.format("SELECT wallet from users  WHERE username = '%s' and password = %s ;" , user,pass);
                    resultSet1 = statement.executeQuery(query1);
                    while (resultSet1.next())
                    {
                        money = resultSet1.getInt(1);
                        //System.out.println(money); //temporary
                    }

                    q1 = String.format("SELECT internet from users  WHERE username = '%s' and password = %s ;" , user,pass);
                    resultSet2 = statement.executeQuery(q1);
                    while (resultSet2.next())
                    {
                        net = resultSet2.getInt(1);
                        //System.out.println(net); //temporary
                    }

                    System.out.println("user name : "+ user);
                    System.out.println("internet : " + net + "G");
                    System.out.println("money : " + money + "T");
                    //------------------- loop--------------------------
                    System.out.println("done");
                    System.out.println("do you want choose other options (yes,no) ? ");
                    strLoop = new Scanner(System.in).nextLine();
                    if (strLoop.equals("yes")){
                        loop = true;
                    }
                    if (strLoop.equals("no")){
                        loop = false;
                    }
                }
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
