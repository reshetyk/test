//debug режим, нажать на паучек
//поставить точку
//F8 след. шаг
//F7 зайти во внутырь метода


//класс
public class DashaMain {

    public static void main(String[] args) { //точка входа
        long varFactorial = 5; //объявление переменной со установленным значением - 10
        Factorial factorial = new Factorial(); //инстанциирование класса
        long result = factorial.calculate(varFactorial); //обращение к методу calculate из класса Factorial
        // и присвоение результата переменной result

        System.out.println("факториала числа " + varFactorial + " = " + result); //вывод на экран

        Multiply multiply = new Multiply();
        int a = 2;
        int b = 3;
        int resultMultiply = multiply.calculate(a, b);
        System.out.println("результат умножения переменных " + a + " и " + b + " = " + resultMultiply);
    }

}
