const mongoose = require("mongoose");
const schema=mongoose.Schema({
    CustomerId:Number,
    CustomerName:String,
    Order_Catagory:String,
    Order_Name:String,
    TableNO:Number,
    PhoneNo:Number
})
const Customer=mongoose.model('Customer',schema,'Customers');
module.exports=Customer
