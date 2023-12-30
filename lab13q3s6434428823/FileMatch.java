/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab13q3s6434428823;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tirawich Kasemchaiyanan
 */
public class FileMatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<AccountRecord> arList = new ArrayList<>();
        ArrayList<TransactionRecord> trList = new ArrayList<>();

        try ( Scanner master = new Scanner(new File("src\\lab13q3s6434428823\\master.txt"));  Scanner trans = new Scanner(new File("src\\lab13q3s6434428823\\trans.txt"));  RandomAccessFile newMaster = new RandomAccessFile("src\\lab13q3s6434428823\\newMaster.dat", "rw")) {

            //read master.txt
            while (master.hasNextLine()) {
                String line = master.nextLine().trim();
                int no = Integer.parseInt(line.substring(0, line.indexOf(" ")).trim());
                String name = line.substring(line.indexOf(" "), line.lastIndexOf(" ")).trim();
                double balance = Double.parseDouble(line.substring(line.lastIndexOf(" ")).trim());
                arList.add(new AccountRecord(no, name, balance));
            }
            //read trans.txt
            while (trans.hasNext()) {
                int no = trans.nextInt();
                double transection = trans.nextDouble();
                trList.add(new TransactionRecord(no, transection));
            }
            // matching balance in AccountRecord
            for (AccountRecord ar : arList) {
                for (TransactionRecord tr : trList) {
                    ar.combine(tr);
                }
            }

            //RandomAccessFile newMaster.dat
            for (AccountRecord ar : arList) {
                newMaster.writeInt(ar.getAcctNo());
                String s = ar.getName();
                while (s.length() != 30) {
                    s += " ";
                }
                newMaster.writeChars(s);
                newMaster.writeDouble(ar.getBalance());
                newMaster.writeInt(ar.getTransCnt());
            }

            //read from newMaster.dat
            //Total Account Record
            System.out.println("Total Account Record : " + newMaster.length() / (4 + (30 * 2) + 8 + 4));
            //Total balance
            double balance = 0;
            for (int i = 64; i <= newMaster.length() - 12; i += 76) {
                newMaster.seek(i);
                balance = balance + newMaster.readDouble();
            }
            System.out.println("Total balance : " + balance);
            //No transaction
            int count = 0;
            for (int i = 72; i <= newMaster.length() - 4; i += 76) {
                newMaster.seek(i);
                if (newMaster.readInt() == 0) {
                    count++;
                }
            }
            System.out.print("No transaction : " + count);
            if (count == 1) {
                System.out.println(" account.");
            } else {
                System.out.println(" accounts.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
