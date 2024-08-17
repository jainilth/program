const express = require('express')
const bodyParser = require('body-parser')
const mongoose = require('mongoose')
const Student = require('./Student')
const connectString = 'mongodb+srv://jainil2005:jainil%40123@cluster0.xljjhq6.mongodb.net/college_sem-3';
mongoose.connect(connectString).then(() => {
    const app = express()
    app.use(bodyParser.urlencoded())
    app.get('/student', async (req, res) => {
        const data = await Student.find();
        res.send(data)
    })
    app.get('/student/:id', async (req, res) => {
        const data = await Student.findOne({ roll: req.params.id })
        res.send(data)
    })
    app.post('/student', async (req, res) => {
        const stu = new Student({ ...req.body })
        const ans = await stu.save()
        res.send(ans)
    })
    app.delete('/student/:id', async (req, res) => {
        const data = await Student.deleteOne({ roll: req.params.id })
        res.send(data)
    })
    app.patch('/student/:id', async (req, res) => {
        const stu = await Student.findOne({ roll: req.params.id })
        stu.name = req.body.name
        const ans = await stu.save()
        res.send(ans)
    })
    app.listen(3000, () => {
        console.log('server is running on port 3000')
    })
    console.log("your sever is now connected with database")
})
