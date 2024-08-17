const mongoose=require('mongoose')
const schema=new mongoose.Schema(
    {
      roll:Number,
      name:String,
      age:Number
    }
)
const Student=mongoose.model('Student',schema,'Students');
module.exports=Student
