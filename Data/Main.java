package Data;

public class Main {
    public static void main(String[] args) {
        Data data0 = new Data(255, 1997);
        Data data1 = new Data(1, 2001);
        Data data2 = new Data("março", 3, 1997);
        Data data3 = new Data("Outubro", 7, 2020);
        Data data4 = new Data(8, 7, 2020);
        Data data5 = new Data(20, 1, 1234);

        data0.print_dAno();
        data1.print_dAno();
        data2.print_extenso();
        data3.print_extenso();
        data4.print_compacto();
        data5.print_compacto();
    }
    
}
