package com.example.invoice

class Invoice(
    val buyerFirstName: String,
    val buyerLastName: String,
    val date: String,
    val goodName: String,
    val amount: Int,
    val pricePerItem: Double
) {

    // String concatenation can be converted into template in Kotlin like below
    // buyerFirstName+" "+buyerLastName prints same result as "$buyerFirstName $buyerLastName"
    val buyerFullName: String = "$buyerFirstName $buyerLastName"
    val totalPrice: Double = amount * pricePerItem
}
fun main(args:Array<String>){
    val firstInvoice=Invoice("Satya","Mohapatra","3/7/2023","Eggs",30,5.0)
}

fun getState(): String{

    return "First Name : ${buyerFirstName}"
}