package com.eit.brnnda.dataclass

data class SingleOrderDetails(
    val affilate_charge: Any,
    val affilate_user: Any,
    val cart: List<Any>,
    val charge_id: Any,
    val coupon_code: Any,
    val coupon_discount: Double,
    val created_at: String,
    val currency_sign: String,
    val currency_value: Int,
    val customer_address: String,
    val customer_city: String,
    val customer_country: String,
    val customer_email: String,
    val customer_name: String,
    val customer_phone: String,
    val customer_zip: String,
    val dp: Int,
    val id: Int,
    val method: String,
    val order_note: Any,
    val order_number: String,
    val packing_cost: Int,
    val pay_amount: Double,
    val pay_id: Any,
    val payment_status: String,
    val pickup_location: String,
    val product_list: List<Product>,
    val shipping: String,
    val shipping_address: Any,
    val shipping_city: Any,
    val shipping_cost: Int,
    val shipping_country: String,
    val shipping_email: Any,
    val shipping_name: Any,
    val shipping_phone: Any,
    val shipping_zip: Any,
    val ssl_transaction_id: Any,
    val status: String,
    val tax: Int,
    val totalQty: String,
    val total_cashback: String,
    val txnid: Any,
    val updated_at: String,
    val user_id: Int,
    val vendor_packing_id: Int,
    val vendor_shipping_id: Int
)