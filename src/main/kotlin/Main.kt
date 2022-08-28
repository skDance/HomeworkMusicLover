fun main() {
    val amount = 1_435_000 //Сумма заказа

    var amountWithDiscount: Int = 0 //Сумма оплаты заказа после вычета скидки
    var discount: Int = 0 //Сумма скидки

    if (amount >= 0 && amount <= 100_000) {
        discount = 0
    } else if (amount >= 100_100 && amount <= 1_000_000) {
        discount = 10000
    } else if (amount >= 1_000_100) {
        discount = amount / 100 * 5
    }

    var isMusicLover = true //Атрибут проверки пользователя на меломана (постоянный покупатель)
    if (isMusicLover) {
        val musicLoverDiscount = ((amount - discount) * 0.01).toInt()
        discount += musicLoverDiscount
        amountWithDiscount = amount - discount
    } else {
        amountWithDiscount = amount - discount
    }

    println("Покупка на сумму $amount, скидка $discount. Итоговая сумма со скидкой $amountWithDiscount")
}