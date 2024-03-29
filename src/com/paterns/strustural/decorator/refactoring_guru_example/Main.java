package com.paterns.strustural.decorator.refactoring_guru_example;

public class Main {

    // Паттерн декоратор предоставляет расширенный интерфейс в отличии от паттерна ЗАМЕСТИТЕЛЬ (Proxy)

    /**                                           ПРИМЕНИМОСТЬ
     *  Когда вам нужно добавлять обязанности объектам на лету, незаметно для кода, который их использует.
     *
     *  Объекты помещают в обёртки, имеющие дополнительные поведения. Обёртки и сами объекты
     *  имеют одинаковый интерфейс, поэтому клиентам без разницы, с чем работать — с обычным объектом данных или с обёрнутым.
     *
     *  Когда нельзя расширить обязанности объекта с помощью наследования.
     *  Во многих языках программирования есть ключевое слово final, которое может заблокировать наследование класса.
     *  Расширить такие классы можно только с помощью Декоратора.
     */


    /**
     * ШАГИ РЕАЛИЗАЦИИ
     * <p>
     * 1 - Убедитесь, что в вашей задаче есть один основной компонент и несколько опциональных дополнений или надстроек над ним.
     * <p>
     * 2 - Создайте интерфейс компонента, который описывал бы общие методы как для основного компонента, так и для его дополнений.
     * <p>
     * 3 - Создайте класс конкретного компонента и поместите в него основную бизнес-логику.
     * <p>
     * 4 - Создайте базовый класс декораторов. Он должен иметь поле для хранения ссылки на вложенный объект-компонент.
     * Все методы базового декоратора должны делегировать действие вложенному объекту.
     * <p>
     * 5 - И конкретный компонент, и базовый декоратор должны следовать одному и тому же интерфейсу компонента.
     * <p>
     * 6 - Теперь создайте классы конкретных декораторов, наследуя их от базового декоратора.
     * Конкретный декоратор должен выполнять свою добавочную функцию, а затем (или перед этим)
     * вызывать эту же операцию обёрнутого объекта.
     * <p>
     * Клиент берёт на себя ответственность за конфигурацию и порядок обёртывания объектов.
     *
     * @param args
     */

    public static void main(String[] args) {

        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}

