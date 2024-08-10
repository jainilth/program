const express=require('express')
const app=express()
const bodyParser=require('body-parser')
app.use(bodyParser.urlencoded())
const student=[
    // {
    //     id:23010101272,
    //     name:'jainil',
    //     age:18
    // },
    // {
    //     id:23010101175,
    //     name:'samarth',
    //     age:'20'
    // }
    'jainil','samarth'
]
app.get('/student',(req,res)=>{
    res.send(student)
})
app.get('/student/:id',(req,res)=>{
    const ans=student.find( stu=> {return stu.id==req.params.id})
    res.send(ans)
})
app.post('/student/:name',(req,res)=>{
    student.push(req.params.name)
    res.send('student added')
})
app.patch('/student/:name/:newName',(req,res)=>{
    const indexToEdit=student.findIndex(stu=>stu==req.params.name)
    student[indexToEdit]=req.params.newName
    res.send('student edited')
})
app.delete('/student/:id',(req,res)=>{
    const indexToDelete=student.findIndex(stu=>stu.id==req.params.id)
    student.splice(indexToDelete,1)
    res.send('student deleted')
})
app.listen(3000,()=>{
    console.log('server is running on port 3000')
})