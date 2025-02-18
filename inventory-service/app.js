const express = require("express");

const app = express();
const port = 3000;

const router = express.Router()

router.get('/inventory', (req, res) => {
    res.json({
        item:['Milk', 'Eggs', 'Bread'],
        message: 'welcome to the inventory service'
    });
});

//application context
app.use('/inventory-service', router)