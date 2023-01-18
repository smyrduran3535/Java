package anaDers.atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int accountNumber;//hesap numarasi
    private int pinNumber;//sifre
    private double checkingBalance;//vadesiz hesap bakiyesi
    private double savingBalance;//vadeli hesap bakiyesi

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    Scanner input = new Scanner(System.in);
    //hesaptan biri para cekmek isterse azaltma olur
    //hesaptan biri para cekmek isterse arttma olur
    //baska bir class icinde cagırmak icin getter setter yaptık

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;


    }

    //hesabımdan para cekme islemi yapacakcak

    //private yaptık cunku baska hicbir yerden cagırmıycam ve kullanmak istemiyorum
    private double calculateCheckingBalanceAfterWithdraw(double amount) {//saving hesabındaki parayı, para cekme isleminden sonra hessapla
        //kullanıcıdan mikt almamız lazım:amount :miktar

        checkingBalance = checkingBalance - amount;//cekilen parayı atama yapmazsak geriye paramız azalmaz

        return checkingBalance;//geri kalan parayı return edebiliriz
    }

    //filtreme icin 2.method olusturcaz
    //para yatırma ;para patıram isleminden sonra kalan bakiyeyi hesapla
    private double calculateCheckingBalanceAfterDepozit(double amount) {//kisi bize su miktarda para yatırmak istiyorum diyecek;amount ile
        checkingBalance = checkingBalance + amount;//yatırdıktan sonraki bakiyeyinin son hali
        return checkingBalance;
    }

    //para cekme:saving hesabından para cekildikten sonra kalan bakiyeyi hesaplama
    private double calculateSavingBalanceAfterWithdraw(double amount) {
        savingBalance = savingBalance - amount;//kisi para cektigi icin
        return savingBalance;
    }

    //aynı islemi para yatırma icin yapıcaz: kalan bakiyeyi hesaplayınız
    private double calculateSavingBalanceAfterDepozit(double amount) {
        savingBalance = savingBalance + amount;
        return savingBalance;
    }

    //musteri ile iletisime gecme vakti geldi; ====================>>>>>>>>>>>>>>>>Burasi 2.kisim:
    //musteri ile para cekmek icin etkilesime gecelim
    //burdaki method public cunku baska yerden cagrc
    public void getCheckingWithdraw() {
        System.out.println("Checking hesabinizda bulunan bakiye : " + moneyFormat.format(checkingBalance));
        //para cekmek istedigi icin
        System.out.println("cekmek istediginiz miktari giriniz");
        //inputu cagırcaz,double istıycez ve  double amount atıycaz
        double amount = input.nextDouble();
        //0'ında asagisininda gecerliligi yok
        if (amount <= 0) {
            System.out.println("Sifir veya eksi bakiyeler gecersizdir");
            //hata verecek bu yuzden ;aynı methodun ismini buraya cagırırsak sıkıntı yok buna reucrsive method diyoruz
            getCheckingBalance();//tekrardan cagırma :reucrsive method diyoruz :yanlıslıkla girdiginde aynı yere tekradan geliyor

        } else if (amount <= checkingBalance) {//istedigi rakam kendi hesabındakinden kucuk ceker kosul saglıyorsa: dogru miktarı gorduk
            calculateCheckingBalanceAfterWithdraw(amount);//kisiye islem hakkı tanınır kosul saglandıgında once miktar yazılır
            displayCurrentAmount(checkingBalance);

        } else {
            System.out.println("yetersiz bakiye!");
        }

    }

    //musteri para yatirmak isterse etkilesime gecelim ;Pra yatirme(checking) hesap icin;
    public void getCheckingDepozit(){
        displayCurrentAmount(checkingBalance);//hesabı gosterelim
        System.out.println("Yatirmak istediginiz miktari giriniz");
        double amount = input.nextDouble();//kisiden para miktarını istiyoruz
        if (amount <= 0) {
            System.out.println("Sifir veya eksi bakiyeler gecersizdir");
            getCheckingDepozit();
            //0 ın ustunde hersey kabul sart acmadık ona
        } else {
            calculateCheckingBalanceAfterDepozit(amount);
            System.out.println("");
           displayCurrentAmount(checkingBalance);

        }
    }
    //musteri ile para cekmek icin etkilesime gecelim :saving hesap
    public void getSavingWithdraw(){
        displayCurrentAmount(savingBalance);
        System.out.println("cekmek istediginiz miktari giriniz");
        double amount=input.nextDouble();
        if (amount<=0){
            System.out.println("sifir veya eksi rakamlar gecersizdir");
            getCheckingWithdraw();//tekrarlaniyor yanlıs girdigi icin
        }else if (amount<=savingBalance){//islem yapabilir
            calculateSavingBalanceAfterWithdraw(amount);
            System.out.println();
            displayCurrentAmount(savingBalance);//vadeli hesabındaki bakiyeyi cagırmak lazım

        }else {
            System.out.println("yetersiz bakiye!");
        }
    }
    //4.KISIM: kisi kendi hesabından para yatıracak:savingBalance=musteri ile para yaırmak icin etkilesime gecelim
    public void getSavingDepozit(){
        displayCurrentAmount(savingBalance);//once bakiyeyi gosterelim
        System.out.println("lutfen yatırmak istediginiz meblayı giriniz");
        double amount=input.nextDouble();
        if (amount<=0){
            System.out.println("sifir veya eksi rakamlar gecersizdir");
           getCheckingDepozit();
        }else{
            //kisi yatırma islemini hangi hesaba yırıyorsa onu cagırıcaz
            calculateSavingBalanceAfterDepozit(amount);
            //yatırdıktan sonra bakiye gor
            displayCurrentAmount(savingBalance);
        }
    }

    //son bakiyeyi bu da gosterir kestirme
    public void displayCurrentAmount(double balance) {
        System.out.println("Checking hesabinizda bulunan bakiye : " + moneyFormat.format(balance));
    }
}