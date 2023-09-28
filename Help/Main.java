import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        char choice, ignore;
        HelpClassDemo help = new HelpClassDemo();
        while(true){
            do {
                help.showmenu();

                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                }while(ignore !='\n');
            }while(!help.isvalid(choice));
            if (choice == 'q') break;
            System.out.println('\n');
            help.helpon(choice);

        }
    }
}
