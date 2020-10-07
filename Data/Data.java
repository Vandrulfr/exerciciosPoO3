package Data;

public class Data {
   private int dia;
   private int mes;
   private int ano;
   private int dAno;
   private String mesEx; 

    public int getDAno() {
        return this.dAno;
    }

    public void setDAno(int dAno) {
        this.dAno = dAno;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMesEx() {
        return this.mesEx;
    }

    public void setMesEx(String mesEx) {
        this.mesEx = mesEx;
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        extende_mes(mes);
        calcula_dAno(mes, dia);
    }

    public Data(String mesEx, int dia, int ano){
        this.mesEx = mesEx.toLowerCase();
        this.dia = dia;
        this.ano = ano;
        comprime_mes(this.mesEx);
        calcula_dAno(mes, dia);
    }

    public Data(int dAno, int ano) { //Considerando que anos bissextos não existam
        this.dAno = dAno;
        this.ano = ano;
        calcula_mes(dAno);
        extende_mes(this.mes);
        calcula_dia(this.mes, dAno);
    }

    private void calcula_mes(int dAno){
        if (dAno < 32) { this.mes = 1; }
        else if (dAno < 60) { this.mes = 2; }
        else if (dAno < 91) { this.mes = 3; }
        else if (dAno < 121) { this.mes = 4; }
        else if (dAno < 152) { this.mes = 5; }
        else if (dAno < 182) { this.mes = 6; }
        else if (dAno < 213) { this.mes = 7; }
        else if (dAno < 244) { this.mes = 8; }
        else if (dAno < 274) { this.mes = 9; }
        else if (dAno < 305) { this.mes = 10; }
        else if (dAno < 335) { this.mes = 11; }
        else this.mes = 12;

    }

    private void extende_mes(int mes){
        switch (mes) {
            case 1: this.mesEx = "janeiro";break;
            case 2: this.mesEx = "fevereiro";break;
            case 3: this.mesEx = "março";break;
            case 4: this.mesEx = "abril";break;
            case 5: this.mesEx = "maio";break;
            case 6: this.mesEx = "junho";break;
            case 7: this.mesEx = "julho";break;
            case 8: this.mesEx = "agosto";break;
            case 9: this.mesEx = "setembro";break;
            case 10: this.mesEx = "outubro";break;
            case 11: this.mesEx = "novembro";break;
            case 12: this.mesEx = "dezembro";break;
        }
    }

    private void comprime_mes(String mesEx){
        switch (mesEx) {
            case "janeiro": this.mes = 1;break;
            case "fevereiro": this.mes = 2;break;
            case "março": this.mes = 3;break;
            case "abril": this.mes = 4;break;
            case "maio": this.mes = 5;break;
            case "junho": this.mes = 6;break;
            case "julho": this.mes = 7;break;
            case "agosto": this.mes = 8;break;
            case "setembro": this.mes = 9;break;
            case "outubro": this.mes = 10;break;
            case "novembro": this.mes = 11;break;
            case "dezembro": this.mes = 12;break;
        }
    }

    private void calcula_dia(int mes, int dAno){
        switch (mes) {
            case 1: this.dia = dAno;break;
            case 2: this.dia = dAno-31;break;
            case 3: this.dia = dAno-59;break;
            case 4: this.dia = dAno-90;break;
            case 5: this.dia = dAno-120;break;
            case 6: this.dia = dAno-151;break;
            case 7: this.dia = dAno-181;break;
            case 8: this.dia = dAno-212;break;
            case 9: this.dia = dAno-243;break;
            case 10: this.dia = dAno-273;break;
            case 11: this.dia = dAno-304;break;
            case 12: this.dia = dAno-334;break;
        }
    }
    private void calcula_dAno(int mes, int dia){
        switch (mes) {
            case 1: this.dAno = dia;break;
            case 2: this.dAno = dia+31;break;
            case 3: this.dAno = dia+59;break;
            case 4: this.dAno = dia+90;break;
            case 5: this.dAno = dia+120;break;
            case 6: this.dAno = dia+151;break;
            case 7: this.dAno = dia+181;break;
            case 8: this.dAno = dia+212;break;
            case 9: this.dAno = dia+243;break;
            case 10: this.dAno = dia+273;break;
            case 11: this.dAno = dia+304;break;
            case 12: this.dAno = dia+334;break;
        }
    }

    public void print_dAno(){
        System.out.println(this.dAno + " " + this.ano);
    }
    public void print_compacto(){
        System.out.println(this.dia+"/"+this.mes+"/"+this.ano);
    }
    public void print_extenso(){
        System.out.println(this.mesEx+" "+this.dia+", "+this.ano);
    }
}
