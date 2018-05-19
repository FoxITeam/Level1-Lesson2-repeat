package ru.foxit.grayfox;

/**
 * Author TestSwitch.java - GrayFox | Ilya Lisin
 * Contact: Skype: foxygameskype | Telegram: +7(925)316-65-82 | vk: https://vk.com/exsperto1
 * GitHub: https://github.com/FoxITeam and https://github.com/GrayFoxIT
 * encoding: UTF-8, Comments, remarks in Russian.
 */

/**
 * Важные заметки, которые очень пригодятся на следующих занятиях.
 * <p>
 * + что мы повторили или используем в коде
 * - то что мы не повторяли или не приходилось использовать в коде
 * o - то что мы узнали на этом уроке и нужно повторить на следующем.
 * o todo | ctrl + F2 - остановить проект.
 * o todo | fori - сокращение цикла for обычная, itar - сокрашения цикла for с массивом, iter - еще не изучали, хотя не пизжу, забыл =D
 * Примечание: fori sout psvm itar и подобные сокращения работают только в методах.
 * o todo | с помощью жука (дебагера) кликаем по нужному участку кода, запускаем и шагаем F8 по шагам, смотрим на выполнение кода.
 * o todo | alt + Enter (Наводим на if или switch и мы можем переконвертировать их) с if в switch или наоборот.
 * + todo | CTRL + / - комментирования выделенных строк в коде.
 * + todo | Название переменных и методов начинаются с маленькой буквой, в то время как классы начинаются с большой буквы.
 * - todo | CTRL + F - поиск, CTRL + R - замена слова.
 * + todo | CTRL + SHIFT + ENTER - поставить точку с запятой и перейти на следующую строку.
 * + todo | CTRL + D - копировать ту строку, на которую мы нажали и оно вставит ее ниже.
 * + todo | Зажимаем ALT и выделяем, выделять будет квадратом.
 * + todo | Shift + F10 - запустить проект.
 * + todo | Shift + F6 - переименования название методов/переменных.
 * + todo | psvm - public static void Main
 * + todo | sout - System.out.println
 * + todo | Alt+ctrl+L - форматирование текста и кода в IDEA, удобная вещь.
 * + todo | Alt + Insert = Можно сгенерировать геттеры и сеттеры.
 * + todo | Что такое переменная - по факту это ссылка в адрес памяти и что по этому адресу лежит
 * + todo | определяется типом нашей переменной. Типы переменных бывают 2 видов - это
 * + todo | примитивные и ссылочные, их всего восемь.
 * + todo | Что такое метод - метод, он же в некоторых языках функция, это какое то поведение
 * + todo | если класс это описание объекта, допустим машина, то метод это его поведение, то что эта
 * + todo | машина может делать, например сигналить.
 * + todo | Что такое String в Java? Какой это тип данных?
 * + todo | String – это класс в Java, который прописан в пакете java.lang. Это не примитивный тип данных,
 * + todo | как int и long. Класс String представляет строковый набор символов.
 * o todo | Везде, где мы делаем константную проверку, используем свитч, это экономит ресурсы. if проверяет все, а вот свитч
 * o todo | остановиться на нужном условии и выйдет из блока кода, не станет дальше проверять, в отличии от if.
 * o todo | Рефакторинг это улучшение кода, когда вы его написали, код который работает, но скорее всего вы его с первого раза не написали
 * o todo | его идеально, нам нужно его обработать, обработка напильников, полировка, шлифовка, шпаклей херовка, цементировка, синонимыСловафрафаф тфу...
 */

public class TestSwitch {
    public static void main(String[] args) {
        // Константа это неизменяемая переменная, какое-то не изменяемое значение.
        testSwitch("Условие 1", "2");
        testSwitchTwo(1);

    }

    public static void testSwitch(String condition, String condition2) {
        switch (condition) {
            case "Условие 1":
                System.out.println("Выполнилось условие String 1 (switch)");
                break;
            case "Условие 2":
                System.out.println("Выполнилось условие String 2 (switch)");
                break;
            case "Условие 3":
                System.out.println("Выполнилось условие String 3 (switch)");
                break;
            default:
                System.out.println("Не выполнилось ничего! (switch)");

        }

        /**
         * Идея свитч может обратить в множественный if
         */

        if ("Условие 1".equals(condition)) {
            System.out.println("Выполнилось условие String 1 (if)");
        } else if ("Условие 2".equals(condition)) {
            System.out.println("Выполнилось условие String 2 (if)");
        } else if ("Условие 3".equals(condition)) {
            System.out.println("Выполнилось условие String 3 (if)");
        } else {
            System.out.println("Не выполнилось ничего! (if)");

        }

//        switch (condition) {
//            case "Условие 1":
//                System.out.println("Выполнилось условие String 1 (switch)");
//                switch (condition2) {
//                    case "2":
//                        testSwitch("2", "0");
//                }
//                break;
//            case "Условие 2":
//                System.out.println("Выполнилось условие String 2 (switch)");
//                break;
//            case "Условие 3":
//                System.out.println("Выполнилось условие String 3 (switch)");
//                break;
//            default:
//                System.out.println("Не выполнилось ничего! (switch)");
//
//        }


    }

    public static void testSwitchTwo(int conditionTwo) {
        switch (conditionTwo) {
            case 1:
                System.out.println("Выполнилось условие int 1 (switch)");
                break;
            case 2:
                System.out.println("Выполнилось условие int 2 (switch)");
                break;
            case 3:
                System.out.println("Выполнилось условие int 3 (switch)");
                break;
            default:
                System.out.println("Не выполнилось ничего! (switch)");

        }
    }
}
