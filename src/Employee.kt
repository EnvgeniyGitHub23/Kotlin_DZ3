// Домашнее задание №3 от 08.10.2026


class Employee(
    val lastName: String,
    val firstName: String,
    val middleName: String,
    val position: String,
    val email: String,
    val phone: String,
    val salary: Double?,
    val age: Int
) {
    // =====Вторичный конструктор: сотрудник на испытательном сроке (без зарплаты) ==
    constructor(
        lastName: String,
        firstName: String,
        middleName: String,
        position: String,
        email: String,
        phone: String,
        age: Int
    ) : this(lastName, firstName, middleName, position, email, phone, null, age)

    // ==== вывод информации ===
    fun printInfo() {
        val fullName = "$lastName $firstName $middleName"
        val salaryText = salary?.let { "${it.toInt()} руб." } ?: "не указана (испытательный срок)"

        println("ФИО: $fullName")
        println("Должность: $position")
        println("Email: $email")
        println("Телефон: $phone")
        println("Зарплата: $salaryText")
        println("Возраст: $age лет")
        println("-----------------------------------")
    }
}

fun main() {
    // ===== Массив из пяти сотрудников =====
    val employees = arrayOf(
        Employee(
            lastName = "Петров", firstName = "Алексей", middleName = "Иванович",
            position = "Менеджер", email = "petrov@mail.ru",
            phone = "+7 (999) 123-45-67", salary = 60000.0, age = 35
        ),
        Employee(
            lastName = "Сидорова", firstName = "Мария", middleName = "Сергеевна",
            position = "Бухгалтер", email = "sidorova@mail.ru",
            phone = "+7 (999) 234-56-78", salary = 75000.0, age = 45
        ),
        Employee(
            lastName = "Иванов", firstName = "Дмитрий", middleName = "Петрович",
            position = "Разработчик", email = "ivanov@mail.ru",
            phone = "+7 (999) 345-67-89", salary = 120000.0, age = 28
        ),
        Employee(  // Вторичный конструктор — на испытательном сроке
            lastName = "Кузнецова", firstName = "Анна", middleName = "Викторовна",
            position = "Стажёр", email = "kuznetsova@mail.ru",
            phone = "+7 (999) 456-78-90", age = 42
        ),
        Employee(
            lastName = "Смирнов", firstName = "Николай", middleName = "Александрович",
            position = "Директор", email = "smirnov@mail.ru",
            phone = "+7 (999) 567-89-01", salary = 200000.0, age = 50
        )
    )

    // ===== Вывод только сотрудников старше 40 лет =====
    println("=== Сотрудники старше 40 лет ===\n")
    for (employee in employees) {
        if (employee.age > 40) {
            employee.printInfo()
        }
    }
}