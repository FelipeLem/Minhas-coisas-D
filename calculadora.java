import java.util.Scanner;
public class calculadora {
    public static float adicao(float a1, float a2){
        float resultado = a1 + a2;
        return resultado;
    }
    public static float subtracao(float a1, float a2){
        float resultado = a1 - a2;
        return resultado;
    }
    public static float multiplicacao(float a1, float a2){
        float resultado = a1 * a2;
        return resultado;

    }
    public static float divisao(float a1, float a2){
        float resultado = a1 / a2;
        return resultado;

    }
    
    public static float fatorial(float a1){
        if (a1 == 0 || a1 == 1) {
            return 1;
        } else {
            return a1 * fatorial(a1 - 1);
        }

    }
    public static float exponenciacao(float a1, float a2){
        float resultado = a1;
        while(a2 > 1){
            resultado = resultado * a1;
            a2 = a2 - 1;
        }
        return resultado;

    }
    public static float porcentagem(float a1, float a2){
        float resultado = a1 * a2/100;
        return resultado;

    }
    public static void calculadoraCien() {
       Scanner leitor = new Scanner(System.in);
       float resultado = 0;
        float n1, n2, adi, sub, div, mult, pont, porc, fat;
        int tal;
        System.out.println("Qual operação vc gostaria de realizar?");
        System.out.println("1 ADIÇÃO");
        System.out.println("2 SUBTRAÇÃO");
        System.out.println("3 MULTIPLICAÇÃO");
        System.out.println("4 DIVISÃO");
        System.out.println("5 FATORIAL");
        System.out.println("6 EXPONENCIAÇÃO");
        System.out.println("7 CALCULO DE PORCENTAGEM");
        tal = leitor.nextInt();
        switch(tal){
            case 1: System.out.println("Digite um numero: ");
            n1 = leitor.nextFloat();
            System.out.println("digite outro numero");
            n2 = leitor.nextFloat();
            adi = adicao(n1,n2);
            resultado = adi;
            System.out.println(adi);
            calculadoraCien();

            case 2: System.out.println("Digite um numero: ");
            n1 = leitor.nextFloat();
            System.out.println("digite outro numero");
            n2 = leitor.nextFloat(); 
            sub = subtracao(n1, n2);
            resultado = sub;
            System.out.println(sub);
            calculadoraCien();

            case 3:System.out.println("Digite um numero: ");
            n1 = leitor.nextFloat();
            System.out.println("digite outro numero");
            n2 = leitor.nextFloat();
            mult = multiplicacao(n1, n2);
            resultado = mult;
            System.out.println(mult);
            calculadoraCien();

            case 4: System.out.println("Digite o dividendo: ");
              n1 = leitor.nextFloat();
              System.out.println("Digite o divisor: ");
              n2 = leitor.nextFloat(); 
              div = divisao(n1,n2);
              resultado = div;
              System.out.println(div);
              calculadoraCien();

            case 5: System.out.println("Digite o numero para fatorar: ");
            n1 = leitor.nextFloat();
            fat = fatorial(n1);
            resultado = fat;
            System.out.println(fat);
            calculadoraCien();

            case 6: System.out.println("Digite um numero: ");
            n1 = leitor.nextFloat();
            System.out.println("Digite o seu expoente: ");
            n2 = leitor.nextFloat();
            pont = exponenciacao(n1, n2);
            resultado = pont;
            System.out.println(pont);
            calculadoraCien();

            case 7:System.out.println("Digite um numero: ");
            n1 = leitor.nextFloat();
            System.out.println("Digite a porcentagem desejada: ");
            n2 = leitor.nextFloat();
            porc = porcentagem(n1, n2);
            resultado = porc;
            System.out.println(porc);
            calculadoraCien();
        }
    }
    public static void main(String[]args){
        System.out.println("Seja bem vindo a minha simples calculadora científica. :D");
        calculadoraCien();
    }
    }
