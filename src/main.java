import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password;
        System.out.print("Kullanıcı adını giriniz : ");
        username = input.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();

        if((username.equals("john")) && (password.equals("12345"))){
            System.out.print("Başarılı bir şekilde giriş yaptınız. ");
        }
        else{
            System.out.println("Şifreniz veya kullanıcı adınız yanlış! ");

            String newPassword;
            int select;

            System.out.println("Şifrenizi değiştirmek için 1'e, çıkış yapmak için 2'ye basınız. ");
            select = input.nextInt();

            switch(select){
                case 1:
                    System.out.println("Yeni şifrenizi giriniz : ");
                    Scanner input2 = new Scanner(System.in);
                    newPassword = input2.nextLine();
                    if(newPassword.equals("12345")){
                        System.out.println("Yeni şifrenizle eski şifreniz aynı olamaz! ");
                    }
                    else{
                        System.out.println("Yeni şifreniz başarıyla oluşturuldu. ");
                    }
                    break;

                case 2:
                    System.out.println("Çıkışınız başarıyla tamamnlanmıştır. ");
                    break;

            }

        }


    }



}
