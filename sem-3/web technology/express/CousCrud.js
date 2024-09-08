const express = require('express')
const bodyParser = require('body-parser')
const mongoose = require('mongoose')
const Customer = require('./Customer')
const connectionString = 'mongodb+srv://jainil2005:jainil%40123@cluster0.xljjhq6.mongodb.net/CoffeeShop'
mongoose.connect(connectionString).then(() => {
    const app = express()
    app.use(bodyParser.json())
    app.get('/customer', async (req, res) => {
        const data = await Customer.find()
        res.send(data)
    })
    app.get('/customer/:id', async (req, res) => {
        const data = await Customer.findOne({ CustomerId: req.params.id })
        res.send(data)
    })
    app.post('/customer', async (req, res) => {
        const cus = new Customer({ ...req.body })
        const data = await cus.save()
        res.send(data)
    })
    app.delete('/customer/:id', async (req, res) => {
        const data = await Customer.deleteOne({ CustomerId: req.params.id })
        res.send(data)
    })
    app.patch('/customer/:id', async (req, res) => {
        const update = await Customer.findOneAndUpdate({ CustomerId: req.params.id }, req.body)
        res.send("updated")
    })
    app.listen(3000, () => {
        console.log('Server is running on port 3000')
    })
    console.log('Connected to MongoDB')
})
