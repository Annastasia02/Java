package ПрактическоеЗадание5;

public class Сотрудник {

        String name;
        String position;
        String email;
        String telephone;
        int salary;
        int age;

    public Сотрудник(String name, String position, String email, String phone_number, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.telephone = telephone;
            this.salary = salary;
            this.age = age;
        }

        public String toString() {
            return String.format("Имя: %s \nДолжность: %s \nEmail: %s \nНомер телефона: %s \nЗарплата: %d \nВозраст: %d \n",
                    name, position, email, telephone, salary, age);
        }

        public void print() {
            System.out.println(this);
        }

        public static void main(String[] args) {

            Сотрудник[] сотрудникs = new Сотрудник[5];
            сотрудникs[0] = new Сотрудник("Даниил", "Генеральный директор", "Dmal@puf.ru", "+001", 350_000, 33);
            сотрудникs[1] = new Сотрудник("Ульяна", "Директор по развитию", "Ykor@puf.ru", "002", 170_000, 44);
            сотрудникs[2] = new Сотрудник("Екатерина", "Начальник отдела персонала", "dm@primer,ru", "003", 80_000, 28);
            сотрудникs[3] = new Сотрудник("Алескей", "Разработчик", "ol@primer,ru", "004", 250_000, 50);
            сотрудникs[4] = new Сотрудник("Елизавета", "Ведущий архитектор", "kv@primer,ru", "005", 180_000, 38);

            for (int i = 0; i < сотрудникs.length; i++)
                if (сотрудникs[i].age > 40) сотрудникs[i].print();

        }
    }
